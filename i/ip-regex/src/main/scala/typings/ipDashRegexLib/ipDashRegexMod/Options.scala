package typings
package ipDashRegexLib.ipDashRegexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Only match an exact string. Useful with `RegExp#test()` to check if a string is an IP address. *(`false` matches any IP address in a string)*
  		@default false
  		*/
  val exact: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		Include boundaries in the regex. When `true`, `192.168.0.2000000000` will report as an invalid IPv4 address. If this option is not set, the mentioned IPv4 address would report as valid (ignoring the trailing zeros).
  		@default false
  		*/
  val includeBoundaries: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    includeBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (!js.isUndefined(includeBoundaries)) __obj.updateDynamic("includeBoundaries")(includeBoundaries)
    __obj.asInstanceOf[Options]
  }
}

