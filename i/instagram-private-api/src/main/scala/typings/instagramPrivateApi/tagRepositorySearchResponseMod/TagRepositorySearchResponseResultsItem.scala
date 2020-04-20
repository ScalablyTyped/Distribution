package typings.instagramPrivateApi.tagRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagRepositorySearchResponseResultsItem extends js.Object {
  var allow_following: Null
  var allow_muting_story: Null
  var debug_info: Null
  var follow_button_text: Null
  var follow_status: Null
  var following: Null
  var id: String
  var media_count: Double
  var name: String
  var non_violating: Null
  var profile_pic_url: String
  var related_tags: Null
  var search_result_subtitle: String
  var show_follow_drop_down: Null
  var social_context: Null
  var social_context_profile_links: Null
  var subtitle: Null
}

object TagRepositorySearchResponseResultsItem {
  @scala.inline
  def apply(
    allow_following: Null,
    allow_muting_story: Null,
    debug_info: Null,
    follow_button_text: Null,
    follow_status: Null,
    following: Null,
    id: String,
    media_count: Double,
    name: String,
    non_violating: Null,
    profile_pic_url: String,
    related_tags: Null,
    search_result_subtitle: String,
    show_follow_drop_down: Null,
    social_context: Null,
    social_context_profile_links: Null,
    subtitle: Null
  ): TagRepositorySearchResponseResultsItem = {
    val __obj = js.Dynamic.literal(allow_following = allow_following.asInstanceOf[js.Any], allow_muting_story = allow_muting_story.asInstanceOf[js.Any], debug_info = debug_info.asInstanceOf[js.Any], follow_button_text = follow_button_text.asInstanceOf[js.Any], follow_status = follow_status.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], non_violating = non_violating.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], related_tags = related_tags.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any], show_follow_drop_down = show_follow_drop_down.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], social_context_profile_links = social_context_profile_links.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRepositorySearchResponseResultsItem]
  }
}

