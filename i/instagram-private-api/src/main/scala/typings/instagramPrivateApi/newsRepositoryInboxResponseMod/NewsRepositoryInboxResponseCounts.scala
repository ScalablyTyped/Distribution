package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewsRepositoryInboxResponseCounts extends StObject {
  
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
  def apply(): NewsRepositoryInboxResponseCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewsRepositoryInboxResponseCounts]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseCountsMutableBuilder[Self <: NewsRepositoryInboxResponseCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaign_notification(value: Double): Self = StObject.set(x, "campaign_notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaign_notificationUndefined: Self = StObject.set(x, "campaign_notification", js.undefined)
    
    @scala.inline
    def setComment_likes(value: Double): Self = StObject.set(x, "comment_likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likesUndefined: Self = StObject.set(x, "comment_likes", js.undefined)
    
    @scala.inline
    def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setLikes(value: Double): Self = StObject.set(x, "likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikesUndefined: Self = StObject.set(x, "likes", js.undefined)
    
    @scala.inline
    def setPhotos_of_you(value: Double): Self = StObject.set(x, "photos_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotos_of_youUndefined: Self = StObject.set(x, "photos_of_you", js.undefined)
    
    @scala.inline
    def setRelationships(value: Double): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setRequests(value: Double): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setUsertags(value: Double): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
  }
}
