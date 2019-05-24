package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableCell/TableCell.TableCellClassKey>> */
trait PartialClassNameMapTableCellClassKey extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[java.lang.String] = js.undefined
  var head: js.UndefOr[java.lang.String] = js.undefined
  var numeric: js.UndefOr[java.lang.String] = js.undefined
  var paddingCheckbox: js.UndefOr[java.lang.String] = js.undefined
  var paddingDense: js.UndefOr[java.lang.String] = js.undefined
  var paddingNone: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapTableCellClassKey {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    footer: java.lang.String = null,
    head: java.lang.String = null,
    numeric: java.lang.String = null,
    paddingCheckbox: java.lang.String = null,
    paddingDense: java.lang.String = null,
    paddingNone: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapTableCellClassKey = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (head != null) __obj.updateDynamic("head")(head)
    if (numeric != null) __obj.updateDynamic("numeric")(numeric)
    if (paddingCheckbox != null) __obj.updateDynamic("paddingCheckbox")(paddingCheckbox)
    if (paddingDense != null) __obj.updateDynamic("paddingDense")(paddingDense)
    if (paddingNone != null) __obj.updateDynamic("paddingNone")(paddingNone)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTableCellClassKey]
  }
}

