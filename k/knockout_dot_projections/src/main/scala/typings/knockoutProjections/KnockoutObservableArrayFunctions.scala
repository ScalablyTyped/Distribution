package typings.knockoutProjections

import typings.knockoutProjections.anon.DisposeItem
import typings.knockoutProjections.anon.MappingWithDisposeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArrayFunctions[T] extends StObject {
  
  def filter(predicate: js.Function1[/* value */ T, Boolean]): KnockoutMappedObservableArray[T] = js.native
  
  def map[TResult](mappingOptions: js.Function1[/* value */ T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
  def map[TResult](mappingOptions: DisposeItem[T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
  def map[TResult](mappingOptions: MappingWithDisposeCallback[T, TResult]): KnockoutMappedObservableArray[TResult] = js.native
}
