package typings
package atMaterialDashUiCoreLib.menuListMenuListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/List/List.ListProps, 'classes' | 'onKeyDown'> ]: @material-ui/core.@material-ui/core/List/List.ListProps[P]} */ trait MenuListProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MenuListClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var disableListWrap: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.ReactEventHandler[reactLib.reactMod.KeyboardEvent[_]]] = js.undefined
}

object MenuListProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MenuListClassKey]] = null,
    disableListWrap: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    onKeyDown: reactLib.reactMod.ReactEventHandler[reactLib.reactMod.KeyboardEvent[_]] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): MenuListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableListWrap)) __obj.updateDynamic("disableListWrap")(disableListWrap)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenuListProps]
  }
}

