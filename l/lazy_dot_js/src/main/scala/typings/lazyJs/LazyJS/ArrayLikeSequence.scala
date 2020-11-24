package typings.lazyJs.LazyJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLikeSequence[T] extends Sequence[T] {
  
  @JSName("first")
  def first_ArrayLikeSequence(): ArrayLikeSequence[T] = js.native
  
  def get(index: Double): T = js.native
  
  def length(): Double = js.native
  
  def pop(): ArrayLikeSequence[T] = js.native
  
  def push(value: T): ArrayLikeSequence[T] = js.native
  
  def shift(): ArrayLikeSequence[T] = js.native
  
  def slice(begin: Double): ArrayLikeSequence[T] = js.native
  def slice(begin: Double, end: Double): ArrayLikeSequence[T] = js.native
  
  def unshift(value: T): ArrayLikeSequence[T] = js.native
}
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
@JSGlobal("LazyJS.ArrayLikeSequence")
@js.native
object ArrayLikeSequence extends js.Object
