package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/InputAdornment.InputAdornmentClassKey>> */
@js.native
trait PartialStyleRulesInputAdornmentClassKey extends js.Object {
  var disablePointerEvents: js.UndefOr[CSSProperties] = js.native
  var filled: js.UndefOr[CSSProperties] = js.native
  var positionEnd: js.UndefOr[CSSProperties] = js.native
  var positionStart: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesInputAdornmentClassKey {
  @scala.inline
  def apply(
    disablePointerEvents: CSSProperties = null,
    filled: CSSProperties = null,
    positionEnd: CSSProperties = null,
    positionStart: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesInputAdornmentClassKey = {
    val __obj = js.Dynamic.literal()
    if (disablePointerEvents != null) __obj.updateDynamic("disablePointerEvents")(disablePointerEvents.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    if (positionEnd != null) __obj.updateDynamic("positionEnd")(positionEnd.asInstanceOf[js.Any])
    if (positionStart != null) __obj.updateDynamic("positionStart")(positionStart.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesInputAdornmentClassKey]
  }
}

