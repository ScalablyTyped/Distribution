package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSettings extends js.Object {
   //number|boolean;
  var accepted_gallery_terms: scala.Boolean
  var active_emails: js.Array[java.lang.String]
  var album_privacy: java.lang.String
  var blocked_users: js.Array[BlockedUser]
  var email: java.lang.String
  var high_quality: scala.Boolean
  var messaging_enabled: scala.Boolean
  var pro_expiration: js.Any
  var public_images: scala.Boolean
}

object AccountSettings {
  @scala.inline
  def apply(
    accepted_gallery_terms: scala.Boolean,
    active_emails: js.Array[java.lang.String],
    album_privacy: java.lang.String,
    blocked_users: js.Array[BlockedUser],
    email: java.lang.String,
    high_quality: scala.Boolean,
    messaging_enabled: scala.Boolean,
    pro_expiration: js.Any,
    public_images: scala.Boolean
  ): AccountSettings = {
    val __obj = js.Dynamic.literal(accepted_gallery_terms = accepted_gallery_terms, active_emails = active_emails, album_privacy = album_privacy, blocked_users = blocked_users, email = email, high_quality = high_quality, messaging_enabled = messaging_enabled, pro_expiration = pro_expiration, public_images = public_images)
  
    __obj.asInstanceOf[AccountSettings]
  }
}

