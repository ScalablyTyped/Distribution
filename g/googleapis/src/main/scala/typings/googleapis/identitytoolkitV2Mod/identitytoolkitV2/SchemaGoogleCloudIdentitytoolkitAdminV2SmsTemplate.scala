package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate extends StObject {
  
  /**
    * Output only. The SMS's content. Can contain the following placeholders which will be replaced with the appropriate values: %APP_NAME% - For Android or iOS apps, the app's display name. For web apps, the domain hosting the application. %LOGIN_CODE% - The OOB code being sent in the SMS.
    */
  var content: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
