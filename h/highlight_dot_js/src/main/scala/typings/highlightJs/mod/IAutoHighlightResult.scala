package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutoHighlightResult extends IHighlightResultBase {
  var second_best: js.UndefOr[IAutoHighlightResult] = js.undefined
}

object IAutoHighlightResult {
  @scala.inline
  def apply(language: String, relevance: Double, value: String, second_best: IAutoHighlightResult = null): IAutoHighlightResult = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (second_best != null) __obj.updateDynamic("second_best")(second_best.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoHighlightResult]
  }
}

