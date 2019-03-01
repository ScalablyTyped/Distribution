package typings
package jsreportDashHtmlDashToDashXlsxLib.jsreportDashHtmlDashToDashXlsxMod.JsReportHtml2XlsxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends jsreportDashXlsxLib.jsreportDashXlsxMod.JsReportXlsxNs.Options {
  var strategy: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    addBufferSize: scala.Double,
    escapeAmp: scala.Boolean,
    numberOfParsedAddIterations: scala.Double,
    strategy: java.lang.String
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBufferSize")(addBufferSize)
    __obj.updateDynamic("escapeAmp")(escapeAmp)
    __obj.updateDynamic("numberOfParsedAddIterations")(numberOfParsedAddIterations)
    __obj.updateDynamic("strategy")(strategy)
    __obj.asInstanceOf[Options]
  }
}

