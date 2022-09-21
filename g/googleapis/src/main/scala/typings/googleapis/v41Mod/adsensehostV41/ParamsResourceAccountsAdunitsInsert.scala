package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdunitsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Account which will contain the ad unit.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Ad client into which to insert the ad unit.
    */
  var adClientId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAdUnit] = js.undefined
}
object ParamsResourceAccountsAdunitsInsert {
  
  inline def apply(): ParamsResourceAccountsAdunitsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdunitsInsert]
  }
  
  extension [Self <: ParamsResourceAccountsAdunitsInsert](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdClientId(value: String): Self = StObject.set(x, "adClientId", value.asInstanceOf[js.Any])
    
    inline def setAdClientIdUndefined: Self = StObject.set(x, "adClientId", js.undefined)
    
    inline def setRequestBody(value: SchemaAdUnit): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
