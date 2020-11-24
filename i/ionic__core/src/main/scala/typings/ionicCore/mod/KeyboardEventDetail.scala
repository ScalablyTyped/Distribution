package typings.ionicCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEventDetail extends js.Object {
  
  var keyboardHeight: Double = js.native
}
object KeyboardEventDetail {
  
  @scala.inline
  def apply(keyboardHeight: Double): KeyboardEventDetail = {
    val __obj = js.Dynamic.literal(keyboardHeight = keyboardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventDetail]
  }
  
  @scala.inline
  implicit class KeyboardEventDetailOps[Self <: KeyboardEventDetail] (val x: Self) extends AnyVal {
    
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
    def setKeyboardHeight(value: Double): Self = this.set("keyboardHeight", value.asInstanceOf[js.Any])
  }
}
