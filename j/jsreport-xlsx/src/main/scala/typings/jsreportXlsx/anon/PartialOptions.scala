package typings.jsreportXlsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-xlsx.jsreport-xlsx.Options> */
trait PartialOptions extends js.Object {
  var addBufferSize: js.UndefOr[Double] = js.undefined
  var escapeAmp: js.UndefOr[Boolean] = js.undefined
  var numberOfParsedAddIterations: js.UndefOr[Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    addBufferSize: js.UndefOr[Double] = js.undefined,
    escapeAmp: js.UndefOr[Boolean] = js.undefined,
    numberOfParsedAddIterations: js.UndefOr[Double] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addBufferSize)) __obj.updateDynamic("addBufferSize")(addBufferSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeAmp)) __obj.updateDynamic("escapeAmp")(escapeAmp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfParsedAddIterations)) __obj.updateDynamic("numberOfParsedAddIterations")(numberOfParsedAddIterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

