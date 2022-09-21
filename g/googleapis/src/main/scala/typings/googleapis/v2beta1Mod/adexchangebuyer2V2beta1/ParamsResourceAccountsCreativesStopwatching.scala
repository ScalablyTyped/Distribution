package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCreativesStopwatching
  extends StObject
     with StandardParameters {
  
  /**
    * The account of the creative to stop notifications for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The creative ID of the creative to stop notifications for. Specify "-" to specify stopping account level notifications.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaStopWatchingCreativeRequest] = js.undefined
}
object ParamsResourceAccountsCreativesStopwatching {
  
  inline def apply(): ParamsResourceAccountsCreativesStopwatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCreativesStopwatching]
  }
  
  extension [Self <: ParamsResourceAccountsCreativesStopwatching](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setRequestBody(value: SchemaStopWatchingCreativeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
