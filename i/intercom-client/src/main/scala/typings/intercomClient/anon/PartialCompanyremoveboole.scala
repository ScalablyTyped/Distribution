package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.company
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Company.Company> & {  remove :boolean | undefined} */
@js.native
trait PartialCompanyremoveboole extends js.Object {
  var app_id: js.UndefOr[String] = js.native
  var company_id: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var id: js.UndefOr[String] = js.native
  var industry: js.UndefOr[String] = js.native
  var monthly_spend: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var plan: js.UndefOr[String | Name] = js.native
  var remote_created_at: js.UndefOr[Double] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var session_count: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[company] = js.native
  var updated_at: js.UndefOr[Double] = js.native
  var user_count: js.UndefOr[Double] = js.native
  var website: js.UndefOr[String] = js.native
}

object PartialCompanyremoveboole {
  @scala.inline
  def apply(): PartialCompanyremoveboole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompanyremoveboole]
  }
  @scala.inline
  implicit class PartialCompanyremovebooleOps[Self <: PartialCompanyremoveboole] (val x: Self) extends AnyVal {
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
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    @scala.inline
    def setCompany_id(value: String): Self = this.set("company_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany_id: Self = this.set("company_id", js.undefined)
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_attributes: Self = this.set("custom_attributes", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndustry(value: String): Self = this.set("industry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndustry: Self = this.set("industry", js.undefined)
    @scala.inline
    def setMonthly_spend(value: Double): Self = this.set("monthly_spend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthly_spend: Self = this.set("monthly_spend", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlan(value: String | Name): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    @scala.inline
    def setRemote_created_at(value: Double): Self = this.set("remote_created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote_created_at: Self = this.set("remote_created_at", js.undefined)
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setSession_count(value: Double): Self = this.set("session_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_count: Self = this.set("session_count", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: company): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setUser_count(value: Double): Self = this.set("user_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_count: Self = this.set("user_count", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

