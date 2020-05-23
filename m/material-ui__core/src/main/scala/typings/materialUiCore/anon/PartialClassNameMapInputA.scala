package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputAdornment/InputAdornment.InputAdornmentClassKey>> */
@js.native
trait PartialClassNameMapInputA extends js.Object {
  var disablePointerEvents: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var positionEnd: js.UndefOr[String] = js.native
  var positionStart: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapInputA {
  @scala.inline
  def apply(
    disablePointerEvents: String = null,
    filled: String = null,
    positionEnd: String = null,
    positionStart: String = null,
    root: String = null
  ): PartialClassNameMapInputA = {
    val __obj = js.Dynamic.literal()
    if (disablePointerEvents != null) __obj.updateDynamic("disablePointerEvents")(disablePointerEvents.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (positionEnd != null) __obj.updateDynamic("positionEnd")(positionEnd.asInstanceOf[js.Any])
    if (positionStart != null) __obj.updateDynamic("positionStart")(positionStart.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapInputA]
  }
}

