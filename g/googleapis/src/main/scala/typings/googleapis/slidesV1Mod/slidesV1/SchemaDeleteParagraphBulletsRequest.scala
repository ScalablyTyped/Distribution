package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes bullets from all of the paragraphs that overlap with the given text
  * index range.  The nesting level of each paragraph will be visually
  * preserved by adding indent to the start of the corresponding paragraph.
  */
trait SchemaDeleteParagraphBulletsRequest extends StObject {
  
  /**
    * The optional table cell location if the text to be modified is in a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
  
  /**
    * The object ID of the shape or table containing the text to delete bullets
    * from.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The range of text to delete bullets from, based on TextElement indexes.
    */
  var textRange: js.UndefOr[SchemaRange] = js.undefined
}
object SchemaDeleteParagraphBulletsRequest {
  
  @scala.inline
  def apply(): SchemaDeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteParagraphBulletsRequestMutableBuilder[Self <: SchemaDeleteParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTextRange(value: SchemaRange): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
