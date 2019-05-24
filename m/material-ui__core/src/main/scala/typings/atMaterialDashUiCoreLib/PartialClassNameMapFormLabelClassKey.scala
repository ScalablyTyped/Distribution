package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelClassKey>> */
trait PartialClassNameMapFormLabelClassKey extends js.Object {
  var asterisk: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var filled: js.UndefOr[java.lang.String] = js.undefined
  var focused: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapFormLabelClassKey {
  @scala.inline
  def apply(
    asterisk: java.lang.String = null,
    disabled: java.lang.String = null,
    error: java.lang.String = null,
    filled: java.lang.String = null,
    focused: java.lang.String = null,
    required: java.lang.String = null,
    root: java.lang.String = null
  ): PartialClassNameMapFormLabelClassKey = {
    val __obj = js.Dynamic.literal()
    if (asterisk != null) __obj.updateDynamic("asterisk")(asterisk)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (required != null) __obj.updateDynamic("required")(required)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapFormLabelClassKey]
  }
}

