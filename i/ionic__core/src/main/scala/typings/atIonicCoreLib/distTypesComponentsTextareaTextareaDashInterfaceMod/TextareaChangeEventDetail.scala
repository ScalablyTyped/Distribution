package typings
package atIonicCoreLib.distTypesComponentsTextareaTextareaDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaChangeEventDetail extends js.Object {
  var value: js.UndefOr[java.lang.String | scala.Null]
}

object TextareaChangeEventDetail {
  @scala.inline
  def apply(value: java.lang.String = null): TextareaChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaChangeEventDetail]
  }
}

