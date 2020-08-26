package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  var fields: js.Array[_] = js.native
  var ops: js.Array[_] = js.native
  var predicates: js.Array[_] = js.native
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[_], ops: js.Array[_], predicates: js.Array[_]): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: js.Any*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[_]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpsVarargs(value: js.Any*): Self = this.set("ops", js.Array(value :_*))
    @scala.inline
    def setOps(value: js.Array[_]): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicatesVarargs(value: js.Any*): Self = this.set("predicates", js.Array(value :_*))
    @scala.inline
    def setPredicates(value: js.Array[_]): Self = this.set("predicates", value.asInstanceOf[js.Any])
  }
  
}

