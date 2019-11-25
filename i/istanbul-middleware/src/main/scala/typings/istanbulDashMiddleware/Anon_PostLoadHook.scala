package typings.istanbulDashMiddleware

import typings.istanbulDashMiddleware.istanbulDashMiddlewareMod.Matcher
import typings.istanbulDashMiddleware.istanbulDashMiddlewareMod.PostLoadHook
import typings.istanbulDashMiddleware.istanbulDashMiddlewareMod.PostLoadHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[PostLoadHook] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Anon_PostLoadHook {
  @scala.inline
  def apply(
    postLoadHook: (/* matcherfn */ Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Anon_PostLoadHook = {
    val __obj = js.Dynamic.literal()
    if (postLoadHook != null) __obj.updateDynamic("postLoadHook")(js.Any.fromFunction3(postLoadHook))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PostLoadHook]
  }
}

