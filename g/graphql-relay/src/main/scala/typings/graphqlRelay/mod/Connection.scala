package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection[T] extends js.Object {
  var edges: js.Array[Edge[T]] = js.native
  var pageInfo: PageInfo = js.native
}

object Connection {
  @scala.inline
  def apply[T](edges: js.Array[Edge[T]], pageInfo: PageInfo): Connection[T] = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection[T]]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection[_], T] (val x: Self with Connection[T]) extends AnyVal {
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
    def setEdgesVarargs(value: Edge[T]*): Self = this.set("edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: js.Array[Edge[T]]): Self = this.set("edges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageInfo(value: PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
  }
  
}

