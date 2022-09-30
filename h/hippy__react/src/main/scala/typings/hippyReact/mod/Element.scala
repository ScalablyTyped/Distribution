package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element
  extends StObject
     with ViewNode {
  
  var attributes: Attributes
  
  var id: String
  
  var style: Style
  
  var tagName: String
}
object Element {
  
  inline def apply(
    _isMounted: Boolean,
    attributes: Attributes,
    childNodes: js.Array[ViewNode],
    id: String,
    index: Double,
    meta: NodeMeta,
    nodeId: Double,
    style: Style,
    tagName: String
  ): Element = {
    val __obj = js.Dynamic.literal(_isMounted = _isMounted.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], nextSibling = null, parentNode = null, prevSibling = null)
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
