package typings.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.Translator")
@js.native
class Translator protected () extends js.Object {
  def this(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]) = this()
  def this(traversalSource: GraphTraversalSource[GraphTraversal]) = this()
  def getTraversalSource(): Translator = js.native
  def of(traversalSource: String): Unit = js.native
  def of(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]): Unit = js.native
  def of(traversalSource: GraphTraversalSource[GraphTraversal]): Unit = js.native
  def translate(bytecode: Bytecode): String = js.native
}

