package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "Translator")
@js.native
class Translator protected () extends js.Object {
  def this(traversalSource: AnonymousTraversalSource) = this()
  def this(traversalSource: GraphTraversalSource) = this()
  def getTraversalSource(): Translator = js.native
  def of(traversalSource: AnonymousTraversalSource): scala.Unit = js.native
  def of(traversalSource: GraphTraversalSource): scala.Unit = js.native
  def translate(bytecode: Bytecode): java.lang.String = js.native
}

