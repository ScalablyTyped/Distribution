package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewsRepositoryInboxResponseCounts extends js.Object {
  
  var campaign_notification: js.UndefOr[Double] = js.native
  
  var comment_likes: js.UndefOr[Double] = js.native
  
  var comments: js.UndefOr[Double] = js.native
  
  var likes: js.UndefOr[Double] = js.native
  
  var photos_of_you: js.UndefOr[Double] = js.native
  
  var relationships: js.UndefOr[Double] = js.native
  
  var requests: js.UndefOr[Double] = js.native
  
  var usertags: js.UndefOr[Double] = js.native
}
object NewsRepositoryInboxResponseCounts {
  
  @scala.inline
  def apply(): NewsRepositoryInboxResponseCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewsRepositoryInboxResponseCounts]
  }
  
  @scala.inline
  implicit class NewsRepositoryInboxResponseCountsOps[Self <: NewsRepositoryInboxResponseCounts] (val x: Self) extends AnyVal {
    
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
    def setCampaign_notification(value: Double): Self = this.set("campaign_notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaign_notification: Self = this.set("campaign_notification", js.undefined)
    
    @scala.inline
    def setComment_likes(value: Double): Self = this.set("comment_likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_likes: Self = this.set("comment_likes", js.undefined)
    
    @scala.inline
    def setComments(value: Double): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setLikes(value: Double): Self = this.set("likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikes: Self = this.set("likes", js.undefined)
    
    @scala.inline
    def setPhotos_of_you(value: Double): Self = this.set("photos_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotos_of_you: Self = this.set("photos_of_you", js.undefined)
    
    @scala.inline
    def setRelationships(value: Double): Self = this.set("relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
    
    @scala.inline
    def setRequests(value: Double): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setUsertags(value: Double): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
