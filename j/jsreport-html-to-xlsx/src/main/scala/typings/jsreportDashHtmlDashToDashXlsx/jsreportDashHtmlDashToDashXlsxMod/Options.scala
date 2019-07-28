package typings.jsreportDashHtmlDashToDashXlsx.jsreportDashHtmlDashToDashXlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.jsreportDashXlsx.jsreportDashXlsxMod.Options {
  var strategy: String
}

object Options {
  @scala.inline
  def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double, strategy: String): Options = {
    val __obj = js.Dynamic.literal(addBufferSize = addBufferSize, escapeAmp = escapeAmp, numberOfParsedAddIterations = numberOfParsedAddIterations, strategy = strategy)
  
    __obj.asInstanceOf[Options]
  }
}

