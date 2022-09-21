package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertsResponse extends StObject {
  
  /** The alerts returned in this list response. */
  var alerts: js.UndefOr[js.Array[Alert]] = js.undefined
}
object ListAlertsResponse {
  
  inline def apply(): ListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertsResponse]
  }
  
  extension [Self <: ListAlertsResponse](x: Self) {
    
    inline def setAlerts(value: js.Array[Alert]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    inline def setAlertsVarargs(value: Alert*): Self = StObject.set(x, "alerts", js.Array(value*))
  }
}
