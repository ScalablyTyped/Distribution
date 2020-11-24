package typings.ink.domMod

import org.scalablytyped.runtime.StringDictionary
import typings.ink.anon.NodeName
import typings.ink.stylesMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ink.domMod.DOMElement
  - typings.ink.domMod.TextNode
*/
trait DOMNode[T] extends js.Object
object DOMNode {
  
  @scala.inline
  def DOMElement[T](
    attributes: StringDictionary[DOMNodeAttribute],
    childNodes: js.Array[DOMNode[NodeName]],
    nodeName: ElementNames,
    style: Styles
  ): DOMNode[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMNode[T]]
  }
  
  @scala.inline
  def TextNode[T](nodeName: TextName, nodeValue: String, style: Styles): DOMNode[T] = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMNode[T]]
  }
}
