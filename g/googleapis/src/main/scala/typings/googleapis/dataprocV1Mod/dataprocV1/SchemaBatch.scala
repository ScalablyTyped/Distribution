package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatch extends StObject {
  
  /**
    * Output only. The time when the batch was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The email address of the user who created the batch.
    */
  var creator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Environment configuration for the batch execution.
    */
  var environmentConfig: js.UndefOr[SchemaEnvironmentConfig] = js.undefined
  
  /**
    * Optional. The labels to associate with this batch. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a batch.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource name of the batch.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the operation associated with this batch.
    */
  var operation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. PySpark batch config.
    */
  var pysparkBatch: js.UndefOr[SchemaPySparkBatch] = js.undefined
  
  /**
    * Optional. Runtime configuration for the batch execution.
    */
  var runtimeConfig: js.UndefOr[SchemaRuntimeConfig] = js.undefined
  
  /**
    * Output only. Runtime information about batch execution.
    */
  var runtimeInfo: js.UndefOr[SchemaRuntimeInfo] = js.undefined
  
  /**
    * Optional. Spark batch config.
    */
  var sparkBatch: js.UndefOr[SchemaSparkBatch] = js.undefined
  
  /**
    * Optional. SparkR batch config.
    */
  var sparkRBatch: js.UndefOr[SchemaSparkRBatch] = js.undefined
  
  /**
    * Optional. SparkSql batch config.
    */
  var sparkSqlBatch: js.UndefOr[SchemaSparkSqlBatch] = js.undefined
  
  /**
    * Output only. The state of the batch.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Historical state information for the batch.
    */
  var stateHistory: js.UndefOr[js.Array[SchemaStateHistory]] = js.undefined
  
  /**
    * Output only. Batch state details, such as a failure description if the state is FAILED.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the batch entered a current state.
    */
  var stateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A batch UUID (Unique Universal Identifier). The service generates this value when it creates the batch.
    */
  var uuid: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatch {
  
  inline def apply(): SchemaBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatch]
  }
  
  extension [Self <: SchemaBatch](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setEnvironmentConfig(value: SchemaEnvironmentConfig): Self = StObject.set(x, "environmentConfig", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentConfigUndefined: Self = StObject.set(x, "environmentConfig", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPysparkBatch(value: SchemaPySparkBatch): Self = StObject.set(x, "pysparkBatch", value.asInstanceOf[js.Any])
    
    inline def setPysparkBatchUndefined: Self = StObject.set(x, "pysparkBatch", js.undefined)
    
    inline def setRuntimeConfig(value: SchemaRuntimeConfig): Self = StObject.set(x, "runtimeConfig", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigUndefined: Self = StObject.set(x, "runtimeConfig", js.undefined)
    
    inline def setRuntimeInfo(value: SchemaRuntimeInfo): Self = StObject.set(x, "runtimeInfo", value.asInstanceOf[js.Any])
    
    inline def setRuntimeInfoUndefined: Self = StObject.set(x, "runtimeInfo", js.undefined)
    
    inline def setSparkBatch(value: SchemaSparkBatch): Self = StObject.set(x, "sparkBatch", value.asInstanceOf[js.Any])
    
    inline def setSparkBatchUndefined: Self = StObject.set(x, "sparkBatch", js.undefined)
    
    inline def setSparkRBatch(value: SchemaSparkRBatch): Self = StObject.set(x, "sparkRBatch", value.asInstanceOf[js.Any])
    
    inline def setSparkRBatchUndefined: Self = StObject.set(x, "sparkRBatch", js.undefined)
    
    inline def setSparkSqlBatch(value: SchemaSparkSqlBatch): Self = StObject.set(x, "sparkSqlBatch", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlBatchUndefined: Self = StObject.set(x, "sparkSqlBatch", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateHistory(value: js.Array[SchemaStateHistory]): Self = StObject.set(x, "stateHistory", value.asInstanceOf[js.Any])
    
    inline def setStateHistoryUndefined: Self = StObject.set(x, "stateHistory", js.undefined)
    
    inline def setStateHistoryVarargs(value: SchemaStateHistory*): Self = StObject.set(x, "stateHistory", js.Array(value*))
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateTime(value: String): Self = StObject.set(x, "stateTime", value.asInstanceOf[js.Any])
    
    inline def setStateTimeNull: Self = StObject.set(x, "stateTime", null)
    
    inline def setStateTimeUndefined: Self = StObject.set(x, "stateTime", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidNull: Self = StObject.set(x, "uuid", null)
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
