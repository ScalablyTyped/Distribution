package typings.googleapis.v21Mod.contentV21

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatafeedstatusesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The country for which to get the datafeed status. If this parameter is
    * provided then language must also be provided. Note that this parameter is
    * required for feeds targeting multiple countries and languages, since a
    * feed may have a different status for each target.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the datafeed.
    */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /**
    * The language for which to get the datafeed status. If this parameter is
    * provided then country must also be provided. Note that this parameter is
    * required for feeds targeting multiple countries and languages, since a
    * feed may have a different status for each target.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that manages the datafeed. This account cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDatafeedstatusesGet {
  
  @scala.inline
  def apply(): ParamsResourceDatafeedstatusesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedstatusesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDatafeedstatusesGetMutableBuilder[Self <: ParamsResourceDatafeedstatusesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
