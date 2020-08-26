package typings.jsoneditor.anon

import typings.jsoneditor.jsoneditorStrings.EqualssignEqualssign
import typings.jsoneditor.jsoneditorStrings.ExclamationmarkEqualssign
import typings.jsoneditor.jsoneditorStrings.Greaterthansign
import typings.jsoneditor.jsoneditorStrings.GreaterthansignEqualssign
import typings.jsoneditor.jsoneditorStrings.Lessthansign
import typings.jsoneditor.jsoneditorStrings.LessthansignEqualssign
import typings.jsoneditor.jsoneditorStrings.`@`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var field: String | `@` = js.native
  var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign = js.native
  var value: String = js.native
}

object Field {
  @scala.inline
  def apply(
    field: String | `@`,
    relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    value: String
  ): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setField(value: String | `@`): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelation(
      value: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
    ): Self = this.set("relation", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

