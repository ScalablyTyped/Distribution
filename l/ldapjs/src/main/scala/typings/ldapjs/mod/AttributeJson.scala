package typings.ldapjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeJson extends js.Object {
  var `type`: String = js.native
  var vals: js.Array[String] = js.native
}

object AttributeJson {
  @scala.inline
  def apply(`type`: String, vals: js.Array[String]): AttributeJson = {
    val __obj = js.Dynamic.literal(vals = vals.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeJson]
  }
  @scala.inline
  implicit class AttributeJsonOps[Self <: AttributeJson] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValsVarargs(value: String*): Self = this.set("vals", js.Array(value :_*))
    @scala.inline
    def setVals(value: js.Array[String]): Self = this.set("vals", value.asInstanceOf[js.Any])
  }
  
}

