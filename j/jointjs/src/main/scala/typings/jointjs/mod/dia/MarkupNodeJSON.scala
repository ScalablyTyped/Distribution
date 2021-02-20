package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.attributes.NativeSVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkupNodeJSON extends StObject {
  
  var attributes: js.UndefOr[NativeSVGAttributes] = js.native
  
  var children: js.UndefOr[MarkupJSON] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var groupSelector: js.UndefOr[String] = js.native
  
  var namespaceUri: js.UndefOr[String] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var tagName: String = js.native
  
  var textContent: js.UndefOr[String] = js.native
}
object MarkupNodeJSON {
  
  @scala.inline
  def apply(tagName: String): MarkupNodeJSON = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupNodeJSON]
  }
  
  @scala.inline
  implicit class MarkupNodeJSONMutableBuilder[Self <: MarkupNodeJSON] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: NativeSVGAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setChildren(value: MarkupJSON): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setGroupSelector(value: String): Self = StObject.set(x, "groupSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSelectorUndefined: Self = StObject.set(x, "groupSelector", js.undefined)
    
    @scala.inline
    def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUriUndefined: Self = StObject.set(x, "namespaceUri", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
  }
}
