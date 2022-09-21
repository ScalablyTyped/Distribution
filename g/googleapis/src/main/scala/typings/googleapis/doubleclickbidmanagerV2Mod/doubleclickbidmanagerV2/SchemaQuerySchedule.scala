package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQuerySchedule extends StObject {
  
  /**
    * Date to periodically run the query until. Not applicable to `ONE_TIME` frequency.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * How often the query is run.
    */
  var frequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Canonical timezone code for report generation time. Defaults to `America/New_York`.
    */
  var nextRunTimezoneCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When to start running the query. Not applicable to `ONE_TIME` frequency.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaQuerySchedule {
  
  inline def apply(): SchemaQuerySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuerySchedule]
  }
  
  extension [Self <: SchemaQuerySchedule](x: Self) {
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyNull: Self = StObject.set(x, "frequency", null)
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setNextRunTimezoneCode(value: String): Self = StObject.set(x, "nextRunTimezoneCode", value.asInstanceOf[js.Any])
    
    inline def setNextRunTimezoneCodeNull: Self = StObject.set(x, "nextRunTimezoneCode", null)
    
    inline def setNextRunTimezoneCodeUndefined: Self = StObject.set(x, "nextRunTimezoneCode", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
