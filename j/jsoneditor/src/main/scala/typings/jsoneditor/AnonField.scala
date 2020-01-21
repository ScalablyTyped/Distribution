package typings.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var field: Boolean
  var value: Boolean
}

object AnonField {
  @scala.inline
  def apply(field: Boolean, value: Boolean): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonField]
  }
}

