package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends StObject {
  
  /** Google Drive file attachment. */
  var driveFile: js.UndefOr[DriveFile] = js.native
  
  /** Google Forms attachment. */
  var form: js.UndefOr[Form] = js.native
  
  /** Link attachment. */
  var link: js.UndefOr[Link] = js.native
  
  /** Youtube video attachment. */
  var youTubeVideo: js.UndefOr[YouTubeVideo] = js.native
}
object Attachment {
  
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
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
    def setYouTubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
  }
}
