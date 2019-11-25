package typings.jsforce.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployResult extends js.Object {
  var checkOnly: Boolean
  var completedDate: String
  var createdDate: String
  var details: js.UndefOr[js.Array[js.Object]] = js.undefined
  var done: Boolean
  var errorMessage: js.UndefOr[String] = js.undefined
  var errorStatusCode: js.UndefOr[String] = js.undefined
  var id: String
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  var lastModifiedDate: String
  var numberComponentErrors: Double
  var numberComponentsDeployed: Double
  var numberComponentsTotal: Double
  var numberTestErrors: Double
  var numberTestsCompleted: Double
  var numberTestsTotal: Double
  var rollbackOnError: js.UndefOr[Boolean] = js.undefined
  var startDate: String
  var status: String
  var success: Boolean
}

object DeployResult {
  @scala.inline
  def apply(
    checkOnly: Boolean,
    completedDate: String,
    createdDate: String,
    done: Boolean,
    id: String,
    lastModifiedDate: String,
    numberComponentErrors: Double,
    numberComponentsDeployed: Double,
    numberComponentsTotal: Double,
    numberTestErrors: Double,
    numberTestsCompleted: Double,
    numberTestsTotal: Double,
    startDate: String,
    status: String,
    success: Boolean,
    details: js.Array[js.Object] = null,
    errorMessage: String = null,
    errorStatusCode: String = null,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined,
    rollbackOnError: js.UndefOr[Boolean] = js.undefined
  ): DeployResult = {
    val __obj = js.Dynamic.literal(checkOnly = checkOnly.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], numberComponentErrors = numberComponentErrors.asInstanceOf[js.Any], numberComponentsDeployed = numberComponentsDeployed.asInstanceOf[js.Any], numberComponentsTotal = numberComponentsTotal.asInstanceOf[js.Any], numberTestErrors = numberTestErrors.asInstanceOf[js.Any], numberTestsCompleted = numberTestsCompleted.asInstanceOf[js.Any], numberTestsTotal = numberTestsTotal.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (errorStatusCode != null) __obj.updateDynamic("errorStatusCode")(errorStatusCode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(rollbackOnError)) __obj.updateDynamic("rollbackOnError")(rollbackOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployResult]
  }
}

