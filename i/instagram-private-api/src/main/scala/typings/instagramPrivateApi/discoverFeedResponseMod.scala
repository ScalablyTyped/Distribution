package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.entitiesMod.ProfileEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoverFeedResponseMod {
  
  @JSImport("instagram-private-api/dist/responses/discover.feed.response", "DiscoverFeedResponseUser")
  @js.native
  class DiscoverFeedResponseUser protected () extends ProfileEntity {
    def this(client: IgApiClient) = this()
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    @JSName("pk")
    var pk_DiscoverFeedResponseUser: String = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  
  trait DiscoverFeedResponseNewSuggestedUsers extends StObject {
    
    var suggestions: js.Array[js.Any]
  }
  object DiscoverFeedResponseNewSuggestedUsers {
    
    inline def apply(suggestions: js.Array[js.Any]): DiscoverFeedResponseNewSuggestedUsers = {
      val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverFeedResponseNewSuggestedUsers]
    }
    
    extension [Self <: DiscoverFeedResponseNewSuggestedUsers](x: Self) {
      
      inline def setSuggestions(value: js.Array[js.Any]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVarargs(value: js.Any*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    }
  }
  
  trait DiscoverFeedResponseRootObject extends StObject {
    
    var max_id: String
    
    var more_available: Boolean
    
    var new_suggested_users: DiscoverFeedResponseNewSuggestedUsers
    
    var next_max_id: String
    
    var status: String
    
    var suggested_users: DiscoverFeedResponseSuggestedUsers
  }
  object DiscoverFeedResponseRootObject {
    
    inline def apply(
      max_id: String,
      more_available: Boolean,
      new_suggested_users: DiscoverFeedResponseNewSuggestedUsers,
      next_max_id: String,
      status: String,
      suggested_users: DiscoverFeedResponseSuggestedUsers
    ): DiscoverFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_suggested_users = new_suggested_users.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggested_users = suggested_users.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverFeedResponseRootObject]
    }
    
    extension [Self <: DiscoverFeedResponseRootObject](x: Self) {
      
      inline def setMax_id(value: String): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
      
      inline def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
      
      inline def setNew_suggested_users(value: DiscoverFeedResponseNewSuggestedUsers): Self = StObject.set(x, "new_suggested_users", value.asInstanceOf[js.Any])
      
      inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSuggested_users(value: DiscoverFeedResponseSuggestedUsers): Self = StObject.set(x, "suggested_users", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiscoverFeedResponseSuggestedUsers extends StObject {
    
    var suggestions: js.Array[DiscoverFeedResponseSuggestionsItem]
  }
  object DiscoverFeedResponseSuggestedUsers {
    
    inline def apply(suggestions: js.Array[DiscoverFeedResponseSuggestionsItem]): DiscoverFeedResponseSuggestedUsers = {
      val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverFeedResponseSuggestedUsers]
    }
    
    extension [Self <: DiscoverFeedResponseSuggestedUsers](x: Self) {
      
      inline def setSuggestions(value: js.Array[DiscoverFeedResponseSuggestionsItem]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVarargs(value: DiscoverFeedResponseSuggestionsItem*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    }
  }
  
  trait DiscoverFeedResponseSuggestionsItem extends StObject {
    
    var algorithm: String
    
    var caption: String
    
    var followed_by: Boolean
    
    var icon: String
    
    var is_new_suggestion: Boolean
    
    var large_urls: js.Array[js.Any]
    
    var media_ids: js.Array[js.Any]
    
    var media_infos: js.Array[js.Any]
    
    var social_context: String
    
    var thumbnail_urls: js.Array[js.Any]
    
    var user: DiscoverFeedResponseUser
    
    var uuid: String
    
    var value: Double
  }
  object DiscoverFeedResponseSuggestionsItem {
    
    inline def apply(
      algorithm: String,
      caption: String,
      followed_by: Boolean,
      icon: String,
      is_new_suggestion: Boolean,
      large_urls: js.Array[js.Any],
      media_ids: js.Array[js.Any],
      media_infos: js.Array[js.Any],
      social_context: String,
      thumbnail_urls: js.Array[js.Any],
      user: DiscoverFeedResponseUser,
      uuid: String,
      value: Double
    ): DiscoverFeedResponseSuggestionsItem = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], is_new_suggestion = is_new_suggestion.asInstanceOf[js.Any], large_urls = large_urls.asInstanceOf[js.Any], media_ids = media_ids.asInstanceOf[js.Any], media_infos = media_infos.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], thumbnail_urls = thumbnail_urls.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverFeedResponseSuggestionsItem]
    }
    
    extension [Self <: DiscoverFeedResponseSuggestionsItem](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIs_new_suggestion(value: Boolean): Self = StObject.set(x, "is_new_suggestion", value.asInstanceOf[js.Any])
      
      inline def setLarge_urls(value: js.Array[js.Any]): Self = StObject.set(x, "large_urls", value.asInstanceOf[js.Any])
      
      inline def setLarge_urlsVarargs(value: js.Any*): Self = StObject.set(x, "large_urls", js.Array(value :_*))
      
      inline def setMedia_ids(value: js.Array[js.Any]): Self = StObject.set(x, "media_ids", value.asInstanceOf[js.Any])
      
      inline def setMedia_idsVarargs(value: js.Any*): Self = StObject.set(x, "media_ids", js.Array(value :_*))
      
      inline def setMedia_infos(value: js.Array[js.Any]): Self = StObject.set(x, "media_infos", value.asInstanceOf[js.Any])
      
      inline def setMedia_infosVarargs(value: js.Any*): Self = StObject.set(x, "media_infos", js.Array(value :_*))
      
      inline def setSocial_context(value: String): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      inline def setThumbnail_urls(value: js.Array[js.Any]): Self = StObject.set(x, "thumbnail_urls", value.asInstanceOf[js.Any])
      
      inline def setThumbnail_urlsVarargs(value: js.Any*): Self = StObject.set(x, "thumbnail_urls", js.Array(value :_*))
      
      inline def setUser(value: DiscoverFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
