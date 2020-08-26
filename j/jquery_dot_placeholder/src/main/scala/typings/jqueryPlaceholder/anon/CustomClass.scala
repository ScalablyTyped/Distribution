package typings.jqueryPlaceholder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomClass extends js.Object {
  var customClass: String = js.native
}

object CustomClass {
  @scala.inline
  def apply(customClass: String): CustomClass = {
    val __obj = js.Dynamic.literal(customClass = customClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomClass]
  }
  @scala.inline
  implicit class CustomClassOps[Self <: CustomClass] (val x: Self) extends AnyVal {
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
    def setCustomClass(value: String): Self = this.set("customClass", value.asInstanceOf[js.Any])
  }
  
}

