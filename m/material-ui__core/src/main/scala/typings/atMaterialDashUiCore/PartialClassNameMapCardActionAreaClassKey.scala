package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActionArea/CardActionArea.CardActionAreaClassKey>> */
trait PartialClassNameMapCardActionAreaClassKey extends js.Object {
  var focusHighlight: js.UndefOr[String] = js.undefined
  var focusVisible: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapCardActionAreaClassKey {
  @scala.inline
  def apply(focusHighlight: String = null, focusVisible: String = null, root: String = null): PartialClassNameMapCardActionAreaClassKey = {
    val __obj = js.Dynamic.literal()
    if (focusHighlight != null) __obj.updateDynamic("focusHighlight")(focusHighlight)
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapCardActionAreaClassKey]
  }
}

