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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accepted_gallery_terms")(accepted_gallery_terms)
    __obj.updateDynamic("active_emails")(active_emails)
    __obj.updateDynamic("album_privacy")(album_privacy)
    __obj.updateDynamic("blocked_users")(blocked_users)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("high_quality")(high_quality)
    __obj.updateDynamic("messaging_enabled")(messaging_enabled)
    __obj.updateDynamic("pro_expiration")(pro_expiration)
    __obj.updateDynamic("public_images")(public_images)
    __obj.asInstanceOf[AccountSettings]
  }
}

