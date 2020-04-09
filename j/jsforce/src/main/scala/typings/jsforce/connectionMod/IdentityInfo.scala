package typings.jsforce.connectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsforce.AnonBody
import typings.jsforce.AnonCustomdomain
import typings.jsforce.AnonPicture
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityInfo
  extends // And possible other attributes.
/* key */ StringDictionary[js.Any] {
  var active: Boolean
  var addr_city: String | Null
  var addr_country: String | Null
  var addr_state: String | Null
  var addr_street: String | Null
  var addr_zip: String | Null
  var asserted_user: Boolean
  var display_name: String
  var email: String
  var email_verified: Boolean
  var first_name: String | Null
  var id: String
  var is_app_installed: Boolean
  var is_lightning_login_user: Boolean
  var language: String
  var last_modified_date: Date
  var last_name: String
  var locale: String
  var mobile_phone: String | Null
  var mobile_phone_verified: Boolean
  var nick_name: String
  var organization_id: String
  var photos: AnonPicture
  var status: AnonBody
  var timezone: String
  var urls: AnonCustomdomain
  var user_id: String
  var user_type: String
  var username: String
  var utcOffset: Double
}

object IdentityInfo {
  @scala.inline
  def apply(
    active: Boolean,
    asserted_user: Boolean,
    display_name: String,
    email: String,
    email_verified: Boolean,
    id: String,
    is_app_installed: Boolean,
    is_lightning_login_user: Boolean,
    language: String,
    last_modified_date: Date,
    last_name: String,
    locale: String,
    mobile_phone_verified: Boolean,
    nick_name: String,
    organization_id: String,
    photos: AnonPicture,
    status: AnonBody,
    timezone: String,
    urls: AnonCustomdomain,
    user_id: String,
    user_type: String,
    username: String,
    utcOffset: Double,
    StringDictionary: // And possible other attributes.
  /* key */ StringDictionary[js.Any] = null,
    addr_city: String = null,
    addr_country: String = null,
    addr_state: String = null,
    addr_street: String = null,
    addr_zip: String = null,
    first_name: String = null,
    mobile_phone: String = null
  ): IdentityInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], asserted_user = asserted_user.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_app_installed = is_app_installed.asInstanceOf[js.Any], is_lightning_login_user = is_lightning_login_user.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_modified_date = last_modified_date.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mobile_phone_verified = mobile_phone_verified.asInstanceOf[js.Any], nick_name = nick_name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_type = user_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addr_city != null) __obj.updateDynamic("addr_city")(addr_city.asInstanceOf[js.Any])
    if (addr_country != null) __obj.updateDynamic("addr_country")(addr_country.asInstanceOf[js.Any])
    if (addr_state != null) __obj.updateDynamic("addr_state")(addr_state.asInstanceOf[js.Any])
    if (addr_street != null) __obj.updateDynamic("addr_street")(addr_street.asInstanceOf[js.Any])
    if (addr_zip != null) __obj.updateDynamic("addr_zip")(addr_zip.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (mobile_phone != null) __obj.updateDynamic("mobile_phone")(mobile_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityInfo]
  }
}

