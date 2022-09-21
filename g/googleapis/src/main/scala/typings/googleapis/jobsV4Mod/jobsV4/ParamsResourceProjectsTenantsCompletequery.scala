package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsCompletequery
  extends StObject
     with StandardParameters {
  
  /**
    * If provided, restricts completion to specified company. The format is "projects/{project_id\}/tenants/{tenant_id\}/companies/{company_id\}", for example, "projects/foo/tenants/bar/companies/baz".
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * The list of languages of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). The maximum number of allowed characters is 255.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. Completion result count. The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The query used to generate suggestions. The maximum number of allowed characters is 255.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The scope of the completion. The defaults is CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of tenant the completion is performed within. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    */
  var tenant: js.UndefOr[String] = js.undefined
  
  /**
    * The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTenantsCompletequery {
  
  inline def apply(): ParamsResourceProjectsTenantsCompletequery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsCompletequery]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsCompletequery](x: Self) {
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
