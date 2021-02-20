package typings.maximMazurokGapiClientBooks.anon

import typings.maximMazurokGapiClientBooks.gapi.client.books.BooksAnnotationsRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentVersion extends StObject {
  
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[BooksAnnotationsRange] = js.native
  
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[String] = js.native
  
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[BooksAnnotationsRange] = js.native
  
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[BooksAnnotationsRange] = js.native
}
object ContentVersion {
  
  @scala.inline
  def apply(): ContentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentVersion]
  }
  
  @scala.inline
  implicit class ContentVersionMutableBuilder[Self <: ContentVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCfiRange(value: BooksAnnotationsRange): Self = StObject.set(x, "cfiRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCfiRangeUndefined: Self = StObject.set(x, "cfiRange", js.undefined)
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    @scala.inline
    def setGbImageRange(value: BooksAnnotationsRange): Self = StObject.set(x, "gbImageRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbImageRangeUndefined: Self = StObject.set(x, "gbImageRange", js.undefined)
    
    @scala.inline
    def setGbTextRange(value: BooksAnnotationsRange): Self = StObject.set(x, "gbTextRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbTextRangeUndefined: Self = StObject.set(x, "gbTextRange", js.undefined)
  }
}
