package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagRepositorySearchResponseMod {
  
  trait TagRepositorySearchResponseResultsItem extends StObject {
    
    var allow_following: Null
    
    var allow_muting_story: Null
    
    var debug_info: Null
    
    var follow_button_text: Null
    
    var follow_status: Null
    
    var following: Null
    
    var id: String
    
    var media_count: Double
    
    var name: String
    
    var non_violating: Null
    
    var profile_pic_url: String
    
    var related_tags: Null
    
    var search_result_subtitle: String
    
    var show_follow_drop_down: Null
    
    var social_context: Null
    
    var social_context_profile_links: Null
    
    var subtitle: Null
  }
  object TagRepositorySearchResponseResultsItem {
    
    inline def apply(
      allow_following: Null,
      allow_muting_story: Null,
      debug_info: Null,
      follow_button_text: Null,
      follow_status: Null,
      following: Null,
      id: String,
      media_count: Double,
      name: String,
      non_violating: Null,
      profile_pic_url: String,
      related_tags: Null,
      search_result_subtitle: String,
      show_follow_drop_down: Null,
      social_context: Null,
      social_context_profile_links: Null,
      subtitle: Null
    ): TagRepositorySearchResponseResultsItem = {
      val __obj = js.Dynamic.literal(allow_following = allow_following.asInstanceOf[js.Any], allow_muting_story = allow_muting_story.asInstanceOf[js.Any], debug_info = debug_info.asInstanceOf[js.Any], follow_button_text = follow_button_text.asInstanceOf[js.Any], follow_status = follow_status.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], non_violating = non_violating.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], related_tags = related_tags.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any], show_follow_drop_down = show_follow_drop_down.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], social_context_profile_links = social_context_profile_links.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagRepositorySearchResponseResultsItem]
    }
    
    extension [Self <: TagRepositorySearchResponseResultsItem](x: Self) {
      
      inline def setAllow_following(value: Null): Self = StObject.set(x, "allow_following", value.asInstanceOf[js.Any])
      
      inline def setAllow_muting_story(value: Null): Self = StObject.set(x, "allow_muting_story", value.asInstanceOf[js.Any])
      
      inline def setDebug_info(value: Null): Self = StObject.set(x, "debug_info", value.asInstanceOf[js.Any])
      
      inline def setFollow_button_text(value: Null): Self = StObject.set(x, "follow_button_text", value.asInstanceOf[js.Any])
      
      inline def setFollow_status(value: Null): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Null): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNon_violating(value: Null): Self = StObject.set(x, "non_violating", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setRelated_tags(value: Null): Self = StObject.set(x, "related_tags", value.asInstanceOf[js.Any])
      
      inline def setSearch_result_subtitle(value: String): Self = StObject.set(x, "search_result_subtitle", value.asInstanceOf[js.Any])
      
      inline def setShow_follow_drop_down(value: Null): Self = StObject.set(x, "show_follow_drop_down", value.asInstanceOf[js.Any])
      
      inline def setSocial_context(value: Null): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      inline def setSocial_context_profile_links(value: Null): Self = StObject.set(x, "social_context_profile_links", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: Null): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagRepositorySearchResponseRootObject extends StObject {
    
    var has_more: Boolean
    
    var rank_token: String
    
    var results: js.Array[TagRepositorySearchResponseResultsItem]
    
    var status: String
  }
  object TagRepositorySearchResponseRootObject {
    
    inline def apply(
      has_more: Boolean,
      rank_token: String,
      results: js.Array[TagRepositorySearchResponseResultsItem],
      status: String
    ): TagRepositorySearchResponseRootObject = {
      val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagRepositorySearchResponseRootObject]
    }
    
    extension [Self <: TagRepositorySearchResponseRootObject](x: Self) {
      
      inline def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      inline def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[TagRepositorySearchResponseResultsItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: TagRepositorySearchResponseResultsItem*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
