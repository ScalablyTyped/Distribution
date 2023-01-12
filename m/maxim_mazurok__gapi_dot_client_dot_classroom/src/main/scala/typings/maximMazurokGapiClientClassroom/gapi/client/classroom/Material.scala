package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Material extends StObject {
  
  /** Google Drive file material. */
  var driveFile: js.UndefOr[SharedDriveFile] = js.undefined
  
  /** Google Forms material. */
  var form: js.UndefOr[Form] = js.undefined
  
  /** Link material. On creation, this is upgraded to a more appropriate type if possible, and this is reflected in the response. */
  var link: js.UndefOr[Link] = js.undefined
  
  /** YouTube video material. */
  var youtubeVideo: js.UndefOr[YouTubeVideo] = js.undefined
}
object Material {
  
  inline def apply(): Material = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Material]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Material] (val x: Self) extends AnyVal {
    
    inline def setDriveFile(value: SharedDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setYoutubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youtubeVideo", value.asInstanceOf[js.Any])
    
    inline def setYoutubeVideoUndefined: Self = StObject.set(x, "youtubeVideo", js.undefined)
  }
}
