package typings.grommet.menuMod

import typings.grommet.AnonCloseMenu
import typings.grommet.AnonOpacity
import typings.grommet.AnonTop
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.JustifyContentType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropAlign: js.UndefOr[AnonTop] = js.undefined
  var dropBackground: js.UndefOr[String | AnonOpacity] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var icon: js.UndefOr[Boolean | ReactNode] = js.undefined
  var items: js.Array[js.Object]
  var justifyContent: js.UndefOr[JustifyContentType] = js.undefined
  var label: js.UndefOr[String | ReactNode] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[AnonCloseMenu] = js.undefined
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
    dropAlign: AnonTop = null,
    dropBackground: String | AnonOpacity = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    gridArea: GridAreaType = null,
    icon: Boolean | ReactNode = null,
    justifyContent: JustifyContentType = null,
    label: String | ReactNode = null,
    margin: MarginType = null,
    messages: AnonCloseMenu = null,
    open: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | String = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign.asInstanceOf[js.Any])
    if (dropBackground != null) __obj.updateDynamic("dropBackground")(dropBackground.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

