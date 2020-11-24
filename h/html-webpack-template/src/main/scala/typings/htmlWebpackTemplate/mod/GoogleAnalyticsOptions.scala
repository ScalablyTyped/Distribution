package typings.htmlWebpackTemplate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsOptions extends js.Object {
  
  /** Log a pageview event after the analytics code loads. */
  var pageViewOnLoad: js.UndefOr[Boolean] = js.native
  
  var trackingId: String = js.native
}
object GoogleAnalyticsOptions {
  
  @scala.inline
  def apply(trackingId: String): GoogleAnalyticsOptions = {
    val __obj = js.Dynamic.literal(trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleAnalyticsOptions]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsOptionsOps[Self <: GoogleAnalyticsOptions] (val x: Self) extends AnyVal {
    
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
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageViewOnLoad(value: Boolean): Self = this.set("pageViewOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageViewOnLoad: Self = this.set("pageViewOnLoad", js.undefined)
  }
}
