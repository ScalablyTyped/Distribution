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
    val __obj = js.Dynamic.literal(chrome = chrome, edge = edge, facebook = facebook, firefox = firefox, ie = ie, msie = msie, safari = safari, version = version)
  
    __obj.asInstanceOf[Browser]
  }
}

