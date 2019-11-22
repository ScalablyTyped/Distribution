package typings.instagramDashPrivateDashApi.distResponsesNewsDotRepositoryDotInboxDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseCounts extends js.Object {
  var campaign_notification: js.UndefOr[Double] = js.undefined
  var comment_likes: js.UndefOr[Double] = js.undefined
  var comments: js.UndefOr[Double] = js.undefined
  var likes: js.UndefOr[Double] = js.undefined
  var photos_of_you: js.UndefOr[Double] = js.undefined
  var relationships: js.UndefOr[Double] = js.undefined
  var requests: js.UndefOr[Double] = js.undefined
  var usertags: js.UndefOr[Double] = js.undefined
}

object NewsRepositoryInboxResponseCounts {
  @scala.inline
  def apply(
    campaign_notification: Int | Double = null,
    comment_likes: Int | Double = null,
    comments: Int | Double = null,
    likes: Int | Double = null,
    photos_of_you: Int | Double = null,
    relationships: Int | Double = null,
    requests: Int | Double = null,
    usertags: Int | Double = null
  ): NewsRepositoryInboxResponseCounts = {
    val __obj = js.Dynamic.literal()
    if (campaign_notification != null) __obj.updateDynamic("campaign_notification")(campaign_notification.asInstanceOf[js.Any])
    if (comment_likes != null) __obj.updateDynamic("comment_likes")(comment_likes.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (likes != null) __obj.updateDynamic("likes")(likes.asInstanceOf[js.Any])
    if (photos_of_you != null) __obj.updateDynamic("photos_of_you")(photos_of_you.asInstanceOf[js.Any])
    if (relationships != null) __obj.updateDynamic("relationships")(relationships.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseCounts]
  }
}

