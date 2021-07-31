package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A group of one or more TestExecutions, built by taking a product of values
  * over a pre-defined set of axes.
  */
trait SchemaTestMatrix extends StObject {
  
  /**
    * Information about the client which invoked the test.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.undefined
  
  /**
    * Required. How the host machine(s) are configured.
    */
  var environmentMatrix: js.UndefOr[SchemaEnvironmentMatrix] = js.undefined
  
  /**
    * The number of times a TestExecution should be re-attempted if one or more
    * of its test cases fail for any reason. The maximum number of reruns
    * allowed is 10.  Default is 0, which implies no reruns.
    */
  var flakyTestAttempts: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. Describes why the matrix is considered invalid. Only useful
    * for matrices in the INVALID state.
    */
  var invalidMatrixDetails: js.UndefOr[String] = js.undefined
  
  /**
    * The cloud project that owns the test matrix.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Where the results for the matrix are written.
    */
  var resultStorage: js.UndefOr[SchemaResultStorage] = js.undefined
  
  /**
    * Output only. Indicates the current progress of the test matrix (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The list of test executions that the service creates for
    * this matrix.
    */
  var testExecutions: js.UndefOr[js.Array[SchemaTestExecution]] = js.undefined
  
  /**
    * Output only. Unique id set by the service.
    */
  var testMatrixId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.undefined
  
  /**
    * Output only. The time this test matrix was initially created.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SchemaTestMatrix {
  
  @scala.inline
  def apply(): SchemaTestMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestMatrix]
  }
  
  @scala.inline
  implicit class SchemaTestMatrixMutableBuilder[Self <: SchemaTestMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientInfo(value: SchemaClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    @scala.inline
    def setEnvironmentMatrix(value: SchemaEnvironmentMatrix): Self = StObject.set(x, "environmentMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentMatrixUndefined: Self = StObject.set(x, "environmentMatrix", js.undefined)
    
    @scala.inline
    def setFlakyTestAttempts(value: Double): Self = StObject.set(x, "flakyTestAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlakyTestAttemptsUndefined: Self = StObject.set(x, "flakyTestAttempts", js.undefined)
    
    @scala.inline
    def setInvalidMatrixDetails(value: String): Self = StObject.set(x, "invalidMatrixDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMatrixDetailsUndefined: Self = StObject.set(x, "invalidMatrixDetails", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setResultStorage(value: SchemaResultStorage): Self = StObject.set(x, "resultStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultStorageUndefined: Self = StObject.set(x, "resultStorage", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTestExecutions(value: js.Array[SchemaTestExecution]): Self = StObject.set(x, "testExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestExecutionsUndefined: Self = StObject.set(x, "testExecutions", js.undefined)
    
    @scala.inline
    def setTestExecutionsVarargs(value: SchemaTestExecution*): Self = StObject.set(x, "testExecutions", js.Array(value :_*))
    
    @scala.inline
    def setTestMatrixId(value: String): Self = StObject.set(x, "testMatrixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestMatrixIdUndefined: Self = StObject.set(x, "testMatrixId", js.undefined)
    
    @scala.inline
    def setTestSpecification(value: SchemaTestSpecification): Self = StObject.set(x, "testSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestSpecificationUndefined: Self = StObject.set(x, "testSpecification", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
