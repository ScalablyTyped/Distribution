package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToISOTimeOptions extends js.Object {
  var includeOffset: js.UndefOr[scala.Boolean] = js.undefined
  var suppressMilliseconds: js.UndefOr[scala.Boolean] = js.undefined
  var suppressSeconds: js.UndefOr[scala.Boolean] = js.undefined
}

object ToISOTimeOptions {
  @scala.inline
  def apply(
    includeOffset: js.UndefOr[scala.Boolean] = js.undefined,
    suppressMilliseconds: js.UndefOr[scala.Boolean] = js.undefined,
    suppressSeconds: js.UndefOr[scala.Boolean] = js.undefined
  ): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeOffset)) __obj.updateDynamic("includeOffset")(includeOffset)
    if (!js.isUndefined(suppressMilliseconds)) __obj.updateDynamic("suppressMilliseconds")(suppressMilliseconds)
    if (!js.isUndefined(suppressSeconds)) __obj.updateDynamic("suppressSeconds")(suppressSeconds)
    __obj.asInstanceOf[ToISOTimeOptions]
  }
}

