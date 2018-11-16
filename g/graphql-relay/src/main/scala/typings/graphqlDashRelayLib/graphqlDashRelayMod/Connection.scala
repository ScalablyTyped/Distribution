package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Connection[T] extends js.Object {
  var edges: js.Array[Edge[T]]
  var pageInfo: PageInfo
}

