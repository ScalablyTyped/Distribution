package typings.keyboardKey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.KeyboardEvent, 'key' | 'keyCode' | 'which'> */
@js.native
trait PickKeyboardEventkeykeyCo extends js.Object {
  var key: String = js.native
  var keyCode: Double = js.native
  var which: Double = js.native
}

object PickKeyboardEventkeykeyCo {
  @scala.inline
  def apply(key: String, keyCode: Double, which: Double): PickKeyboardEventkeykeyCo = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickKeyboardEventkeykeyCo]
  }
  @scala.inline
  implicit class PickKeyboardEventkeykeyCoOps[Self <: PickKeyboardEventkeykeyCo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhich(value: Double): Self = this.set("which", value.asInstanceOf[js.Any])
  }
  
}

