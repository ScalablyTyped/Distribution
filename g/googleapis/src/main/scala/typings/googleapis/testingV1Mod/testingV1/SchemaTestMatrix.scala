package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of one or more TestExecutions, built by taking a product of values
  * over a pre-defined set of axes.
  */
@js.native
trait SchemaTestMatrix extends js.Object {
  /**
    * Information about the client which invoked the test.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * Required. How the host machine(s) are configured.
    */
  var environmentMatrix: js.UndefOr[SchemaEnvironmentMatrix] = js.native
  /**
    * The number of times a TestExecution should be re-attempted if one or more
    * of its test cases fail for any reason. The maximum number of reruns
    * allowed is 10.  Default is 0, which implies no reruns.
    */
  var flakyTestAttempts: js.UndefOr[Double] = js.native
  /**
    * Output only. Describes why the matrix is considered invalid. Only useful
    * for matrices in the INVALID state.
    */
  var invalidMatrixDetails: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the test matrix.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. Where the results for the matrix are written.
    */
  var resultStorage: js.UndefOr[SchemaResultStorage] = js.native
  /**
    * Output only. Indicates the current progress of the test matrix (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The list of test executions that the service creates for
    * this matrix.
    */
  var testExecutions: js.UndefOr[js.Array[SchemaTestExecution]] = js.native
  /**
    * Output only. Unique id set by the service.
    */
  var testMatrixId: js.UndefOr[String] = js.native
  /**
    * Required. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.native
  /**
    * Output only. The time this test matrix was initially created.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaTestMatrix {
  @scala.inline
  def apply(
    clientInfo: SchemaClientInfo = null,
    environmentMatrix: SchemaEnvironmentMatrix = null,
    flakyTestAttempts: js.UndefOr[Double] = js.undefined,
    invalidMatrixDetails: String = null,
    projectId: String = null,
    resultStorage: SchemaResultStorage = null,
    state: String = null,
    testExecutions: js.Array[SchemaTestExecution] = null,
    testMatrixId: String = null,
    testSpecification: SchemaTestSpecification = null,
    timestamp: String = null
  ): SchemaTestMatrix = {
    val __obj = js.Dynamic.literal()
    if (clientInfo != null) __obj.updateDynamic("clientInfo")(clientInfo.asInstanceOf[js.Any])
    if (environmentMatrix != null) __obj.updateDynamic("environmentMatrix")(environmentMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(flakyTestAttempts)) __obj.updateDynamic("flakyTestAttempts")(flakyTestAttempts.get.asInstanceOf[js.Any])
    if (invalidMatrixDetails != null) __obj.updateDynamic("invalidMatrixDetails")(invalidMatrixDetails.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (resultStorage != null) __obj.updateDynamic("resultStorage")(resultStorage.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (testExecutions != null) __obj.updateDynamic("testExecutions")(testExecutions.asInstanceOf[js.Any])
    if (testMatrixId != null) __obj.updateDynamic("testMatrixId")(testMatrixId.asInstanceOf[js.Any])
    if (testSpecification != null) __obj.updateDynamic("testSpecification")(testSpecification.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestMatrix]
  }
}

