package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouTubeVideo extends StObject {
  
  /** URL that can be used to view the YouTube video. Read-only. */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /** YouTube API resource ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** URL of a thumbnail image of the YouTube video. Read-only. */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
  
  /** Title of the YouTube video. Read-only. */
  var title: js.UndefOr[String] = js.undefined
}
object YouTubeVideo {
  
  inline def apply(): YouTubeVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubeVideo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YouTubeVideo] (val x: Self) extends AnyVal {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
