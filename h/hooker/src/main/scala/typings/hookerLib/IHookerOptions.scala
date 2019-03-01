package typings
package hookerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHookerOptions extends js.Object {
  var once: js.UndefOr[scala.Boolean] = js.undefined
  var passName: js.UndefOr[scala.Boolean] = js.undefined
  var post: js.UndefOr[HookerPostHookFunction] = js.undefined
  var pre: js.UndefOr[HookerPreHookFunction] = js.undefined
}

object IHookerOptions {
  @scala.inline
  def apply(
    once: js.UndefOr[scala.Boolean] = js.undefined,
    passName: js.UndefOr[scala.Boolean] = js.undefined,
    post: HookerPostHookFunction = null,
    pre: HookerPreHookFunction = null
  ): IHookerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (!js.isUndefined(passName)) __obj.updateDynamic("passName")(passName)
    if (post != null) __obj.updateDynamic("post")(post)
    if (pre != null) __obj.updateDynamic("pre")(pre)
    __obj.asInstanceOf[IHookerOptions]
  }
}

