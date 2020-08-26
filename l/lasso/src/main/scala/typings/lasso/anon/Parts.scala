package typings.lasso.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parts extends js.Object {
  var parts: js.Array[String] = js.native
  var value: String = js.native
}

object Parts {
  @scala.inline
  def apply(parts: js.Array[String], value: String): Parts = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parts]
  }
  @scala.inline
  implicit class PartsOps[Self <: Parts] (val x: Self) extends AnyVal {
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
    def setPartsVarargs(value: String*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[String]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

