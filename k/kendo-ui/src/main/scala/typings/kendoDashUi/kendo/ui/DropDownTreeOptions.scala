package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeOptions extends js.Object {
  var animation: js.UndefOr[Boolean | DropDownTreeAnimation] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DropDownTreeChangeEvent, Unit]] = js.undefined
  var checkAll: js.UndefOr[Boolean] = js.undefined
  var checkAllTemplate: js.UndefOr[String | js.Function] = js.undefined
  var checkboxes: js.UndefOr[Boolean | DropDownTreeCheckboxes] = js.undefined
  var clearButton: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DropDownTreeCloseEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownTreeDataBoundEvent, Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  var dataTextField: js.UndefOr[String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[String] = js.undefined
  var dataValueField: js.UndefOr[String | js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownTreeFilteringEvent, Unit]] = js.undefined
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[DropDownTreeMessages] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DropDownTreeOpenEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[DropDownTreePopup] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DropDownTreeSelectEvent, Unit]] = js.undefined
  var tagMode: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | js.Any] = js.undefined
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  var valueTemplate: js.UndefOr[String | js.Function] = js.undefined
}

object DropDownTreeOptions {
  @scala.inline
  def apply(
    animation: Boolean | DropDownTreeAnimation = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ DropDownTreeChangeEvent => Unit = null,
    checkAll: js.UndefOr[Boolean] = js.undefined,
    checkAllTemplate: String | js.Function = null,
    checkboxes: Boolean | DropDownTreeCheckboxes = null,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    close: /* e */ DropDownTreeCloseEvent => Unit = null,
    dataBound: /* e */ DropDownTreeDataBoundEvent => Unit = null,
    dataImageUrlField: String = null,
    dataSource: js.Any | HierarchicalDataSource = null,
    dataSpriteCssClassField: String = null,
    dataTextField: String | js.Any = null,
    dataUrlField: String = null,
    dataValueField: String | js.Any = null,
    delay: Int | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    filtering: /* e */ DropDownTreeFilteringEvent => Unit = null,
    footerTemplate: String | js.Function = null,
    headerTemplate: String | js.Function = null,
    height: String | Double = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    messages: DropDownTreeMessages = null,
    minLength: Int | Double = null,
    name: String = null,
    noDataTemplate: String | js.Function | Boolean = null,
    open: /* e */ DropDownTreeOpenEvent => Unit = null,
    placeholder: String = null,
    popup: DropDownTreePopup = null,
    select: /* e */ DropDownTreeSelectEvent => Unit = null,
    tagMode: String = null,
    template: String | js.Function = null,
    text: String = null,
    value: String | js.Any = null,
    valuePrimitive: js.UndefOr[Boolean] = js.undefined,
    valueTemplate: String | js.Function = null
  ): DropDownTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(checkAll)) __obj.updateDynamic("checkAll")(checkAll)
    if (checkAllTemplate != null) __obj.updateDynamic("checkAllTemplate")(checkAllTemplate.asInstanceOf[js.Any])
    if (checkboxes != null) __obj.updateDynamic("checkboxes")(checkboxes.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataImageUrlField != null) __obj.updateDynamic("dataImageUrlField")(dataImageUrlField)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSpriteCssClassField != null) __obj.updateDynamic("dataSpriteCssClassField")(dataSpriteCssClassField)
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField.asInstanceOf[js.Any])
    if (dataUrlField != null) __obj.updateDynamic("dataUrlField")(dataUrlField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(enforceMinLength)) __obj.updateDynamic("enforceMinLength")(enforceMinLength)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filtering != null) __obj.updateDynamic("filtering")(js.Any.fromFunction1(filtering))
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (tagMode != null) __obj.updateDynamic("tagMode")(tagMode)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive)
    if (valueTemplate != null) __obj.updateDynamic("valueTemplate")(valueTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownTreeOptions]
  }
}

