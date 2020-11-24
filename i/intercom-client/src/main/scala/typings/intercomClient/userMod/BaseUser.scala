package typings.intercomClient.userMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseUser extends js.Object {
  
  var anonymous: Boolean = js.native
  
  var app_id: js.UndefOr[String] = js.native
  
  var avatar: Avatar = js.native
  
  val created_at: Double = js.native
  
  var custom_attributes: StringDictionary[js.Any] = js.native
  
  var email: String | Null = js.native
  
  val id: String = js.native
  
  var last_request_at: Double | Null = js.native
  
  var last_seen_ip: String | Null = js.native
  
  var name: String | Null = js.native
  
  var phone: String | Null = js.native
  
  var pseudonym: String | Null = js.native
  
  var session_count: Double = js.native
  
  var signed_up_at: Double | Null = js.native
  
  var `type`: user | contact = js.native
  
  var unsubscribed_from_emails: Boolean = js.native
  
  val updated_at: Double = js.native
  
  var user_agent_data: String | Null = js.native
  
  var user_id: String | Null = js.native
}
object BaseUser {
  
  @scala.inline
  def apply(
    anonymous: Boolean,
    avatar: Avatar,
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    session_count: Double,
    `type`: user | contact,
    unsubscribed_from_emails: Boolean,
    updated_at: Double
  ): BaseUser = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUser]
  }
  
  @scala.inline
  implicit class BaseUserOps[Self <: BaseUser] (val x: Self) extends AnyVal {
    
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
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar(value: Avatar): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_count(value: Double): Self = this.set("session_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: user | contact): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = this.set("unsubscribed_from_emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    
    @scala.inline
    def setLast_request_at(value: Double): Self = this.set("last_request_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_request_atNull: Self = this.set("last_request_at", null)
    
    @scala.inline
    def setLast_seen_ip(value: String): Self = this.set("last_seen_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_seen_ipNull: Self = this.set("last_seen_ip", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    
    @scala.inline
    def setPseudonym(value: String): Self = this.set("pseudonym", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudonymNull: Self = this.set("pseudonym", null)
    
    @scala.inline
    def setSigned_up_at(value: Double): Self = this.set("signed_up_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigned_up_atNull: Self = this.set("signed_up_at", null)
    
    @scala.inline
    def setUser_agent_data(value: String): Self = this.set("user_agent_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agent_dataNull: Self = this.set("user_agent_data", null)
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idNull: Self = this.set("user_id", null)
  }
}
