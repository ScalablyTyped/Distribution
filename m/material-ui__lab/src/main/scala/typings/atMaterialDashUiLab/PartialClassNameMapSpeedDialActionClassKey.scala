package typings.atMaterialDashUiLab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialAction/SpeedDialAction.SpeedDialActionClassKey>> */
trait PartialClassNameMapSpeedDialActionClassKey extends js.Object {
  var button: js.UndefOr[String] = js.undefined
  var buttonClosed: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapSpeedDialActionClassKey {
  @scala.inline
  def apply(button: String = null, buttonClosed: String = null, root: String = null): PartialClassNameMapSpeedDialActionClassKey = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button)
    if (buttonClosed != null) __obj.updateDynamic("buttonClosed")(buttonClosed)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapSpeedDialActionClassKey]
  }
}

