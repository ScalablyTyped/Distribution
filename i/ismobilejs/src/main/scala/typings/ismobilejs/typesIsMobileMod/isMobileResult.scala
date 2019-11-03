package typings.ismobilejs.typesIsMobileMod

import typings.ismobilejs.Anon_Blackberry
import typings.ismobilejs.Anon_Device
import typings.ismobilejs.Anon_DevicePhone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isMobileResult extends js.Object {
  var amazon: Anon_DevicePhone
  var android: Anon_DevicePhone
  var any: Boolean
  var apple: Anon_Device
  var other: Anon_Blackberry
  var phone: Boolean
  var tablet: Boolean
  var windows: Anon_DevicePhone
}

object isMobileResult {
  @scala.inline
  def apply(
    amazon: Anon_DevicePhone,
    android: Anon_DevicePhone,
    any: Boolean,
    apple: Anon_Device,
    other: Anon_Blackberry,
    phone: Boolean,
    tablet: Boolean,
    windows: Anon_DevicePhone
  ): isMobileResult = {
    val __obj = js.Dynamic.literal(amazon = amazon, android = android, any = any, apple = apple, other = other, phone = phone, tablet = tablet, windows = windows)
  
    __obj.asInstanceOf[isMobileResult]
  }
}

