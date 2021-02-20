package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userStoryFeedResponseMod {
  
  @js.native
  trait UserStoryFeedResponseCandidatesItem extends StObject {
    
    var estimated_scans_sizes: js.UndefOr[js.Array[Double]] = js.native
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object UserStoryFeedResponseCandidatesItem {
    
    @scala.inline
    def apply(height: Double, url: String, width: Double): UserStoryFeedResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseCandidatesItemMutableBuilder[Self <: UserStoryFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimated_scans_sizesUndefined: Self = StObject.set(x, "estimated_scans_sizes", js.undefined)
      
      @scala.inline
      def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean = js.native
    
    var followed_by: Boolean = js.native
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var muting: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object UserStoryFeedResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      blocking: Boolean,
      followed_by: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      muting: Boolean,
      outgoing_request: Boolean
    ): UserStoryFeedResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseFriendshipStatusMutableBuilder[Self <: UserStoryFeedResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
      
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
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[UserStoryFeedResponseCandidatesItem] = js.native
  }
  object UserStoryFeedResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[UserStoryFeedResponseCandidatesItem]): UserStoryFeedResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseImageVersions2]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseImageVersions2MutableBuilder[Self <: UserStoryFeedResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[UserStoryFeedResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: UserStoryFeedResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserStoryFeedResponseItemsItem extends StObject {
    
    var can_reply: Boolean = js.native
    
    var can_reshare: Boolean = js.native
    
    var can_viewer_save: Boolean = js.native
    
    var caption: Null = js.native
    
    var caption_is_edited: Boolean = js.native
    
    var caption_position: Double = js.native
    
    var client_cache_key: String = js.native
    
    var code: String = js.native
    
    var device_timestamp: String | Double = js.native
    
    var expiring_at: Double = js.native
    
    var filter_type: Double = js.native
    
    var has_audio: js.UndefOr[Boolean] = js.native
    
    var has_shared_to_fb: Double = js.native
    
    var id: String = js.native
    
    var image_versions2: UserStoryFeedResponseImageVersions2 = js.native
    
    var imported_taken_at: Double = js.native
    
    var is_dash_eligible: js.UndefOr[Double] = js.native
    
    var is_pride_media: Boolean = js.native
    
    var is_reel_media: Boolean = js.native
    
    var media_type: Double = js.native
    
    var number_of_qualities: js.UndefOr[Double] = js.native
    
    var organic_tracking_token: String = js.native
    
    var original_height: Double = js.native
    
    var original_width: Double = js.native
    
    var photo_of_you: Boolean = js.native
    
    var pk: String = js.native
    
    var show_one_tap_fb_share_tooltip: Boolean = js.native
    
    var story_locations: js.UndefOr[js.Array[UserStoryFeedResponseStoryLocationsItem]] = js.native
    
    var supports_reel_reactions: Boolean = js.native
    
    var taken_at: Double = js.native
    
    var user: UserStoryFeedResponseUser = js.native
    
    var video_codec: js.UndefOr[String] = js.native
    
    var video_dash_manifest: js.UndefOr[String] = js.native
    
    var video_duration: js.UndefOr[Double] = js.native
    
    var video_versions: js.UndefOr[js.Array[UserStoryFeedResponseVideoVersionsItem]] = js.native
  }
  object UserStoryFeedResponseItemsItem {
    
    @scala.inline
    def apply(
      can_reply: Boolean,
      can_reshare: Boolean,
      can_viewer_save: Boolean,
      caption: Null,
      caption_is_edited: Boolean,
      caption_position: Double,
      client_cache_key: String,
      code: String,
      device_timestamp: String | Double,
      expiring_at: Double,
      filter_type: Double,
      has_shared_to_fb: Double,
      id: String,
      image_versions2: UserStoryFeedResponseImageVersions2,
      imported_taken_at: Double,
      is_pride_media: Boolean,
      is_reel_media: Boolean,
      media_type: Double,
      organic_tracking_token: String,
      original_height: Double,
      original_width: Double,
      photo_of_you: Boolean,
      pk: String,
      show_one_tap_fb_share_tooltip: Boolean,
      supports_reel_reactions: Boolean,
      taken_at: Double,
      user: UserStoryFeedResponseUser
    ): UserStoryFeedResponseItemsItem = {
      val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], imported_taken_at = imported_taken_at.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseItemsItem]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseItemsItemMutableBuilder[Self <: UserStoryFeedResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: Null): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_position(value: Double): Self = StObject.set(x, "caption_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
      
      @scala.inline
      def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: UserStoryFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImported_taken_at(value: Double): Self = StObject.set(x, "imported_taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
      
      @scala.inline
      def setIs_pride_media(value: Boolean): Self = StObject.set(x, "is_pride_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber_of_qualitiesUndefined: Self = StObject.set(x, "number_of_qualities", js.undefined)
      
      @scala.inline
      def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_locations(value: js.Array[UserStoryFeedResponseStoryLocationsItem]): Self = StObject.set(x, "story_locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_locationsUndefined: Self = StObject.set(x, "story_locations", js.undefined)
      
      @scala.inline
      def setStory_locationsVarargs(value: UserStoryFeedResponseStoryLocationsItem*): Self = StObject.set(x, "story_locations", js.Array(value :_*))
      
      @scala.inline
      def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserStoryFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_codecUndefined: Self = StObject.set(x, "video_codec", js.undefined)
      
      @scala.inline
      def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_dash_manifestUndefined: Self = StObject.set(x, "video_dash_manifest", js.undefined)
      
      @scala.inline
      def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
      
      @scala.inline
      def setVideo_versions(value: js.Array[UserStoryFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
      
      @scala.inline
      def setVideo_versionsVarargs(value: UserStoryFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UserStoryFeedResponseLocation extends StObject {
    
    var address: String = js.native
    
    var city: String = js.native
    
    var external_source: String = js.native
    
    var facebook_places_id: Double = js.native
    
    var lat: Double = js.native
    
    var lng: String | Double = js.native
    
    var name: String = js.native
    
    var pk: Double = js.native
    
    var short_name: String = js.native
  }
  object UserStoryFeedResponseLocation {
    
    @scala.inline
    def apply(
      address: String,
      city: String,
      external_source: String,
      facebook_places_id: Double,
      lat: Double,
      lng: String | Double,
      name: String,
      pk: Double,
      short_name: String
    ): UserStoryFeedResponseLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], external_source = external_source.asInstanceOf[js.Any], facebook_places_id = facebook_places_id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseLocation]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseLocationMutableBuilder[Self <: UserStoryFeedResponseLocation] (val x: Self) extends AnyVal {
      
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
      def setLng(value: String | Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseReel extends StObject {
    
    var can_reply: Boolean = js.native
    
    var can_reshare: Boolean = js.native
    
    var expiring_at: Double = js.native
    
    var has_besties_media: Boolean = js.native
    
    var has_pride_media: Boolean = js.native
    
    var id: Double = js.native
    
    var items: js.Array[UserStoryFeedResponseItemsItem] = js.native
    
    var latest_reel_media: Double = js.native
    
    var media_count: Double = js.native
    
    var prefetch_count: Double = js.native
    
    var reel_type: String = js.native
    
    var seen: Double = js.native
    
    var user: UserStoryFeedResponseUser = js.native
  }
  object UserStoryFeedResponseReel {
    
    @scala.inline
    def apply(
      can_reply: Boolean,
      can_reshare: Boolean,
      expiring_at: Double,
      has_besties_media: Boolean,
      has_pride_media: Boolean,
      id: Double,
      items: js.Array[UserStoryFeedResponseItemsItem],
      latest_reel_media: Double,
      media_count: Double,
      prefetch_count: Double,
      reel_type: String,
      seen: Double,
      user: UserStoryFeedResponseUser
    ): UserStoryFeedResponseReel = {
      val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_besties_media = has_besties_media.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseReel]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseReelMutableBuilder[Self <: UserStoryFeedResponseReel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_besties_media(value: Boolean): Self = StObject.set(x, "has_besties_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_pride_media(value: Boolean): Self = StObject.set(x, "has_pride_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[UserStoryFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: UserStoryFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefetch_count(value: Double): Self = StObject.set(x, "prefetch_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeen(value: Double): Self = StObject.set(x, "seen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserStoryFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseRootObject extends StObject {
    
    var broadcast: Null = js.native
    
    var reel: UserStoryFeedResponseReel = js.native
    
    var status: String = js.native
  }
  object UserStoryFeedResponseRootObject {
    
    @scala.inline
    def apply(broadcast: Null, reel: UserStoryFeedResponseReel, status: String): UserStoryFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(broadcast = broadcast.asInstanceOf[js.Any], reel = reel.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseRootObjectMutableBuilder[Self <: UserStoryFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcast(value: Null): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel(value: UserStoryFeedResponseReel): Self = StObject.set(x, "reel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseStoryLocationsItem extends StObject {
    
    var height: String = js.native
    
    var is_hidden: Double = js.native
    
    var is_pinned: Double = js.native
    
    var is_sticker: Double = js.native
    
    var location: UserStoryFeedResponseLocation = js.native
    
    var rotation: Double | String = js.native
    
    var width: String = js.native
    
    var x: String = js.native
    
    var y: String = js.native
    
    var z: Double = js.native
  }
  object UserStoryFeedResponseStoryLocationsItem {
    
    @scala.inline
    def apply(
      height: String,
      is_hidden: Double,
      is_pinned: Double,
      is_sticker: Double,
      location: UserStoryFeedResponseLocation,
      rotation: Double | String,
      width: String,
      x: String,
      y: String,
      z: Double
    ): UserStoryFeedResponseStoryLocationsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseStoryLocationsItem]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseStoryLocationsItemMutableBuilder[Self <: UserStoryFeedResponseStoryLocationsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: UserStoryFeedResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double | String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseUser extends StObject {
    
    var friendship_status: js.UndefOr[UserStoryFeedResponseFriendshipStatus] = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
    
    var is_favorite: js.UndefOr[Boolean] = js.native
    
    var is_private: Boolean = js.native
    
    var is_unpublished: js.UndefOr[Boolean] = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object UserStoryFeedResponseUser {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): UserStoryFeedResponseUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseUser]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseUserMutableBuilder[Self <: UserStoryFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: UserStoryFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
      
      @scala.inline
      def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_favoriteUndefined: Self = StObject.set(x, "is_favorite", js.undefined)
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublishedUndefined: Self = StObject.set(x, "is_unpublished", js.undefined)
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserStoryFeedResponseVideoVersionsItem extends StObject {
    
    var height: Double = js.native
    
    var id: String = js.native
    
    var `type`: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object UserStoryFeedResponseVideoVersionsItem {
    
    @scala.inline
    def apply(height: Double, id: String, `type`: Double, url: String, width: Double): UserStoryFeedResponseVideoVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserStoryFeedResponseVideoVersionsItem]
    }
    
    @scala.inline
    implicit class UserStoryFeedResponseVideoVersionsItemMutableBuilder[Self <: UserStoryFeedResponseVideoVersionsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
