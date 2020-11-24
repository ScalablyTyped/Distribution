package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YarnApplication extends js.Object {
  
  /** Required. The application name. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The numerical progress of the application, from 1 to 100. */
  var progress: js.UndefOr[Double] = js.native
  
  /** Required. The application state. */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the internal hostname, and requires a
    * proxy server for resolution and, possibly, access.
    */
  var trackingUrl: js.UndefOr[String] = js.native
}
object YarnApplication {
  
  @scala.inline
  def apply(): YarnApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YarnApplication]
  }
  
  @scala.inline
  implicit class YarnApplicationOps[Self <: YarnApplication] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTrackingUrl(value: String): Self = this.set("trackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingUrl: Self = this.set("trackingUrl", js.undefined)
  }
}
