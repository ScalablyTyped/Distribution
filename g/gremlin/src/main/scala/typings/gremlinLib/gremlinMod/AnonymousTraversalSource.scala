package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "AnonymousTraversalSource")
@js.native
class AnonymousTraversalSource () extends js.Object {
  def withGraph(graph: Graph): GraphTraversalSource = js.native
  def withRemote(remoteConnection: RemoteConnection): GraphTraversalSource = js.native
}

/* static members */
@JSImport("gremlin", "AnonymousTraversalSource")
@js.native
object AnonymousTraversalSource extends js.Object {
  def traversal(): gremlinLib.gremlinMod.AnonymousTraversalSource = js.native
}

