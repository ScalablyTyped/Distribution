package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection[T] extends js.Object {
  var edges: js.Array[Edge[T]]
  var pageInfo: PageInfo
}

object Connection {
  @scala.inline
  def apply[T](edges: js.Array[Edge[T]], pageInfo: PageInfo): Connection[T] = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection[T]]
  }
}

