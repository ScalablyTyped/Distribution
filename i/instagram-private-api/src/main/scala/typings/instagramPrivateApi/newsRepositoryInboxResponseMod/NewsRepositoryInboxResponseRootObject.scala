package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseRootObject extends StObject {
  
  var ads_manager: NewsRepositoryInboxResponseAdsManager
  
  var aymf: NewsRepositoryInboxResponseAymf
  
  var business_profile_reminder: NewsRepositoryInboxResponseBusinessProfileReminder
  
  var continuation_token: Double
  
  var counts: NewsRepositoryInboxResponseCounts
  
  var friend_request_stories: js.Array[js.Any]
  
  var new_stories: js.Array[NewsRepositoryInboxResponseNewStoriesItem]
  
  var old_stories: js.Array[NewsRepositoryInboxResponseOldStoriesItem]
  
  var partition: NewsRepositoryInboxResponsePartition
  
  var status: String
  
  var subscription: js.Any
}
object NewsRepositoryInboxResponseRootObject {
  
  @scala.inline
  def apply(
    ads_manager: NewsRepositoryInboxResponseAdsManager,
    aymf: NewsRepositoryInboxResponseAymf,
    business_profile_reminder: NewsRepositoryInboxResponseBusinessProfileReminder,
    continuation_token: Double,
    counts: NewsRepositoryInboxResponseCounts,
    friend_request_stories: js.Array[js.Any],
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
  implicit class NewsRepositoryInboxResponseRootObjectMutableBuilder[Self <: NewsRepositoryInboxResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAds_manager(value: NewsRepositoryInboxResponseAdsManager): Self = StObject.set(x, "ads_manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAymf(value: NewsRepositoryInboxResponseAymf): Self = StObject.set(x, "aymf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_profile_reminder(value: NewsRepositoryInboxResponseBusinessProfileReminder): Self = StObject.set(x, "business_profile_reminder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuation_token(value: Double): Self = StObject.set(x, "continuation_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounts(value: NewsRepositoryInboxResponseCounts): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriend_request_stories(value: js.Array[js.Any]): Self = StObject.set(x, "friend_request_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriend_request_storiesVarargs(value: js.Any*): Self = StObject.set(x, "friend_request_stories", js.Array(value :_*))
    
    @scala.inline
    def setNew_stories(value: js.Array[NewsRepositoryInboxResponseNewStoriesItem]): Self = StObject.set(x, "new_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_storiesVarargs(value: NewsRepositoryInboxResponseNewStoriesItem*): Self = StObject.set(x, "new_stories", js.Array(value :_*))
    
    @scala.inline
    def setOld_stories(value: js.Array[NewsRepositoryInboxResponseOldStoriesItem]): Self = StObject.set(x, "old_stories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld_storiesVarargs(value: NewsRepositoryInboxResponseOldStoriesItem*): Self = StObject.set(x, "old_stories", js.Array(value :_*))
    
    @scala.inline
    def setPartition(value: NewsRepositoryInboxResponsePartition): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: js.Any): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
  }
}
