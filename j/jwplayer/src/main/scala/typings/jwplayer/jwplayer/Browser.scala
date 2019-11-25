package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var chrome: Boolean
  var edge: Boolean
  var facebook: Boolean
  var firefox: Boolean
  var ie: Boolean
  var msie: Boolean
  var safari: Boolean
  var version: Version
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
}

