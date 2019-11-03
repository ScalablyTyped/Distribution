package typings.ismobilejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blackberry extends js.Object {
  var blackberry: Boolean
  var blackberry10: Boolean
  var chrome: Boolean
  var device: Boolean
  var firefox: Boolean
  var opera: Boolean
}

object Anon_Blackberry {
  @scala.inline
  def apply(
    blackberry: Boolean,
    blackberry10: Boolean,
    chrome: Boolean,
    device: Boolean,
    firefox: Boolean,
    opera: Boolean
  ): Anon_Blackberry = {
    val __obj = js.Dynamic.literal(blackberry = blackberry, blackberry10 = blackberry10, chrome = chrome, device = device, firefox = firefox, opera = opera)
  
    __obj.asInstanceOf[Anon_Blackberry]
  }
}

