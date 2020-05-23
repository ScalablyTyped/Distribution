package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackNode[T] extends js.Object {
  var next: StackNode[T] | Null
  var value: T
}

object StackNode {
  @scala.inline
  def apply[T](value: T, next: StackNode[T] = null): StackNode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNode[T]]
  }
}

