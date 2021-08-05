package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A step that represents running tests.  It accepts ant-junit xml files which
  * will be parsed into structured test results by the service. Xml file paths
  * are updated in order to append more files, however they can&#39;t be
  * deleted.  Users can also add test results manually by using the test_result
  * field.
  */
trait SchemaTestExecutionStep extends StObject {
  
  /**
    * Issues observed during the test execution.  For example, if the mobile
    * app under test crashed during the test, the error message and the stack
    * trace content can be recorded here to assist debugging.  - In response:
    * present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[SchemaTestIssue]] = js.undefined
  
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML
    * log by server, or uploaded directly by user. This references should only
    * be called when test suites are fully parsed or uploaded.  The maximum
    * allowed number of test suite overviews per step is 1000.  - In response:
    * always set - In create request: optional - In update request: never (use
    * publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[SchemaTestSuiteOverview]] = js.undefined
  
  /**
    * The timing break down of the test execution.  - In response: present if
    * set by create or update - In create/update request: optional
    */
  var testTiming: js.UndefOr[SchemaTestTiming] = js.undefined
  
  /**
    * Represents the execution of the test runner.  The exit code of this tool
    * will be used to determine if the test passed.  - In response: always set
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.undefined
}
object SchemaTestExecutionStep {
  
  inline def apply(): SchemaTestExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestExecutionStep]
  }
  
  extension [Self <: SchemaTestExecutionStep](x: Self) {
    
    inline def setTestIssues(value: js.Array[SchemaTestIssue]): Self = StObject.set(x, "testIssues", value.asInstanceOf[js.Any])
    
    inline def setTestIssuesUndefined: Self = StObject.set(x, "testIssues", js.undefined)
    
    inline def setTestIssuesVarargs(value: SchemaTestIssue*): Self = StObject.set(x, "testIssues", js.Array(value :_*))
    
    inline def setTestSuiteOverviews(value: js.Array[SchemaTestSuiteOverview]): Self = StObject.set(x, "testSuiteOverviews", value.asInstanceOf[js.Any])
    
    inline def setTestSuiteOverviewsUndefined: Self = StObject.set(x, "testSuiteOverviews", js.undefined)
    
    inline def setTestSuiteOverviewsVarargs(value: SchemaTestSuiteOverview*): Self = StObject.set(x, "testSuiteOverviews", js.Array(value :_*))
    
    inline def setTestTiming(value: SchemaTestTiming): Self = StObject.set(x, "testTiming", value.asInstanceOf[js.Any])
    
    inline def setTestTimingUndefined: Self = StObject.set(x, "testTiming", js.undefined)
    
    inline def setToolExecution(value: SchemaToolExecution): Self = StObject.set(x, "toolExecution", value.asInstanceOf[js.Any])
    
    inline def setToolExecutionUndefined: Self = StObject.set(x, "toolExecution", js.undefined)
  }
}
