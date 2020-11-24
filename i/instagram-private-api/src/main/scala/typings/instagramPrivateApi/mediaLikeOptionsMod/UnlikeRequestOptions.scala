package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d :0 | undefined} */
@js.native
trait UnlikeRequestOptions extends js.Object {
  
  var d: js.UndefOr[`0`] = js.native
  
  var mediaId: String = js.native
  
  var moduleInfo: LikeModuleInfoOption = js.native
}
object UnlikeRequestOptions {
  
  @scala.inline
  def apply(mediaId: String, moduleInfo: LikeModuleInfoOption): UnlikeRequestOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlikeRequestOptions]
  }
  
  @scala.inline
  implicit class UnlikeRequestOptionsOps[Self <: UnlikeRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleInfo(value: LikeModuleInfoOption): Self = this.set("moduleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: `0`): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
  }
}
