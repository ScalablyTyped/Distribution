package typings
package jsreportDashXlsxLib.jsreportDashXlsxMod.JsReportXlsxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addBufferSize: scala.Double
  var escapeAmp: scala.Boolean
  var numberOfParsedAddIterations: scala.Double
}

object Options {
  @scala.inline
  def apply(addBufferSize: scala.Double, escapeAmp: scala.Boolean, numberOfParsedAddIterations: scala.Double): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addBufferSize")(addBufferSize)
    __obj.updateDynamic("escapeAmp")(escapeAmp)
    __obj.updateDynamic("numberOfParsedAddIterations")(numberOfParsedAddIterations)
    __obj.asInstanceOf[Options]
  }
}

