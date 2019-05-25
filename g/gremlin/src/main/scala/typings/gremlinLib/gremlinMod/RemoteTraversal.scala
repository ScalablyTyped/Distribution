package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "RemoteTraversal")
@js.native
class RemoteTraversal () extends Traversal {
  def this(traversers: js.Array[Traverser]) = this()
  def this(traversers: js.Array[Traverser], sideEffects: TraversalSideEffects) = this()
}

