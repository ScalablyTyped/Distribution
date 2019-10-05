package typings.jsonDashStableDashStringify.jsonDashStableDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cmp: js.UndefOr[Comparator] = js.undefined
  var replacer: js.UndefOr[Replacer] = js.undefined
  var space: js.UndefOr[Double | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cmp: (/* a */ Element, /* b */ Element) => Double = null,
    replacer: (/* key */ String, /* value */ js.Any) => js.Any = null,
    space: Double | String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cmp != null) __obj.updateDynamic("cmp")(js.Any.fromFunction2(cmp))
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2(replacer))
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

