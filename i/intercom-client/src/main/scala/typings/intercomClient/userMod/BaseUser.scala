package typings.intercomClient.userMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUser extends js.Object {
  var anonymous: Boolean
  var app_id: js.UndefOr[String] = js.undefined
  var avatar: Avatar
  val created_at: Double
  var custom_attributes: StringDictionary[js.Any]
  var email: String | Null
  val id: String
  var last_request_at: Double | Null
  var last_seen_ip: String | Null
  var name: String | Null
  var phone: String | Null
  var pseudonym: String | Null
  var session_count: Double
  var signed_up_at: Double | Null
  var `type`: user | contact
  var unsubscribed_from_emails: Boolean
  val updated_at: Double
  var user_agent_data: String | Null
  var user_id: String | Null
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
    updated_at: Double,
    app_id: String = null,
    email: String = null,
    last_request_at: Double = null.asInstanceOf[Double],
    last_seen_ip: String = null,
    name: String = null,
    phone: String = null,
    pseudonym: String = null,
    signed_up_at: Double = null.asInstanceOf[Double],
    user_agent_data: String = null,
    user_id: String = null
  ): BaseUser = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], last_request_at = last_request_at.asInstanceOf[js.Any], last_seen_ip = last_seen_ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], pseudonym = pseudonym.asInstanceOf[js.Any], signed_up_at = signed_up_at.asInstanceOf[js.Any], user_agent_data = user_agent_data.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUser]
  }
}

