package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAlertStrategy extends StObject {
  
  /**
    * If an alert policy that was active has no data for this long, any open incidents will close
    */
  var autoClose: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
    */
  var notificationRateLimit: js.UndefOr[SchemaNotificationRateLimit] = js.undefined
}
object SchemaAlertStrategy {
  
  inline def apply(): SchemaAlertStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlertStrategy]
  }
  
  extension [Self <: SchemaAlertStrategy](x: Self) {
    
    inline def setAutoClose(value: String): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseNull: Self = StObject.set(x, "autoClose", null)
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setNotificationRateLimit(value: SchemaNotificationRateLimit): Self = StObject.set(x, "notificationRateLimit", value.asInstanceOf[js.Any])
    
    inline def setNotificationRateLimitUndefined: Self = StObject.set(x, "notificationRateLimit", js.undefined)
  }
}
