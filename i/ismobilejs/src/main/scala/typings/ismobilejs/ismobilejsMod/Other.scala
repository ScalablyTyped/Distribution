package typings.ismobilejs.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other extends js.Object {
  var blackberry: Boolean
  var blackberry_10: Boolean
  var chrome: Boolean
  var device: Boolean
  var firefox: Boolean
  var opera: Boolean
}

object Other {
  @scala.inline
  def apply(
    blackberry: Boolean,
    blackberry_10: Boolean,
    chrome: Boolean,
    device: Boolean,
    firefox: Boolean,
    opera: Boolean
  ): Other = {
    val __obj = js.Dynamic.literal(blackberry = blackberry, blackberry_10 = blackberry_10, chrome = chrome, device = device, firefox = firefox, opera = opera)
  
    __obj.asInstanceOf[Other]
  }
}

