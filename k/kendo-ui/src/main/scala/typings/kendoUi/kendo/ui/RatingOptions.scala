package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.continuous
import typings.kendoUi.kendoUiStrings.half
import typings.kendoUi.kendoUiStrings.item
import typings.kendoUi.kendoUiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RatingChangeEvent, Unit]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var hoveredTemplate: js.UndefOr[String | js.Function] = js.undefined
  var itemTemplate: js.UndefOr[String | js.Function] = js.undefined
  var label: js.UndefOr[Boolean | RatingLabel] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var precision: String | item | half
  var readonly: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ RatingSelectEvent, Unit]] = js.undefined
  var selectValueOnFocus: js.UndefOr[Double] = js.undefined
  var selectedTemplate: js.UndefOr[String | js.Function] = js.undefined
  var selection: String | continuous | single
  var tooltip: js.UndefOr[Boolean] = js.undefined
}

object RatingOptions {
  @scala.inline
  def apply(
    precision: String | item | half,
    selection: String | continuous | single,
    change: /* e */ RatingChangeEvent => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hoveredTemplate: String | js.Function = null,
    itemTemplate: String | js.Function = null,
    label: Boolean | RatingLabel = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    select: /* e */ RatingSelectEvent => Unit = null,
    selectValueOnFocus: js.UndefOr[Double] = js.undefined,
    selectedTemplate: String | js.Function = null,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): RatingOptions = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (hoveredTemplate != null) __obj.updateDynamic("hoveredTemplate")(hoveredTemplate.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(selectValueOnFocus)) __obj.updateDynamic("selectValueOnFocus")(selectValueOnFocus.get.asInstanceOf[js.Any])
    if (selectedTemplate != null) __obj.updateDynamic("selectedTemplate")(selectedTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingOptions]
  }
}

