package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey>> */
trait PartialClassNameMapRadioGroupClassKey extends js.Object {
  var root: js.UndefOr[java.lang.String] = js.undefined
  var row: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapRadioGroupClassKey {
  @scala.inline
  def apply(root: java.lang.String = null, row: java.lang.String = null): PartialClassNameMapRadioGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[PartialClassNameMapRadioGroupClassKey]
  }
}

