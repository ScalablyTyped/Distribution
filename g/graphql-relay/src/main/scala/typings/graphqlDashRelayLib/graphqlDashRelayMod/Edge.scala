package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge[T] extends js.Object {
  var cursor: ConnectionCursor
  var node: T
}

object Edge {
  @scala.inline
  def apply[T](cursor: ConnectionCursor, node: T): Edge[T] = {
    val __obj = js.Dynamic.literal(cursor = cursor, node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Edge[T]]
  }
}

