package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.like
import typings.instagramPrivateApi.instagramPrivateApiStrings.unlike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  action :'like' | 'unlike',   d :1 | 0 | undefined} */
@js.native
trait MediaLikeOrUnlikeOptions extends js.Object {
  
  var action: like | unlike = js.native
  
  var d: js.UndefOr[`1` | `0`] = js.native
  
  var mediaId: String = js.native
  
  var moduleInfo: LikeModuleInfoOption = js.native
}
object MediaLikeOrUnlikeOptions {
  
  @scala.inline
  def apply(action: like | unlike, mediaId: String, moduleInfo: LikeModuleInfoOption): MediaLikeOrUnlikeOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaLikeOrUnlikeOptions]
  }
  
  @scala.inline
  implicit class MediaLikeOrUnlikeOptionsOps[Self <: MediaLikeOrUnlikeOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(value: like | unlike): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaId(value: String): Self = this.set("mediaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleInfo(value: LikeModuleInfoOption): Self = this.set("moduleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: `1` | `0`): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
  }
}
