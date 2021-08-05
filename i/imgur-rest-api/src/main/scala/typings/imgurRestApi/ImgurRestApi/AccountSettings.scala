package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  //number|boolean;
  var accepted_gallery_terms: Boolean
  
  var active_emails: js.Array[String]
  
  var album_privacy: String
  
  var blocked_users: js.Array[BlockedUser]
  
  var email: String
  
  var high_quality: Boolean
  
  var messaging_enabled: Boolean
  
  var pro_expiration: js.Any
  
  var public_images: Boolean
}
object AccountSettings {
  
  inline def apply(
    accepted_gallery_terms: Boolean,
    active_emails: js.Array[String],
    album_privacy: String,
    blocked_users: js.Array[BlockedUser],
    email: String,
    high_quality: Boolean,
    messaging_enabled: Boolean,
    pro_expiration: js.Any,
    public_images: Boolean
  ): AccountSettings = {
    val __obj = js.Dynamic.literal(accepted_gallery_terms = accepted_gallery_terms.asInstanceOf[js.Any], active_emails = active_emails.asInstanceOf[js.Any], album_privacy = album_privacy.asInstanceOf[js.Any], blocked_users = blocked_users.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], high_quality = high_quality.asInstanceOf[js.Any], messaging_enabled = messaging_enabled.asInstanceOf[js.Any], pro_expiration = pro_expiration.asInstanceOf[js.Any], public_images = public_images.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountSettings]
  }
  
  extension [Self <: AccountSettings](x: Self) {
    
    inline def setAccepted_gallery_terms(value: Boolean): Self = StObject.set(x, "accepted_gallery_terms", value.asInstanceOf[js.Any])
    
    inline def setActive_emails(value: js.Array[String]): Self = StObject.set(x, "active_emails", value.asInstanceOf[js.Any])
    
    inline def setActive_emailsVarargs(value: String*): Self = StObject.set(x, "active_emails", js.Array(value :_*))
    
    inline def setAlbum_privacy(value: String): Self = StObject.set(x, "album_privacy", value.asInstanceOf[js.Any])
    
    inline def setBlocked_users(value: js.Array[BlockedUser]): Self = StObject.set(x, "blocked_users", value.asInstanceOf[js.Any])
    
    inline def setBlocked_usersVarargs(value: BlockedUser*): Self = StObject.set(x, "blocked_users", js.Array(value :_*))
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setHigh_quality(value: Boolean): Self = StObject.set(x, "high_quality", value.asInstanceOf[js.Any])
    
    inline def setMessaging_enabled(value: Boolean): Self = StObject.set(x, "messaging_enabled", value.asInstanceOf[js.Any])
    
    inline def setPro_expiration(value: js.Any): Self = StObject.set(x, "pro_expiration", value.asInstanceOf[js.Any])
    
    inline def setPublic_images(value: Boolean): Self = StObject.set(x, "public_images", value.asInstanceOf[js.Any])
  }
}
