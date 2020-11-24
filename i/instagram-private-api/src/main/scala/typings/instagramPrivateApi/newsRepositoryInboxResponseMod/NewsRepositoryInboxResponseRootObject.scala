package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseRootObject extends js.Object {
  
  var ads_manager: NewsRepositoryInboxResponseAdsManager = js.native
  
  var aymf: NewsRepositoryInboxResponseAymf = js.native
  
  var business_profile_reminder: NewsRepositoryInboxResponseBusinessProfileReminder = js.native
  
  var continuation_token: Double = js.native
  
  var counts: NewsRepositoryInboxResponseCounts = js.native
  
  var friend_request_stories: js.Array[_] = js.native
  
  var new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem] = js.native
  
  var old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem] = js.native
  
  var partition: NewsRepositoryInboxResponsePartition = js.native
  
  var status: String = js.native
  
  var subscription: js.Any = js.native
}
object NewsRepositoryInboxResponseRootObject {
  
  @scala.inline
  def apply(
    ads_manager: NewsRepositoryInboxResponseAdsManager,
    aymf: NewsRepositoryInboxResponseAymf,
    business_profile_reminder: NewsRepositoryInboxResponseBusinessProfileReminder,
    continuation_token: Double,
    counts: NewsRepositoryInboxResponseCounts,
    friend_request_stories: js.Array[_],
    new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem],
    old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem],
    partition: NewsRepositoryInboxResponsePartition,
    status: String,
    subscription: js.Any
  ): NewsRepositoryInboxResponseRootObject = {
    val __obj = js.Dynamic.literal(ads_manager = ads_manager.asInstanceOf[js.Any], aymf = aymf.asInstanceOf[js.Any], business_profile_reminder = business_profile_reminder.asInstanceOf[js.Any], continuation_token = continuation_token.asInstanceOf[js.Any], counts = counts.asInstanceOf[js.Any], friend_request_stories = friend_request_stories.asInstanceOf[js.Any], new_stories = new_stories.asInstanceOf[js.Any], old_stories = old_stories.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseRootObject]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseRootObjectOps[Self <: NewsRepositoryInboxResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setAds_manager(value: NewsRepositoryInboxResponseAdsManager): Self = this.set("ads_manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAymf(value: NewsRepositoryInboxResponseAymf): Self = this.set("aymf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_profile_reminder(value: NewsRepositoryInboxResponseBusinessProfileReminder): Self = this.set("business_profile_reminder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuation_token(value: Double): Self = this.set("continuation_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounts(value: NewsRepositoryInboxResponseCounts): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriend_request_storiesVarargs(value: js.Any*): Self = this.set("friend_request_stories", js.Array(value :_*))
    
    @scala.inline
    def setFriend_request_stories(value: js.Array[_]): Self = this.set("friend_request_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_storiesVarargs(value: NewsRepositoryInboxResponseNewStoriesItem*): Self = this.set("new_stories", js.Array(value :_*))
    
    @scala.inline
    def setNew_stories(value: js.Array[NewsRepositoryInboxResponseNewStoriesItem]): Self = this.set("new_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld_storiesVarargs(value: NewsRepositoryInboxResponseOldStoriesItem*): Self = this.set("old_stories", js.Array(value :_*))
    
    @scala.inline
    def setOld_stories(value: js.Array[NewsRepositoryInboxResponseOldStoriesItem]): Self = this.set("old_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: NewsRepositoryInboxResponsePartition): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: js.Any): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
}
