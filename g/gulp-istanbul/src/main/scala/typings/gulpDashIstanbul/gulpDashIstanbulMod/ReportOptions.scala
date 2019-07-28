package typings.gulpDashIstanbul.gulpDashIstanbulMod

import typings.gulpDashIstanbul.Anon_Dir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var reportOpts: js.UndefOr[Anon_Dir] = js.undefined
  var reporters: js.UndefOr[js.Array[String]] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(
    coverageVariable: String = null,
    dir: String = null,
    reportOpts: Anon_Dir = null,
    reporters: js.Array[String] = null
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (reportOpts != null) __obj.updateDynamic("reportOpts")(reportOpts)
    if (reporters != null) __obj.updateDynamic("reporters")(reporters)
    __obj.asInstanceOf[ReportOptions]
  }
}

