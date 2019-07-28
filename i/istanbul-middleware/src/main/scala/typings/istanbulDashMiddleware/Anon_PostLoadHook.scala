package typings.istanbulDashMiddleware

import typings.istanbulDashMiddleware.istanbulDashMiddlewareMod.PostLoadHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[PostLoadHook] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Anon_PostLoadHook {
  @scala.inline
  def apply(postLoadHook: PostLoadHook = null, verbose: js.UndefOr[Boolean] = js.undefined): Anon_PostLoadHook = {
    val __obj = js.Dynamic.literal()
    if (postLoadHook != null) __obj.updateDynamic("postLoadHook")(postLoadHook)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_PostLoadHook]
  }
}

