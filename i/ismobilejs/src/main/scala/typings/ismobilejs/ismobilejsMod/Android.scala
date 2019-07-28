package typings.ismobilejs.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Android extends js.Object {
  var device: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object Android {
  @scala.inline
  def apply(device: Boolean, phone: Boolean, tablet: Boolean): Android = {
    val __obj = js.Dynamic.literal(device = device, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Android]
  }
}

