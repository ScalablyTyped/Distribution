package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceBase[T] extends SequenceBaser[T] {
  
  def first(): js.Any = js.native
  def first(count: Double): Sequence[T] = js.native
  
  def indexOf(value: js.Any): Double = js.native
  def indexOf(value: js.Any, startIndex: Double): Double = js.native
  
  def last(): js.Any = js.native
  def last(count: Double): Sequence[T] = js.native
  
  def lastIndexOf(value: js.Any): Double = js.native
  
  def reverse(): Sequence[T] = js.native
}
