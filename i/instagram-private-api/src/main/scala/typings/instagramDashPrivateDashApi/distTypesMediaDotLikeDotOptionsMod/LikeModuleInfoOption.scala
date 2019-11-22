package typings.instagramDashPrivateDashApi.distTypesMediaDotLikeDotOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_hashtag
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_location
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_newsfeed_multi_media_liked
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_contextual_post
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.feed_timeline
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.media_view_profile
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.newsfeed
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.photo_view_profile
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.profile
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.video_view_profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.FeedTimeline | instagram-private-api.instagram-private-api/dist/types/media.like.options.FeedContextualHashtag | instagram-private-api.instagram-private-api/dist/types/media.like.options.FeedContextualLocation | instagram-private-api.instagram-private-api/dist/types/media.like.options.Profile | instagram-private-api.instagram-private-api/dist/types/media.like.options.MediaViewProfile | instagram-private-api.instagram-private-api/dist/types/media.like.options.VideoViewProfile | instagram-private-api.instagram-private-api/dist/types/media.like.options.PhotoViewProfile & {[x: string] : any} */
trait LikeModuleInfoOption
  extends /* x */ StringDictionary[js.Any] {
  var hashtag: js.UndefOr[String] = js.undefined
  var location_id: js.UndefOr[String | Double] = js.undefined
  var module_name: js.UndefOr[
    feed_contextual_hashtag | feed_contextual_location | feed_contextual_newsfeed_multi_media_liked | feed_contextual_post | feed_timeline | media_view_profile | newsfeed | photo_view_profile | profile | video_view_profile
  ] = js.undefined
  var user_id: js.UndefOr[String | Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object LikeModuleInfoOption {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    hashtag: String = null,
    location_id: String | Double = null,
    module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked = null,
    user_id: String | Double = null,
    username: String = null
  ): LikeModuleInfoOption = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (location_id != null) __obj.updateDynamic("location_id")(location_id.asInstanceOf[js.Any])
    if (module_name != null) __obj.updateDynamic("module_name")(module_name.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[LikeModuleInfoOption]
  }
}

