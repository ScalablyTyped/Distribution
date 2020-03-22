package typings.keyboardKey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which' | 'shiftKey'> */
trait PickKeyboardEventkeykeyCoKey extends js.Object {
  var key: String
  var keyCode: Double
  var shiftKey: Boolean
  var which: Double
}

object PickKeyboardEventkeykeyCoKey {
  @scala.inline
  def apply(key: String, keyCode: Double, shiftKey: Boolean, which: Double): PickKeyboardEventkeykeyCoKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickKeyboardEventkeykeyCoKey]
  }
}

