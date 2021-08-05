package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for iSDK to execute strong match flow for post-install attribution.
  * This is meant for iOS requests only. Requests from other platforms will not
  * be honored.
  */
trait SchemaGetIosPostInstallAttributionRequest extends StObject {
  
  /**
    * App installation epoch time (https://en.wikipedia.org/wiki/Unix_time).
    * This is a client signal for a more accurate weak match.
    */
  var appInstallationTime: js.UndefOr[String] = js.undefined
  
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String] = js.undefined
  
  /**
    * Device information.
    */
  var device: js.UndefOr[SchemaDeviceInfo] = js.undefined
  
  /**
    * iOS version, ie: 9.3.5. Consider adding &quot;build&quot;.
    */
  var iosVersion: js.UndefOr[String] = js.undefined
  
  /**
    * App post install attribution retrieval information. Disambiguates
    * mechanism (iSDK or developer invoked) to retrieve payload from clicked
    * link.
    */
  var retrievalMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Possible unique matched link that server need to check before performing
    * fingerprint match. If passed link is short server need to expand the
    * link. If link is long server need to vslidate the link.
    */
  var uniqueMatchLinkToCheck: js.UndefOr[String] = js.undefined
  
  /**
    * Strong match page information. Disambiguates between default UI and
    * custom page to present when strong match succeeds/fails to find cookie.
    */
  var visualStyle: js.UndefOr[String] = js.undefined
}
object SchemaGetIosPostInstallAttributionRequest {
  
  inline def apply(): SchemaGetIosPostInstallAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionRequest]
  }
  
  extension [Self <: SchemaGetIosPostInstallAttributionRequest](x: Self) {
    
    inline def setAppInstallationTime(value: String): Self = StObject.set(x, "appInstallationTime", value.asInstanceOf[js.Any])
    
    inline def setAppInstallationTimeUndefined: Self = StObject.set(x, "appInstallationTime", js.undefined)
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setDevice(value: SchemaDeviceInfo): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setIosVersion(value: String): Self = StObject.set(x, "iosVersion", value.asInstanceOf[js.Any])
    
    inline def setIosVersionUndefined: Self = StObject.set(x, "iosVersion", js.undefined)
    
    inline def setRetrievalMethod(value: String): Self = StObject.set(x, "retrievalMethod", value.asInstanceOf[js.Any])
    
    inline def setRetrievalMethodUndefined: Self = StObject.set(x, "retrievalMethod", js.undefined)
    
    inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    inline def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
    
    inline def setUniqueMatchLinkToCheck(value: String): Self = StObject.set(x, "uniqueMatchLinkToCheck", value.asInstanceOf[js.Any])
    
    inline def setUniqueMatchLinkToCheckUndefined: Self = StObject.set(x, "uniqueMatchLinkToCheck", js.undefined)
    
    inline def setVisualStyle(value: String): Self = StObject.set(x, "visualStyle", value.asInstanceOf[js.Any])
    
    inline def setVisualStyleUndefined: Self = StObject.set(x, "visualStyle", js.undefined)
  }
}
