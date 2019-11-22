package typings.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`0`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`1`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.like
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.unlike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  action  :'like' | 'unlike',   d ? :1 | 0} */
trait MediaLikeOrUnlikeOptions extends js.Object {
  var action: like | unlike
  var d: js.UndefOr[`1` | `0`] = js.undefined
  var mediaId: String
  var moduleInfo: LikeModuleInfoOption
}

object MediaLikeOrUnlikeOptions {
  @scala.inline
  def apply(action: like | unlike, mediaId: String, moduleInfo: LikeModuleInfoOption, d: `1` | `0` = null): MediaLikeOrUnlikeOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mediaId = mediaId, moduleInfo = moduleInfo)
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaLikeOrUnlikeOptions]
  }
}

