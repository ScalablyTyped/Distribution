package typings.intlifyMessageCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.intlifyMessageCompiler.mod.TextNode
  - typings.intlifyMessageCompiler.mod.NamedNode
  - typings.intlifyMessageCompiler.mod.ListNode
  - typings.intlifyMessageCompiler.mod.LiteralNode
  - typings.intlifyMessageCompiler.mod.LinkedNode
*/
trait MessageElementNode extends StObject
object MessageElementNode {
  
  inline def LinkedNode(end: Double, key: LinkedKeyNode | NamedNode | ListNode | LiteralNode, start: Double): typings.intlifyMessageCompiler.mod.LinkedNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(6)
    __obj.asInstanceOf[typings.intlifyMessageCompiler.mod.LinkedNode]
  }
  
  inline def ListNode(end: Double, index: Double, start: Double): typings.intlifyMessageCompiler.mod.ListNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[typings.intlifyMessageCompiler.mod.ListNode]
  }
  
  inline def LiteralNode(end: Double, start: Double, value: String): typings.intlifyMessageCompiler.mod.LiteralNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typings.intlifyMessageCompiler.mod.LiteralNode]
  }
  
  inline def NamedNode(end: Double, key: Identifier, start: Double): typings.intlifyMessageCompiler.mod.NamedNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typings.intlifyMessageCompiler.mod.NamedNode]
  }
  
  inline def TextNode(end: Double, start: Double, value: String): typings.intlifyMessageCompiler.mod.TextNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[typings.intlifyMessageCompiler.mod.TextNode]
  }
}
