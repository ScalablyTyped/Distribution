package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/RadioGroup/RadioGroup.RadioGroupClassKey>> */
trait PartialClassNameMapRadioGroupClassKey extends js.Object {
  var root: js.UndefOr[String] = js.undefined
  var row: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapRadioGroupClassKey {
  @scala.inline
  def apply(root: String = null, row: String = null): PartialClassNameMapRadioGroupClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[PartialClassNameMapRadioGroupClassKey]
  }
}

