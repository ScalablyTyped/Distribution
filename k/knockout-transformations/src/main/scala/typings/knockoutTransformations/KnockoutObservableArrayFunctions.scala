package typings.knockoutTransformations

import typings.knockoutTransformations.KnockoutTransformations.Mapping
import typings.knockoutTransformations.KnockoutTransformations.MappingOption
import typings.knockoutTransformations.KnockoutTransformations.MappingWithDisposeCallbackOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def filter(predicate: js.Function1[/* value */ T, Boolean]): js.Any = js.native
  def indexBy(indexer: js.Function1[/* value */ T, _ | js.Array[String] | String]): js.Any = js.native
  def map[TResult](mapping: Mapping[T, TResult]): js.Any = js.native
  def map[TResult](mapping: MappingOption[T, TResult]): js.Any = js.native
  def map[TResult](mapping: MappingWithDisposeCallbackOption[T, TResult]): js.Any = js.native
  def sortBy(sorter: js.Function2[/* value */ T, /* descending */ js.Function1[/* sorter */ js.Any, _], _]): js.Any = js.native
  def uniqueIndexBy(indexer: js.Function1[/* value */ T, String]): js.Any = js.native
}

