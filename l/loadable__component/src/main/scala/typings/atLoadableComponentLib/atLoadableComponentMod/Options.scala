package typings
package atLoadableComponentLib.atLoadableComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var cacheKey: js.UndefOr[js.Function1[/* props */ T, _]] = js.undefined
  var fallback: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  var ssr: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    cacheKey: /* props */ T => _ = null,
    fallback: reactLib.reactMod.Global.JSXNs.Element = null,
    ssr: js.UndefOr[scala.Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(js.Any.fromFunction1(cacheKey))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr)
    __obj.asInstanceOf[Options[T]]
  }
}

