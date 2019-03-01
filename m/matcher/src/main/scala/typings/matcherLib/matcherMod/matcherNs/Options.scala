package typings
package matcherLib.matcherMod.matcherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    __obj.asInstanceOf[Options]
  }
}

