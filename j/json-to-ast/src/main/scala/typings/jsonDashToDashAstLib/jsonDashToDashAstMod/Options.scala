package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		 * Appends location information.
  		 *
  		 * @default true
  		 */
  var loc: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Appends source information to node’s location.
  		 *
  		 * @default null
  		 */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(loc: js.UndefOr[scala.Boolean] = js.undefined, source: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Options]
  }
}

