package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.company
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Company.Company> */
@js.native
trait PartialCompany extends StObject {
  
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
  
  var session_count: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[company] = js.native
  
  var updated_at: js.UndefOr[Double] = js.native
  
  var user_count: js.UndefOr[Double] = js.native
  
  var website: js.UndefOr[String] = js.native
}
object PartialCompany {
  
  @scala.inline
  def apply(): PartialCompany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompany]
  }
  
  @scala.inline
  implicit class PartialCompanyMutableBuilder[Self <: PartialCompany] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    @scala.inline
    def setCompany_id(value: String): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany_idUndefined: Self = StObject.set(x, "company_id", js.undefined)
    
    @scala.inline
    def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
    
    @scala.inline
    def setMonthly_spend(value: Double): Self = StObject.set(x, "monthly_spend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthly_spendUndefined: Self = StObject.set(x, "monthly_spend", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlan(value: String | Name): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    @scala.inline
    def setRemote_created_at(value: Double): Self = StObject.set(x, "remote_created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote_created_atUndefined: Self = StObject.set(x, "remote_created_at", js.undefined)
    
    @scala.inline
    def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_countUndefined: Self = StObject.set(x, "session_count", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: company): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    @scala.inline
    def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
