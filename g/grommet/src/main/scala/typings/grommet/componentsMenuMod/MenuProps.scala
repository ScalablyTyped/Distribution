package typings.grommet.componentsMenuMod

import typings.grommet.Anon_BottomLeftRight
import typings.grommet.Anon_CloseMenu
import typings.grommet.Anon_ColorMedium
import typings.grommet.componentsDropMod.DropProps
import typings.grommet.grommetStrings.around
import typings.grommet.grommetStrings.between
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropAlign: js.UndefOr[Anon_BottomLeftRight] = js.undefined
  var dropBackground: js.UndefOr[String | Anon_ColorMedium] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var icon: js.UndefOr[Boolean | ReactNode] = js.undefined
  var items: js.Array[js.Object]
  var justifyContent: js.UndefOr[start | center | end | between | around | stretch] = js.undefined
  var label: js.UndefOr[String | ReactNode] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[Anon_CloseMenu] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    items: js.Array[js.Object],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropAlign: Anon_BottomLeftRight = null,
    dropBackground: String | Anon_ColorMedium = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    gridArea: GridAreaType = null,
    icon: Boolean | ReactNode = null,
    justifyContent: start | center | end | between | around | stretch = null,
    label: String | ReactNode = null,
    margin: MarginType = null,
    messages: Anon_CloseMenu = null,
    open: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign)
    if (dropBackground != null) __obj.updateDynamic("dropBackground")(dropBackground.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

