package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataSourceRefreshSchedule extends StObject {
  
  /**
    * Daily refresh schedule.
    */
  var dailySchedule: js.UndefOr[SchemaDataSourceRefreshDailySchedule] = js.undefined
  
  /**
    * True if the refresh schedule is enabled, or false otherwise.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Monthly refresh schedule.
    */
  var monthlySchedule: js.UndefOr[SchemaDataSourceRefreshMonthlySchedule] = js.undefined
  
  /**
    * Output only. The time interval of the next run.
    */
  var nextRun: js.UndefOr[SchemaInterval] = js.undefined
  
  /**
    * The scope of the refresh. Must be ALL_DATA_SOURCES.
    */
  var refreshScope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Weekly refresh schedule.
    */
  var weeklySchedule: js.UndefOr[SchemaDataSourceRefreshWeeklySchedule] = js.undefined
}
object SchemaDataSourceRefreshSchedule {
  
  inline def apply(): SchemaDataSourceRefreshSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataSourceRefreshSchedule]
  }
  
  extension [Self <: SchemaDataSourceRefreshSchedule](x: Self) {
    
    inline def setDailySchedule(value: SchemaDataSourceRefreshDailySchedule): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    inline def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMonthlySchedule(value: SchemaDataSourceRefreshMonthlySchedule): Self = StObject.set(x, "monthlySchedule", value.asInstanceOf[js.Any])
    
    inline def setMonthlyScheduleUndefined: Self = StObject.set(x, "monthlySchedule", js.undefined)
    
    inline def setNextRun(value: SchemaInterval): Self = StObject.set(x, "nextRun", value.asInstanceOf[js.Any])
    
    inline def setNextRunUndefined: Self = StObject.set(x, "nextRun", js.undefined)
    
    inline def setRefreshScope(value: String): Self = StObject.set(x, "refreshScope", value.asInstanceOf[js.Any])
    
    inline def setRefreshScopeNull: Self = StObject.set(x, "refreshScope", null)
    
    inline def setRefreshScopeUndefined: Self = StObject.set(x, "refreshScope", js.undefined)
    
    inline def setWeeklySchedule(value: SchemaDataSourceRefreshWeeklySchedule): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    inline def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
