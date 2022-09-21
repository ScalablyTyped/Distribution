package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaItem extends StObject {
  
  /**
    * The description of the item.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Displays an image on the page.
    */
  var imageItem: js.UndefOr[SchemaImageItem] = js.undefined
  
  /**
    * The item ID. On creation, it can be provided but the ID must not be already used in the form. If not provided, a new ID is assigned.
    */
  var itemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Starts a new page with a title.
    */
  var pageBreakItem: js.UndefOr[SchemaPageBreakItem] = js.undefined
  
  /**
    * Poses one or more questions to the user with a single major prompt.
    */
  var questionGroupItem: js.UndefOr[SchemaQuestionGroupItem] = js.undefined
  
  /**
    * Poses a question to the user.
    */
  var questionItem: js.UndefOr[SchemaQuestionItem] = js.undefined
  
  /**
    * Displays a title and description on the page.
    */
  var textItem: js.UndefOr[SchemaTextItem] = js.undefined
  
  /**
    * The title of the item.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Displays a video on the page.
    */
  var videoItem: js.UndefOr[SchemaVideoItem] = js.undefined
}
object SchemaItem {
  
  inline def apply(): SchemaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItem]
  }
  
  extension [Self <: SchemaItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImageItem(value: SchemaImageItem): Self = StObject.set(x, "imageItem", value.asInstanceOf[js.Any])
    
    inline def setImageItemUndefined: Self = StObject.set(x, "imageItem", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setPageBreakItem(value: SchemaPageBreakItem): Self = StObject.set(x, "pageBreakItem", value.asInstanceOf[js.Any])
    
    inline def setPageBreakItemUndefined: Self = StObject.set(x, "pageBreakItem", js.undefined)
    
    inline def setQuestionGroupItem(value: SchemaQuestionGroupItem): Self = StObject.set(x, "questionGroupItem", value.asInstanceOf[js.Any])
    
    inline def setQuestionGroupItemUndefined: Self = StObject.set(x, "questionGroupItem", js.undefined)
    
    inline def setQuestionItem(value: SchemaQuestionItem): Self = StObject.set(x, "questionItem", value.asInstanceOf[js.Any])
    
    inline def setQuestionItemUndefined: Self = StObject.set(x, "questionItem", js.undefined)
    
    inline def setTextItem(value: SchemaTextItem): Self = StObject.set(x, "textItem", value.asInstanceOf[js.Any])
    
    inline def setTextItemUndefined: Self = StObject.set(x, "textItem", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideoItem(value: SchemaVideoItem): Self = StObject.set(x, "videoItem", value.asInstanceOf[js.Any])
    
    inline def setVideoItemUndefined: Self = StObject.set(x, "videoItem", js.undefined)
  }
}
