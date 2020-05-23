package typings.istanbulLibHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRunInContextOptions> */
trait PartialHookRunInContextOp extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialHookRunInContextOp {
  @scala.inline
  def apply(coverageVariable: String = null, verbose: js.UndefOr[Boolean] = js.undefined): PartialHookRunInContextOp = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHookRunInContextOp]
  }
}

