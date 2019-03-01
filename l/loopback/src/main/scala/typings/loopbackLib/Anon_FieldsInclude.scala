package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsInclude extends js.Object {
  var fields: js.UndefOr[java.lang.String | js.Any | js.Array[_]] = js.undefined
  var include: js.UndefOr[java.lang.String | js.Any | js.Array[_]] = js.undefined
}

object Anon_FieldsInclude {
  @scala.inline
  def apply(
    fields: java.lang.String | js.Any | js.Array[_] = null,
    include: java.lang.String | js.Any | js.Array[_] = null
  ): Anon_FieldsInclude = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldsInclude]
  }
}

