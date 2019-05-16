package typings
package jsonpackLib.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends js.Object {
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(verbose: js.UndefOr[scala.Boolean] = js.undefined): PackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[PackOptions]
  }
}

