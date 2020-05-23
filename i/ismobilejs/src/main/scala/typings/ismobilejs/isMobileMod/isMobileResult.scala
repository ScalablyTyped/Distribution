package typings.ismobilejs.isMobileMod

import typings.ismobilejs.anon.Blackberry
import typings.ismobilejs.anon.Device
import typings.ismobilejs.anon.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isMobileResult extends js.Object {
  var amazon: Phone
  var android: Phone
  var any: Boolean
  var apple: Device
  var other: Blackberry
  var phone: Boolean
  var tablet: Boolean
  var windows: Phone
}

object isMobileResult {
  @scala.inline
  def apply(
    amazon: Phone,
    android: Phone,
    any: Boolean,
    apple: Device,
    other: Blackberry,
    phone: Boolean,
    tablet: Boolean,
    windows: Phone
  ): isMobileResult = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[isMobileResult]
  }
}

