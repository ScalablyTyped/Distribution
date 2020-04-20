package typings.instagramPrivateApi.mediaLikeOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d  :1 | 0} */
trait LikeRequestOptions extends js.Object {
  var d: `1` | `0`
  var mediaId: String
  var moduleInfo: LikeModuleInfoOption
}

object LikeRequestOptions {
  @scala.inline
  def apply(d: `1` | `0`, mediaId: String, moduleInfo: LikeModuleInfoOption): LikeRequestOptions = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikeRequestOptions]
  }
}

