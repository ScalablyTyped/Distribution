package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TextField/TextField.TextFieldClassKey>> */
trait PartialClassNameMapTextFieldClassKey extends js.Object {
  var fullWidth: js.UndefOr[java.lang.String] = js.undefined
  var marginDense: js.UndefOr[java.lang.String] = js.undefined
  var marginNormal: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapTextFieldClassKey {
  @scala.inline
  def apply(
    fullWidth: java.lang.String = null,
    marginDense: java.lang.String = null,
    marginNormal: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapTextFieldClassKey = {
    val __obj = js.Dynamic.literal()
    if (fullWidth != null) __obj.updateDynamic("fullWidth")(fullWidth)
    if (marginDense != null) __obj.updateDynamic("marginDense")(marginDense)
    if (marginNormal != null) __obj.updateDynamic("marginNormal")(marginNormal)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapTextFieldClassKey]
  }
}

