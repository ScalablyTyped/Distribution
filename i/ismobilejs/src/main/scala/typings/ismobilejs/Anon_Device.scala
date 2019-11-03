package typings.ismobilejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Device extends js.Object {
  var device: Boolean
  var ipod: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object Anon_Device {
  @scala.inline
  def apply(device: Boolean, ipod: Boolean, phone: Boolean, tablet: Boolean): Anon_Device = {
    val __obj = js.Dynamic.literal(device = device, ipod = ipod, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Anon_Device]
  }
}

