package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtIdField extends js.Object {
  var extIdField: js.UndefOr[String] = js.undefined
}

object AnonExtIdField {
  @scala.inline
  def apply(extIdField: String = null): AnonExtIdField = {
    val __obj = js.Dynamic.literal()
    if (extIdField != null) __obj.updateDynamic("extIdField")(extIdField.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtIdField]
  }
}

