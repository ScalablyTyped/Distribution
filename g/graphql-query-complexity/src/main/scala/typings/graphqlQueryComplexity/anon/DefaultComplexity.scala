package typings.graphqlQueryComplexity.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultComplexity extends js.Object {
  var defaultComplexity: js.UndefOr[Double] = js.undefined
}

object DefaultComplexity {
  @scala.inline
  def apply(defaultComplexity: js.UndefOr[Double] = js.undefined): DefaultComplexity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultComplexity)) __obj.updateDynamic("defaultComplexity")(defaultComplexity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComplexity]
  }
}

