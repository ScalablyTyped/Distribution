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
  def apply(cmp: Comparator = null, replacer: Replacer = null, space: Double | String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cmp != null) __obj.updateDynamic("cmp")(cmp)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

