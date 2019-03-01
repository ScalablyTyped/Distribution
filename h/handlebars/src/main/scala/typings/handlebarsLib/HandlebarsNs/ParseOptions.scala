package typings
package handlebarsLib.HandlebarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var ignoreStandalone: js.UndefOr[scala.Boolean] = js.undefined
  var srcName: js.UndefOr[java.lang.String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(ignoreStandalone: js.UndefOr[scala.Boolean] = js.undefined, srcName: java.lang.String = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreStandalone)) __obj.updateDynamic("ignoreStandalone")(ignoreStandalone)
    if (srcName != null) __obj.updateDynamic("srcName")(srcName)
    __obj.asInstanceOf[ParseOptions]
  }
}

