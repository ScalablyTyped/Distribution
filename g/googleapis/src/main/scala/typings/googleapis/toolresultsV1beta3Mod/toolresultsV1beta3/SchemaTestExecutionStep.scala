package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A step that represents running tests.  It accepts ant-junit xml files which
  * will be parsed into structured test results by the service. Xml file paths
  * are updated in order to append more files, however they can&#39;t be
  * deleted.  Users can also add test results manually by using the test_result
  * field.
  */
@js.native
trait SchemaTestExecutionStep extends js.Object {
  /**
    * Issues observed during the test execution.  For example, if the mobile
    * app under test crashed during the test, the error message and the stack
    * trace content can be recorded here to assist debugging.  - In response:
    * present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[SchemaTestIssue]] = js.native
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML
    * log by server, or uploaded directly by user. This references should only
    * be called when test suites are fully parsed or uploaded.  The maximum
    * allowed number of test suite overviews per step is 1000.  - In response:
    * always set - In create request: optional - In update request: never (use
    * publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[SchemaTestSuiteOverview]] = js.native
  /**
    * The timing break down of the test execution.  - In response: present if
    * set by create or update - In create/update request: optional
    */
  var testTiming: js.UndefOr[SchemaTestTiming] = js.native
  /**
    * Represents the execution of the test runner.  The exit code of this tool
    * will be used to determine if the test passed.  - In response: always set
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.native
}

object SchemaTestExecutionStep {
  @scala.inline
  def apply(
    testIssues: js.Array[SchemaTestIssue] = null,
    testSuiteOverviews: js.Array[SchemaTestSuiteOverview] = null,
    testTiming: SchemaTestTiming = null,
    toolExecution: SchemaToolExecution = null
  ): SchemaTestExecutionStep = {
    val __obj = js.Dynamic.literal()
    if (testIssues != null) __obj.updateDynamic("testIssues")(testIssues.asInstanceOf[js.Any])
    if (testSuiteOverviews != null) __obj.updateDynamic("testSuiteOverviews")(testSuiteOverviews.asInstanceOf[js.Any])
    if (testTiming != null) __obj.updateDynamic("testTiming")(testTiming.asInstanceOf[js.Any])
    if (toolExecution != null) __obj.updateDynamic("toolExecution")(toolExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestExecutionStep]
  }
}

