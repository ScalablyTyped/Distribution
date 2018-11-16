package typings
package knockoutDotProjectionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def filter(predicate: js.Function1[/* value */ T, scala.Boolean]): KnockoutMappedObservableArray[T] = js.native
  def map[TResult](mappingOptions: js.Function1[/* value */ T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
  def map[TResult](mappingOptions: Anon_Mapping[T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
  def map[TResult](mappingOptions: Anon_MappingWithDisposeCallback[T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
}

