package typings
package gulpDashIstanbulLib.gulpDashIstanbulMod.GulpIstanbulNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageOptions extends js.Object {
  var branches: js.UndefOr[scala.Double] = js.undefined
  var functions: js.UndefOr[scala.Double] = js.undefined
  var lines: js.UndefOr[scala.Double] = js.undefined
  var statements: js.UndefOr[scala.Double] = js.undefined
}

object CoverageOptions {
  @scala.inline
  def apply(
    branches: scala.Int | scala.Double = null,
    functions: scala.Int | scala.Double = null,
    lines: scala.Int | scala.Double = null,
    statements: scala.Int | scala.Double = null
  ): CoverageOptions = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageOptions]
  }
}

