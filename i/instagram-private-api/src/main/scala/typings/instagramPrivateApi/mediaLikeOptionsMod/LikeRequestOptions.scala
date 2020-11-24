package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d :1 | 0} */
@js.native
trait LikeRequestOptions extends js.Object {
  
  var d: `1` | `0` = js.native
  
  var mediaId: String = js.native
  
  var moduleInfo: LikeModuleInfoOption = js.native
}
object LikeRequestOptions {
  
  @scala.inline
  def apply(d: `1` | `0`, mediaId: String, moduleInfo: LikeModuleInfoOption): LikeRequestOptions = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikeRequestOptions]
  }
  
  @scala.inline
  implicit class LikeRequestOptionsOps[Self <: LikeRequestOptions] (val x: Self) extends AnyVal {
    
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
    def setD(value: `1` | `0`): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleInfo(value: LikeModuleInfoOption): Self = this.set("moduleInfo", value.asInstanceOf[js.Any])
  }
}
