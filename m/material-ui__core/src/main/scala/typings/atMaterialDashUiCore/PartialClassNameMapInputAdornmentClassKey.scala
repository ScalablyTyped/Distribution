package typings.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputAdornment/InputAdornment.InputAdornmentClassKey>> */
trait PartialClassNameMapInputAdornmentClassKey extends js.Object {
  var disablePointerEvents: js.UndefOr[String] = js.undefined
  var filled: js.UndefOr[String] = js.undefined
  var positionEnd: js.UndefOr[String] = js.undefined
  var positionStart: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
}

object PartialClassNameMapInputAdornmentClassKey {
  @scala.inline
  def apply(
    disablePointerEvents: String = null,
    filled: String = null,
    positionEnd: String = null,
    positionStart: String = null,
    root: String = null
  ): PartialClassNameMapInputAdornmentClassKey = {
    val __obj = js.Dynamic.literal()
    if (disablePointerEvents != null) __obj.updateDynamic("disablePointerEvents")(disablePointerEvents)
    if (filled != null) __obj.updateDynamic("filled")(filled)
    if (positionEnd != null) __obj.updateDynamic("positionEnd")(positionEnd)
    if (positionStart != null) __obj.updateDynamic("positionStart")(positionStart)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[PartialClassNameMapInputAdornmentClassKey]
  }
}

