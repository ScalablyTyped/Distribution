package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1WafSettings extends StObject {
  
  /**
    * Required. The WAF feature for which this key is enabled.
    */
  var wafFeature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The WAF service that uses this key.
    */
  var wafService: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1WafSettings {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1WafSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1WafSettings]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1WafSettings](x: Self) {
    
    inline def setWafFeature(value: String): Self = StObject.set(x, "wafFeature", value.asInstanceOf[js.Any])
    
    inline def setWafFeatureNull: Self = StObject.set(x, "wafFeature", null)
    
    inline def setWafFeatureUndefined: Self = StObject.set(x, "wafFeature", js.undefined)
    
    inline def setWafService(value: String): Self = StObject.set(x, "wafService", value.asInstanceOf[js.Any])
    
    inline def setWafServiceNull: Self = StObject.set(x, "wafService", null)
    
    inline def setWafServiceUndefined: Self = StObject.set(x, "wafService", js.undefined)
  }
}
