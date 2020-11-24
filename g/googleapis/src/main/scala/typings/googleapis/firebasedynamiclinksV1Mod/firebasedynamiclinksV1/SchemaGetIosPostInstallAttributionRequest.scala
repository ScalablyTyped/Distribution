package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for iSDK to execute strong match flow for post-install attribution.
  * This is meant for iOS requests only. Requests from other platforms will not
  * be honored.
  */
@js.native
trait SchemaGetIosPostInstallAttributionRequest extends js.Object {
  
  /**
    * App installation epoch time (https://en.wikipedia.org/wiki/Unix_time).
    * This is a client signal for a more accurate weak match.
    */
  var appInstallationTime: js.UndefOr[String] = js.native
  
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * Device information.
    */
  var device: js.UndefOr[SchemaDeviceInfo] = js.native
  
  /**
    * iOS version, ie: 9.3.5. Consider adding &quot;build&quot;.
    */
  var iosVersion: js.UndefOr[String] = js.native
  
  /**
    * App post install attribution retrieval information. Disambiguates
    * mechanism (iSDK or developer invoked) to retrieve payload from clicked
    * link.
    */
  var retrievalMethod: js.UndefOr[String] = js.native
  
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
  
  /**
    * Possible unique matched link that server need to check before performing
    * fingerprint match. If passed link is short server need to expand the
    * link. If link is long server need to vslidate the link.
    */
  var uniqueMatchLinkToCheck: js.UndefOr[String] = js.native
  
  /**
    * Strong match page information. Disambiguates between default UI and
    * custom page to present when strong match succeeds/fails to find cookie.
    */
  var visualStyle: js.UndefOr[String] = js.native
}
object SchemaGetIosPostInstallAttributionRequest {
  
  @scala.inline
  def apply(): SchemaGetIosPostInstallAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionRequest]
  }
  
  @scala.inline
  implicit class SchemaGetIosPostInstallAttributionRequestOps[Self <: SchemaGetIosPostInstallAttributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppInstallationTime(value: String): Self = this.set("appInstallationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstallationTime: Self = this.set("appInstallationTime", js.undefined)
    
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setDevice(value: SchemaDeviceInfo): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setIosVersion(value: String): Self = this.set("iosVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosVersion: Self = this.set("iosVersion", js.undefined)
    
    @scala.inline
    def setRetrievalMethod(value: String): Self = this.set("retrievalMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetrievalMethod: Self = this.set("retrievalMethod", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
    
    @scala.inline
    def setUniqueMatchLinkToCheck(value: String): Self = this.set("uniqueMatchLinkToCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueMatchLinkToCheck: Self = this.set("uniqueMatchLinkToCheck", js.undefined)
    
    @scala.inline
    def setVisualStyle(value: String): Self = this.set("visualStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualStyle: Self = this.set("visualStyle", js.undefined)
  }
}
