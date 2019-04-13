package typings
package jsreportDashHtmlDashToDashXlsxLib.jsreportDashHtmlDashToDashXlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends jsreportDashXlsxLib.jsreportDashXlsxMod.Options {
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
    val __obj = js.Dynamic.literal(addBufferSize = addBufferSize, escapeAmp = escapeAmp, numberOfParsedAddIterations = numberOfParsedAddIterations, strategy = strategy)
  
    __obj.asInstanceOf[Options]
  }
}

