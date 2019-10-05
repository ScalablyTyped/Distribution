package typings.json2csv.jSON2CSVBaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo[T] extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var stringify: js.UndefOr[Boolean] = js.undefined
  var value: String | FieldValueCallback[T]
}

object FieldInfo {
  @scala.inline
  def apply[T](
    value: String | FieldValueCallback[T],
    default: String = null,
    label: String = null,
    stringify: js.UndefOr[Boolean] = js.undefined
  ): FieldInfo[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[FieldInfo[T]]
  }
}

