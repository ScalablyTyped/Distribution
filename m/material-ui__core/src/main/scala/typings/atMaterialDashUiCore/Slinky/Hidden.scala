package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.JS
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.css
import typings.atMaterialDashUiCore.hiddenHiddenMod.HiddenProps
import typings.atMaterialDashUiCore.hiddenMod.default
import typings.atMaterialDashUiCore.stylesCreateBreakpointsMod.Breakpoint
import typings.atMaterialDashUiCore.stylesWithStylesMod.ClassNameMap
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Hidden
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.hiddenMod.default].asInstanceOf[String | js.Object]
  def apply(
    classes: Partial[ClassNameMap[scala.Nothing]] = null,
    implementation: JS | css = null,
    initialWidth: Breakpoint = null,
    innerRef: Ref[_] | RefObject[_] = null,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: Breakpoint | js.Array[Breakpoint] = null,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(lgDown)) __obj.updateDynamic("lgDown")(lgDown)
    if (!js.isUndefined(lgUp)) __obj.updateDynamic("lgUp")(lgUp)
    if (!js.isUndefined(mdDown)) __obj.updateDynamic("mdDown")(mdDown)
    if (!js.isUndefined(mdUp)) __obj.updateDynamic("mdUp")(mdUp)
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (!js.isUndefined(smDown)) __obj.updateDynamic("smDown")(smDown)
    if (!js.isUndefined(smUp)) __obj.updateDynamic("smUp")(smUp)
    if (!js.isUndefined(xlDown)) __obj.updateDynamic("xlDown")(xlDown)
    if (!js.isUndefined(xlUp)) __obj.updateDynamic("xlUp")(xlUp)
    if (!js.isUndefined(xsDown)) __obj.updateDynamic("xsDown")(xsDown)
    if (!js.isUndefined(xsUp)) __obj.updateDynamic("xsUp")(xsUp)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HiddenProps
}

