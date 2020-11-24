package typings.logrocket.mod.LR

import typings.logrocket.anon.BaseHref
import typings.logrocket.anon.IsEnabled
import typings.logrocket.anon.RequestSanitizer
import typings.logrocket.anon.UrlSanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions extends js.Object {
  
  var browser: js.UndefOr[UrlSanitizer] = js.native
  
  var console: js.UndefOr[IsEnabled] = js.native
  
  var dom: js.UndefOr[BaseHref] = js.native
  
  /** Convenience option for configuring the SDK for an on-prem install. Include the protocol (eg. https://ingest.example.com) **/
  var ingestServer: js.UndefOr[String] = js.native
  
  var mergeIframes: js.UndefOr[Boolean] = js.native
  
  var network: js.UndefOr[RequestSanitizer] = js.native
  
  var release: js.UndefOr[String] = js.native
  
  /**
    * Enable sharing sessions across subdomains by setting this to the top-level hostname.
    **/
  var rootHostname: js.UndefOr[String] = js.native
  
  /** Convenience option for configuring where the full SDK should be loaded from for on-prem installs. **/
  var sdkServer: js.UndefOr[String] = js.native
  
  /** Controls collection of IP addresses and related features, such as GeoIP **/
  var shouldCaptureIP: js.UndefOr[Boolean] = js.native
  
  var shouldDebugLog: js.UndefOr[Boolean] = js.native
  
  /** a callback which determines whether to send data at a particular moment of time. **/
  var shouldSendData: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var uploadTimeInterval: js.UndefOr[Double] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: UrlSanitizer): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setConsole(value: IsEnabled): Self = this.set("console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    
    @scala.inline
    def setDom(value: BaseHref): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setIngestServer(value: String): Self = this.set("ingestServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestServer: Self = this.set("ingestServer", js.undefined)
    
    @scala.inline
    def setMergeIframes(value: Boolean): Self = this.set("mergeIframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeIframes: Self = this.set("mergeIframes", js.undefined)
    
    @scala.inline
    def setNetwork(value: RequestSanitizer): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setRelease(value: String): Self = this.set("release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setRootHostname(value: String): Self = this.set("rootHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootHostname: Self = this.set("rootHostname", js.undefined)
    
    @scala.inline
    def setSdkServer(value: String): Self = this.set("sdkServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkServer: Self = this.set("sdkServer", js.undefined)
    
    @scala.inline
    def setShouldCaptureIP(value: Boolean): Self = this.set("shouldCaptureIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCaptureIP: Self = this.set("shouldCaptureIP", js.undefined)
    
    @scala.inline
    def setShouldDebugLog(value: Boolean): Self = this.set("shouldDebugLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldDebugLog: Self = this.set("shouldDebugLog", js.undefined)
    
    @scala.inline
    def setShouldSendData(value: () => Boolean): Self = this.set("shouldSendData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShouldSendData: Self = this.set("shouldSendData", js.undefined)
    
    @scala.inline
    def setUploadTimeInterval(value: Double): Self = this.set("uploadTimeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadTimeInterval: Self = this.set("uploadTimeInterval", js.undefined)
  }
}
