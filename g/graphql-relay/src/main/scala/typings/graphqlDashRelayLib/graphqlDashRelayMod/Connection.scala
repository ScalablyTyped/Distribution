package typings
package graphqlDashRelayLib.graphqlDashRelayMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("pageInfo")(pageInfo)
    __obj.asInstanceOf[Connection[T]]
  }
}

