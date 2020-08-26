package typings.matrixAppserviceBridge.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Age extends js.Object {
  var age: Double = js.native
}

object Age {
  @scala.inline
  def apply(age: Double): Age = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any])
    __obj.asInstanceOf[Age]
  }
  @scala.inline
  implicit class AgeOps[Self <: Age] (val x: Self) extends AnyVal {
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
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
  }
  
}

