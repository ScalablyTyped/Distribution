package typings
package atMaterialDashUiCoreLib.withWidthWithWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth ]:? @material-ui/core.@material-ui/core/withWidth/withWidth.WithWidth[P]} */ trait WithWidthProps extends js.Object {
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
}

object WithWidthProps {
  @scala.inline
  def apply(innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null): WithWidthProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithWidthProps]
  }
}

