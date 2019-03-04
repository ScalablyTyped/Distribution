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
    val __obj = js.Dynamic.literal(blackberry = blackberry, blackberry_10 = blackberry_10, chrome = chrome, device = device, firefox = firefox, opera = opera)
  
    __obj.asInstanceOf[Other]
  }
}

