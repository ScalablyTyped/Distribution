package typings.ismobilejs.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Windows extends js.Object {
  var device: Boolean
  var phone: Boolean
  var tablet: Boolean
}

object Windows {
  @scala.inline
  def apply(device: Boolean, phone: Boolean, tablet: Boolean): Windows = {
    val __obj = js.Dynamic.literal(device = device, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Windows]
  }
}

