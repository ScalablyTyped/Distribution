package typings.instagramDashPrivateDashApi.distResponsesNewsDotRepositoryDotInboxDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseRootObject extends js.Object {
  var ads_manager: NewsRepositoryInboxResponseAds_manager
  var aymf: NewsRepositoryInboxResponseAymf
  var business_profile_reminder: NewsRepositoryInboxResponseBusiness_profile_reminder
  var continuation_token: Double
  var counts: NewsRepositoryInboxResponseCounts
  var friend_request_stories: js.Array[_]
  var new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem]
  var old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem]
  var partition: NewsRepositoryInboxResponsePartition
  var status: String
  var subscription: js.Any
}

object NewsRepositoryInboxResponseRootObject {
  @scala.inline
  def apply(
    ads_manager: NewsRepositoryInboxResponseAds_manager,
    aymf: NewsRepositoryInboxResponseAymf,
    business_profile_reminder: NewsRepositoryInboxResponseBusiness_profile_reminder,
    continuation_token: Double,
    counts: NewsRepositoryInboxResponseCounts,
    friend_request_stories: js.Array[_],
    new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem],
    old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem],
    partition: NewsRepositoryInboxResponsePartition,
    status: String,
    subscription: js.Any
  ): NewsRepositoryInboxResponseRootObject = {
    val __obj = js.Dynamic.literal(ads_manager = ads_manager, aymf = aymf, business_profile_reminder = business_profile_reminder, continuation_token = continuation_token, counts = counts, friend_request_stories = friend_request_stories, new_stories = new_stories, old_stories = old_stories, partition = partition, status = status, subscription = subscription)
  
    __obj.asInstanceOf[NewsRepositoryInboxResponseRootObject]
  }
}

