package typings.istanbulLibHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-hook.istanbul-lib-hook.HookRequireOptions> */
trait PartialHookRequireOptions extends js.Object {
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var postLoadHook: js.UndefOr[js.Function1[/* filename */ String, Unit]] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialHookRequireOptions {
  @scala.inline
  def apply(
    extensions: js.Array[String] = null,
    postLoadHook: /* filename */ String => Unit = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialHookRequireOptions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (postLoadHook != null) __obj.updateDynamic("postLoadHook")(js.Any.fromFunction1(postLoadHook))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHookRequireOptions]
  }
}

