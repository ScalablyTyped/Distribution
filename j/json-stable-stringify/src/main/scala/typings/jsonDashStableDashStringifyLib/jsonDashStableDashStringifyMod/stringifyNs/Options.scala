package typings
package jsonDashStableDashStringifyLib.jsonDashStableDashStringifyMod.stringifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cmp: js.UndefOr[Comparator] = js.undefined
  var replacer: js.UndefOr[Replacer] = js.undefined
  var space: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cmp: Comparator = null, replacer: Replacer = null, space: scala.Double | java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cmp != null) __obj.updateDynamic("cmp")(cmp)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

