package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTemplateMetadata extends StObject {
  
  /**
    * Optional. A description of the template.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the template.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The parameters for the template.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameterMetadata]] = js.undefined
}
object SchemaTemplateMetadata {
  
  inline def apply(): SchemaTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateMetadata]
  }
  
  extension [Self <: SchemaTemplateMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaParameterMetadata]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaParameterMetadata*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
