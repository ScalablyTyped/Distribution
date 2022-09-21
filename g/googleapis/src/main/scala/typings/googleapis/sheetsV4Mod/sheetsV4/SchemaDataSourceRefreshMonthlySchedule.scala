package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceRefreshMonthlySchedule extends StObject {
  
  /**
    * Days of the month to refresh. Only 1-28 are supported, mapping to the 1st to the 28th day. At lesat one day must be specified.
    */
  var daysOfMonth: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * The start time of a time interval in which a data source refresh is scheduled. Only `hours` part is used. The time interval size defaults to that in the Sheets editor.
    */
  var startTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
}
object SchemaDataSourceRefreshMonthlySchedule {
  
  inline def apply(): SchemaDataSourceRefreshMonthlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceRefreshMonthlySchedule]
  }
  
  extension [Self <: SchemaDataSourceRefreshMonthlySchedule](x: Self) {
    
    inline def setDaysOfMonth(value: js.Array[Double]): Self = StObject.set(x, "daysOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDaysOfMonthNull: Self = StObject.set(x, "daysOfMonth", null)
    
    inline def setDaysOfMonthUndefined: Self = StObject.set(x, "daysOfMonth", js.undefined)
    
    inline def setDaysOfMonthVarargs(value: Double*): Self = StObject.set(x, "daysOfMonth", js.Array(value*))
    
    inline def setStartTime(value: SchemaTimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
