package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource containing usage stats for a given script, based on the supplied
  * filter and mask present in the request.
  */
@js.native
trait SchemaMetrics extends StObject {
  
  /**
    * Number of active users.
    */
  var activeUsers: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
  
  /**
    * Number of failed executions.
    */
  var failedExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
  
  /**
    * Number of total executions.
    */
  var totalExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
}
object SchemaMetrics {
  
  @scala.inline
  def apply(): SchemaMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrics]
  }
  
  @scala.inline
  implicit class SchemaMetricsMutableBuilder[Self <: SchemaMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveUsers(value: js.Array[SchemaMetricsValue]): Self = StObject.set(x, "activeUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUsersUndefined: Self = StObject.set(x, "activeUsers", js.undefined)
    
    @scala.inline
    def setActiveUsersVarargs(value: SchemaMetricsValue*): Self = StObject.set(x, "activeUsers", js.Array(value :_*))
    
    @scala.inline
    def setFailedExecutions(value: js.Array[SchemaMetricsValue]): Self = StObject.set(x, "failedExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedExecutionsUndefined: Self = StObject.set(x, "failedExecutions", js.undefined)
    
    @scala.inline
    def setFailedExecutionsVarargs(value: SchemaMetricsValue*): Self = StObject.set(x, "failedExecutions", js.Array(value :_*))
    
    @scala.inline
    def setTotalExecutions(value: js.Array[SchemaMetricsValue]): Self = StObject.set(x, "totalExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalExecutionsUndefined: Self = StObject.set(x, "totalExecutions", js.undefined)
    
    @scala.inline
    def setTotalExecutionsVarargs(value: SchemaMetricsValue*): Self = StObject.set(x, "totalExecutions", js.Array(value :_*))
  }
}
