package typings.jsonpack.jsonpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends js.Object {
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(verbose: js.UndefOr[Boolean] = js.undefined): PackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackOptions]
  }
}

