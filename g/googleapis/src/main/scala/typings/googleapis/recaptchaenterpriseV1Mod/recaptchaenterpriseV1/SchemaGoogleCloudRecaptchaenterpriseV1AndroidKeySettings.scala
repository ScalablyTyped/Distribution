package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings extends StObject {
  
  /**
    * If set to true, allowed_package_names are not enforced.
    */
  var allowAllPackageNames: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
    */
  var allowedPackageNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings](x: Self) {
    
    inline def setAllowAllPackageNames(value: Boolean): Self = StObject.set(x, "allowAllPackageNames", value.asInstanceOf[js.Any])
    
    inline def setAllowAllPackageNamesNull: Self = StObject.set(x, "allowAllPackageNames", null)
    
    inline def setAllowAllPackageNamesUndefined: Self = StObject.set(x, "allowAllPackageNames", js.undefined)
    
    inline def setAllowedPackageNames(value: js.Array[String]): Self = StObject.set(x, "allowedPackageNames", value.asInstanceOf[js.Any])
    
    inline def setAllowedPackageNamesNull: Self = StObject.set(x, "allowedPackageNames", null)
    
    inline def setAllowedPackageNamesUndefined: Self = StObject.set(x, "allowedPackageNames", js.undefined)
    
    inline def setAllowedPackageNamesVarargs(value: String*): Self = StObject.set(x, "allowedPackageNames", js.Array(value*))
  }
}
