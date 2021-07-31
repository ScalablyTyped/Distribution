package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsReportsSavedGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Account to which the saved reports belong.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional locale to use for translating report output to a local language.
    * Defaults to "en_US" if not specified.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of rows of report data to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The saved report to retrieve.
    */
  var savedReportId: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first row of report data to return.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object ParamsResourceAccountsReportsSavedGenerate {
  
  @scala.inline
  def apply(): ParamsResourceAccountsReportsSavedGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsReportsSavedGenerate]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsReportsSavedGenerateMutableBuilder[Self <: ParamsResourceAccountsReportsSavedGenerate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setSavedReportId(value: String): Self = StObject.set(x, "savedReportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavedReportIdUndefined: Self = StObject.set(x, "savedReportId", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
