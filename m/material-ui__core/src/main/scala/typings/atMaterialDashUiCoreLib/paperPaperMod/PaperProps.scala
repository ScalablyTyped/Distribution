package typings
package atMaterialDashUiCoreLib.paperPaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLDivElement>[P]} */ trait PaperProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[PaperClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[PaperProps]] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var square: js.UndefOr[scala.Boolean] = js.undefined
}

object PaperProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[PaperClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[PaperProps] = null,
    elevation: scala.Int | scala.Double = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    square: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): PaperProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(square)) __obj.updateDynamic("square")(square)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PaperProps]
  }
}

