package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineOptions extends js.Object {
  var actionClick: js.UndefOr[js.Function1[/* e */ TimelineActionClickEvent, Unit]] = js.undefined
  var alternatingMode: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ TimelineChangeEvent, Unit]] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ TimelineCollapseEvent, Unit]] = js.undefined
  var collapsibleEvents: js.UndefOr[Boolean] = js.undefined
  var dataActionsField: js.UndefOr[String] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ TimelineDataBoundEvent, Unit]] = js.undefined
  var dataDateField: js.UndefOr[String] = js.undefined
  var dataDescriptionField: js.UndefOr[String] = js.undefined
  var dataImagesField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[DataSource | js.Any] = js.undefined
  var dataSubTitleField: js.UndefOr[String] = js.undefined
  var dataTitleField: js.UndefOr[String] = js.undefined
  var dateformat: js.UndefOr[String] = js.undefined
  var eventHeight: js.UndefOr[Double] = js.undefined
  var eventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var eventWidth: js.UndefOr[Double] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ TimelineExpandEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ TimelineNavigateEvent, Unit]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var showDateLabels: js.UndefOr[Boolean] = js.undefined
}

object TimelineOptions {
  @scala.inline
  def apply(
    actionClick: /* e */ TimelineActionClickEvent => Unit = null,
    alternatingMode: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ TimelineChangeEvent => Unit = null,
    collapse: /* e */ TimelineCollapseEvent => Unit = null,
    collapsibleEvents: js.UndefOr[Boolean] = js.undefined,
    dataActionsField: String = null,
    dataBound: /* e */ TimelineDataBoundEvent => Unit = null,
    dataDateField: String = null,
    dataDescriptionField: String = null,
    dataImagesField: String = null,
    dataSource: DataSource | js.Any = null,
    dataSubTitleField: String = null,
    dataTitleField: String = null,
    dateformat: String = null,
    eventHeight: Int | Double = null,
    eventTemplate: String | js.Function = null,
    eventWidth: Int | Double = null,
    expand: /* e */ TimelineExpandEvent => Unit = null,
    name: String = null,
    navigate: /* e */ TimelineNavigateEvent => Unit = null,
    orientation: String = null,
    showDateLabels: js.UndefOr[Boolean] = js.undefined
  ): TimelineOptions = {
    val __obj = js.Dynamic.literal()
    if (actionClick != null) __obj.updateDynamic("actionClick")(js.Any.fromFunction1(actionClick))
    if (!js.isUndefined(alternatingMode)) __obj.updateDynamic("alternatingMode")(alternatingMode)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1(collapse))
    if (!js.isUndefined(collapsibleEvents)) __obj.updateDynamic("collapsibleEvents")(collapsibleEvents)
    if (dataActionsField != null) __obj.updateDynamic("dataActionsField")(dataActionsField)
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataDateField != null) __obj.updateDynamic("dataDateField")(dataDateField)
    if (dataDescriptionField != null) __obj.updateDynamic("dataDescriptionField")(dataDescriptionField)
    if (dataImagesField != null) __obj.updateDynamic("dataImagesField")(dataImagesField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSubTitleField != null) __obj.updateDynamic("dataSubTitleField")(dataSubTitleField)
    if (dataTitleField != null) __obj.updateDynamic("dataTitleField")(dataTitleField)
    if (dateformat != null) __obj.updateDynamic("dateformat")(dateformat)
    if (eventHeight != null) __obj.updateDynamic("eventHeight")(eventHeight.asInstanceOf[js.Any])
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (eventWidth != null) __obj.updateDynamic("eventWidth")(eventWidth.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1(expand))
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(showDateLabels)) __obj.updateDynamic("showDateLabels")(showDateLabels)
    __obj.asInstanceOf[TimelineOptions]
  }
}

