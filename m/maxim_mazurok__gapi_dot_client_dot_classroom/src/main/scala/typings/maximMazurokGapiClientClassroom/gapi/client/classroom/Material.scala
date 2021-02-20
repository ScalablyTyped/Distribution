package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Material extends StObject {
  
  /** Google Drive file material. */
  var driveFile: js.UndefOr[SharedDriveFile] = js.native
  
  /** Google Forms material. */
  var form: js.UndefOr[Form] = js.native
  
  /** Link material. On creation, this is upgraded to a more appropriate type if possible, and this is reflected in the response. */
  var link: js.UndefOr[Link] = js.native
  
  /** YouTube video material. */
  var youtubeVideo: js.UndefOr[YouTubeVideo] = js.native
}
object Material {
  
  @scala.inline
  def apply(): Material = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Material]
  }
  
  @scala.inline
  implicit class MaterialMutableBuilder[Self <: Material] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: SharedDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    @scala.inline
    def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setYoutubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youtubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeVideoUndefined: Self = StObject.set(x, "youtubeVideo", js.undefined)
  }
}
