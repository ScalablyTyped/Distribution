package typings.ismobilejs.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apple extends js.Object {
  var device: Boolean
  var ipod: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object Apple {
  @scala.inline
  def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean): Apple = {
    val __obj = js.Dynamic.literal(device = device, ipod = ipod, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Apple]
  }
}

