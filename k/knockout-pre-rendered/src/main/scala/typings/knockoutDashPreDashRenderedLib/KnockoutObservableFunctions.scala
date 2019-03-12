package typings
package knockoutDashPreDashRenderedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[KnockoutBindingHandler] {
  def equalityComparer(a: js.Any, b: js.Any): scala.Boolean
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](
    equalityComparer: (js.Any, js.Any) => scala.Boolean,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[KnockoutBindingHandler] = null
  ): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

