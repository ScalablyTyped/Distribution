package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooksAnnotationsRange extends StObject {
  
  /** The offset from the ending position. */
  var endOffset: js.UndefOr[String] = js.native
  
  /** The ending position for the range. */
  var endPosition: js.UndefOr[String] = js.native
  
  /** The offset from the starting position. */
  var startOffset: js.UndefOr[String] = js.native
  
  /** The starting position for the range. */
  var startPosition: js.UndefOr[String] = js.native
}
object BooksAnnotationsRange {
  
  @scala.inline
  def apply(): BooksAnnotationsRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksAnnotationsRange]
  }
  
  @scala.inline
  implicit class BooksAnnotationsRangeMutableBuilder[Self <: BooksAnnotationsRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOffset(value: String): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
    
    @scala.inline
    def setEndPosition(value: String): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
    
    @scala.inline
    def setStartOffset(value: String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
  }
}
