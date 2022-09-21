package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSqlScheduledMaintenance extends StObject {
  
  var canDefer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If the scheduled maintenance can be rescheduled.
    */
  var canReschedule: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The start time of any upcoming scheduled maintenance for this instance.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaSqlScheduledMaintenance {
  
  inline def apply(): SchemaSqlScheduledMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSqlScheduledMaintenance]
  }
  
  extension [Self <: SchemaSqlScheduledMaintenance](x: Self) {
    
    inline def setCanDefer(value: Boolean): Self = StObject.set(x, "canDefer", value.asInstanceOf[js.Any])
    
    inline def setCanDeferNull: Self = StObject.set(x, "canDefer", null)
    
    inline def setCanDeferUndefined: Self = StObject.set(x, "canDefer", js.undefined)
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleNull: Self = StObject.set(x, "canReschedule", null)
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
