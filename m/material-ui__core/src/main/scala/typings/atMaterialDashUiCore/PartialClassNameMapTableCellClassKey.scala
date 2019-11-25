package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableCell/TableCell.TableCellClassKey>> */
trait PartialClassNameMapTableCellClassKey extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[String] = js.undefined
  var head: js.UndefOr[String] = js.undefined
  var numeric: js.UndefOr[String] = js.undefined
  var paddingCheckbox: js.UndefOr[String] = js.undefined
  var paddingDense: js.UndefOr[String] = js.undefined
  var paddingNone: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTableCellClassKey {
  @scala.inline
  def apply(
    body: String = null,
    footer: String = null,
    head: String = null,
    numeric: String = null,
    paddingCheckbox: String = null,
    paddingDense: String = null,
    paddingNone: String = null,
    root: String = null
  ): PartialClassNameMapTableCellClassKey = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (paddingCheckbox != null) __obj.updateDynamic("paddingCheckbox")(paddingCheckbox.asInstanceOf[js.Any])
    if (paddingDense != null) __obj.updateDynamic("paddingDense")(paddingDense.asInstanceOf[js.Any])
    if (paddingNone != null) __obj.updateDynamic("paddingNone")(paddingNone.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTableCellClassKey]
  }
}

