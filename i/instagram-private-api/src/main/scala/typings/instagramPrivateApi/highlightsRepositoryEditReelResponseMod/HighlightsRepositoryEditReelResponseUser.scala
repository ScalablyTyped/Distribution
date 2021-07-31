package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryEditReelResponseUser extends StObject {
  
  var allowed_commenter_type: js.UndefOr[String] = js.undefined
  
  var can_boost_post: js.UndefOr[Boolean] = js.undefined
  
  var can_see_organic_insights: js.UndefOr[Boolean] = js.undefined
  
  var full_name: String
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  
  var is_private: Boolean
  
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  
  var is_verified: Boolean
  
  var pk: Double
  
  var profile_pic_id: String
  
  var profile_pic_url: String
  
  var reel_auto_archive: js.UndefOr[String] = js.undefined
  
  var show_insights_terms: js.UndefOr[Boolean] = js.undefined
  
  var username: String
}
object HighlightsRepositoryEditReelResponseUser {
  
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): HighlightsRepositoryEditReelResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseUser]
  }
  
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseUserMutableBuilder[Self <: HighlightsRepositoryEditReelResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_commenter_typeUndefined: Self = StObject.set(x, "allowed_commenter_type", js.undefined)
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_boost_postUndefined: Self = StObject.set(x, "can_boost_post", js.undefined)
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_organic_insightsUndefined: Self = StObject.set(x, "can_see_organic_insights", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
    
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
    def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_auto_archiveUndefined: Self = StObject.set(x, "reel_auto_archive", js.undefined)
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_insights_termsUndefined: Self = StObject.set(x, "show_insights_terms", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
