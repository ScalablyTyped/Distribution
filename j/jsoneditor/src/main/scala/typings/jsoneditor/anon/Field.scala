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

trait Field extends js.Object {
  var field: String | `@`
  var relation: EqualssignEqualssign | ExclamationmarkEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign
  var value: String
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
}

