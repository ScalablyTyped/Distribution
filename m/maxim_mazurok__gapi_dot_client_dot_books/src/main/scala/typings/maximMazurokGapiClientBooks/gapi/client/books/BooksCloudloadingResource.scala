package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooksCloudloadingResource extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var processingState: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var volumeId: js.UndefOr[String] = js.undefined
}
object BooksCloudloadingResource {
  
  @scala.inline
  def apply(): BooksCloudloadingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooksCloudloadingResource]
  }
  
  @scala.inline
  implicit class BooksCloudloadingResourceMutableBuilder[Self <: BooksCloudloadingResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setProcessingState(value: String): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
