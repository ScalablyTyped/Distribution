package typings.listJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortOptions extends js.Object {
  var alphabet: js.UndefOr[String] = js.undefined
  var insensitive: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[String] = js.undefined
  var sortFunction: js.UndefOr[js.Function2[/* a */ js.Object, /* b */ js.Object, js.UndefOr[Double]]] = js.undefined
}

object SortOptions {
  @scala.inline
  def apply(
    alphabet: String = null,
    insensitive: js.UndefOr[Boolean] = js.undefined,
    order: String = null,
    sortFunction: (/* a */ js.Object, /* b */ js.Object) => js.UndefOr[Double] = null
  ): SortOptions = {
    val __obj = js.Dynamic.literal()
    if (alphabet != null) __obj.updateDynamic("alphabet")(alphabet.asInstanceOf[js.Any])
    if (!js.isUndefined(insensitive)) __obj.updateDynamic("insensitive")(insensitive.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (sortFunction != null) __obj.updateDynamic("sortFunction")(js.Any.fromFunction2(sortFunction))
    __obj.asInstanceOf[SortOptions]
  }
}

