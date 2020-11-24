package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the content of an activity: the video that was shared, the
  * channel that was subscribed to, etc.
  */
@js.native
trait SchemaActivityContentDetails extends js.Object {
  
  /**
    * The bulletin object contains details about a channel bulletin post. This
    * object is only present if the snippet.type is bulletin.
    */
  var bulletin: js.UndefOr[SchemaActivityContentDetailsBulletin] = js.native
  
  /**
    * The channelItem object contains details about a resource which was added
    * to a channel. This property is only present if the snippet.type is
    * channelItem.
    */
  var channelItem: js.UndefOr[SchemaActivityContentDetailsChannelItem] = js.native
  
  /**
    * The comment object contains information about a resource that received a
    * comment. This property is only present if the snippet.type is comment.
    */
  var comment: js.UndefOr[SchemaActivityContentDetailsComment] = js.native
  
  /**
    * The favorite object contains information about a video that was marked as
    * a favorite video. This property is only present if the snippet.type is
    * favorite.
    */
  var favorite: js.UndefOr[SchemaActivityContentDetailsFavorite] = js.native
  
  /**
    * The like object contains information about a resource that received a
    * positive (like) rating. This property is only present if the snippet.type
    * is like.
    */
  var like: js.UndefOr[SchemaActivityContentDetailsLike] = js.native
  
  /**
    * The playlistItem object contains information about a new playlist item.
    * This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: js.UndefOr[SchemaActivityContentDetailsPlaylistItem] = js.native
  
  /**
    * The promotedItem object contains details about a resource which is being
    * promoted. This property is only present if the snippet.type is
    * promotedItem.
    */
  var promotedItem: js.UndefOr[SchemaActivityContentDetailsPromotedItem] = js.native
  
  /**
    * The recommendation object contains information about a recommended
    * resource. This property is only present if the snippet.type is
    * recommendation.
    */
  var recommendation: js.UndefOr[SchemaActivityContentDetailsRecommendation] = js.native
  
  /**
    * The social object contains details about a social network post. This
    * property is only present if the snippet.type is social.
    */
  var social: js.UndefOr[SchemaActivityContentDetailsSocial] = js.native
  
  /**
    * The subscription object contains information about a channel that a user
    * subscribed to. This property is only present if the snippet.type is
    * subscription.
    */
  var subscription: js.UndefOr[SchemaActivityContentDetailsSubscription] = js.native
  
  /**
    * The upload object contains information about the uploaded video. This
    * property is only present if the snippet.type is upload.
    */
  var upload: js.UndefOr[SchemaActivityContentDetailsUpload] = js.native
}
object SchemaActivityContentDetails {
  
  @scala.inline
  def apply(): SchemaActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetails]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsOps[Self <: SchemaActivityContentDetails] (val x: Self) extends AnyVal {
    
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
    def setBulletin(value: SchemaActivityContentDetailsBulletin): Self = this.set("bulletin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulletin: Self = this.set("bulletin", js.undefined)
    
    @scala.inline
    def setChannelItem(value: SchemaActivityContentDetailsChannelItem): Self = this.set("channelItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelItem: Self = this.set("channelItem", js.undefined)
    
    @scala.inline
    def setComment(value: SchemaActivityContentDetailsComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setFavorite(value: SchemaActivityContentDetailsFavorite): Self = this.set("favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFavorite: Self = this.set("favorite", js.undefined)
    
    @scala.inline
    def setLike(value: SchemaActivityContentDetailsLike): Self = this.set("like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLike: Self = this.set("like", js.undefined)
    
    @scala.inline
    def setPlaylistItem(value: SchemaActivityContentDetailsPlaylistItem): Self = this.set("playlistItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistItem: Self = this.set("playlistItem", js.undefined)
    
    @scala.inline
    def setPromotedItem(value: SchemaActivityContentDetailsPromotedItem): Self = this.set("promotedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotedItem: Self = this.set("promotedItem", js.undefined)
    
    @scala.inline
    def setRecommendation(value: SchemaActivityContentDetailsRecommendation): Self = this.set("recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendation: Self = this.set("recommendation", js.undefined)
    
    @scala.inline
    def setSocial(value: SchemaActivityContentDetailsSocial): Self = this.set("social", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocial: Self = this.set("social", js.undefined)
    
    @scala.inline
    def setSubscription(value: SchemaActivityContentDetailsSubscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
    
    @scala.inline
    def setUpload(value: SchemaActivityContentDetailsUpload): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
}
