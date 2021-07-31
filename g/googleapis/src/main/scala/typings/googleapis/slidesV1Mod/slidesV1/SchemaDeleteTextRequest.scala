package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes text from a shape or a table cell.
  */
trait SchemaDeleteTextRequest extends StObject {
  
  /**
    * The optional table cell location if the text is to be deleted from a
    * table cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.undefined
  
  /**
    * The object ID of the shape or table from which the text will be deleted.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The range of text to delete, based on TextElement indexes.  There is
    * always an implicit newline character at the end of a shape&#39;s or table
    * cell&#39;s text that cannot be deleted. `Range.Type.ALL` will use the
    * correct bounds, but care must be taken when specifying explicit bounds
    * for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example, if the
    * text is &quot;ABC&quot;, followed by an implicit newline, then the
    * maximum value is 2 for `text_range.start_index` and 3 for
    * `text_range.end_index`.  Deleting text that crosses a paragraph boundary
    * may result in changes to paragraph styles and lists as the two paragraphs
    * are merged.  Ranges that include only one code unit of a surrogate pair
    * are expanded to include both code units.
    */
  var textRange: js.UndefOr[SchemaRange] = js.undefined
}
object SchemaDeleteTextRequest {
  
  @scala.inline
  def apply(): SchemaDeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTextRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteTextRequestMutableBuilder[Self <: SchemaDeleteTextRequest] (val x: Self) extends AnyVal {
    
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
