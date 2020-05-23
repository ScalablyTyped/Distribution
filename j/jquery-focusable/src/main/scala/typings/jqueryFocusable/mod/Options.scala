package typings.jqueryFocusable.mod

import typings.jqueryFocusable.jqueryFocusableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  findNegativeTabindex  :boolean,   findPositiveTabindex  :true}> */
trait Options extends js.Object {
  var findNegativeTabindex: js.UndefOr[Boolean] = js.undefined
  var findPositiveTabindex: js.UndefOr[`true`] = js.undefined
}

object Options {
  @scala.inline
  def apply(findNegativeTabindex: js.UndefOr[Boolean] = js.undefined, findPositiveTabindex: `true` = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(findNegativeTabindex)) __obj.updateDynamic("findNegativeTabindex")(findNegativeTabindex.get.asInstanceOf[js.Any])
    if (findPositiveTabindex != null) __obj.updateDynamic("findPositiveTabindex")(findPositiveTabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

