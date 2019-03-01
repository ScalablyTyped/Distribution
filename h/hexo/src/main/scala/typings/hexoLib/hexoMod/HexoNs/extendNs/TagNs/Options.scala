package typings
package hexoLib.hexoMod.HexoNs.extendNs.TagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var ends: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(async: js.UndefOr[scala.Boolean] = js.undefined, ends: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(ends)) __obj.updateDynamic("ends")(ends)
    __obj.asInstanceOf[Options]
  }
}

