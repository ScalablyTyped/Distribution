package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItemText/ListItemText.ListItemTextClassKey>> */
trait PartialClassNameMapListItemTextClassKey extends js.Object {
  var dense: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var secondary: js.UndefOr[String] = js.undefined
  var textDense: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapListItemTextClassKey {
  @scala.inline
  def apply(
    dense: String = null,
    inset: String = null,
    primary: String = null,
    root: String = null,
    secondary: String = null,
    textDense: String = null
  ): PartialClassNameMapListItemTextClassKey = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (textDense != null) __obj.updateDynamic("textDense")(textDense.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapListItemTextClassKey]
  }
}

