package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings extends StObject {
  
  /**
    * If set to true, allowed_bundle_ids are not enforced.
    */
  var allowAllBundleIds: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
    */
  var allowedBundleIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings](x: Self) {
    
    inline def setAllowAllBundleIds(value: Boolean): Self = StObject.set(x, "allowAllBundleIds", value.asInstanceOf[js.Any])
    
    inline def setAllowAllBundleIdsNull: Self = StObject.set(x, "allowAllBundleIds", null)
    
    inline def setAllowAllBundleIdsUndefined: Self = StObject.set(x, "allowAllBundleIds", js.undefined)
    
    inline def setAllowedBundleIds(value: js.Array[String]): Self = StObject.set(x, "allowedBundleIds", value.asInstanceOf[js.Any])
    
    inline def setAllowedBundleIdsNull: Self = StObject.set(x, "allowedBundleIds", null)
    
    inline def setAllowedBundleIdsUndefined: Self = StObject.set(x, "allowedBundleIds", js.undefined)
    
    inline def setAllowedBundleIdsVarargs(value: String*): Self = StObject.set(x, "allowedBundleIds", js.Array(value*))
  }
}
