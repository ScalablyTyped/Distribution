package typings.grommet.componentsSelectMod

import typings.grommet.Anon_BottomLeft
import typings.grommet.Anon_Multiple
import typings.grommet.componentsDropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var closeOnChange: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean | (js.Array[Double | String | js.Object])] = js.undefined
  var disabledKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var dropAlign: js.UndefOr[Anon_BottomLeft] = js.undefined
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var emptySearchMessage: js.UndefOr[String] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var icon: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _]) | ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[Anon_Multiple] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var options: js.Array[String | Boolean | Double | Element | js.Object]
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String | Element | js.Object | (js.Array[String | js.Object])] = js.undefined
  var valueKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var valueLabel: js.UndefOr[ReactNode] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    options: js.Array[String | Boolean | Double | Element | js.Object],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    children: /* repeated */ js.Any => _ = null,
    closeOnChange: js.UndefOr[Boolean] = js.undefined,
    disabled: Boolean | (js.Array[Double | String | js.Object]) = null,
    disabledKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    dropAlign: Anon_BottomLeft = null,
    dropHeight: xsmall | small | medium | large | xlarge | String = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    emptySearchMessage: String = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    icon: Boolean | (js.Function1[/* repeated */ js.Any, _]) | ReactNode = null,
    id: String = null,
    labelKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    margin: MarginType = null,
    messages: Anon_Multiple = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* repeated */ js.Any => Unit = null,
    onClose: /* repeated */ js.Any => _ = null,
    onMore: /* repeated */ js.Any => _ = null,
    onOpen: /* repeated */ js.Any => _ = null,
    onSearch: /* search */ String => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: PlaceHolderType = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    searchPlaceholder: String = null,
    selected: Double | js.Array[Double] = null,
    size: small | medium | large | xlarge | String = null,
    value: String | Element | js.Object | (js.Array[String | js.Object]) = null,
    valueKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    valueLabel: ReactNode = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal(options = options)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
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
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1(onMore))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (valueLabel != null) __obj.updateDynamic("valueLabel")(valueLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

