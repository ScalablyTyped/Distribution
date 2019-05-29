package typings
package json2csvLib.jSON2CSVBaseMod.json2csvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValueCallbackInfo extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
}

object FieldValueCallbackInfo {
  @scala.inline
  def apply(label: java.lang.String, default: java.lang.String = null): FieldValueCallbackInfo = {
    val __obj = js.Dynamic.literal(label = label)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[FieldValueCallbackInfo]
  }
}

