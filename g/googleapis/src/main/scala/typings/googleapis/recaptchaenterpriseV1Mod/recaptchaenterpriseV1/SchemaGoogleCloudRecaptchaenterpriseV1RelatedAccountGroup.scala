package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup extends StObject {
  
  /**
    * Required. The resource name for the related account group in the format `projects/{project\}/relatedaccountgroups/{related_account_group\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
