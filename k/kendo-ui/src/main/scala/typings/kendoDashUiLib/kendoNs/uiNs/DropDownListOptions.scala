package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | DropDownListAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var cascade: js.UndefOr[js.Function1[/* e */ DropDownListCascadeEvent, scala.Unit]] = js.undefined
  var cascadeFrom: js.UndefOr[java.lang.String] = js.undefined
  var cascadeFromField: js.UndefOr[java.lang.String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DropDownListChangeEvent, scala.Unit]] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DropDownListCloseEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownListDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownListFilteringEvent, scala.Unit]] = js.undefined
  var fixedGroupTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var footerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var groupTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noDataTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DropDownListOpenEvent, scala.Unit]] = js.undefined
  var optionLabel: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var optionLabelTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var popup: js.UndefOr[DropDownListPopup] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DropDownListSelectEvent, scala.Unit]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined
  var valueTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var virtual: js.UndefOr[scala.Boolean | DropDownListVirtual] = js.undefined
}

object DropDownListOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | DropDownListAnimation = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    cascade: /* e */ DropDownListCascadeEvent => scala.Unit = null,
    cascadeFrom: java.lang.String = null,
    cascadeFromField: java.lang.String = null,
    change: /* e */ DropDownListChangeEvent => scala.Unit = null,
    close: /* e */ DropDownListCloseEvent => scala.Unit = null,
    dataBound: /* e */ DropDownListDataBoundEvent => scala.Unit = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTextField: java.lang.String = null,
    dataValueField: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined,
    filter: java.lang.String = null,
    filtering: /* e */ DropDownListFilteringEvent => scala.Unit = null,
    fixedGroupTemplate: java.lang.String | js.Function = null,
    footerTemplate: java.lang.String | js.Function = null,
    groupTemplate: java.lang.String | js.Function = null,
    headerTemplate: java.lang.String | js.Function = null,
    height: scala.Int | scala.Double = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    noDataTemplate: java.lang.String | js.Function = null,
    open: /* e */ DropDownListOpenEvent => scala.Unit = null,
    optionLabel: java.lang.String | js.Any = null,
    optionLabelTemplate: java.lang.String | js.Function = null,
    popup: DropDownListPopup = null,
    select: /* e */ DropDownListSelectEvent => scala.Unit = null,
    template: java.lang.String | js.Function = null,
    text: java.lang.String = null,
    value: java.lang.String = null,
    valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined,
    valueTemplate: java.lang.String | js.Function = null,
    virtual: scala.Boolean | DropDownListVirtual = null
  ): DropDownListOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (cascade != null) __obj.updateDynamic("cascade")(js.Any.fromFunction1(cascade))
    if (cascadeFrom != null) __obj.updateDynamic("cascadeFrom")(cascadeFrom)
    if (cascadeFromField != null) __obj.updateDynamic("cascadeFromField")(cascadeFromField)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField)
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
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1(open))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (optionLabelTemplate != null) __obj.updateDynamic("optionLabelTemplate")(optionLabelTemplate.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive)
    if (valueTemplate != null) __obj.updateDynamic("valueTemplate")(valueTemplate.asInstanceOf[js.Any])
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListOptions]
  }
}

