package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.error
import typings.ionicCore.ionicCoreStrings.success
import typings.ionicCore.ionicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var `type`: error | success | warning
}

object AnonError {
  @scala.inline
  def apply(`type`: error | success | warning): AnonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

