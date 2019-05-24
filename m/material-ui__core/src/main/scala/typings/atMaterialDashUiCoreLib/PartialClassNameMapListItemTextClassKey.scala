package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItemText/ListItemText.ListItemTextClassKey>> */
trait PartialClassNameMapListItemTextClassKey extends js.Object {
  var dense: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var secondary: js.UndefOr[java.lang.String] = js.undefined
  var textDense: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapListItemTextClassKey {
  @scala.inline
  def apply(
    dense: java.lang.String = null,
    inset: java.lang.String = null,
    primary: java.lang.String = null,
    root: java.lang.String = null,
    secondary: java.lang.String = null,
    textDense: java.lang.String = null
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

