package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSchedule extends StObject {
  
  /**
    * A standard [cron](https://wikipedia.com/wiki/cron) string that defines a repeating schedule for creating Backups via this BackupPlan. If this is defined, then backup_retain_days must also be defined. Default (empty): no automatic backup creation will occur.
    */
  var cronSchedule: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This flag denotes whether automatic Backup creation is paused for this BackupPlan. Default: False
    */
  var paused: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSchedule {
  
  inline def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  
  extension [Self <: SchemaSchedule](x: Self) {
    
    inline def setCronSchedule(value: String): Self = StObject.set(x, "cronSchedule", value.asInstanceOf[js.Any])
    
    inline def setCronScheduleNull: Self = StObject.set(x, "cronSchedule", null)
    
    inline def setCronScheduleUndefined: Self = StObject.set(x, "cronSchedule", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedNull: Self = StObject.set(x, "paused", null)
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
  }
}
