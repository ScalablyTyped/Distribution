package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the uploaded video.
  */
@js.native
trait SchemaActivityContentDetailsUpload extends js.Object {
  
  /**
    * The ID that YouTube uses to uniquely identify the uploaded video.
    */
  var videoId: js.UndefOr[String] = js.native
}
object SchemaActivityContentDetailsUpload {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsUpload]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsUploadOps[Self <: SchemaActivityContentDetailsUpload] (val x: Self) extends AnyVal {
    
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
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
}
