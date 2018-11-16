package typings
package knockoutDashTransformationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def filter(predicate: js.Function1[/* value */ T, scala.Boolean]): knockoutLib.KnockoutObservableArray[T] = js.native
  def indexBy(indexer: js.Function1[/* value */ T, _ | java.lang.String | js.Array[java.lang.String]]): knockoutLib.KnockoutObservable[ScalablyTyped.runtime.StringDictionary[js.Array[T]]] = js.native
  def map[TResult](mapping: knockoutDashTransformationsLib.KnockoutTransformationsNs.Mapping[T, TResult]): knockoutLib.KnockoutObservableArray[TResult] = js.native
  def map[TResult](mapping: knockoutDashTransformationsLib.KnockoutTransformationsNs.MappingOption[T, TResult]): knockoutLib.KnockoutObservableArray[TResult] = js.native
  def map[TResult](
    mapping: knockoutDashTransformationsLib.KnockoutTransformationsNs.MappingWithDisposeCallbackOption[T, TResult]
  ): knockoutLib.KnockoutObservableArray[TResult] = js.native
  def sortBy(sorter: js.Function2[/* value */ T, /* descending */ js.Function1[/* sorter */ js.Any, _], _]): knockoutLib.KnockoutObservableArray[T] = js.native
  def uniqueIndexBy(indexer: js.Function1[/* value */ T, java.lang.String]): knockoutLib.KnockoutObservable[ScalablyTyped.runtime.StringDictionary[T]] = js.native
}

