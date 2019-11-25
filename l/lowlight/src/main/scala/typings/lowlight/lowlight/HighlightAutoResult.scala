package typings.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightAutoResult extends HighlightResult {
  var secondBest: js.UndefOr[HighlightAutoResult] = js.undefined
}

object HighlightAutoResult {
  @scala.inline
  def apply(
    language: String,
    relevance: Double,
    value: js.Array[HastNode],
    secondBest: HighlightAutoResult = null
  ): HighlightAutoResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (secondBest != null) __obj.updateDynamic("secondBest")(secondBest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightAutoResult]
  }
}

