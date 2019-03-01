package typings
package ismobilejsLib.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends js.Object {
  var blackberry: scala.Boolean
  var blackberry_10: scala.Boolean
  var chrome: scala.Boolean
  var device: scala.Boolean
  var firefox: scala.Boolean
  var opera: scala.Boolean
}

object Other {
  @scala.inline
  def apply(
    blackberry: scala.Boolean,
    blackberry_10: scala.Boolean,
    chrome: scala.Boolean,
    device: scala.Boolean,
    firefox: scala.Boolean,
    opera: scala.Boolean
  ): Other = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blackberry")(blackberry)
    __obj.updateDynamic("blackberry_10")(blackberry_10)
    __obj.updateDynamic("chrome")(chrome)
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("firefox")(firefox)
    __obj.updateDynamic("opera")(opera)
    __obj.asInstanceOf[Other]
  }
}

