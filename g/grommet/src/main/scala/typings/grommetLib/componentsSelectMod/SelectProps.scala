package typings
package grommetLib.componentsSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var closeOnChange: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean | (js.Array[scala.Double | java.lang.String | js.Object])] = js.undefined
  var disabledKey: js.UndefOr[java.lang.String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var dropAlign: js.UndefOr[grommetLib.Anon_BottomLeft] = js.undefined
  var dropHeight: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var dropProps: js.UndefOr[grommetLib.componentsDropMod.DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var emptySearchMessage: js.UndefOr[java.lang.String] = js.undefined
  var focusIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labelKey: js.UndefOr[java.lang.String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var messages: js.UndefOr[grommetLib.Anon_Multiple] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.Array[java.lang.String | reactLib.reactMod.Global.JSXNs.Element | js.Object]
  var placeholder: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var searchPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String
  ] = js.undefined
  var value: js.UndefOr[
    java.lang.String | reactLib.reactMod.Global.JSXNs.Element | js.Object | (js.Array[java.lang.String | js.Object])
  ] = js.undefined
  var valueKey: js.UndefOr[java.lang.String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var valueLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    options: js.Array[java.lang.String | reactLib.reactMod.Global.JSXNs.Element | js.Object],
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    children: /* repeated */ js.Any => _ = null,
    closeOnChange: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: scala.Boolean | (js.Array[scala.Double | java.lang.String | js.Object]) = null,
    disabledKey: java.lang.String | (js.Function1[/* repeated */ js.Any, _]) = null,
    dropAlign: grommetLib.Anon_BottomLeft = null,
    dropHeight: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    dropProps: grommetLib.componentsDropMod.DropProps = null,
    dropTarget: js.Object = null,
    emptySearchMessage: java.lang.String = null,
    focusIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    gridArea: java.lang.String = null,
    icon: scala.Boolean | (js.Function1[/* repeated */ js.Any, _]) = null,
    id: java.lang.String = null,
    labelKey: java.lang.String | (js.Function1[/* repeated */ js.Any, _]) = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    messages: grommetLib.Anon_Multiple = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* repeated */ js.Any => _ = null,
    onClose: /* repeated */ js.Any => _ = null,
    onOpen: /* repeated */ js.Any => _ = null,
    onSearch: /* repeated */ js.Any => _ = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    searchPlaceholder: java.lang.String = null,
    selected: scala.Double | js.Array[scala.Double] = null,
    size: grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | java.lang.String = null,
    value: java.lang.String | reactLib.reactMod.Global.JSXNs.Element | js.Object | (js.Array[java.lang.String | js.Object]) = null,
    valueKey: java.lang.String | (js.Function1[/* repeated */ js.Any, _]) = null,
    valueLabel: reactLib.reactMod.ReactNs.ReactNode = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal(options = options)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(closeOnChange)) __obj.updateDynamic("closeOnChange")(closeOnChange)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledKey != null) __obj.updateDynamic("disabledKey")(disabledKey.asInstanceOf[js.Any])
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign)
    if (dropHeight != null) __obj.updateDynamic("dropHeight")(dropHeight.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (emptySearchMessage != null) __obj.updateDynamic("emptySearchMessage")(emptySearchMessage)
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (valueLabel != null) __obj.updateDynamic("valueLabel")(valueLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

