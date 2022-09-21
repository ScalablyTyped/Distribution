package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchOperationMetadata extends StObject {
  
  /**
    * The time when the batch operation is created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time when the batch operation is finished and google.longrunning.Operation.done is set to `true`.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of failed item(s) inside an operation.
    */
  var failureCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The state of a long running operation.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * More detailed information about operation state.
    */
  var stateDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of successful item(s) inside an operation.
    */
  var successCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Count of total item(s) inside an operation.
    */
  var totalCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time when the batch operation status is updated. The metadata and the update_time is refreshed every minute otherwise cached data is returned.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatchOperationMetadata {
  
  inline def apply(): SchemaBatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchOperationMetadata]
  }
  
  extension [Self <: SchemaBatchOperationMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFailureCount(value: Double): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountNull: Self = StObject.set(x, "failureCount", null)
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDescription(value: String): Self = StObject.set(x, "stateDescription", value.asInstanceOf[js.Any])
    
    inline def setStateDescriptionNull: Self = StObject.set(x, "stateDescription", null)
    
    inline def setStateDescriptionUndefined: Self = StObject.set(x, "stateDescription", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuccessCount(value: Double): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountNull: Self = StObject.set(x, "successCount", null)
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
