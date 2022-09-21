package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Alert to delete.
    */
  var alertId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAlertsDelete {
  
  inline def apply(): ParamsResourceAlertsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsDelete]
  }
  
  extension [Self <: ParamsResourceAlertsDelete](x: Self) {
    
    inline def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
  }
}
