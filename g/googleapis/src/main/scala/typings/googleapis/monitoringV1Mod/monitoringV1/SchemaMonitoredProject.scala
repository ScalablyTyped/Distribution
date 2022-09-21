package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonitoredProject extends StObject {
  
  /**
    * Output only. The time when this MonitoredProject was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The resource name of the MonitoredProject. On input, the resource name includes the scoping project ID and monitored project ID. On output, it contains the equivalent project numbers. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER\}/projects/{MONITORED_PROJECT_ID_OR_NUMBER\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaMonitoredProject {
  
  inline def apply(): SchemaMonitoredProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoredProject]
  }
  
  extension [Self <: SchemaMonitoredProject](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
