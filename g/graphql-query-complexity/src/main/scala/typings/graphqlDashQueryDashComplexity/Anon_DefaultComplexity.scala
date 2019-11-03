package typings.graphqlDashQueryDashComplexity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultComplexity extends js.Object {
  var defaultComplexity: js.UndefOr[Double] = js.undefined
}

object Anon_DefaultComplexity {
  @scala.inline
  def apply(defaultComplexity: Int | Double = null): Anon_DefaultComplexity = {
    val __obj = js.Dynamic.literal()
    if (defaultComplexity != null) __obj.updateDynamic("defaultComplexity")(defaultComplexity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultComplexity]
  }
}

