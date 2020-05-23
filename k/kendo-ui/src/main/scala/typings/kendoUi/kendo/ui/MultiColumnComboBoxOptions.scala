package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxOptions extends js.Object {
  var animation: js.UndefOr[MultiColumnComboBoxAnimation] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var cascade: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxCascadeEvent, Unit]] = js.undefined
  var cascadeFrom: js.UndefOr[String] = js.undefined
  var cascadeFromField: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxChangeEvent, Unit]] = js.undefined
  var clearButton: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxCloseEvent, Unit]] = js.undefined
  var columns: js.UndefOr[js.Array[MultiColumnComboBoxColumn]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var dataValueField: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var dropDownWidth: js.UndefOr[String | Double] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filterFields: js.UndefOr[js.Any] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxFilteringEvent, Unit]] = js.undefined
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.undefined
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var groupTemplate: js.UndefOr[String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var highlightFirst: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxOpenEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[MultiColumnComboBoxPopup] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxSelectEvent, Unit]] = js.undefined
  var suggest: js.UndefOr[Boolean] = js.undefined
  var syncValueAndText: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  var virtual: js.UndefOr[Boolean | MultiColumnComboBoxVirtual] = js.undefined
}

object MultiColumnComboBoxOptions {
  @scala.inline
  def apply(
    animation: MultiColumnComboBoxAnimation = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    cascade: /* e */ MultiColumnComboBoxCascadeEvent => Unit = null,
    cascadeFrom: String = null,
    cascadeFromField: String = null,
    change: /* e */ MultiColumnComboBoxChangeEvent => Unit = null,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    close: /* e */ MultiColumnComboBoxCloseEvent => Unit = null,
    columns: js.Array[MultiColumnComboBoxColumn] = null,
    dataBound: /* e */ MultiColumnComboBoxDataBoundEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    dataValueField: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    dropDownWidth: String | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    filterFields: js.Any = null,
    filtering: /* e */ MultiColumnComboBoxFilteringEvent => Unit = null,
    fixedGroupTemplate: String | js.Function = null,
    footerTemplate: String | js.Function = null,
    groupTemplate: String | js.Function = null,
    headerTemplate: String | js.Function = null,
    height: js.UndefOr[Double] = js.undefined,
    highlightFirst: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    noDataTemplate: String | js.Function | Boolean = null,
    open: /* e */ MultiColumnComboBoxOpenEvent => Unit = null,
    placeholder: String = null,
    popup: MultiColumnComboBoxPopup = null,
    select: /* e */ MultiColumnComboBoxSelectEvent => Unit = null,
    suggest: js.UndefOr[Boolean] = js.undefined,
    syncValueAndText: js.UndefOr[Boolean] = js.undefined,
    template: String | js.Function = null,
    text: String = null,
    value: String = null,
    valuePrimitive: js.UndefOr[Boolean] = js.undefined,
    virtual: Boolean | MultiColumnComboBoxVirtual = null
  ): MultiColumnComboBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.get.asInstanceOf[js.Any])
    if (cascade != null) __obj.updateDynamic("cascade")(js.Any.fromFunction1(cascade))
    if (cascadeFrom != null) __obj.updateDynamic("cascadeFrom")(cascadeFrom.asInstanceOf[js.Any])
    if (cascadeFromField != null) __obj.updateDynamic("cascadeFromField")(cascadeFromField.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.get.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (dropDownWidth != null) __obj.updateDynamic("dropDownWidth")(dropDownWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceMinLength)) __obj.updateDynamic("enforceMinLength")(enforceMinLength.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterFields != null) __obj.updateDynamic("filterFields")(filterFields.asInstanceOf[js.Any])
    if (filtering != null) __obj.updateDynamic("filtering")(js.Any.fromFunction1(filtering))
    if (fixedGroupTemplate != null) __obj.updateDynamic("fixedGroupTemplate")(fixedGroupTemplate.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirst)) __obj.updateDynamic("highlightFirst")(highlightFirst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(syncValueAndText)) __obj.updateDynamic("syncValueAndText")(syncValueAndText.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive.get.asInstanceOf[js.Any])
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxOptions]
  }
}

