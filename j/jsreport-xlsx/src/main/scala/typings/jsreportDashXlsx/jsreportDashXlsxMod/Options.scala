package typings.jsreportDashXlsx.jsreportDashXlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var addBufferSize: Double
  var escapeAmp: Boolean
  var numberOfParsedAddIterations: Double
}

object Options {
  @scala.inline
  def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double): Options = {
    val __obj = js.Dynamic.literal(addBufferSize = addBufferSize, escapeAmp = escapeAmp, numberOfParsedAddIterations = numberOfParsedAddIterations)
  
    __obj.asInstanceOf[Options]
  }
}

