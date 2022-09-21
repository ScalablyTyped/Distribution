package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotificationRateLimit extends StObject {
  
  /**
    * Not more than one notification per period.
    */
  var period: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotificationRateLimit {
  
  inline def apply(): SchemaNotificationRateLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationRateLimit]
  }
  
  extension [Self <: SchemaNotificationRateLimit](x: Self) {
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodNull: Self = StObject.set(x, "period", null)
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
