package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseUser extends StObject {
  
  var account_badges: js.UndefOr[js.Array[_]] = js.native
  
  var can_be_reported_as_fraud: js.UndefOr[Boolean] = js.native
  
  var friendship_status: js.UndefOr[TopicalExploreFeedResponseFriendshipStatus] = js.native
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  
  var is_favorite: js.UndefOr[Boolean] = js.native
  
  var is_private: Boolean = js.native
  
  var is_unpublished: js.UndefOr[Boolean] = js.native
  
  var is_verified: Boolean = js.native
  
  var latest_reel_media: js.UndefOr[Double] = js.native
  
  var merchant_checkout_style: js.UndefOr[String] = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: js.UndefOr[String] = js.native
  
  var profile_pic_url: String = js.native
  
  var seller_shoppable_feed_type: js.UndefOr[String] = js.native
  
  var shoppable_posts_count: js.UndefOr[Double] = js.native
  
  var show_shoppable_feed: js.UndefOr[Boolean] = js.native
  
  var username: String = js.native
}
object TopicalExploreFeedResponseUser {
  
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String
  ): TopicalExploreFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseUser]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseUserMutableBuilder[Self <: TopicalExploreFeedResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_badges(value: js.Array[_]): Self = StObject.set(x, "account_badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_badgesUndefined: Self = StObject.set(x, "account_badges", js.undefined)
    
    @scala.inline
    def setAccount_badgesVarargs(value: js.Any*): Self = StObject.set(x, "account_badges", js.Array(value :_*))
    
    @scala.inline
    def setCan_be_reported_as_fraud(value: Boolean): Self = StObject.set(x, "can_be_reported_as_fraud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_be_reported_as_fraudUndefined: Self = StObject.set(x, "can_be_reported_as_fraud", js.undefined)
    
    @scala.inline
    def setFriendship_status(value: TopicalExploreFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
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
    def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
    
    @scala.inline
    def setMerchant_checkout_style(value: String): Self = StObject.set(x, "merchant_checkout_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchant_checkout_styleUndefined: Self = StObject.set(x, "merchant_checkout_style", js.undefined)
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeller_shoppable_feed_type(value: String): Self = StObject.set(x, "seller_shoppable_feed_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeller_shoppable_feed_typeUndefined: Self = StObject.set(x, "seller_shoppable_feed_type", js.undefined)
    
    @scala.inline
    def setShoppable_posts_count(value: Double): Self = StObject.set(x, "shoppable_posts_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShoppable_posts_countUndefined: Self = StObject.set(x, "shoppable_posts_count", js.undefined)
    
    @scala.inline
    def setShow_shoppable_feed(value: Boolean): Self = StObject.set(x, "show_shoppable_feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_shoppable_feedUndefined: Self = StObject.set(x, "show_shoppable_feed", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
