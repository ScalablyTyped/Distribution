package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fbsearchRepositoryTopsearchFlatResponseMod {
  
  trait FbsearchRepositoryTopsearchFlatResponseFriendshipStatus extends StObject {
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_private: Boolean
    
    var outgoing_request: Boolean
  }
  object FbsearchRepositoryTopsearchFlatResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      outgoing_request: Boolean
    ): FbsearchRepositoryTopsearchFlatResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponseFriendshipStatusMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryTopsearchFlatResponseHashtag extends StObject {
    
    var id: String
    
    var media_count: Double
    
    var name: String
    
    var profile_pic_url: String
    
    var search_result_subtitle: String
  }
  object FbsearchRepositoryTopsearchFlatResponseHashtag {
    
    @scala.inline
    def apply(
      id: String,
      media_count: Double,
      name: String,
      profile_pic_url: String,
      search_result_subtitle: String
    ): FbsearchRepositoryTopsearchFlatResponseHashtag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseHashtag]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponseHashtagMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponseHashtag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_result_subtitle(value: String): Self = StObject.set(x, "search_result_subtitle", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryTopsearchFlatResponseHeaderMedia extends StObject
  
  trait FbsearchRepositoryTopsearchFlatResponseListItem extends StObject {
    
    var hashtag: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseHashtag] = js.undefined
    
    var place: js.UndefOr[FbsearchRepositoryTopsearchFlatResponsePlace] = js.undefined
    
    var position: Double
    
    var user: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseUser] = js.undefined
  }
  object FbsearchRepositoryTopsearchFlatResponseListItem {
    
    @scala.inline
    def apply(position: Double): FbsearchRepositoryTopsearchFlatResponseListItem = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseListItem]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponseListItemMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponseListItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashtag(value: FbsearchRepositoryTopsearchFlatResponseHashtag): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setPlace(value: FbsearchRepositoryTopsearchFlatResponsePlace): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: FbsearchRepositoryTopsearchFlatResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait FbsearchRepositoryTopsearchFlatResponseLocation extends StObject {
    
    var address: String
    
    var city: String
    
    var external_source: String
    
    var facebook_places_id: Double
    
    var lat: Double
    
    var lng: Double
    
    var name: String
    
    var pk: Double
    
    var short_name: String
  }
  object FbsearchRepositoryTopsearchFlatResponseLocation {
    
    @scala.inline
    def apply(
      address: String,
      city: String,
      external_source: String,
      facebook_places_id: Double,
      lat: Double,
      lng: Double,
      name: String,
      pk: Double,
      short_name: String
    ): FbsearchRepositoryTopsearchFlatResponseLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseLocation]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponseLocationMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponseLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_source(value: String): Self = StObject.set(x, "external_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacebook_places_id(value: Double): Self = StObject.set(x, "facebook_places_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryTopsearchFlatResponsePlace extends StObject {
    
    var header_media: FbsearchRepositoryTopsearchFlatResponseHeaderMedia
    
    var location: FbsearchRepositoryTopsearchFlatResponseLocation
    
    var media_bundles: js.Array[js.Any]
    
    var subtitle: String
    
    var title: String
  }
  object FbsearchRepositoryTopsearchFlatResponsePlace {
    
    @scala.inline
    def apply(
      header_media: FbsearchRepositoryTopsearchFlatResponseHeaderMedia,
      location: FbsearchRepositoryTopsearchFlatResponseLocation,
      media_bundles: js.Array[js.Any],
      subtitle: String,
      title: String
    ): FbsearchRepositoryTopsearchFlatResponsePlace = {
      val __obj = js.Dynamic.literal(header_media = header_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], media_bundles = media_bundles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponsePlace]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponsePlaceMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponsePlace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader_media(value: FbsearchRepositoryTopsearchFlatResponseHeaderMedia): Self = StObject.set(x, "header_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: FbsearchRepositoryTopsearchFlatResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_bundles(value: js.Array[js.Any]): Self = StObject.set(x, "media_bundles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_bundlesVarargs(value: js.Any*): Self = StObject.set(x, "media_bundles", js.Array(value :_*))
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryTopsearchFlatResponseRootObject extends StObject {
    
    var clear_client_cache: Boolean
    
    var has_more: Boolean
    
    var list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]
    
    var rank_token: String
    
    var status: String
  }
  object FbsearchRepositoryTopsearchFlatResponseRootObject {
    
    @scala.inline
    def apply(
      clear_client_cache: Boolean,
      has_more: Boolean,
      list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem],
      rank_token: String,
      status: String
    ): FbsearchRepositoryTopsearchFlatResponseRootObject = {
      val __obj = js.Dynamic.literal(clear_client_cache = clear_client_cache.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseRootObject]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponseRootObjectMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear_client_cache(value: Boolean): Self = StObject.set(x, "clear_client_cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListVarargs(value: FbsearchRepositoryTopsearchFlatResponseListItem*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait FbsearchRepositoryTopsearchFlatResponseUser extends StObject {
    
    var byline: String
    
    var follower_count: Double
    
    var friendship_status: FbsearchRepositoryTopsearchFlatResponseFriendshipStatus
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var latest_reel_media: js.UndefOr[Double] = js.undefined
    
    var mutual_followers_count: Double
    
    var pk: Double
    
    var profile_pic_id: js.UndefOr[String] = js.undefined
    
    var profile_pic_url: String
    
    var search_social_context: js.UndefOr[String] = js.undefined
    
    var social_context: js.UndefOr[String] = js.undefined
    
    var username: String
  }
  object FbsearchRepositoryTopsearchFlatResponseUser {
    
    @scala.inline
    def apply(
      byline: String,
      follower_count: Double,
      friendship_status: FbsearchRepositoryTopsearchFlatResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      mutual_followers_count: Double,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): FbsearchRepositoryTopsearchFlatResponseUser = {
      val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], mutual_followers_count = mutual_followers_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseUser]
    }
    
    @scala.inline
    implicit class FbsearchRepositoryTopsearchFlatResponseUserMutableBuilder[Self <: FbsearchRepositoryTopsearchFlatResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByline(value: String): Self = StObject.set(x, "byline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendship_status(value: FbsearchRepositoryTopsearchFlatResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
      
      @scala.inline
      def setMutual_followers_count(value: Double): Self = StObject.set(x, "mutual_followers_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_social_context(value: String): Self = StObject.set(x, "search_social_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_social_contextUndefined: Self = StObject.set(x, "search_social_context", js.undefined)
      
      @scala.inline
      def setSocial_context(value: String): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_contextUndefined: Self = StObject.set(x, "social_context", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
