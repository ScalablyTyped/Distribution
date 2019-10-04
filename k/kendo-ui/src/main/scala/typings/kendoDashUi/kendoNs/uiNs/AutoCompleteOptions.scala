package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  var animation: js.UndefOr[Boolean | AutoCompleteAnimation] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ AutoCompleteChangeEvent, Unit]] = js.undefined
  var clearButton: js.UndefOr[Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ AutoCompleteCloseEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ AutoCompleteDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var dataTextField: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ AutoCompleteFilteringEvent, Unit]] = js.undefined
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.undefined
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var groupTemplate: js.UndefOr[String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var highlightFirst: js.UndefOr[Boolean] = js.undefined
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ AutoCompleteOpenEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[js.Any] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ AutoCompleteSelectEvent, Unit]] = js.undefined
  var separator: js.UndefOr[String | js.Any] = js.undefined
  var suggest: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  var virtual: js.UndefOr[Boolean | AutoCompleteVirtual] = js.undefined
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    animation: Boolean | AutoCompleteAnimation = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ AutoCompleteChangeEvent => Unit = null,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    close: /* e */ AutoCompleteCloseEvent => Unit = null,
    dataBound: /* e */ AutoCompleteDataBoundEvent => Unit = null,
    dataSource: js.Any | DataSource = null,
    dataTextField: String = null,
    delay: Int | Double = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    filtering: /* e */ AutoCompleteFilteringEvent => Unit = null,
    fixedGroupTemplate: String | js.Function = null,
    footerTemplate: String | js.Function = null,
    groupTemplate: String | js.Function = null,
    headerTemplate: String | js.Function = null,
    height: Int | Double = null,
    highlightFirst: js.UndefOr[Boolean] = js.undefined,
    ignoreCase: js.UndefOr[Boolean] = js.undefined,
    minLength: Int | Double = null,
    name: String = null,
    noDataTemplate: String | js.Function | Boolean = null,
    open: /* e */ AutoCompleteOpenEvent => Unit = null,
    placeholder: String = null,
    popup: js.Any = null,
    select: /* e */ AutoCompleteSelectEvent => Unit = null,
    separator: String | js.Any = null,
    suggest: js.UndefOr[Boolean] = js.undefined,
    template: String | js.Function = null,
    value: String = null,
    valuePrimitive: js.UndefOr[Boolean] = js.undefined,
    virtual: Boolean | AutoCompleteVirtual = null
  ): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(enforceMinLength)) __obj.updateDynamic("enforceMinLength")(enforceMinLength)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filtering != null) __obj.updateDynamic("filtering")(js.Any.fromFunction1(filtering))
    if (fixedGroupTemplate != null) __obj.updateDynamic("fixedGroupTemplate")(fixedGroupTemplate.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirst)) __obj.updateDynamic("highlightFirst")(highlightFirst)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(suggest)) __obj.updateDynamic("suggest")(suggest)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive)
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteOptions]
  }
}

