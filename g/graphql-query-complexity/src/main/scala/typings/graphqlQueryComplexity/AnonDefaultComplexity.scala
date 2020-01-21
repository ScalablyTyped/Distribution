package typings.graphqlQueryComplexity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultComplexity extends js.Object {
  var defaultComplexity: js.UndefOr[Double] = js.undefined
}

object AnonDefaultComplexity {
  @scala.inline
  def apply(defaultComplexity: Int | Double = null): AnonDefaultComplexity = {
    val __obj = js.Dynamic.literal()
    if (defaultComplexity != null) __obj.updateDynamic("defaultComplexity")(defaultComplexity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultComplexity]
  }
}

