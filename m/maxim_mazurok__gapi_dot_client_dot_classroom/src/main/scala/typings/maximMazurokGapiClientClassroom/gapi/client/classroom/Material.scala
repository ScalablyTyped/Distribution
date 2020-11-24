package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Material extends js.Object {
  
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
  implicit class MaterialOps[Self <: Material] (val x: Self) extends AnyVal {
    
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
    def setDriveFile(value: SharedDriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    
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
    def setYoutubeVideo(value: YouTubeVideo): Self = this.set("youtubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoutubeVideo: Self = this.set("youtubeVideo", js.undefined)
  }
}
