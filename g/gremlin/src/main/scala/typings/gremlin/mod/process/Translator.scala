package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.Translator")
@js.native
open class Translator protected () extends StObject {
  def this(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]) = this()
  def this(traversalSource: GraphTraversalSource[GraphTraversal]) = this()
  
  def convert(anyObject: Any): String = js.native
  
  def getTraversalSource(): Translator = js.native
  
  def of(traversalSource: String): Unit = js.native
  def of(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]): Unit = js.native
  def of(traversalSource: GraphTraversalSource[GraphTraversal]): Unit = js.native
  
  def translate(bytecode: Bytecode): String = js.native
  def translate(bytecode: Bytecode, child: Boolean): String = js.native
}
