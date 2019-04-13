package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
  * @since 1.8
  */
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
trait PropHook[TElement]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  var get: js.UndefOr[js.Function1[/* tween */ Tween[TElement], _]] = js.undefined
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  var set: js.UndefOr[js.Function1[/* tween */ Tween[TElement], scala.Unit]] = js.undefined
}

object PropHook {
  @scala.inline
  def apply[TElement](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] = null,
    get: /* tween */ Tween[TElement] => _ = null,
    set: /* tween */ Tween[TElement] => scala.Unit = null
  ): PropHook[TElement] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    __obj.asInstanceOf[PropHook[TElement]]
  }
}

