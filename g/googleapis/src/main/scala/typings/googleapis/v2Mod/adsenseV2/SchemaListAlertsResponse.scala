package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAlertsResponse extends StObject {
  
  /**
    * The alerts returned in this list response.
    */
  var alerts: js.UndefOr[js.Array[SchemaAlert]] = js.undefined
}
object SchemaListAlertsResponse {
  
  inline def apply(): SchemaListAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAlertsResponse]
  }
  
  extension [Self <: SchemaListAlertsResponse](x: Self) {
    
    inline def setAlerts(value: js.Array[SchemaAlert]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    inline def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    inline def setAlertsVarargs(value: SchemaAlert*): Self = StObject.set(x, "alerts", js.Array(value*))
  }
}
