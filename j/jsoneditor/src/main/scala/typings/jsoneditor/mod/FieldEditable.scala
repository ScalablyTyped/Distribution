package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldEditable extends js.Object {
  var field: Boolean
  var value: Boolean
}

object FieldEditable {
  @scala.inline
  def apply(field: Boolean, value: Boolean): FieldEditable = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldEditable]
  }
}

