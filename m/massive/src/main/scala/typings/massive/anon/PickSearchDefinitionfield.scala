package typings.massive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<massive.massive.SearchDefinition, 'fields' | 'term'> */
@js.native
trait PickSearchDefinitionfield extends js.Object {
  var fields: js.Array[String] = js.native
  var term: String = js.native
}

object PickSearchDefinitionfield {
  @scala.inline
  def apply(fields: js.Array[String], term: String): PickSearchDefinitionfield = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickSearchDefinitionfield]
  }
  @scala.inline
  implicit class PickSearchDefinitionfieldOps[Self <: PickSearchDefinitionfield] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
  }
  
}

