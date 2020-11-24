package typings.maximMazurokGapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmpUrl extends js.Object {
  
  /** The AMP URL pointing to the publisher's web server. */
  var ampUrl: js.UndefOr[String] = js.native
  
  /** The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to the cached document in the Google AMP Cache. */
  var cdnAmpUrl: js.UndefOr[String] = js.native
  
  /** The original non-AMP URL. */
  var originalUrl: js.UndefOr[String] = js.native
}
object AmpUrl {
  
  @scala.inline
  def apply(): AmpUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpUrl]
  }
  
  @scala.inline
  implicit class AmpUrlOps[Self <: AmpUrl] (val x: Self) extends AnyVal {
    
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
    def setAmpUrl(value: String): Self = this.set("ampUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpUrl: Self = this.set("ampUrl", js.undefined)
    
    @scala.inline
    def setCdnAmpUrl(value: String): Self = this.set("cdnAmpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdnAmpUrl: Self = this.set("cdnAmpUrl", js.undefined)
    
    @scala.inline
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalUrl: Self = this.set("originalUrl", js.undefined)
  }
}
