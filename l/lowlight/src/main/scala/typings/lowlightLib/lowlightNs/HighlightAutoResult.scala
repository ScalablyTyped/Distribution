package typings
package lowlightLib.lowlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightAutoResult extends HighlightResult {
  var secondBest: js.UndefOr[HighlightAutoResult] = js.undefined
}

object HighlightAutoResult {
  @scala.inline
  def apply(
    language: java.lang.String,
    relevance: scala.Double,
    value: js.Array[HastNode],
    secondBest: HighlightAutoResult = null
  ): HighlightAutoResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("relevance")(relevance)
    __obj.updateDynamic("value")(value)
    if (secondBest != null) __obj.updateDynamic("secondBest")(secondBest)
    __obj.asInstanceOf[HighlightAutoResult]
  }
}

