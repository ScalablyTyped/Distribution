package typings.ismobilejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DevicePhone extends js.Object {
  var device: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object Anon_DevicePhone {
  @scala.inline
  def apply(device: Boolean, phone: Boolean, tablet: Boolean): Anon_DevicePhone = {
    val __obj = js.Dynamic.literal(device = device, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Anon_DevicePhone]
  }
}

