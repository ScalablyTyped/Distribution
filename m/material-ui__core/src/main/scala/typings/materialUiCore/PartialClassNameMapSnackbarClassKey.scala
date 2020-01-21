package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Snackbar/Snackbar.SnackbarClassKey>> */
@js.native
trait PartialClassNameMapSnackbarClassKey extends js.Object {
  var anchorOriginBottomCenter: js.UndefOr[String] = js.native
  var anchorOriginBottomLeft: js.UndefOr[String] = js.native
  var anchorOriginBottomRight: js.UndefOr[String] = js.native
  var anchorOriginTopCenter: js.UndefOr[String] = js.native
  var anchorOriginTopLeft: js.UndefOr[String] = js.native
  var anchorOriginTopRight: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapSnackbarClassKey {
  @scala.inline
  def apply(
    anchorOriginBottomCenter: String = null,
    anchorOriginBottomLeft: String = null,
    anchorOriginBottomRight: String = null,
    anchorOriginTopCenter: String = null,
    anchorOriginTopLeft: String = null,
    anchorOriginTopRight: String = null,
    root: String = null
  ): PartialClassNameMapSnackbarClassKey = {
    val __obj = js.Dynamic.literal()
    if (anchorOriginBottomCenter != null) __obj.updateDynamic("anchorOriginBottomCenter")(anchorOriginBottomCenter.asInstanceOf[js.Any])
    if (anchorOriginBottomLeft != null) __obj.updateDynamic("anchorOriginBottomLeft")(anchorOriginBottomLeft.asInstanceOf[js.Any])
    if (anchorOriginBottomRight != null) __obj.updateDynamic("anchorOriginBottomRight")(anchorOriginBottomRight.asInstanceOf[js.Any])
    if (anchorOriginTopCenter != null) __obj.updateDynamic("anchorOriginTopCenter")(anchorOriginTopCenter.asInstanceOf[js.Any])
    if (anchorOriginTopLeft != null) __obj.updateDynamic("anchorOriginTopLeft")(anchorOriginTopLeft.asInstanceOf[js.Any])
    if (anchorOriginTopRight != null) __obj.updateDynamic("anchorOriginTopRight")(anchorOriginTopRight.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapSnackbarClassKey]
  }
}

