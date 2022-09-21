package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceConfig extends StObject {
  
  /**
    * Verifies core internal services are running.
    */
  var enableHealthMonitoring: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
    */
  var notebookUpgradeSchedule: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceConfig {
  
  inline def apply(): SchemaInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConfig]
  }
  
  extension [Self <: SchemaInstanceConfig](x: Self) {
    
    inline def setEnableHealthMonitoring(value: Boolean): Self = StObject.set(x, "enableHealthMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableHealthMonitoringNull: Self = StObject.set(x, "enableHealthMonitoring", null)
    
    inline def setEnableHealthMonitoringUndefined: Self = StObject.set(x, "enableHealthMonitoring", js.undefined)
    
    inline def setNotebookUpgradeSchedule(value: String): Self = StObject.set(x, "notebookUpgradeSchedule", value.asInstanceOf[js.Any])
    
    inline def setNotebookUpgradeScheduleNull: Self = StObject.set(x, "notebookUpgradeSchedule", null)
    
    inline def setNotebookUpgradeScheduleUndefined: Self = StObject.set(x, "notebookUpgradeSchedule", js.undefined)
  }
}
