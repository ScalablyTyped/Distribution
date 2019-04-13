package typings
package highlightDotJsLib.highlightDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutoHighlightResult extends IHighlightResultBase {
  var second_best: js.UndefOr[IAutoHighlightResult] = js.undefined
}

object IAutoHighlightResult {
  @scala.inline
  def apply(
    language: java.lang.String,
    relevance: scala.Double,
    value: java.lang.String,
    second_best: IAutoHighlightResult = null
  ): IAutoHighlightResult = {
    val __obj = js.Dynamic.literal(language = language, relevance = relevance, value = value)
    if (second_best != null) __obj.updateDynamic("second_best")(second_best)
    __obj.asInstanceOf[IAutoHighlightResult]
  }
}

