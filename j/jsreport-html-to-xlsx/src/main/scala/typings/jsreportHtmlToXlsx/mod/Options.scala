package typings.jsreportHtmlToXlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.jsreportXlsx.mod.Options {
  var strategy: String
}

object Options {
  @scala.inline
  def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double, strategy: String): Options = {
    val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

