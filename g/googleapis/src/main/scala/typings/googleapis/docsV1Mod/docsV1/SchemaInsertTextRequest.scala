package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInsertTextRequest extends StObject {
  
  /**
    * Inserts the text at the end of a header, footer, footnote or the document body.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.undefined
  
  /**
    * Inserts the text at a specific index in the document. Text must be inserted inside the bounds of an existing Paragraph. For instance, text cannot be inserted at a table's start index (i.e. between the table and its preceding paragraph). The text must be inserted in the preceding paragraph.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
  
  /**
    * The text to be inserted. Inserting a newline character will implicitly create a new Paragraph at that index. The paragraph style of the new paragraph will be copied from the paragraph at the current insertion index, including lists and bullets. Text styles for inserted text will be determined automatically, generally preserving the styling of neighboring text. In most cases, the text style for the inserted text will match the text immediately before the insertion index. Some control characters (U+0000-U+0008, U+000C-U+001F) and characters from the Unicode Basic Multilingual Plane Private Use Area (U+E000-U+F8FF) will be stripped out of the inserted text.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaInsertTextRequest {
  
  inline def apply(): SchemaInsertTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTextRequest]
  }
  
  extension [Self <: SchemaInsertTextRequest](x: Self) {
    
    inline def setEndOfSegmentLocation(value: SchemaEndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    inline def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
