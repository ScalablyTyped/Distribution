package typings.jsonpack.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackDebugOptions extends PackOptions {
  var debug: js.UndefOr[Boolean] = js.undefined
}

object PackDebugOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, verbose: js.UndefOr[Boolean] = js.undefined): PackDebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[PackDebugOptions]
  }
}

