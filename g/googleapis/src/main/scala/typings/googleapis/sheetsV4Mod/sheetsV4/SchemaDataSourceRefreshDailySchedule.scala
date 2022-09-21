package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceRefreshDailySchedule extends StObject {
  
  /**
    * The start time of a time interval in which a data source refresh is scheduled. Only `hours` part is used. The time interval size defaults to that in the Sheets editor.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaDataSourceRefreshDailySchedule {
  
  inline def apply(): SchemaDataSourceRefreshDailySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceRefreshDailySchedule]
  }
  
  extension [Self <: SchemaDataSourceRefreshDailySchedule](x: Self) {
    
    inline def setStartTime(value: SchemaTimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
