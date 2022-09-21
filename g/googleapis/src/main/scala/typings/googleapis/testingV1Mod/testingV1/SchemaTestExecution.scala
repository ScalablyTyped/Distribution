package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestExecution extends StObject {
  
  /**
    * Output only. How the host machine(s) are configured.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.undefined
  
  /**
    * Output only. Unique id set by the service.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Id of the containing TestMatrix.
    */
  var matrixId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The cloud project that owns the test execution.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Details about the shard.
    */
  var shard: js.UndefOr[SchemaShard] = js.undefined
  
  /**
    * Output only. Indicates the current progress of the test execution (e.g., FINISHED).
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Additional details about the running test.
    */
  var testDetails: js.UndefOr[SchemaTestDetails] = js.undefined
  
  /**
    * Output only. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.undefined
  
  /**
    * Output only. The time this test execution was initially created.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Where the results for this execution are written.
    */
  var toolResultsStep: js.UndefOr[SchemaToolResultsStep] = js.undefined
}
object SchemaTestExecution {
  
  inline def apply(): SchemaTestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestExecution]
  }
  
  extension [Self <: SchemaTestExecution](x: Self) {
    
    inline def setEnvironment(value: SchemaEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMatrixId(value: String): Self = StObject.set(x, "matrixId", value.asInstanceOf[js.Any])
    
    inline def setMatrixIdNull: Self = StObject.set(x, "matrixId", null)
    
    inline def setMatrixIdUndefined: Self = StObject.set(x, "matrixId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setShard(value: SchemaShard): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTestDetails(value: SchemaTestDetails): Self = StObject.set(x, "testDetails", value.asInstanceOf[js.Any])
    
    inline def setTestDetailsUndefined: Self = StObject.set(x, "testDetails", js.undefined)
    
    inline def setTestSpecification(value: SchemaTestSpecification): Self = StObject.set(x, "testSpecification", value.asInstanceOf[js.Any])
    
    inline def setTestSpecificationUndefined: Self = StObject.set(x, "testSpecification", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setToolResultsStep(value: SchemaToolResultsStep): Self = StObject.set(x, "toolResultsStep", value.asInstanceOf[js.Any])
    
    inline def setToolResultsStepUndefined: Self = StObject.set(x, "toolResultsStep", js.undefined)
  }
}
