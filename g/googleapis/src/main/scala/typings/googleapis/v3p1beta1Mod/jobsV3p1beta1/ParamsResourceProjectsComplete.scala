package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsComplete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional.  If provided, restricts completion to specified company.  The
    * format is "projects/{project_id}/companies/{company_id}", for example,
    * "projects/api-test-project/companies/foo".
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Use language_codes instead.  Optional.  The language of the
    * query. This is the BCP-47 language code, such as "en-US" or "sr-Latn".
    * For more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with the same language_code
    * are returned.  For CompletionType.COMPANY_NAME type, only companies
    * having open jobs with the same language_code are returned.  For
    * CompletionType.COMBINED type, only open jobs with the same language_code
    * or companies having open jobs with the same language_code are returned.
    * The maximum number of allowed characters is 255.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The list of languages of the query. This is the BCP-47
    * language code, such as "en-US" or "sr-Latn". For more information, see
    * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with the same
    * language_codes are returned.  For CompletionType.COMPANY_NAME type, only
    * companies having open jobs with the same language_codes are returned. For
    * CompletionType.COMBINED type, only open jobs with the same language_codes
    * or companies having open jobs with the same language_codes are returned.
    * The maximum number of allowed characters is 255.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required.  Resource name of project the completion is performed within.
    * The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required.  Completion result count.  The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Required.  The query used to generate suggestions.  The maximum number of
    * allowed characters is 255.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The scope of the completion. The defaults is
    * CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsComplete {
  
  @scala.inline
  def apply(): ParamsResourceProjectsComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsComplete]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsCompleteMutableBuilder[Self <: ParamsResourceProjectsComplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    @scala.inline
    def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
