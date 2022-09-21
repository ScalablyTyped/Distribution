package typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecution extends StObject {
  
  /**
    * Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `'{"argument":"{\"firstName\":\"FIRST\",\"lastName\":\"LAST\"\}"\}'`
    */
  var argument: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The call logging level associated to this execution.
    */
  var callLogLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Marks the end of execution, successful or not.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The error which caused the execution to finish prematurely. The value is only present if the execution's state is `FAILED` or `CANCELLED`.
    */
  var error: js.UndefOr[SchemaError] = js.undefined
  
  /**
    * Output only. The resource name of the execution. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}/executions/{execution\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Output of the execution represented as a JSON string. The value can only be present if the execution's state is `SUCCEEDED`.
    */
  var result: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Marks the beginning of execution.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the execution.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Revision of the workflow this execution is using.
    */
  var workflowRevisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecution {
  
  inline def apply(): SchemaExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecution]
  }
  
  extension [Self <: SchemaExecution](x: Self) {
    
    inline def setArgument(value: String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setCallLogLevel(value: String): Self = StObject.set(x, "callLogLevel", value.asInstanceOf[js.Any])
    
    inline def setCallLogLevelNull: Self = StObject.set(x, "callLogLevel", null)
    
    inline def setCallLogLevelUndefined: Self = StObject.set(x, "callLogLevel", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setError(value: SchemaError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWorkflowRevisionId(value: String): Self = StObject.set(x, "workflowRevisionId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowRevisionIdNull: Self = StObject.set(x, "workflowRevisionId", null)
    
    inline def setWorkflowRevisionIdUndefined: Self = StObject.set(x, "workflowRevisionId", js.undefined)
  }
}
