package typings
package json2csvLib.json2csvbaseMod.json2csvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo[T] extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var value: js.UndefOr[java.lang.String | FieldValueCallback[T]] = js.undefined
}

object FieldInfo {
  @scala.inline
  def apply[T](
    label: java.lang.String,
    default: java.lang.String = null,
    value: java.lang.String | FieldValueCallback[T] = null
  ): FieldInfo[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (default != null) __obj.updateDynamic("default")(default)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo[T]]
  }
}

