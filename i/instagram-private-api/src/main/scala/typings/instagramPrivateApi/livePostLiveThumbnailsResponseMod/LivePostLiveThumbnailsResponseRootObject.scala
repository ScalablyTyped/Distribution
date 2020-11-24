package typings.instagramPrivateApi.livePostLiveThumbnailsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LivePostLiveThumbnailsResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var thumbnails: js.Array[String] = js.native
}
object LivePostLiveThumbnailsResponseRootObject {
  
  @scala.inline
  def apply(status: String, thumbnails: js.Array[String]): LivePostLiveThumbnailsResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivePostLiveThumbnailsResponseRootObject]
  }
  
  @scala.inline
  implicit class LivePostLiveThumbnailsResponseRootObjectOps[Self <: LivePostLiveThumbnailsResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsVarargs(value: String*): Self = this.set("thumbnails", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: js.Array[String]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
  }
}
