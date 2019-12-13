package typings.gremlin.gremlinMod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "process.Translator")
@js.native
class Translator protected () extends js.Object {
  def this(traversalSource: AnonymousTraversalSource) = this()
  def this(traversalSource: GraphTraversalSource) = this()
  def getTraversalSource(): Translator = js.native
  def of(traversalSource: String): Unit = js.native
  def of(traversalSource: AnonymousTraversalSource): Unit = js.native
  def of(traversalSource: GraphTraversalSource): Unit = js.native
  def translate(bytecode: Bytecode): String = js.native
}

