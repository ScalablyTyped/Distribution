package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetricsScope extends StObject {
  
  /**
    * Output only. The time when this Metrics Scope was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The list of projects monitored by this Metrics Scope.
    */
  var monitoredProjects: js.UndefOr[js.Array[SchemaMonitoredProject]] = js.undefined
  
  /**
    * Immutable. The resource name of the Monitoring Metrics Scope. On input, the resource name can be specified with the scoping project ID or number. On output, the resource name is specified with the scoping project number. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when this Metrics Scope record was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetricsScope {
  
  inline def apply(): SchemaMetricsScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricsScope]
  }
  
  extension [Self <: SchemaMetricsScope](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setMonitoredProjects(value: js.Array[SchemaMonitoredProject]): Self = StObject.set(x, "monitoredProjects", value.asInstanceOf[js.Any])
    
    inline def setMonitoredProjectsUndefined: Self = StObject.set(x, "monitoredProjects", js.undefined)
    
    inline def setMonitoredProjectsVarargs(value: SchemaMonitoredProject*): Self = StObject.set(x, "monitoredProjects", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
