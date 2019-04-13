package typings
package gulpDashIstanbulLib.gulpDashIstanbulMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var coverageVariable: js.UndefOr[java.lang.String] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var reportOpts: js.UndefOr[gulpDashIstanbulLib.Anon_Dir] = js.undefined
  var reporters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(
    coverageVariable: java.lang.String = null,
    dir: java.lang.String = null,
    reportOpts: gulpDashIstanbulLib.Anon_Dir = null,
    reporters: js.Array[java.lang.String] = null
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (reportOpts != null) __obj.updateDynamic("reportOpts")(reportOpts)
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    __obj.asInstanceOf[ReportOptions]
  }
}

