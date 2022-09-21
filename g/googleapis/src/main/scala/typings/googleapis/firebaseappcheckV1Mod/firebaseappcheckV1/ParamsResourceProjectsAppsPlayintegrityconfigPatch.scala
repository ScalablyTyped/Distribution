package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsPlayintegrityconfigPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the Play Integrity configuration object, in the format: ``` projects/{project_number\}/apps/{app_id\}/playIntegrityConfig ```
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig] = js.undefined
  
  /**
    * Required. A comma-separated list of names of fields in the PlayIntegrityConfig Gets to update. Example: `token_ttl`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsPlayintegrityconfigPatch {
  
  inline def apply(): ParamsResourceProjectsAppsPlayintegrityconfigPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsPlayintegrityconfigPatch]
  }
  
  extension [Self <: ParamsResourceProjectsAppsPlayintegrityconfigPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFirebaseAppcheckV1PlayIntegrityConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
