package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stack[T] extends StObject {
  
  /* private */ var N: Any = js.native
  
  def _push(x: Null, a: T): StackNode[T] = js.native
  def _push(x: StackNode[T], a: T): StackNode[T] = js.native
  
  /* private */ var first: Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def peep(): js.UndefOr[T] = js.native
  
  def pop(): js.UndefOr[T] = js.native
  
  def push(a: T): Unit = js.native
  
  def size(): Double = js.native
  
  def toArray(): js.Array[T] = js.native
}
