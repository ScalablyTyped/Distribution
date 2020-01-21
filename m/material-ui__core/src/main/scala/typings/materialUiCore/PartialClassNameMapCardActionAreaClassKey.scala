package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardActionArea/CardActionArea.CardActionAreaClassKey>> */
@js.native
trait PartialClassNameMapCardActionAreaClassKey extends js.Object {
  var focusHighlight: js.UndefOr[String] = js.native
  var focusVisible: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapCardActionAreaClassKey {
  @scala.inline
  def apply(focusHighlight: String = null, focusVisible: String = null, root: String = null): PartialClassNameMapCardActionAreaClassKey = {
    val __obj = js.Dynamic.literal()
    if (focusHighlight != null) __obj.updateDynamic("focusHighlight")(focusHighlight.asInstanceOf[js.Any])
    if (focusVisible != null) __obj.updateDynamic("focusVisible")(focusVisible.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapCardActionAreaClassKey]
  }
}

