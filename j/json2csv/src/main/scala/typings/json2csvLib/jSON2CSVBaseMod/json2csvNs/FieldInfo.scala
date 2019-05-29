package typings
package json2csvLib.jSON2CSVBaseMod.json2csvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo[T] extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String | FieldValueCallback[T]
}

object FieldInfo {
  @scala.inline
  def apply[T](
    value: java.lang.String | FieldValueCallback[T],
    default: java.lang.String = null,
    label: java.lang.String = null,
    stringify: js.UndefOr[scala.Boolean] = js.undefined
  ): FieldInfo[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[FieldInfo[T]]
  }
}

