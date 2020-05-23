package typings.istanbulLibReport.anon

import typings.istanbulLibReport.mod.Watermark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.Watermarks> */
trait PartialWatermarks extends js.Object {
  var branches: js.UndefOr[Watermark] = js.undefined
  var functions: js.UndefOr[Watermark] = js.undefined
  var lines: js.UndefOr[Watermark] = js.undefined
  var statements: js.UndefOr[Watermark] = js.undefined
}

object PartialWatermarks {
  @scala.inline
  def apply(
    branches: Watermark = null,
    functions: Watermark = null,
    lines: Watermark = null,
    statements: Watermark = null
  ): PartialWatermarks = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWatermarks]
  }
}

