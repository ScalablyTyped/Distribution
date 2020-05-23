package typings.markedjsHtmlDiffer.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  /**
    * the number of characters around the diff result between two HTML
    * @default 40
    */
  var charsAroundDiff: js.UndefOr[Double] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(charsAroundDiff: js.UndefOr[Double] = js.undefined): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(charsAroundDiff)) __obj.updateDynamic("charsAroundDiff")(charsAroundDiff.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

