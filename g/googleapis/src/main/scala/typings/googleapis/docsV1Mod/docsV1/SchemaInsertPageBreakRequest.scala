package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inserts a page break followed by a newline at the specified location.
  */
trait SchemaInsertPageBreakRequest extends StObject {
  
  /**
    * Inserts the page break at the end of the document body.  Page breaks
    * cannot be inserted inside a footnote, header or footer. Since page breaks
    * can only be inserted inside the body, the segment ID field must be empty.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.undefined
  
  /**
    * Inserts the page break at a specific index in the document.  The page
    * break must be inserted inside the bounds of an existing Paragraph. For
    * instance, it cannot be inserted at a table&#39;s start index (i.e.
    * between the table and its preceding paragraph).  Page breaks cannot be
    * inserted inside a table, equation, footnote, header or footer. Since page
    * breaks can only be inserted inside the body, the segment ID field must be
    * empty.
    */
  var location: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaInsertPageBreakRequest {
  
  @scala.inline
  def apply(): SchemaInsertPageBreakRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertPageBreakRequest]
  }
  
  @scala.inline
  implicit class SchemaInsertPageBreakRequestMutableBuilder[Self <: SchemaInsertPageBreakRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOfSegmentLocation(value: SchemaEndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
