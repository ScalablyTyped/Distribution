package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

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
    campaign_notification: js.UndefOr[Double] = js.undefined,
    comment_likes: js.UndefOr[Double] = js.undefined,
    comments: js.UndefOr[Double] = js.undefined,
    likes: js.UndefOr[Double] = js.undefined,
    photos_of_you: js.UndefOr[Double] = js.undefined,
    relationships: js.UndefOr[Double] = js.undefined,
    requests: js.UndefOr[Double] = js.undefined,
    usertags: js.UndefOr[Double] = js.undefined
  ): NewsRepositoryInboxResponseCounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(campaign_notification)) __obj.updateDynamic("campaign_notification")(campaign_notification.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comment_likes)) __obj.updateDynamic("comment_likes")(comment_likes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(likes)) __obj.updateDynamic("likes")(likes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(photos_of_you)) __obj.updateDynamic("photos_of_you")(photos_of_you.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relationships)) __obj.updateDynamic("relationships")(relationships.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requests)) __obj.updateDynamic("requests")(requests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usertags)) __obj.updateDynamic("usertags")(usertags.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseCounts]
  }
}

