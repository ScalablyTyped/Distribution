package typings
package atMaterialDashUiCoreLib.appBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Paper/Paper.PaperProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/Paper/Paper.PaperProps[P]} */ trait AppBarProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[AppBarClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var color: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color] = js.undefined
  var position: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.absolute | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.sticky | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.relative
  ] = js.undefined
}

object AppBarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[AppBarClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    position: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fixed | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.absolute | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.sticky | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.static | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.relative = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): AppBarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AppBarProps]
  }
}

