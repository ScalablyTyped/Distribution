package typings.intercomClient.companyMod

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Name
import typings.intercomClient.intercomClientStrings.company
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Company extends js.Object {
  val app_id: js.UndefOr[String] = js.native
  var company_id: js.UndefOr[String] = js.native
  val created_at: Double = js.native
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  val id: String = js.native
  var industry: js.UndefOr[String] = js.native
  var monthly_spend: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var plan: js.UndefOr[String | Name] = js.native
  var remote_created_at: js.UndefOr[Double] = js.native
  var session_count: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  val `type`: company = js.native
  val updated_at: Double = js.native
  var user_count: js.UndefOr[Double] = js.native
  var website: js.UndefOr[String] = js.native
}

object Company {
  @scala.inline
  def apply(created_at: Double, id: String, `type`: company, updated_at: Double): Company = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  @scala.inline
  implicit class CompanyOps[Self <: Company] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: company): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    @scala.inline
    def setCompany_id(value: String): Self = this.set("company_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany_id: Self = this.set("company_id", js.undefined)
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_attributes: Self = this.set("custom_attributes", js.undefined)
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
    def setSession_count(value: Double): Self = this.set("session_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_count: Self = this.set("session_count", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
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

