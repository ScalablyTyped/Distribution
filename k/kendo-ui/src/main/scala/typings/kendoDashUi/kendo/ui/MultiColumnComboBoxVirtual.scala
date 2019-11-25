package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxVirtual extends js.Object {
  var itemHeight: js.UndefOr[Double] = js.undefined
  var mapValueTo: js.UndefOr[String] = js.undefined
  var valueMapper: js.UndefOr[js.Function] = js.undefined
}

object MultiColumnComboBoxVirtual {
  @scala.inline
  def apply(itemHeight: Int | Double = null, mapValueTo: String = null, valueMapper: js.Function = null): MultiColumnComboBoxVirtual = {
    val __obj = js.Dynamic.literal()
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (mapValueTo != null) __obj.updateDynamic("mapValueTo")(mapValueTo.asInstanceOf[js.Any])
    if (valueMapper != null) __obj.updateDynamic("valueMapper")(valueMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxVirtual]
  }
}

