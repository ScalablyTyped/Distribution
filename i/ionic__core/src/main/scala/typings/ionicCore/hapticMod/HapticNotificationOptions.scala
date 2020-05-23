package typings.ionicCore.hapticMod

import typings.ionicCore.ionicCoreStrings.error
import typings.ionicCore.ionicCoreStrings.success
import typings.ionicCore.ionicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapticNotificationOptions extends js.Object {
  var style: success | warning | error
}

object HapticNotificationOptions {
  @scala.inline
  def apply(style: success | warning | error): HapticNotificationOptions = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HapticNotificationOptions]
  }
}

