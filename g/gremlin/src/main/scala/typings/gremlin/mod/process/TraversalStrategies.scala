package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.TraversalStrategies")
@js.native
class TraversalStrategies () extends js.Object {
  def this(parent: TraversalStrategies) = this()
  
  def addStrategy(strategy: TraversalStrategy): Unit = js.native
  
  def applyStrategies(traversal: Traversal_): js.Promise[Traversal_] = js.native
}
