package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for an alert listing request.
  */
trait SchemaListAlertsResponse extends StObject {
  
  /**
    * The list of alerts.
    */
  var alerts: js.UndefOr[js.Array[SchemaAlert]] = js.undefined
  
  /**
    * The token for the next page. If not empty, indicates that there may be
    * more alerts that match the listing request; this value can be used in a
    * subsequent ListAlertsRequest to get alerts continuing from last result of
    * the current list call.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAlertsResponse {
  
  inline def apply(): SchemaListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertsResponse]
  }
  
  extension [Self <: SchemaListAlertsResponse](x: Self) {
    
    inline def setAlerts(value: js.Array[SchemaAlert]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    inline def setAlertsVarargs(value: SchemaAlert*): Self = StObject.set(x, "alerts", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
