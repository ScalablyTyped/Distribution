package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | AutoCompleteAnimation] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ AutoCompleteChangeEvent, scala.Unit]] = js.undefined
  var clearButton: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ AutoCompleteCloseEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ AutoCompleteDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ AutoCompleteFilteringEvent, scala.Unit]] = js.undefined
  var fixedGroupTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var footerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var groupTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var highlightFirst: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noDataTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ AutoCompleteOpenEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var popup: js.UndefOr[js.Any] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ AutoCompleteSelectEvent, scala.Unit]] = js.undefined
  var separator: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var suggest: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined
  var virtual: js.UndefOr[scala.Boolean | AutoCompleteVirtual] = js.undefined
}

object AutoCompleteOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | AutoCompleteAnimation = null,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    change: /* e */ AutoCompleteChangeEvent => scala.Unit = null,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    close: /* e */ AutoCompleteCloseEvent => scala.Unit = null,
    dataBound: /* e */ AutoCompleteDataBoundEvent => scala.Unit = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTextField: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined,
    filter: java.lang.String = null,
    filtering: /* e */ AutoCompleteFilteringEvent => scala.Unit = null,
    fixedGroupTemplate: java.lang.String | js.Function = null,
    footerTemplate: java.lang.String | js.Function = null,
    groupTemplate: java.lang.String | js.Function = null,
    headerTemplate: java.lang.String | js.Function = null,
    height: scala.Int | scala.Double = null,
    highlightFirst: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    minLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    noDataTemplate: java.lang.String | js.Function = null,
    open: /* e */ AutoCompleteOpenEvent => scala.Unit = null,
    placeholder: java.lang.String = null,
    popup: js.Any = null,
    select: /* e */ AutoCompleteSelectEvent => scala.Unit = null,
    separator: java.lang.String | js.Any = null,
    suggest: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String | js.Function = null,
    value: java.lang.String = null,
    valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined,
    virtual: scala.Boolean | AutoCompleteVirtual = null
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

