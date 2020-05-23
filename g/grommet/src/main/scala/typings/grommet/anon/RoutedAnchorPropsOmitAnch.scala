package typings.grommet.anon

import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.push
import typings.grommet.grommetStrings.replace
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PolymorphicType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined grommet.grommet/components/RoutedAnchor.RoutedAnchorProps & grommet.grommet/utils.Omit<grommet.grommet/components/Anchor.AnchorProps, 'href'> */
trait RoutedAnchorPropsOmitAnch extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var method: js.UndefOr[push | replace] = js.undefined
  var path: String
  var reverse: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
}

object RoutedAnchorPropsOmitAnch {
  @scala.inline
  def apply(
    path: String,
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    as: PolymorphicType = null,
    color: ColorType = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    icon: Element = null,
    label: ReactNode = null,
    margin: MarginType = null,
    method: push | replace = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    size: xsmall | small | medium | large | xlarge | xxlarge | String = null
  ): RoutedAnchorPropsOmitAnch = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutedAnchorPropsOmitAnch]
  }
}

