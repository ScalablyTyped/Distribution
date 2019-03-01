package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownTreeOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean | DropDownTreeAnimation] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DropDownTreeChangeEvent, scala.Unit]] = js.undefined
  var checkAll: js.UndefOr[scala.Boolean] = js.undefined
  var checkAllTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var checkboxes: js.UndefOr[scala.Boolean | DropDownTreeCheckboxes] = js.undefined
  var clearButton: js.UndefOr[scala.Boolean] = js.undefined
  var close: js.UndefOr[js.Function1[/* e */ DropDownTreeCloseEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownTreeDataBoundEvent, scala.Unit]] = js.undefined
  var dataImageUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource] = js.undefined
  var dataSpriteCssClassField: js.UndefOr[java.lang.String] = js.undefined
  var dataTextField: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var dataUrlField: js.UndefOr[java.lang.String] = js.undefined
  var dataValueField: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownTreeFilteringEvent, scala.Unit]] = js.undefined
  var footerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var headerTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[DropDownTreeMessages] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noDataTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var open: js.UndefOr[js.Function1[/* e */ DropDownTreeOpenEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var popup: js.UndefOr[DropDownTreePopup] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DropDownTreeSelectEvent, scala.Unit]] = js.undefined
  var tagMode: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined
  var valueTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object DropDownTreeOptions {
  @scala.inline
  def apply(
    animation: scala.Boolean | DropDownTreeAnimation = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ DropDownTreeChangeEvent, scala.Unit] = null,
    checkAll: js.UndefOr[scala.Boolean] = js.undefined,
    checkAllTemplate: java.lang.String | js.Function = null,
    checkboxes: scala.Boolean | DropDownTreeCheckboxes = null,
    clearButton: js.UndefOr[scala.Boolean] = js.undefined,
    close: js.Function1[/* e */ DropDownTreeCloseEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ DropDownTreeDataBoundEvent, scala.Unit] = null,
    dataImageUrlField: java.lang.String = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.HierarchicalDataSource = null,
    dataSpriteCssClassField: java.lang.String = null,
    dataTextField: java.lang.String | js.Any = null,
    dataUrlField: java.lang.String = null,
    dataValueField: java.lang.String | js.Any = null,
    delay: scala.Int | scala.Double = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    enforceMinLength: js.UndefOr[scala.Boolean] = js.undefined,
    filter: java.lang.String = null,
    filtering: js.Function1[/* e */ DropDownTreeFilteringEvent, scala.Unit] = null,
    footerTemplate: java.lang.String | js.Function = null,
    headerTemplate: java.lang.String | js.Function = null,
    height: java.lang.String | scala.Double = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    loadOnDemand: js.UndefOr[scala.Boolean] = js.undefined,
    messages: DropDownTreeMessages = null,
    minLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    noDataTemplate: java.lang.String | js.Function = null,
    open: js.Function1[/* e */ DropDownTreeOpenEvent, scala.Unit] = null,
    placeholder: java.lang.String = null,
    popup: DropDownTreePopup = null,
    select: js.Function1[/* e */ DropDownTreeSelectEvent, scala.Unit] = null,
    tagMode: java.lang.String = null,
    template: java.lang.String | js.Function = null,
    text: java.lang.String = null,
    value: java.lang.String | js.Any = null,
    valuePrimitive: js.UndefOr[scala.Boolean] = js.undefined,
    valueTemplate: java.lang.String | js.Function = null
  ): DropDownTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (change != null) __obj.updateDynamic("change")(change)
    if (!js.isUndefined(checkAll)) __obj.updateDynamic("checkAll")(checkAll)
    if (checkAllTemplate != null) __obj.updateDynamic("checkAllTemplate")(checkAllTemplate.asInstanceOf[js.Any])
    if (checkboxes != null) __obj.updateDynamic("checkboxes")(checkboxes.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton)
    if (close != null) __obj.updateDynamic("close")(close)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
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
    if (filtering != null) __obj.updateDynamic("filtering")(filtering)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noDataTemplate != null) __obj.updateDynamic("noDataTemplate")(noDataTemplate.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    if (select != null) __obj.updateDynamic("select")(select)
    if (tagMode != null) __obj.updateDynamic("tagMode")(tagMode)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valuePrimitive)) __obj.updateDynamic("valuePrimitive")(valuePrimitive)
    if (valueTemplate != null) __obj.updateDynamic("valueTemplate")(valueTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownTreeOptions]
  }
}

