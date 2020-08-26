package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterID extends js.Object {
  var registerID: String = js.native
}

object RegisterID {
  @scala.inline
  def apply(registerID: String): RegisterID = {
    val __obj = js.Dynamic.literal(registerID = registerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterID]
  }
  @scala.inline
  implicit class RegisterIDOps[Self <: RegisterID] (val x: Self) extends AnyVal {
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
    def setRegisterID(value: String): Self = this.set("registerID", value.asInstanceOf[js.Any])
  }
  
}

