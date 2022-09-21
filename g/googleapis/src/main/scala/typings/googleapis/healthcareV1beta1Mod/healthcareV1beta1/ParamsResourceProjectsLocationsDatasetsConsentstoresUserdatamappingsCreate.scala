package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the consent store.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUserDataMapping] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaUserDataMapping): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
