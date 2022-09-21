package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsKeysMigrate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the key to be migrated, in the format "projects/{project\}/keys/{key\}".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1MigrateKeyRequest] = js.undefined
}
object ParamsResourceProjectsKeysMigrate {
  
  inline def apply(): ParamsResourceProjectsKeysMigrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsKeysMigrate]
  }
  
  extension [Self <: ParamsResourceProjectsKeysMigrate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudRecaptchaenterpriseV1MigrateKeyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
