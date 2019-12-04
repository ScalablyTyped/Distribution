package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputBase/Textarea.TextareaClassKey>> */
trait PartialClassNameMapTextareaClassKey extends js.Object {
  var root: js.UndefOr[String] = js.undefined
  var shadow: js.UndefOr[String] = js.undefined
  var textarea: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapTextareaClassKey {
  @scala.inline
  def apply(root: String = null, shadow: String = null, textarea: String = null): PartialClassNameMapTextareaClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (textarea != null) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTextareaClassKey]
  }
}

