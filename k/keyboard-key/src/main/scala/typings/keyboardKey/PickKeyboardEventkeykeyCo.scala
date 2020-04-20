package typings.keyboardKey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which'> */
trait PickKeyboardEventkeykeyCo extends js.Object {
  var key: String
  var keyCode: Double
  var which: Double
}

object PickKeyboardEventkeykeyCo {
  @scala.inline
  def apply(key: String, keyCode: Double, which: Double): PickKeyboardEventkeykeyCo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickKeyboardEventkeykeyCo]
  }
}

