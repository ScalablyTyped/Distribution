package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadingPosition extends StObject {
  
  /** Position in an EPUB as a CFI. */
  var epubCfiPosition: js.UndefOr[String] = js.undefined
  
  /** Position in a volume for image-based content. */
  var gbImagePosition: js.UndefOr[String] = js.undefined
  
  /** Position in a volume for text-based content. */
  var gbTextPosition: js.UndefOr[String] = js.undefined
  
  /** Resource type for a reading position. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Position in a PDF file. */
  var pdfPosition: js.UndefOr[String] = js.undefined
  
  /** Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[String] = js.undefined
  
  /** Volume id associated with this reading position. */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ReadingPosition {
  
  @scala.inline
  def apply(): ReadingPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadingPosition]
  }
  
  @scala.inline
  implicit class ReadingPositionMutableBuilder[Self <: ReadingPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEpubCfiPosition(value: String): Self = StObject.set(x, "epubCfiPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpubCfiPositionUndefined: Self = StObject.set(x, "epubCfiPosition", js.undefined)
    
    @scala.inline
    def setGbImagePosition(value: String): Self = StObject.set(x, "gbImagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbImagePositionUndefined: Self = StObject.set(x, "gbImagePosition", js.undefined)
    
    @scala.inline
    def setGbTextPosition(value: String): Self = StObject.set(x, "gbTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbTextPositionUndefined: Self = StObject.set(x, "gbTextPosition", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPdfPosition(value: String): Self = StObject.set(x, "pdfPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfPositionUndefined: Self = StObject.set(x, "pdfPosition", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
