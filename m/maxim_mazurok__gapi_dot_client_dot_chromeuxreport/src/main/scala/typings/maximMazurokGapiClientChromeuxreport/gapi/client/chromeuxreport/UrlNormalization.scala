package typings.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlNormalization extends js.Object {
  
  /** The URL after any normalization actions. This is a valid user experience URL that could reasonably be looked up. */
  var normalizedUrl: js.UndefOr[String] = js.native
  
  /** The original requested URL prior to any normalization actions. */
  var originalUrl: js.UndefOr[String] = js.native
}
object UrlNormalization {
  
  @scala.inline
  def apply(): UrlNormalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlNormalization]
  }
  
  @scala.inline
  implicit class UrlNormalizationOps[Self <: UrlNormalization] (val x: Self) extends AnyVal {
    
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
    def setNormalizedUrl(value: String): Self = this.set("normalizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedUrl: Self = this.set("normalizedUrl", js.undefined)
    
    @scala.inline
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalUrl: Self = this.set("originalUrl", js.undefined)
  }
}
