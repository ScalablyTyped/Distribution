package typings.instagramPrivateApi.mediaLikeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikeOrUnlikeBaseOptions extends js.Object {
  var mediaId: String
  var moduleInfo: LikeModuleInfoOption
}

object LikeOrUnlikeBaseOptions {
  @scala.inline
  def apply(mediaId: String, moduleInfo: LikeModuleInfoOption): LikeOrUnlikeBaseOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LikeOrUnlikeBaseOptions]
  }
}

