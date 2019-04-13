package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region Val hooks
// #region Val hooks
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
trait ValHook[TElement]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] {
  var get: js.UndefOr[js.Function1[/* elem */ TElement, _]] = js.undefined
  var set: js.UndefOr[js.Function2[/* elem */ TElement, /* value */ js.Any, _]] = js.undefined
}

object ValHook {
  @scala.inline
  def apply[TElement](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] = null,
    get: /* elem */ TElement => _ = null,
    set: (/* elem */ TElement, /* value */ js.Any) => _ = null
  ): ValHook[TElement] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    __obj.asInstanceOf[ValHook[TElement]]
  }
}

