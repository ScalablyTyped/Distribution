package typings.googleapis.contentV2Mod.contentV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceShippingsettingsGetsupportedholidays extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the account for which to retrieve the supported holidays.
    */
  var merchantId: js.UndefOr[String] = js.native
}
object ParamsResourceShippingsettingsGetsupportedholidays {
  
  @scala.inline
  def apply(): ParamsResourceShippingsettingsGetsupportedholidays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceShippingsettingsGetsupportedholidays]
  }
  
  @scala.inline
  implicit class ParamsResourceShippingsettingsGetsupportedholidaysMutableBuilder[Self <: ParamsResourceShippingsettingsGetsupportedholidays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
