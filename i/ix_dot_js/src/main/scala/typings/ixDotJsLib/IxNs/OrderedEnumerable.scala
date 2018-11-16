package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedEnumerable[T] extends Enumerable[T] {
  def thenBy[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
  def thenBy[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
  def thenByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey]): OrderedEnumerable[T] = js.native
  def thenByDescending[TKey](keySelector: js.Function1[/* item */ T, TKey], comparer: Comparer[TKey, TKey]): OrderedEnumerable[T] = js.native
}

