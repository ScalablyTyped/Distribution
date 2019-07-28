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
    if (dense != null) __obj.updateDynamic("dense")(dense)
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (root != null) __obj.updateDynamic("root")(root)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    if (textDense != null) __obj.updateDynamic("textDense")(textDense)
    __obj.asInstanceOf[PartialClassNameMapListItemTextClassKey]
  }
}

