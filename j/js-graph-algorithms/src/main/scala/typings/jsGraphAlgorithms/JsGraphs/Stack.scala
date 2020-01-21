package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.Stack")
@js.native
class Stack[T] () extends js.Object {
  var N: js.Any = js.native
  var first: js.Any = js.native
  def _push(x: Null, a: T): StackNode[T] = js.native
  def _push(x: StackNode[T], a: T): StackNode[T] = js.native
  def isEmpty(): Boolean = js.native
  def peep(): js.UndefOr[T] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(a: T): Unit = js.native
  def size(): Double = js.native
  def toArray(): js.Array[T] = js.native
}

