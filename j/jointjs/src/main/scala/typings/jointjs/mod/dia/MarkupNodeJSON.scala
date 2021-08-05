package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.NativeSVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkupNodeJSON extends StObject {
  
  var attributes: js.UndefOr[NativeSVGAttributes] = js.undefined
  
  var children: js.UndefOr[MarkupJSON] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var groupSelector: js.UndefOr[String] = js.undefined
  
  var namespaceUri: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var tagName: String
  
  var textContent: js.UndefOr[String] = js.undefined
}
object MarkupNodeJSON {
  
  inline def apply(tagName: String): MarkupNodeJSON = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupNodeJSON]
  }
  
  extension [Self <: MarkupNodeJSON](x: Self) {
    
    inline def setAttributes(value: NativeSVGAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setChildren(value: MarkupJSON): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setGroupSelector(value: String): Self = StObject.set(x, "groupSelector", value.asInstanceOf[js.Any])
    
    inline def setGroupSelectorUndefined: Self = StObject.set(x, "groupSelector", js.undefined)
    
    inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
  }
}
