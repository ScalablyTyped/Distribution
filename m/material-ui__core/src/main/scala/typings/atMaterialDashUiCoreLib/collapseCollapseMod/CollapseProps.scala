package typings
package atMaterialDashUiCoreLib.collapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/transitions/transition.TransitionProps, 'classes' | 'timeout'> ]: @material-ui/core.@material-ui/core/transitions/transition.TransitionProps[P]} */ trait CollapseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[CollapseClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var collapsedHeight: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[CollapseProps]] = js.undefined
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
  var timeout: js.UndefOr[scala.Nothing | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CollapseClassKey]] = null,
    collapsedHeight: java.lang.String = null,
    component: reactLib.reactMod.ReactNs.ReactType[CollapseProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme = null,
    timeout: scala.Nothing | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

