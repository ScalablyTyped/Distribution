package typings.grommet.componentsButtonMod

import typings.grommet.Anon_Background
import typings.grommet.Anon_Bottom
import typings.grommet.Anon_Dark
import typings.grommet.grommetStrings._blank
import typings.grommet.grommetStrings._parent
import typings.grommet.grommetStrings._self
import typings.grommet.grommetStrings._top
import typings.grommet.grommetStrings.background
import typings.grommet.grommetStrings.button
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.reset
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.submit
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.PolymorphicType
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[horizontal | vertical | Boolean] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var gap: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var hoverIndicator: js.UndefOr[Boolean | String | background | Anon_Background] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Element] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
  var `type`: js.UndefOr[button | reset | submit] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    alignSelf: start | center | end | stretch = null,
    as: PolymorphicType = null,
    color: String | Anon_Dark = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: horizontal | vertical | Boolean = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gap: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    gridArea: String = null,
    hoverIndicator: Boolean | String | background | Anon_Background = null,
    href: String = null,
    icon: Element = null,
    label: ReactNode = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    onClick: /* repeated */ js.Any => _ = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    target: _self | _blank | _parent | _top = null,
    `type`: button | reset | submit = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator)
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (hoverIndicator != null) __obj.updateDynamic("hoverIndicator")(hoverIndicator.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

