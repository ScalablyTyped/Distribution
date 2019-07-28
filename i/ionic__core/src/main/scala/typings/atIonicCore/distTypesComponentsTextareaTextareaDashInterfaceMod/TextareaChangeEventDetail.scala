package typings.atIonicCore.distTypesComponentsTextareaTextareaDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaChangeEventDetail extends js.Object {
  var value: js.UndefOr[String | Null] = js.undefined
}

object TextareaChangeEventDetail {
  @scala.inline
  def apply(value: String = null): TextareaChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaChangeEventDetail]
  }
}

