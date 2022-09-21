package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV2Complete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. If provided, restricts completion to the specified company.
    */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The language of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). For CompletionType.JOB_TITLE type, only open jobs with same language_code are returned. For CompletionType.COMPANY_NAME type, only companies having open jobs with same language_code are returned. For CompletionType.COMBINED type, only open jobs with same language_code or companies having open jobs with same language_code are returned.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Completion result count. The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. The query used to generate suggestions.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The scope of the completion. The defaults is CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceV2Complete {
  
  inline def apply(): ParamsResourceV2Complete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV2Complete]
  }
  
  extension [Self <: ParamsResourceV2Complete](x: Self) {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
