package typings
package atMaterialDashUiCoreLib.listItemSecondaryActionListItemSecondaryActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/ListItemSecondaryAction/ListItemSecondaryAction.ListItemSecondaryActionClassKey, never> */
trait ListItemSecondaryActionProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[atMaterialDashUiCoreLib.PartialClassNameMapListItemSecondaryActionClassKey] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ListItemSecondaryActionProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: atMaterialDashUiCoreLib.PartialClassNameMapListItemSecondaryActionClassKey = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ListItemSecondaryActionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListItemSecondaryActionProps]
  }
}

