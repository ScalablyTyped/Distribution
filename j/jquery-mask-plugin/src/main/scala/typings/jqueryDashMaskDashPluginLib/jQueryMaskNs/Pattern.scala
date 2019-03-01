package typings
package jqueryDashMaskDashPluginLib.jQueryMaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var fallback: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var pattern: js.UndefOr[stdLib.RegExp] = js.undefined
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

object Pattern {
  @scala.inline
  def apply(
    fallback: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: stdLib.RegExp = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[Pattern]
  }
}

