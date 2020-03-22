package typings.istanbulLibHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.Options> */
trait PartialOptions extends js.Object {
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(verbose: js.UndefOr[Boolean] = js.undefined): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

