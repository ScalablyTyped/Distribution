package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255\}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md.
    */
  var attributeDefinitionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the consent store that this Attribute definition belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAttributeDefinition] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate](x: Self) {
    
    inline def setAttributeDefinitionId(value: String): Self = StObject.set(x, "attributeDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionIdUndefined: Self = StObject.set(x, "attributeDefinitionId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAttributeDefinition): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
