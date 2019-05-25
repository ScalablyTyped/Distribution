package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "RemoteStrategy")
@js.native
class RemoteStrategy protected () extends TraversalStrategy {
  def this(connection: RemoteConnection) = this()
  @JSName("apply")
  def apply(traversal: RemoteTraversal): js.Promise[_] = js.native
}

