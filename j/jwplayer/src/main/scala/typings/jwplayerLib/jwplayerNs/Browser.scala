package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Browser extends js.Object {
  var chrome: scala.Boolean
  var edge: scala.Boolean
  var facebook: scala.Boolean
  var firefox: scala.Boolean
  var ie: scala.Boolean
  var msie: scala.Boolean
  var safari: scala.Boolean
  var version: Version
}

object Browser {
  @scala.inline
  def apply(
    chrome: scala.Boolean,
    edge: scala.Boolean,
    facebook: scala.Boolean,
    firefox: scala.Boolean,
    ie: scala.Boolean,
    msie: scala.Boolean,
    safari: scala.Boolean,
    version: Version
  ): Browser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chrome")(chrome)
    __obj.updateDynamic("edge")(edge)
    __obj.updateDynamic("facebook")(facebook)
    __obj.updateDynamic("firefox")(firefox)
    __obj.updateDynamic("ie")(ie)
    __obj.updateDynamic("msie")(msie)
    __obj.updateDynamic("safari")(safari)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Browser]
  }
}

