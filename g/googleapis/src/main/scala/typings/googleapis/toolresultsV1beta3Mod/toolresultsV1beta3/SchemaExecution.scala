package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecution extends StObject {
  
  /**
    * The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
    */
  var completionTime: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
    */
  var creationTime: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
    */
  var dimensionDefinitions: js.UndefOr[js.Array[SchemaMatrixDimensionDefinition]] = js.undefined
  
  /**
    * A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
    */
  var executionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
    */
  var outcome: js.UndefOr[SchemaOutcome] = js.undefined
  
  /**
    * Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
    */
  var specification: js.UndefOr[SchemaSpecification] = js.undefined
  
  /**
    * The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
    */
  var testExecutionMatrixId: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecution {
  
  inline def apply(): SchemaExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecution]
  }
  
  extension [Self <: SchemaExecution](x: Self) {
    
    inline def setCompletionTime(value: SchemaTimestamp): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: SchemaTimestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDimensionDefinitions(value: js.Array[SchemaMatrixDimensionDefinition]): Self = StObject.set(x, "dimensionDefinitions", value.asInstanceOf[js.Any])
    
    inline def setDimensionDefinitionsUndefined: Self = StObject.set(x, "dimensionDefinitions", js.undefined)
    
    inline def setDimensionDefinitionsVarargs(value: SchemaMatrixDimensionDefinition*): Self = StObject.set(x, "dimensionDefinitions", js.Array(value*))
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdNull: Self = StObject.set(x, "executionId", null)
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setOutcome(value: SchemaOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setSpecification(value: SchemaSpecification): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
    
    inline def setSpecificationUndefined: Self = StObject.set(x, "specification", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTestExecutionMatrixId(value: String): Self = StObject.set(x, "testExecutionMatrixId", value.asInstanceOf[js.Any])
    
    inline def setTestExecutionMatrixIdNull: Self = StObject.set(x, "testExecutionMatrixId", null)
    
    inline def setTestExecutionMatrixIdUndefined: Self = StObject.set(x, "testExecutionMatrixId", js.undefined)
  }
}
