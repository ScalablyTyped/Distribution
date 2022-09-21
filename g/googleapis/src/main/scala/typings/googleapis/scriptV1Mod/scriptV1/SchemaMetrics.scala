package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetrics extends StObject {
  
  /**
    * Number of active users.
    */
  var activeUsers: js.UndefOr[js.Array[SchemaMetricsValue]] = js.undefined
  
  /**
    * Number of failed executions.
    */
  var failedExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.undefined
  
  /**
    * Number of total executions.
    */
  var totalExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.undefined
}
object SchemaMetrics {
  
  inline def apply(): SchemaMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrics]
  }
  
  extension [Self <: SchemaMetrics](x: Self) {
    
    inline def setActiveUsers(value: js.Array[SchemaMetricsValue]): Self = StObject.set(x, "activeUsers", value.asInstanceOf[js.Any])
    
    inline def setActiveUsersUndefined: Self = StObject.set(x, "activeUsers", js.undefined)
    
    inline def setActiveUsersVarargs(value: SchemaMetricsValue*): Self = StObject.set(x, "activeUsers", js.Array(value*))
    
    inline def setFailedExecutions(value: js.Array[SchemaMetricsValue]): Self = StObject.set(x, "failedExecutions", value.asInstanceOf[js.Any])
    
    inline def setFailedExecutionsUndefined: Self = StObject.set(x, "failedExecutions", js.undefined)
    
    inline def setFailedExecutionsVarargs(value: SchemaMetricsValue*): Self = StObject.set(x, "failedExecutions", js.Array(value*))
    
    inline def setTotalExecutions(value: js.Array[SchemaMetricsValue]): Self = StObject.set(x, "totalExecutions", value.asInstanceOf[js.Any])
    
    inline def setTotalExecutionsUndefined: Self = StObject.set(x, "totalExecutions", js.undefined)
    
    inline def setTotalExecutionsVarargs(value: SchemaMetricsValue*): Self = StObject.set(x, "totalExecutions", js.Array(value*))
  }
}
