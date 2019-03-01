package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenParam extends js.Object {
  var fullscreen: scala.Boolean
}

object FullscreenParam {
  @scala.inline
  def apply(fullscreen: scala.Boolean): FullscreenParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullscreen")(fullscreen)
    __obj.asInstanceOf[FullscreenParam]
  }
}

