package typings.jsforce.connectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsforce.anon.Body
import typings.jsforce.anon.Customdomain
import typings.jsforce.anon.Picture
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityInfo
  extends // And possible other attributes.
/* key */ StringDictionary[js.Any] {
  
  var active: Boolean = js.native
  
  var addr_city: String | Null = js.native
  
  var addr_country: String | Null = js.native
  
  var addr_state: String | Null = js.native
  
  var addr_street: String | Null = js.native
  
  var addr_zip: String | Null = js.native
  
  var asserted_user: Boolean = js.native
  
  var display_name: String = js.native
  
  var email: String = js.native
  
  var email_verified: Boolean = js.native
  
  var first_name: String | Null = js.native
  
  var id: String = js.native
  
  var is_app_installed: Boolean = js.native
  
  var is_lightning_login_user: Boolean = js.native
  
  var language: String = js.native
  
  var last_modified_date: Date = js.native
  
  var last_name: String = js.native
  
  var locale: String = js.native
  
  var mobile_phone: String | Null = js.native
  
  var mobile_phone_verified: Boolean = js.native
  
  var nick_name: String = js.native
  
  var organization_id: String = js.native
  
  var photos: Picture = js.native
  
  var status: Body = js.native
  
  var timezone: String = js.native
  
  var urls: Customdomain = js.native
  
  var user_id: String = js.native
  
  var user_type: String = js.native
  
  var username: String = js.native
  
  var utcOffset: Double = js.native
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
    photos: Picture,
    status: Body,
    timezone: String,
    urls: Customdomain,
    user_id: String,
    user_type: String,
    username: String,
    utcOffset: Double
  ): IdentityInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], asserted_user = asserted_user.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_app_installed = is_app_installed.asInstanceOf[js.Any], is_lightning_login_user = is_lightning_login_user.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_modified_date = last_modified_date.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mobile_phone_verified = mobile_phone_verified.asInstanceOf[js.Any], nick_name = nick_name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_type = user_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityInfo]
  }
  
  @scala.inline
  implicit class IdentityInfoOps[Self <: IdentityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsserted_user(value: Boolean): Self = this.set("asserted_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_verified(value: Boolean): Self = this.set("email_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_app_installed(value: Boolean): Self = this.set("is_app_installed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_lightning_login_user(value: Boolean): Self = this.set("is_lightning_login_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modified_date(value: Date): Self = this.set("last_modified_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_phone_verified(value: Boolean): Self = this.set("mobile_phone_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNick_name(value: String): Self = this.set("nick_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_id(value: String): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotos(value: Picture): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Body): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Customdomain): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_type(value: String): Self = this.set("user_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcOffset(value: Double): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddr_city(value: String): Self = this.set("addr_city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddr_cityNull: Self = this.set("addr_city", null)
    
    @scala.inline
    def setAddr_country(value: String): Self = this.set("addr_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddr_countryNull: Self = this.set("addr_country", null)
    
    @scala.inline
    def setAddr_state(value: String): Self = this.set("addr_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddr_stateNull: Self = this.set("addr_state", null)
    
    @scala.inline
    def setAddr_street(value: String): Self = this.set("addr_street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddr_streetNull: Self = this.set("addr_street", null)
    
    @scala.inline
    def setAddr_zip(value: String): Self = this.set("addr_zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddr_zipNull: Self = this.set("addr_zip", null)
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameNull: Self = this.set("first_name", null)
    
    @scala.inline
    def setMobile_phone(value: String): Self = this.set("mobile_phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile_phoneNull: Self = this.set("mobile_phone", null)
  }
}
