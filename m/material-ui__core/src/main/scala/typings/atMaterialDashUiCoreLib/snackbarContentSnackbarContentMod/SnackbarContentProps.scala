package typings
package atMaterialDashUiCoreLib.snackbarContentSnackbarContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Paper/Paper.PaperProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/Paper/Paper.PaperProps[P]} */ trait SnackbarContentProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SnackbarContentClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var action: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var message: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SnackbarContentProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SnackbarContentClassKey]
    ] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    message: reactLib.reactMod.ReactNs.ReactNode = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SnackbarContentProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SnackbarContentProps]
  }
}

