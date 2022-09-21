package typings.htmlDomParser

import typings.domhandler.mod.Comment
import typings.domhandler.mod.Element
import typings.domhandler.mod.ProcessingInstruction
import typings.domhandler.mod.Text
import typings.std.NamedNodeMap
import typings.std.NodeList
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("html-dom-parser/lib/client/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatAttributes(attributes: NamedNodeMap): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def formatDOM(nodes: NodeList): js.Array[Comment | Element | ProcessingInstruction | Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList, parent: Null, directive: String): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList, parent: Unit, directive: String): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList, parent: Element): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def formatDOM(nodes: NodeList, parent: Element, directive: String): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDOM")(nodes.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], directive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
}
