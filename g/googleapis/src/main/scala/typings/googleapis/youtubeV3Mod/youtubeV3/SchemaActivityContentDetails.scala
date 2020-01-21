package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    bulletin: SchemaActivityContentDetailsBulletin = null,
    channelItem: SchemaActivityContentDetailsChannelItem = null,
    comment: SchemaActivityContentDetailsComment = null,
    favorite: SchemaActivityContentDetailsFavorite = null,
    like: SchemaActivityContentDetailsLike = null,
    playlistItem: SchemaActivityContentDetailsPlaylistItem = null,
    promotedItem: SchemaActivityContentDetailsPromotedItem = null,
    recommendation: SchemaActivityContentDetailsRecommendation = null,
    social: SchemaActivityContentDetailsSocial = null,
    subscription: SchemaActivityContentDetailsSubscription = null,
    upload: SchemaActivityContentDetailsUpload = null
  ): SchemaActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    if (bulletin != null) __obj.updateDynamic("bulletin")(bulletin.asInstanceOf[js.Any])
    if (channelItem != null) __obj.updateDynamic("channelItem")(channelItem.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (favorite != null) __obj.updateDynamic("favorite")(favorite.asInstanceOf[js.Any])
    if (like != null) __obj.updateDynamic("like")(like.asInstanceOf[js.Any])
    if (playlistItem != null) __obj.updateDynamic("playlistItem")(playlistItem.asInstanceOf[js.Any])
    if (promotedItem != null) __obj.updateDynamic("promotedItem")(promotedItem.asInstanceOf[js.Any])
    if (recommendation != null) __obj.updateDynamic("recommendation")(recommendation.asInstanceOf[js.Any])
    if (social != null) __obj.updateDynamic("social")(social.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetails]
  }
}

