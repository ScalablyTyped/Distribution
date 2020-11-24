package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOrderedEnumerable[T] extends IEnumerable[T] {
  
  def createOrderedEnumerable[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
  def createOrderedEnumerable[TKey](
    keySelector: js.Function1[/* element */ T, TKey],
    comparer: js.UndefOr[scala.Nothing],
    descending: Boolean
  ): IOrderedEnumerable[T] = js.native
  def createOrderedEnumerable[TKey](
    keySelector: js.Function1[/* element */ T, TKey],
    comparer: js.Function2[/* first */ T, /* second */ T, Double]
  ): IOrderedEnumerable[T] = js.native
  def createOrderedEnumerable[TKey](
    keySelector: js.Function1[/* element */ T, TKey],
    comparer: js.Function2[/* first */ T, /* second */ T, Double],
    descending: Boolean
  ): IOrderedEnumerable[T] = js.native
  
  def thenBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
  def thenBy[TKey](
    keySelector: js.Function1[/* element */ T, TKey],
    comparer: js.Function2[/* first */ T, /* second */ T, Double]
  ): IOrderedEnumerable[T] = js.native
  
  def thenByDescending[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
  def thenByDescending[TKey](
    keySelector: js.Function1[/* element */ T, TKey],
    comparer: js.Function2[/* first */ T, /* second */ T, Double]
  ): IOrderedEnumerable[T] = js.native
}
