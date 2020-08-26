package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge[T] extends js.Object {
  var cursor: ConnectionCursor = js.native
  var node: T = js.native
}

object Edge {
  @scala.inline
  def apply[T](cursor: ConnectionCursor, node: T): Edge[T] = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[T]]
  }
  @scala.inline
  implicit class EdgeOps[Self <: Edge[_], T] (val x: Self with Edge[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor(value: ConnectionCursor): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: T): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

