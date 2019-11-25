package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListOptions extends js.Object {
  var animation: js.UndefOr[Boolean | DropDownListAnimation] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var cascade: js.UndefOr[js.Function1[/* e */ DropDownListCascadeEvent, Unit]] = js.undefined
  var cascadeFrom: js.UndefOr[String] = js.undefined
  var cascadeFromField: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DropDownListChangeEvent, Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DropDownListCloseEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownListDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataValueField: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownListFilteringEvent, Unit]] = js.undefined
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.undefined
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var groupTemplate: js.UndefOr[String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DropDownListOpenEvent, Unit]] = js.undefined
  var optionLabel: js.UndefOr[String | js.Any] = js.undefined
  var optionLabelTemplate: js.UndefOr[String | js.Function] = js.undefined
  var popup: js.UndefOr[DropDownListPopup] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DropDownListSelectEvent, Unit]] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  var valueTemplate: js.UndefOr[String | js.Function] = js.undefined
  var virtual: js.UndefOr[Boolean | DropDownListVirtual] = js.undefined
}

object DropDownListOptions {
  @scala.inline
  def apply(
    animation: Boolean | DropDownListAnimation = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cascade: /* e */ DropDownListCascadeEvent => Unit = null,
    cascadeFrom: String = null,
    cascadeFromField: String = null,
    change: /* e */ DropDownListChangeEvent => Unit = null,
    close: /* e */ DropDownListCloseEvent => Unit = null,
    dataBound: /* e */ DropDownListDataBoundEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    dataValueField: String = null,
    delay: Int | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    filtering: /* e */ DropDownListFilteringEvent => Unit = null,
    fixedGroupTemplate: String | js.Function = null,
    footerTemplate: String | js.Function = null,
    groupTemplate: String | js.Function = null,
    headerTemplate: String | js.Function = null,
    height: Int | Double = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    minLength: Int | Double = null,
    name: String = null,
    noDataTemplate: String | js.Function | Boolean = null,
    open: /* e */ DropDownListOpenEvent => Unit = null,
    optionLabel: String | js.Any = null,
    optionLabelTemplate: String | js.Function = null,
    popup: DropDownListPopup = null,
    select: /* e */ DropDownListSelectEvent => Unit = null,
    template: String | js.Function = null,
    text: String = null,
    value: String = null,
    valuePrimitive: js.UndefOr[Boolean] = js.undefined,
    valueTemplate: String | js.Function = null,
    virtual: Boolean | DropDownListVirtual = null
  ): DropDownListOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (cascade != null) __obj.updateDynamic("cascade")(js.Any.fromFunction1(cascade))
    if (cascadeFrom != null) __obj.updateDynamic("cascadeFrom")(cascadeFrom.asInstanceOf[js.Any])
    if (cascadeFromField != null) __obj.updateDynamic("cascadeFromField")(cascadeFromField.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceMinLength)) __obj.updateDynamic("enforceMinLength")(enforceMinLength.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filtering != null) __obj.updateDynamic("filtering")(js.Any.fromFunction1(filtering))
    if (fixedGroupTemplate != null) __obj.updateDynamic("fixedGroupTemplate")(fixedGroupTemplate.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (optionLabelTemplate != null) __obj.updateDynamic("optionLabelTemplate")(optionLabelTemplate.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive.asInstanceOf[js.Any])
    if (valueTemplate != null) __obj.updateDynamic("valueTemplate")(valueTemplate.asInstanceOf[js.Any])
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListOptions]
  }
}

