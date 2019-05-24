package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputAdornment/InputAdornment.InputAdornmentClassKey>> */
trait PartialClassNameMapInputAdornmentClassKey extends js.Object {
  var disablePointerEvents: js.UndefOr[java.lang.String] = js.undefined
  var filled: js.UndefOr[java.lang.String] = js.undefined
  var positionEnd: js.UndefOr[java.lang.String] = js.undefined
  var positionStart: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object PartialClassNameMapInputAdornmentClassKey {
  @scala.inline
  def apply(
    disablePointerEvents: java.lang.String = null,
    filled: java.lang.String = null,
    positionEnd: java.lang.String = null,
    positionStart: java.lang.String = null,
    root: java.lang.String = null
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

