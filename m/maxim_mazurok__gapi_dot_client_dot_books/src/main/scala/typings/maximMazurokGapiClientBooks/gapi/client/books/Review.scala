package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.Description
import typings.maximMazurokGapiClientBooks.anon.DisplayName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Review extends StObject {
  
  /** Author of this review. */
  var author: js.UndefOr[DisplayName] = js.undefined
  
  /** Review text. */
  var content: js.UndefOr[String] = js.undefined
  
  /** Date of this review. */
  var date: js.UndefOr[String] = js.undefined
  
  /** URL for the full review text, for reviews gathered from the web. */
  var fullTextUrl: js.UndefOr[String] = js.undefined
  
  /** Resource type for a review. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Star rating for this review. Possible values are ONE, TWO, THREE, FOUR, FIVE or NOT_RATED. */
  var rating: js.UndefOr[String] = js.undefined
  
  /** Information regarding the source of this review, when the review is not from a Google Books user. */
  var source: js.UndefOr[Description] = js.undefined
  
  /** Title for this review. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Source type for this review. Possible values are EDITORIAL, WEB_USER or GOOGLE_USER. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Volume that this review is for. */
  var volumeId: js.UndefOr[String] = js.undefined
}
object Review {
  
  inline def apply(): Review = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Review]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: DisplayName): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setFullTextUrl(value: String): Self = StObject.set(x, "fullTextUrl", value.asInstanceOf[js.Any])
    
    inline def setFullTextUrlUndefined: Self = StObject.set(x, "fullTextUrl", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setSource(value: Description): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
