package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Snackbar/Snackbar.SnackbarClassKey>> */
trait PartialClassNameMapSnackbarClassKey extends js.Object {
  var anchorOriginBottomCenter: js.UndefOr[String] = js.undefined
  var anchorOriginBottomLeft: js.UndefOr[String] = js.undefined
  var anchorOriginBottomRight: js.UndefOr[String] = js.undefined
  var anchorOriginTopCenter: js.UndefOr[String] = js.undefined
  var anchorOriginTopLeft: js.UndefOr[String] = js.undefined
  var anchorOriginTopRight: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
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
    if (anchorOriginBottomCenter != null) __obj.updateDynamic("anchorOriginBottomCenter")(anchorOriginBottomCenter)
    if (anchorOriginBottomLeft != null) __obj.updateDynamic("anchorOriginBottomLeft")(anchorOriginBottomLeft)
    if (anchorOriginBottomRight != null) __obj.updateDynamic("anchorOriginBottomRight")(anchorOriginBottomRight)
    if (anchorOriginTopCenter != null) __obj.updateDynamic("anchorOriginTopCenter")(anchorOriginTopCenter)
    if (anchorOriginTopLeft != null) __obj.updateDynamic("anchorOriginTopLeft")(anchorOriginTopLeft)
    if (anchorOriginTopRight != null) __obj.updateDynamic("anchorOriginTopRight")(anchorOriginTopRight)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapSnackbarClassKey]
  }
}

