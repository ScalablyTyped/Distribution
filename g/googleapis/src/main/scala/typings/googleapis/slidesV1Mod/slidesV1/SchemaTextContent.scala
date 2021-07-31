package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The general text content. The text must reside in a compatible shape (e.g.
  * text box or rectangle) or a table cell in a page.
  */
trait SchemaTextContent extends StObject {
  
  /**
    * The bulleted lists contained in this text, keyed by list ID.
    */
  var lists: js.UndefOr[StringDictionary[SchemaList]] = js.undefined
  
  /**
    * The text contents broken down into its component parts, including styling
    * information. This property is read-only.
    */
  var textElements: js.UndefOr[js.Array[SchemaTextElement]] = js.undefined
}
object SchemaTextContent {
  
  @scala.inline
  def apply(): SchemaTextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextContent]
  }
  
  @scala.inline
  implicit class SchemaTextContentMutableBuilder[Self <: SchemaTextContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLists(value: StringDictionary[SchemaList]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    @scala.inline
    def setTextElements(value: js.Array[SchemaTextElement]): Self = StObject.set(x, "textElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextElementsUndefined: Self = StObject.set(x, "textElements", js.undefined)
    
    @scala.inline
    def setTextElementsVarargs(value: SchemaTextElement*): Self = StObject.set(x, "textElements", js.Array(value :_*))
  }
}
