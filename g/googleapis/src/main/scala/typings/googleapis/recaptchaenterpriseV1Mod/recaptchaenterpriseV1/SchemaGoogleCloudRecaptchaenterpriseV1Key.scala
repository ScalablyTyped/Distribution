package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1Key extends StObject {
  
  /**
    * Settings for keys that can be used by Android apps.
    */
  var androidSettings: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings] = js.undefined
  
  /**
    * The timestamp corresponding to the creation of this Key.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable display name of this key. Modifiable by user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings for keys that can be used by iOS apps.
    */
  var iosSettings: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings] = js.undefined
  
  /**
    * See Creating and managing labels.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The resource name for the Key in the format "projects/{project\}/keys/{key\}".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options for user acceptance testing.
    */
  var testingOptions: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions] = js.undefined
  
  /**
    * Settings for WAF
    */
  var wafSettings: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1WafSettings] = js.undefined
  
  /**
    * Settings for keys that can be used by websites.
    */
  var webSettings: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1Key {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1Key]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1Key](x: Self) {
    
    inline def setAndroidSettings(value: SchemaGoogleCloudRecaptchaenterpriseV1AndroidKeySettings): Self = StObject.set(x, "androidSettings", value.asInstanceOf[js.Any])
    
    inline def setAndroidSettingsUndefined: Self = StObject.set(x, "androidSettings", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIosSettings(value: SchemaGoogleCloudRecaptchaenterpriseV1IOSKeySettings): Self = StObject.set(x, "iosSettings", value.asInstanceOf[js.Any])
    
    inline def setIosSettingsUndefined: Self = StObject.set(x, "iosSettings", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestingOptions(value: SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions): Self = StObject.set(x, "testingOptions", value.asInstanceOf[js.Any])
    
    inline def setTestingOptionsUndefined: Self = StObject.set(x, "testingOptions", js.undefined)
    
    inline def setWafSettings(value: SchemaGoogleCloudRecaptchaenterpriseV1WafSettings): Self = StObject.set(x, "wafSettings", value.asInstanceOf[js.Any])
    
    inline def setWafSettingsUndefined: Self = StObject.set(x, "wafSettings", js.undefined)
    
    inline def setWebSettings(value: SchemaGoogleCloudRecaptchaenterpriseV1WebKeySettings): Self = StObject.set(x, "webSettings", value.asInstanceOf[js.Any])
    
    inline def setWebSettingsUndefined: Self = StObject.set(x, "webSettings", js.undefined)
  }
}
