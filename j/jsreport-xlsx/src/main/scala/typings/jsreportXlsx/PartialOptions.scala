package typings.jsreportXlsx

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
    addBufferSize: Int | Double = null,
    escapeAmp: js.UndefOr[Boolean] = js.undefined,
    numberOfParsedAddIterations: Int | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (addBufferSize != null) __obj.updateDynamic("addBufferSize")(addBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeAmp)) __obj.updateDynamic("escapeAmp")(escapeAmp.asInstanceOf[js.Any])
    if (numberOfParsedAddIterations != null) __obj.updateDynamic("numberOfParsedAddIterations")(numberOfParsedAddIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

