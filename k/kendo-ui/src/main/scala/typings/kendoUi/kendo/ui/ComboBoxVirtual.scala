package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxVirtual extends js.Object {
  var itemHeight: js.UndefOr[Double] = js.undefined
  var mapValueTo: js.UndefOr[String] = js.undefined
  var valueMapper: js.UndefOr[js.Function] = js.undefined
}

object ComboBoxVirtual {
  @scala.inline
  def apply(itemHeight: Int | Double = null, mapValueTo: String = null, valueMapper: js.Function = null): ComboBoxVirtual = {
    val __obj = js.Dynamic.literal()
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (mapValueTo != null) __obj.updateDynamic("mapValueTo")(mapValueTo.asInstanceOf[js.Any])
    if (valueMapper != null) __obj.updateDynamic("valueMapper")(valueMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxVirtual]
  }
}

