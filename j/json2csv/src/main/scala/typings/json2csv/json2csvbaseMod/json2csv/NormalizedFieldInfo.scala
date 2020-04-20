package typings.json2csv.json2csvbaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizedFieldInfo[T] extends js.Object {
  var label: String
  var value: FieldValueCallback[T]
}

object NormalizedFieldInfo {
  @scala.inline
  def apply[T](label: String, value: FieldValueCallback[T]): NormalizedFieldInfo[T] = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedFieldInfo[T]]
  }
}

