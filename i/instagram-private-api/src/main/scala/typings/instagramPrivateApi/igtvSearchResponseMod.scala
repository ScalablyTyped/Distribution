package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igtvSearchResponseMod {
  
  trait IgtvSearchResponseBiographyWithEntities extends StObject {
    
    var entities: js.Array[IgtvSearchResponseEntitiesItem]
    
    var raw_text: String
  }
  object IgtvSearchResponseBiographyWithEntities {
    
    @scala.inline
    def apply(entities: js.Array[IgtvSearchResponseEntitiesItem], raw_text: String): IgtvSearchResponseBiographyWithEntities = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseBiographyWithEntities]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseBiographyWithEntitiesMutableBuilder[Self <: IgtvSearchResponseBiographyWithEntities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntities(value: js.Array[IgtvSearchResponseEntitiesItem]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesVarargs(value: IgtvSearchResponseEntitiesItem*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      @scala.inline
      def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseChannel extends StObject {
    
    var approx_total_videos: Null
    
    var cover_photo_url: Null
    
    var description: Null
    
    var id: String
    
    var items: js.Array[js.Any]
    
    var max_id: Null
    
    var more_available: Boolean
    
    var seen_state: IgtvSearchResponseSeenState
    
    var title: String
    
    var `type`: String
    
    var user_dict: IgtvSearchResponseUserDict
  }
  object IgtvSearchResponseChannel {
    
    @scala.inline
    def apply(
      approx_total_videos: Null,
      cover_photo_url: Null,
      description: Null,
      id: String,
      items: js.Array[js.Any],
      max_id: Null,
      more_available: Boolean,
      seen_state: IgtvSearchResponseSeenState,
      title: String,
      `type`: String,
      user_dict: IgtvSearchResponseUserDict
    ): IgtvSearchResponseChannel = {
      val __obj = js.Dynamic.literal(approx_total_videos = approx_total_videos.asInstanceOf[js.Any], cover_photo_url = cover_photo_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseChannel]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseChannelMutableBuilder[Self <: IgtvSearchResponseChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApprox_total_videos(value: Null): Self = StObject.set(x, "approx_total_videos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCover_photo_url(value: Null): Self = StObject.set(x, "cover_photo_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeen_state(value: IgtvSearchResponseSeenState): Self = StObject.set(x, "seen_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_dict(value: IgtvSearchResponseUserDict): Self = StObject.set(x, "user_dict", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseEntitiesItem extends StObject {
    
    var hashtag: js.UndefOr[IgtvSearchResponseHashtag] = js.undefined
    
    var user: js.UndefOr[IgtvSearchResponseUser] = js.undefined
  }
  object IgtvSearchResponseEntitiesItem {
    
    @scala.inline
    def apply(): IgtvSearchResponseEntitiesItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgtvSearchResponseEntitiesItem]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseEntitiesItemMutableBuilder[Self <: IgtvSearchResponseEntitiesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashtag(value: IgtvSearchResponseHashtag): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setUser(value: IgtvSearchResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait IgtvSearchResponseFriendshipStatus extends StObject {
    
    var blocking: js.UndefOr[Boolean] = js.undefined
    
    var followed_by: js.UndefOr[Boolean] = js.undefined
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_private: Boolean
    
    var is_restricted: Boolean
    
    var muting: js.UndefOr[Boolean] = js.undefined
    
    var outgoing_request: Boolean
  }
  object IgtvSearchResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): IgtvSearchResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseFriendshipStatusMutableBuilder[Self <: IgtvSearchResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
      
      @scala.inline
      def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowed_byUndefined: Self = StObject.set(x, "followed_by", js.undefined)
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutingUndefined: Self = StObject.set(x, "muting", js.undefined)
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseHashtag extends StObject {
    
    var id: String
    
    var name: String
  }
  object IgtvSearchResponseHashtag {
    
    @scala.inline
    def apply(id: String, name: String): IgtvSearchResponseHashtag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseHashtag]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseHashtagMutableBuilder[Self <: IgtvSearchResponseHashtag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseResultsItem extends StObject {
    
    var channel: IgtvSearchResponseChannel
    
    var `type`: String
    
    var user: IgtvSearchResponseUser
  }
  object IgtvSearchResponseResultsItem {
    
    @scala.inline
    def apply(channel: IgtvSearchResponseChannel, `type`: String, user: IgtvSearchResponseUser): IgtvSearchResponseResultsItem = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseResultsItem]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseResultsItemMutableBuilder[Self <: IgtvSearchResponseResultsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: IgtvSearchResponseChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: IgtvSearchResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseRootObject extends StObject {
    
    var has_more: Boolean
    
    var num_results: Double
    
    var rank_token: String
    
    var results: js.Array[IgtvSearchResponseResultsItem]
    
    var status: String
  }
  object IgtvSearchResponseRootObject {
    
    @scala.inline
    def apply(
      has_more: Boolean,
      num_results: Double,
      rank_token: String,
      results: js.Array[IgtvSearchResponseResultsItem],
      status: String
    ): IgtvSearchResponseRootObject = {
      val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseRootObject]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseRootObjectMutableBuilder[Self <: IgtvSearchResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[IgtvSearchResponseResultsItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: IgtvSearchResponseResultsItem*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseSeenState extends StObject
  
  trait IgtvSearchResponseUser extends StObject {
    
    var biography: js.UndefOr[String] = js.undefined
    
    var biography_with_entities: js.UndefOr[IgtvSearchResponseBiographyWithEntities] = js.undefined
    
    var external_lynx_url: js.UndefOr[String] = js.undefined
    
    var external_url: js.UndefOr[String] = js.undefined
    
    var friendship_status: js.UndefOr[IgtvSearchResponseFriendshipStatus] = js.undefined
    
    var full_name: js.UndefOr[String] = js.undefined
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
    
    var has_biography_translation: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var is_private: js.UndefOr[Boolean] = js.undefined
    
    var is_verified: js.UndefOr[Boolean] = js.undefined
    
    var latest_reel_media: js.UndefOr[Double] = js.undefined
    
    var mutual_followers_count: js.UndefOr[Double] = js.undefined
    
    var pk: js.UndefOr[Double] = js.undefined
    
    var profile_pic_id: js.UndefOr[String] = js.undefined
    
    var profile_pic_url: js.UndefOr[String] = js.undefined
    
    var username: String
  }
  object IgtvSearchResponseUser {
    
    @scala.inline
    def apply(username: String): IgtvSearchResponseUser = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseUser]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseUserMutableBuilder[Self <: IgtvSearchResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiographyUndefined: Self = StObject.set(x, "biography", js.undefined)
      
      @scala.inline
      def setBiography_with_entities(value: IgtvSearchResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiography_with_entitiesUndefined: Self = StObject.set(x, "biography_with_entities", js.undefined)
      
      @scala.inline
      def setExternal_lynx_url(value: String): Self = StObject.set(x, "external_lynx_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_lynx_urlUndefined: Self = StObject.set(x, "external_lynx_url", js.undefined)
      
      @scala.inline
      def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_urlUndefined: Self = StObject.set(x, "external_url", js.undefined)
      
      @scala.inline
      def setFriendship_status(value: IgtvSearchResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
      
      @scala.inline
      def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_biography_translationUndefined: Self = StObject.set(x, "has_biography_translation", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_privateUndefined: Self = StObject.set(x, "is_private", js.undefined)
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verifiedUndefined: Self = StObject.set(x, "is_verified", js.undefined)
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
      
      @scala.inline
      def setMutual_followers_count(value: Double): Self = StObject.set(x, "mutual_followers_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutual_followers_countUndefined: Self = StObject.set(x, "mutual_followers_count", js.undefined)
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkUndefined: Self = StObject.set(x, "pk", js.undefined)
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_urlUndefined: Self = StObject.set(x, "profile_pic_url", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgtvSearchResponseUserDict extends StObject {
    
    var biography: String
    
    var biography_with_entities: IgtvSearchResponseBiographyWithEntities
    
    var external_lynx_url: js.UndefOr[String] = js.undefined
    
    var external_url: String
    
    var follower_count: Double
    
    var following_count: Double
    
    var following_tag_count: Double
    
    var friendship_status: IgtvSearchResponseFriendshipStatus
    
    var full_name: String
    
    var geo_media_count: js.UndefOr[Double] = js.undefined
    
    var has_anonymous_profile_picture: Boolean
    
    var has_biography_translation: js.UndefOr[Boolean] = js.undefined
    
    var has_igtv_series: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var media_count: Double
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var total_igtv_videos: Double
    
    var username: String
  }
  object IgtvSearchResponseUserDict {
    
    @scala.inline
    def apply(
      biography: String,
      biography_with_entities: IgtvSearchResponseBiographyWithEntities,
      external_url: String,
      follower_count: Double,
      following_count: Double,
      following_tag_count: Double,
      friendship_status: IgtvSearchResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      has_igtv_series: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      media_count: Double,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      total_igtv_videos: Double,
      username: String
    ): IgtvSearchResponseUserDict = {
      val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_igtv_series = has_igtv_series.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgtvSearchResponseUserDict]
    }
    
    @scala.inline
    implicit class IgtvSearchResponseUserDictMutableBuilder[Self <: IgtvSearchResponseUserDict] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiography_with_entities(value: IgtvSearchResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_lynx_url(value: String): Self = StObject.set(x, "external_lynx_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_lynx_urlUndefined: Self = StObject.set(x, "external_lynx_url", js.undefined)
      
      @scala.inline
      def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing_count(value: Double): Self = StObject.set(x, "following_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing_tag_count(value: Double): Self = StObject.set(x, "following_tag_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendship_status(value: IgtvSearchResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo_media_count(value: Double): Self = StObject.set(x, "geo_media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeo_media_countUndefined: Self = StObject.set(x, "geo_media_count", js.undefined)
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_biography_translationUndefined: Self = StObject.set(x, "has_biography_translation", js.undefined)
      
      @scala.inline
      def setHas_igtv_series(value: Boolean): Self = StObject.set(x, "has_igtv_series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_igtv_videos(value: Double): Self = StObject.set(x, "total_igtv_videos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
