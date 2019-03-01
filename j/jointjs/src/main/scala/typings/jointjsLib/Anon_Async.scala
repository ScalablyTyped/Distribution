package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Async {
  @scala.inline
  def apply(async: js.UndefOr[scala.Boolean] = js.undefined, position: scala.Int | scala.Double = null): Anon_Async = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Async]
  }
}

