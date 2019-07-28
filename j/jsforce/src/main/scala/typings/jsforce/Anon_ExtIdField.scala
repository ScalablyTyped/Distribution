package typings.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtIdField extends js.Object {
  var extIdField: js.UndefOr[String] = js.undefined
}

object Anon_ExtIdField {
  @scala.inline
  def apply(extIdField: String = null): Anon_ExtIdField = {
    val __obj = js.Dynamic.literal()
    if (extIdField != null) __obj.updateDynamic("extIdField")(extIdField)
    __obj.asInstanceOf[Anon_ExtIdField]
  }
}

