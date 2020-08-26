package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Lead.Lead> */
@js.native
trait PartialLead extends js.Object {
  var avatar: js.UndefOr[Avatar] = js.native
  var companies: js.UndefOr[Companies] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var email: js.UndefOr[String | Null] = js.native
  var id: js.UndefOr[String] = js.native
  var last_request_at: js.UndefOr[Double | Null] = js.native
  var last_seen_ip: js.UndefOr[String | Null] = js.native
  var location_data: js.UndefOr[LocationData | js.Object] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var phone: js.UndefOr[String | Null] = js.native
  var referrer: js.UndefOr[String | Null] = js.native
  var segments: js.UndefOr[Segments] = js.native
  var social_profiles: js.UndefOr[Socialprofiles] = js.native
  var tags: js.UndefOr[Tags] = js.native
  var `type`: js.UndefOr[contact] = js.native
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.native
  var updated_at: js.UndefOr[Double] = js.native
  var user_agent_data: js.UndefOr[String | Null] = js.native
  var user_id: js.UndefOr[String | Null] = js.native
}

object PartialLead {
  @scala.inline
  def apply(): PartialLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLead]
  }
  @scala.inline
  implicit class PartialLeadOps[Self <: PartialLead] (val x: Self) extends AnyVal {
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
    def setAvatar(value: Avatar): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setCompanies(value: Companies): Self = this.set("companies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanies: Self = this.set("companies", js.undefined)
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_attributes: Self = this.set("custom_attributes", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLast_request_at(value: Double): Self = this.set("last_request_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_request_at: Self = this.set("last_request_at", js.undefined)
    @scala.inline
    def setLast_request_atNull: Self = this.set("last_request_at", null)
    @scala.inline
    def setLast_seen_ip(value: String): Self = this.set("last_seen_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_seen_ip: Self = this.set("last_seen_ip", js.undefined)
    @scala.inline
    def setLast_seen_ipNull: Self = this.set("last_seen_ip", null)
    @scala.inline
    def setLocation_data(value: LocationData | js.Object): Self = this.set("location_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation_data: Self = this.set("location_data", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setReferrerNull: Self = this.set("referrer", null)
    @scala.inline
    def setSegments(value: Segments): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setSocial_profiles(value: Socialprofiles): Self = this.set("social_profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocial_profiles: Self = this.set("social_profiles", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: contact): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = this.set("unsubscribed_from_emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsubscribed_from_emails: Self = this.set("unsubscribed_from_emails", js.undefined)
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUser_agent_data(value: String): Self = this.set("user_agent_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_agent_data: Self = this.set("user_agent_data", js.undefined)
    @scala.inline
    def setUser_agent_dataNull: Self = this.set("user_agent_data", null)
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
    @scala.inline
    def setUser_idNull: Self = this.set("user_id", null)
  }
  
}

