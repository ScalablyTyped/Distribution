package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var chrome: Boolean = js.native
  var edge: Boolean = js.native
  var facebook: Boolean = js.native
  var firefox: Boolean = js.native
  var ie: Boolean = js.native
  var msie: Boolean = js.native
  var safari: Boolean = js.native
  var version: Version = js.native
}

object Browser {
  @scala.inline
  def apply(
    chrome: Boolean,
    edge: Boolean,
    facebook: Boolean,
    firefox: Boolean,
    ie: Boolean,
    msie: Boolean,
    safari: Boolean,
    version: Version
  ): Browser = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], ie = ie.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def setChrome(value: Boolean): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdge(value: Boolean): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacebook(value: Boolean): Self = this.set("facebook", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirefox(value: Boolean): Self = this.set("firefox", value.asInstanceOf[js.Any])
    @scala.inline
    def setIe(value: Boolean): Self = this.set("ie", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsie(value: Boolean): Self = this.set("msie", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafari(value: Boolean): Self = this.set("safari", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

