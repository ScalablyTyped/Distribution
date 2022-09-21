package typings.knockoutTransformations

import typings.knockoutTransformations.KnockoutTransformations.Mapping
import typings.knockoutTransformations.KnockoutTransformations.MappingOption
import typings.knockoutTransformations.KnockoutTransformations.MappingWithDisposeCallbackOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArrayFunctions[T] extends StObject {
  
  def filter(predicate: js.Function1[/* value */ T, Boolean]): Any = js.native
  
  def indexBy(indexer: js.Function1[/* value */ T, Any | js.Array[String] | String]): Any = js.native
  
  def map[TResult](mapping: Mapping[T, TResult]): Any = js.native
  def map[TResult](mapping: MappingOption[T, TResult]): Any = js.native
  def map[TResult](mapping: MappingWithDisposeCallbackOption[T, TResult]): Any = js.native
  
  def sortBy(sorter: js.Function2[/* value */ T, /* descending */ js.Function1[/* sorter */ Any, Any], Any]): Any = js.native
  
  def uniqueIndexBy(indexer: js.Function1[/* value */ T, String]): Any = js.native
}
