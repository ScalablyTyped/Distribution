package typings.ionicCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEventDetail extends js.Object {
  var keyboardHeight: Double
}

object KeyboardEventDetail {
  @scala.inline
  def apply(keyboardHeight: Double): KeyboardEventDetail = {
    val __obj = js.Dynamic.literal(keyboardHeight = keyboardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventDetail]
  }
}

