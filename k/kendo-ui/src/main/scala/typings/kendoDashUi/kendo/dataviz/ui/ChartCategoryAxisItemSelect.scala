package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemSelect extends js.Object {
  var from: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var mousewheel: js.UndefOr[ChartCategoryAxisItemSelectMousewheel] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object ChartCategoryAxisItemSelect {
  @scala.inline
  def apply(
    from: js.Any = null,
    max: js.Any = null,
    min: js.Any = null,
    mousewheel: ChartCategoryAxisItemSelectMousewheel = null,
    to: js.Any = null
  ): ChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (mousewheel != null) __obj.updateDynamic("mousewheel")(mousewheel)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ChartCategoryAxisItemSelect]
  }
}

