package typings
package listDotJsLib.listDotJsMod.ListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortOptions extends js.Object {
  var alphabet: js.UndefOr[java.lang.String] = js.undefined
  var insensitive: js.UndefOr[scala.Boolean] = js.undefined
  var order: js.UndefOr[java.lang.String] = js.undefined
  var sortFunction: js.UndefOr[js.Function2[/* a */ js.Object, /* b */ js.Object, js.UndefOr[scala.Double]]] = js.undefined
}

object SortOptions {
  @scala.inline
  def apply(
    alphabet: java.lang.String = null,
    insensitive: js.UndefOr[scala.Boolean] = js.undefined,
    order: java.lang.String = null,
    sortFunction: (/* a */ js.Object, /* b */ js.Object) => js.UndefOr[scala.Double] = null
  ): SortOptions = {
    val __obj = js.Dynamic.literal()
    if (alphabet != null) __obj.updateDynamic("alphabet")(alphabet)
    if (!js.isUndefined(insensitive)) __obj.updateDynamic("insensitive")(insensitive)
    if (order != null) __obj.updateDynamic("order")(order)
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction2(sortFunction))
    __obj.asInstanceOf[SortOptions]
  }
}

