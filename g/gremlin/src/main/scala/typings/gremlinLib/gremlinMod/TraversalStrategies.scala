package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "TraversalStrategies")
@js.native
class TraversalStrategies () extends js.Object {
  def this(parent: TraversalStrategies) = this()
  def addStrategy(strategy: TraversalStrategy): scala.Unit = js.native
  def applyStrategies(traversal: Traversal): js.Promise[Traversal] = js.native
}

