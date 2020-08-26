package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Throws extends js.Object {
  var throws: Boolean = js.native
  var validate: Boolean = js.native
}

object Throws {
  @scala.inline
  def apply(throws: Boolean, validate: Boolean): Throws = {
    val __obj = js.Dynamic.literal(throws = throws.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throws]
  }
  @scala.inline
  implicit class ThrowsOps[Self <: Throws] (val x: Self) extends AnyVal {
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
    def setThrows(value: Boolean): Self = this.set("throws", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
  
}

