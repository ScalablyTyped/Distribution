package typings.istanbulMiddleware

import typings.istanbulMiddleware.mod.Matcher
import typings.istanbulMiddleware.mod.PostLoadHook
import typings.istanbulMiddleware.mod.PostLoadHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostLoadHook extends js.Object {
  var postLoadHook: js.UndefOr[PostLoadHook] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object AnonPostLoadHook {
  @scala.inline
  def apply(
    postLoadHook: (/* matcherfn */ Matcher, /* transformer */ js.Any, /* verbose */ Boolean) => PostLoadHookFn = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): AnonPostLoadHook = {
    val __obj = js.Dynamic.literal()
    if (postLoadHook != null) __obj.updateDynamic("postLoadHook")(js.Any.fromFunction3(postLoadHook))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPostLoadHook]
  }
}

