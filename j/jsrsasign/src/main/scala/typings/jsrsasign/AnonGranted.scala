package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGranted extends js.Object {
  var granted: Double
  var grantedWithMods: Double
  var rejection: Double
  var revocationNotification: Double
  var revocationWarning: Double
  var waiting: Double
}

object AnonGranted {
  @scala.inline
  def apply(
    granted: Double,
    grantedWithMods: Double,
    rejection: Double,
    revocationNotification: Double,
    revocationWarning: Double,
    waiting: Double
  ): AnonGranted = {
    val __obj = js.Dynamic.literal(granted = granted.asInstanceOf[js.Any], grantedWithMods = grantedWithMods.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], revocationNotification = revocationNotification.asInstanceOf[js.Any], revocationWarning = revocationWarning.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGranted]
  }
}

