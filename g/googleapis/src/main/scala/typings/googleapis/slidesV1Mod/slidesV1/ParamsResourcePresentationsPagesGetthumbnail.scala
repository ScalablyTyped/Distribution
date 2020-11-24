package typings.googleapis.slidesV1Mod.slidesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePresentationsPagesGetthumbnail extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The object ID of the page whose thumbnail to retrieve.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the presentation to retrieve.
    */
  var presentationId: js.UndefOr[String] = js.native
  
  /**
    * The optional mime type of the thumbnail image.  If you don't specify the
    * mime type, the default mime type will be PNG.
    */
  @JSName("thumbnailProperties.mimeType")
  var thumbnailPropertiesDotmimeType: js.UndefOr[String] = js.native
  
  /**
    * The optional thumbnail image size.  If you don't specify the size, the
    * server chooses a default size of the image.
    */
  @JSName("thumbnailProperties.thumbnailSize")
  var thumbnailPropertiesDotthumbnailSize: js.UndefOr[String] = js.native
}
object ParamsResourcePresentationsPagesGetthumbnail {
  
  @scala.inline
  def apply(): ParamsResourcePresentationsPagesGetthumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePresentationsPagesGetthumbnail]
  }
  
  @scala.inline
  implicit class ParamsResourcePresentationsPagesGetthumbnailOps[Self <: ParamsResourcePresentationsPagesGetthumbnail] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setPageObjectId(value: String): Self = this.set("pageObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageObjectId: Self = this.set("pageObjectId", js.undefined)
    
    @scala.inline
    def setPresentationId(value: String): Self = this.set("presentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentationId: Self = this.set("presentationId", js.undefined)
    
    @scala.inline
    def setThumbnailPropertiesDotmimeType(value: String): Self = this.set("thumbnailProperties.mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailPropertiesDotmimeType: Self = this.set("thumbnailProperties.mimeType", js.undefined)
    
    @scala.inline
    def setThumbnailPropertiesDotthumbnailSize(value: String): Self = this.set("thumbnailProperties.thumbnailSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailPropertiesDotthumbnailSize: Self = this.set("thumbnailProperties.thumbnailSize", js.undefined)
  }
}
