package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHookerOptions extends js.Object {
  var once: js.UndefOr[Boolean] = js.undefined
  var passName: js.UndefOr[Boolean] = js.undefined
  var post: js.UndefOr[HookerPostHookFunction] = js.undefined
  var pre: js.UndefOr[HookerPreHookFunction] = js.undefined
}

object IHookerOptions {
  @scala.inline
  def apply(
    once: js.UndefOr[Boolean] = js.undefined,
    passName: js.UndefOr[Boolean] = js.undefined,
    post: (/* result */ js.Any, /* repeated */ js.Any) => IHookerPostHookResult | Unit = null,
    pre: /* repeated */ js.Any => IHookerPreHookResult | Unit = null
  ): IHookerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passName)) __obj.updateDynamic("passName")(passName.get.asInstanceOf[js.Any])
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction2(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction1(pre))
    __obj.asInstanceOf[IHookerOptions]
  }
}

