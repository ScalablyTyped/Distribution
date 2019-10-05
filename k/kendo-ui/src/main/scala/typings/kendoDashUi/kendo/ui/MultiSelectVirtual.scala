package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectVirtual extends js.Object {
  var itemHeight: js.UndefOr[Double] = js.undefined
  var mapValueTo: js.UndefOr[String] = js.undefined
  var valueMapper: js.UndefOr[js.Function] = js.undefined
}

object MultiSelectVirtual {
  @scala.inline
  def apply(itemHeight: Int | Double = null, mapValueTo: String = null, valueMapper: js.Function = null): MultiSelectVirtual = {
    val __obj = js.Dynamic.literal()
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (mapValueTo != null) __obj.updateDynamic("mapValueTo")(mapValueTo)
    if (valueMapper != null) __obj.updateDynamic("valueMapper")(valueMapper)
    __obj.asInstanceOf[MultiSelectVirtual]
  }
}

