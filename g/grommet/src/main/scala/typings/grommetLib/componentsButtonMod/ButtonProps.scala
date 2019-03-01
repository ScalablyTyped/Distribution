package typings
package grommetLib.componentsButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var a11yTitle: js.UndefOr[java.lang.String] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var alignSelf: js.UndefOr[
    grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch
  ] = js.undefined
  var as: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String | grommetLib.Anon_Dark] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  var focusIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var gridArea: js.UndefOr[java.lang.String] = js.undefined
  var hoverIndicator: js.UndefOr[
    scala.Boolean | java.lang.String | grommetLib.grommetLibStrings.background | grommetLib.Anon_Background
  ] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var margin: js.UndefOr[
    grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    grommetLib.grommetLibStrings.button | grommetLib.grommetLibStrings.reset | grommetLib.grommetLibStrings.submit
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    a11yTitle: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    alignSelf: grommetLib.grommetLibStrings.start | grommetLib.grommetLibStrings.center | grommetLib.grommetLibStrings.end | grommetLib.grommetLibStrings.stretch = null,
    as: java.lang.String = null,
    color: java.lang.String | grommetLib.Anon_Dark = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    focusIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    gridArea: java.lang.String = null,
    hoverIndicator: scala.Boolean | java.lang.String | grommetLib.grommetLibStrings.background | grommetLib.Anon_Background = null,
    href: java.lang.String = null,
    icon: reactLib.reactMod.Global.JSXNs.Element = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    margin: grommetLib.grommetLibStrings.none | grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.Anon_Bottom | java.lang.String = null,
    onClick: js.Function1[/* repeated */ js.Any, _] = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: grommetLib.grommetLibStrings.button | grommetLib.grommetLibStrings.reset | grommetLib.grommetLibStrings.submit = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator)
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (hoverIndicator != null) __obj.updateDynamic("hoverIndicator")(hoverIndicator.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

