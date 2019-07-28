package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelClassKey>> */
trait PartialClassNameMapFormLabelClassKey extends js.Object {
  var asterisk: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var filled: js.UndefOr[String] = js.undefined
  var focused: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapFormLabelClassKey {
  @scala.inline
  def apply(
    asterisk: String = null,
    disabled: String = null,
    error: String = null,
    filled: String = null,
    focused: String = null,
    required: String = null,
    root: String = null
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

