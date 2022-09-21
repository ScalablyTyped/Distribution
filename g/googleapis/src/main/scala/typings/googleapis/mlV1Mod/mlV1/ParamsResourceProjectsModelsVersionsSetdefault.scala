package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsVersionsSetdefault
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the version to make the default for the model. You can get the names of all the versions of a model by calling projects.models.versions.list.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudMlV1SetDefaultVersionRequest] = js.undefined
}
object ParamsResourceProjectsModelsVersionsSetdefault {
  
  inline def apply(): ParamsResourceProjectsModelsVersionsSetdefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsVersionsSetdefault]
  }
  
  extension [Self <: ParamsResourceProjectsModelsVersionsSetdefault](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudMlV1SetDefaultVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
