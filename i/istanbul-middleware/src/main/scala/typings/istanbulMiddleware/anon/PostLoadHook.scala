package typings.istanbulMiddleware.anon

import typings.istanbulMiddleware.mod.PostLoadHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[typings.istanbulMiddleware.mod.PostLoadHook] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PostLoadHook {
  @scala.inline
  def apply(
    postLoadHook: (/* matcherfn */ typings.istanbulMiddleware.mod.Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PostLoadHook = {
    val __obj = js.Dynamic.literal()
    if (postLoadHook != null) __obj.updateDynamic("postLoadHook")(js.Any.fromFunction3(postLoadHook))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostLoadHook]
  }
}

