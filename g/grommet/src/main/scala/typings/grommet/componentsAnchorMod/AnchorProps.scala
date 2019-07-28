package typings.grommet.componentsAnchorMod

import typings.grommet.Anon_Bottom
import typings.grommet.Anon_Dark
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.PolymorphicType
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
}

object AnchorProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    alignSelf: start | center | end | stretch = null,
    as: PolymorphicType = null,
    color: String | Anon_Dark = null,
    gridArea: String = null,
    href: String = null,
    icon: Element = null,
    label: ReactNode = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    onClick: /* repeated */ js.Any => _ = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    size: xsmall | small | medium | large | xlarge | xxlarge | String = null
  ): AnchorProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorProps]
  }
}

