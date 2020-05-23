package typings.lunr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boost extends js.Object {
  var boost: js.UndefOr[Double] = js.undefined
  var extractor: js.UndefOr[js.Function1[/* doc */ js.Object, String | js.Object | js.Array[js.Object]]] = js.undefined
}

object Boost {
  @scala.inline
  def apply(
    boost: js.UndefOr[Double] = js.undefined,
    extractor: /* doc */ js.Object => String | js.Object | js.Array[js.Object] = null
  ): Boost = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boost)) __obj.updateDynamic("boost")(boost.get.asInstanceOf[js.Any])
    if (extractor != null) __obj.updateDynamic("extractor")(js.Any.fromFunction1(extractor))
    __obj.asInstanceOf[Boost]
  }
}

