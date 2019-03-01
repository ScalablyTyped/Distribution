package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | MultiSelectAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ MultiSelectChangeEvent, scala.Unit]] = js.undefined
  var clearButton: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ MultiSelectCloseEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ MultiSelectDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var deselect: js.UndefOr[js.Function1[/* e */ MultiSelectDeselectEvent, scala.Unit]] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ MultiSelectFilteringEvent, scala.Unit]] = js.undefined
  var fixedGroupTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var footerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var groupTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var highlightFirst: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var itemTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var maxSelectedItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noDataTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ MultiSelectOpenEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var popup: js.UndefOr[MultiSelectPopup] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ MultiSelectSelectEvent, scala.Unit]] = js.undefined
  var tagMode: js.UndefOr[java.lang.String] = js.undefined
  var tagTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined
  var virtual: js.UndefOr[scala.Boolean | MultiSelectVirtual] = js.undefined
}

object MultiSelectOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | MultiSelectAnimation = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ MultiSelectChangeEvent, scala.Unit] = null,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    close: js.Function1[/* e */ MultiSelectCloseEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ MultiSelectDataBoundEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataTextField: java.lang.String = null,
    dataValueField: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    deselect: js.Function1[/* e */ MultiSelectDeselectEvent, scala.Unit] = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined,
    filter: java.lang.String = null,
    filtering: js.Function1[/* e */ MultiSelectFilteringEvent, scala.Unit] = null,
    fixedGroupTemplate: java.lang.String | js.Function = null,
    footerTemplate: java.lang.String | js.Function = null,
    groupTemplate: java.lang.String | js.Function = null,
    headerTemplate: java.lang.String | js.Function = null,
    height: scala.Int | scala.Double = null,
    highlightFirst: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    itemTemplate: java.lang.String | js.Function = null,
    maxSelectedItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    noDataTemplate: java.lang.String | js.Function = null,
    open: js.Function1[/* e */ MultiSelectOpenEvent, scala.Unit] = null,
    placeholder: java.lang.String = null,
    popup: MultiSelectPopup = null,
    select: js.Function1[/* e */ MultiSelectSelectEvent, scala.Unit] = null,
    tagMode: java.lang.String = null,
    tagTemplate: java.lang.String | js.Function = null,
    value: js.Any = null,
    valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined,
    virtual: scala.Boolean | MultiSelectVirtual = null
  ): MultiSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (change != null) __obj.updateDynamic("change")(change)
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (close != null) __obj.updateDynamic("close")(close)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataTextField != null) __obj.updateDynamic("dataTextField")(dataTextField)
    if (dataValueField != null) __obj.updateDynamic("dataValueField")(dataValueField)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (deselect != null) __obj.updateDynamic("deselect")(deselect)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(enforceMinLength)) __obj.updateDynamic("enforceMinLength")(enforceMinLength)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filtering != null) __obj.updateDynamic("filtering")(filtering)
    if (fixedGroupTemplate != null) __obj.updateDynamic("fixedGroupTemplate")(fixedGroupTemplate.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (groupTemplate != null) __obj.updateDynamic("groupTemplate")(groupTemplate.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirst)) __obj.updateDynamic("highlightFirst")(highlightFirst)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(itemTemplate.asInstanceOf[js.Any])
    if (maxSelectedItems != null) __obj.updateDynamic("maxSelectedItems")(maxSelectedItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (select != null) __obj.updateDynamic("select")(select)
    if (tagMode != null) __obj.updateDynamic("tagMode")(tagMode)
    if (tagTemplate != null) __obj.updateDynamic("tagTemplate")(tagTemplate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive)
    if (virtual != null) __obj.updateDynamic("virtual")(virtual.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptions]
  }
}

