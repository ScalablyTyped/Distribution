package typings.knockoutPreRendered

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends /* key */ StringDictionary[KnockoutBindingHandler] {
  def equalityComparer(a: js.Any, b: js.Any): Boolean
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](
    equalityComparer: (js.Any, js.Any) => Boolean,
    StringDictionary: /* key */ StringDictionary[KnockoutBindingHandler] = null
  ): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

