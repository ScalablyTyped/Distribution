package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachment extends js.Object {
  
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
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDriveFile(value: DriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    
    @scala.inline
    def setForm(value: Form): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setYouTubeVideo(value: YouTubeVideo): Self = this.set("youTubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYouTubeVideo: Self = this.set("youTubeVideo", js.undefined)
  }
}
