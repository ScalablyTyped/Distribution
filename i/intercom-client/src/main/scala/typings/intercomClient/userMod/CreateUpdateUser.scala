package typings.intercomClient.userMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.PartialCompanyremoveboole
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUpdateUser extends BaseUser {
  var companies: js.Array[PartialCompanyremoveboole] = js.native
}

object CreateUpdateUser {
  @scala.inline
  def apply(
    anonymous: Boolean,
    avatar: Avatar,
    companies: js.Array[PartialCompanyremoveboole],
    created_at: Double,
    custom_attributes: StringDictionary[js.Any],
    id: String,
    session_count: Double,
    `type`: user | contact,
    unsubscribed_from_emails: Boolean,
    updated_at: Double
  ): CreateUpdateUser = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUpdateUser]
  }
  @scala.inline
  implicit class CreateUpdateUserOps[Self <: CreateUpdateUser] (val x: Self) extends AnyVal {
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
    def setCompaniesVarargs(value: PartialCompanyremoveboole*): Self = this.set("companies", js.Array(value :_*))
    @scala.inline
    def setCompanies(value: js.Array[PartialCompanyremoveboole]): Self = this.set("companies", value.asInstanceOf[js.Any])
  }
  
}

