package typings.lunr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoost extends js.Object {
  var boost: js.UndefOr[Double] = js.undefined
  var extractor: js.UndefOr[js.Function1[/* doc */ js.Object, String | js.Object | js.Array[js.Object]]] = js.undefined
}

object AnonBoost {
  @scala.inline
  def apply(
    boost: Int | Double = null,
    extractor: /* doc */ js.Object => String | js.Object | js.Array[js.Object] = null
  ): AnonBoost = {
    val __obj = js.Dynamic.literal()
    if (boost != null) __obj.updateDynamic("boost")(boost.asInstanceOf[js.Any])
    if (extractor != null) __obj.updateDynamic("extractor")(js.Any.fromFunction1(extractor))
    __obj.asInstanceOf[AnonBoost]
  }
}

