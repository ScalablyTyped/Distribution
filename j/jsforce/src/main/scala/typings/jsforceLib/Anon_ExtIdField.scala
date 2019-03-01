package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtIdField extends js.Object {
  var extIdField: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ExtIdField {
  @scala.inline
  def apply(extIdField: java.lang.String = null): Anon_ExtIdField = {
    val __obj = js.Dynamic.literal()
    if (extIdField != null) __obj.updateDynamic("extIdField")(extIdField)
    __obj.asInstanceOf[Anon_ExtIdField]
  }
}

