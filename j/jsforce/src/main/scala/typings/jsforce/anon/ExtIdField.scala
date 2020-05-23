package typings.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtIdField extends js.Object {
  var extIdField: js.UndefOr[String] = js.undefined
}

object ExtIdField {
  @scala.inline
  def apply(extIdField: String = null): ExtIdField = {
    val __obj = js.Dynamic.literal()
    if (extIdField != null) __obj.updateDynamic("extIdField")(extIdField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtIdField]
  }
}

