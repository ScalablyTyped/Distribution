package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.company
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Company.Company> & {  remove :boolean | undefined} */
trait PartialCompanyremoveboole extends StObject {
  
  var app_id: js.UndefOr[String] = js.undefined
  
  var company_id: js.UndefOr[String] = js.undefined
  
  var created_at: js.UndefOr[Double] = js.undefined
  
  var custom_attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var industry: js.UndefOr[String] = js.undefined
  
  var monthly_spend: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var plan: js.UndefOr[String | Name] = js.undefined
  
  var remote_created_at: js.UndefOr[Double] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var session_count: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[company] = js.undefined
  
  var updated_at: js.UndefOr[Double] = js.undefined
  
  var user_count: js.UndefOr[Double] = js.undefined
  
  var website: js.UndefOr[String] = js.undefined
}
object PartialCompanyremoveboole {
  
  inline def apply(): PartialCompanyremoveboole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCompanyremoveboole]
  }
  
  extension [Self <: PartialCompanyremoveboole](x: Self) {
    
    inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setCompany_id(value: String): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
    
    inline def setCompany_idUndefined: Self = StObject.set(x, "company_id", js.undefined)
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCustom_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    inline def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
    
    inline def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
    
    inline def setMonthly_spend(value: Double): Self = StObject.set(x, "monthly_spend", value.asInstanceOf[js.Any])
    
    inline def setMonthly_spendUndefined: Self = StObject.set(x, "monthly_spend", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlan(value: String | Name): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setRemote_created_at(value: Double): Self = StObject.set(x, "remote_created_at", value.asInstanceOf[js.Any])
    
    inline def setRemote_created_atUndefined: Self = StObject.set(x, "remote_created_at", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
    
    inline def setSession_countUndefined: Self = StObject.set(x, "session_count", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: company): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
    
    inline def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
    
    inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
