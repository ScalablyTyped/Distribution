package typings.jqueryMaskPlugin.jQueryMask

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var fallback: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var pattern: js.UndefOr[RegExp] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object Pattern {
  @scala.inline
  def apply(
    fallback: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    pattern: RegExp = null,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

