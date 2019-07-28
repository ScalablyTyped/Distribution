package typings.imgurDashRestDashApi.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSettings extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(accepted_gallery_terms = accepted_gallery_terms, active_emails = active_emails, album_privacy = album_privacy, blocked_users = blocked_users, email = email, high_quality = high_quality, messaging_enabled = messaging_enabled, pro_expiration = pro_expiration, public_images = public_images)
  
    __obj.asInstanceOf[AccountSettings]
  }
}

