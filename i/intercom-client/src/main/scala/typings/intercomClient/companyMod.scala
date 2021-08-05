package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Name
import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.company
import typings.intercomClient.intercomClientStrings.companyDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object companyMod {
  
  trait Company extends StObject {
    
    val app_id: js.UndefOr[String] = js.undefined
    
    var company_id: js.UndefOr[String] = js.undefined
    
    val created_at: Double
    
    var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    val id: String
    
    var industry: js.UndefOr[String] = js.undefined
    
    var monthly_spend: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var plan: js.UndefOr[String | Name] = js.undefined
    
    var remote_created_at: js.UndefOr[Double] = js.undefined
    
    var session_count: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    val `type`: company
    
    val updated_at: Double
    
    var user_count: js.UndefOr[Double] = js.undefined
    
    var website: js.UndefOr[String] = js.undefined
  }
  object Company {
    
    inline def apply(created_at: Double, id: String, updated_at: Double): Company = {
      val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("company")
      __obj.asInstanceOf[Company]
    }
    
    extension [Self <: Company](x: Self) {
      
      inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      inline def setCompany_id(value: String): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
      
      inline def setCompany_idUndefined: Self = StObject.set(x, "company_id", js.undefined)
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCustom_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
      
      inline def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
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
      
      inline def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
      
      inline def setSession_countUndefined: Self = StObject.set(x, "session_count", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: company): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
      
      inline def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.anon.Id
    - typings.intercomClient.anon.Companyid
  */
  trait CompanyIdentifier extends StObject
  object CompanyIdentifier {
    
    inline def Companyid(company_id: String): typings.intercomClient.anon.Companyid = {
      val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Companyid]
    }
    
    inline def Id(id: String): typings.intercomClient.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Id]
    }
  }
  
  trait List extends StObject {
    
    var companies: js.Array[Company & CompanyIdentifier]
    
    var pages: Next
    
    var total_count: Double
    
    var `type`: companyDotlist
  }
  object List {
    
    inline def apply(companies: js.Array[Company & CompanyIdentifier], pages: Next, total_count: Double): List = {
      val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("company.list")
      __obj.asInstanceOf[List]
    }
    
    extension [Self <: List](x: Self) {
      
      inline def setCompanies(value: js.Array[Company & CompanyIdentifier]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      inline def setCompaniesVarargs(value: (Company & CompanyIdentifier)*): Self = StObject.set(x, "companies", js.Array(value :_*))
      
      inline def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      inline def setType(value: companyDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
