package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActivityContentDetails extends StObject {
  
  /**
    * The bulletin object contains details about a channel bulletin post. This object is only present if the snippet.type is bulletin.
    */
  var bulletin: js.UndefOr[SchemaActivityContentDetailsBulletin] = js.undefined
  
  /**
    * The channelItem object contains details about a resource which was added to a channel. This property is only present if the snippet.type is channelItem.
    */
  var channelItem: js.UndefOr[SchemaActivityContentDetailsChannelItem] = js.undefined
  
  /**
    * The comment object contains information about a resource that received a comment. This property is only present if the snippet.type is comment.
    */
  var comment: js.UndefOr[SchemaActivityContentDetailsComment] = js.undefined
  
  /**
    * The favorite object contains information about a video that was marked as a favorite video. This property is only present if the snippet.type is favorite.
    */
  var favorite: js.UndefOr[SchemaActivityContentDetailsFavorite] = js.undefined
  
  /**
    * The like object contains information about a resource that received a positive (like) rating. This property is only present if the snippet.type is like.
    */
  var like: js.UndefOr[SchemaActivityContentDetailsLike] = js.undefined
  
  /**
    * The playlistItem object contains information about a new playlist item. This property is only present if the snippet.type is playlistItem.
    */
  var playlistItem: js.UndefOr[SchemaActivityContentDetailsPlaylistItem] = js.undefined
  
  /**
    * The promotedItem object contains details about a resource which is being promoted. This property is only present if the snippet.type is promotedItem.
    */
  var promotedItem: js.UndefOr[SchemaActivityContentDetailsPromotedItem] = js.undefined
  
  /**
    * The recommendation object contains information about a recommended resource. This property is only present if the snippet.type is recommendation.
    */
  var recommendation: js.UndefOr[SchemaActivityContentDetailsRecommendation] = js.undefined
  
  /**
    * The social object contains details about a social network post. This property is only present if the snippet.type is social.
    */
  var social: js.UndefOr[SchemaActivityContentDetailsSocial] = js.undefined
  
  /**
    * The subscription object contains information about a channel that a user subscribed to. This property is only present if the snippet.type is subscription.
    */
  var subscription: js.UndefOr[SchemaActivityContentDetailsSubscription] = js.undefined
  
  /**
    * The upload object contains information about the uploaded video. This property is only present if the snippet.type is upload.
    */
  var upload: js.UndefOr[SchemaActivityContentDetailsUpload] = js.undefined
}
object SchemaActivityContentDetails {
  
  inline def apply(): SchemaActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetails]
  }
  
  extension [Self <: SchemaActivityContentDetails](x: Self) {
    
    inline def setBulletin(value: SchemaActivityContentDetailsBulletin): Self = StObject.set(x, "bulletin", value.asInstanceOf[js.Any])
    
    inline def setBulletinUndefined: Self = StObject.set(x, "bulletin", js.undefined)
    
    inline def setChannelItem(value: SchemaActivityContentDetailsChannelItem): Self = StObject.set(x, "channelItem", value.asInstanceOf[js.Any])
    
    inline def setChannelItemUndefined: Self = StObject.set(x, "channelItem", js.undefined)
    
    inline def setComment(value: SchemaActivityContentDetailsComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFavorite(value: SchemaActivityContentDetailsFavorite): Self = StObject.set(x, "favorite", value.asInstanceOf[js.Any])
    
    inline def setFavoriteUndefined: Self = StObject.set(x, "favorite", js.undefined)
    
    inline def setLike(value: SchemaActivityContentDetailsLike): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
    
    inline def setPlaylistItem(value: SchemaActivityContentDetailsPlaylistItem): Self = StObject.set(x, "playlistItem", value.asInstanceOf[js.Any])
    
    inline def setPlaylistItemUndefined: Self = StObject.set(x, "playlistItem", js.undefined)
    
    inline def setPromotedItem(value: SchemaActivityContentDetailsPromotedItem): Self = StObject.set(x, "promotedItem", value.asInstanceOf[js.Any])
    
    inline def setPromotedItemUndefined: Self = StObject.set(x, "promotedItem", js.undefined)
    
    inline def setRecommendation(value: SchemaActivityContentDetailsRecommendation): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    inline def setSocial(value: SchemaActivityContentDetailsSocial): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
    
    inline def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
    
    inline def setSubscription(value: SchemaActivityContentDetailsSubscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setUpload(value: SchemaActivityContentDetailsUpload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
