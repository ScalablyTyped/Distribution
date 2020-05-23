package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueNode[T] extends js.Object {
  var next: QueueNode[T] | Null
  var value: T
}

object QueueNode {
  @scala.inline
  def apply[T](value: T, next: QueueNode[T] = null): QueueNode[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueNode[T]]
  }
}

