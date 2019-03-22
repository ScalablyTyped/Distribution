package typings
package grommetLib.componentsAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var as: js.UndefOr[grommetLib.utilsMod.PolymorphicType] = js.undefined
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_Dark] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.xxlarge | java.lang.String
  ] = js.undefined
}

object AnchorProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    as: grommetLib.utilsMod.PolymorphicType = null,
    color: java.lang.String | grommetLib.Anon_Dark = null,
    gridArea: java.lang.String = null,
    href: java.lang.String = null,
    icon: reactLib.reactMod.Global.JSXNs.Element = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onClick: /* repeated */ js.Any => _ = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    size: grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.xxlarge | java.lang.String = null
  ): AnchorProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
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

