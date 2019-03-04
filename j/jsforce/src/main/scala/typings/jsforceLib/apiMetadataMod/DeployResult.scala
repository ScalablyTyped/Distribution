package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployResult extends js.Object {
  var checkOnly: scala.Boolean
  var completedDate: java.lang.String
  var createdDate: java.lang.String
  var details: js.UndefOr[js.Array[js.Object]] = js.undefined
  var done: scala.Boolean
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var errorStatusCode: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var lastModifiedDate: java.lang.String
  var numberComponentErrors: scala.Double
  var numberComponentsDeployed: scala.Double
  var numberComponentsTotal: scala.Double
  var numberTestErrors: scala.Double
  var numberTestsCompleted: scala.Double
  var numberTestsTotal: scala.Double
  var rollbackOnError: js.UndefOr[scala.Boolean] = js.undefined
  var startDate: java.lang.String
  var status: java.lang.String
  var success: scala.Boolean
}

object DeployResult {
  @scala.inline
  def apply(
    checkOnly: scala.Boolean,
    completedDate: java.lang.String,
    createdDate: java.lang.String,
    done: scala.Boolean,
    id: java.lang.String,
    lastModifiedDate: java.lang.String,
    numberComponentErrors: scala.Double,
    numberComponentsDeployed: scala.Double,
    numberComponentsTotal: scala.Double,
    numberTestErrors: scala.Double,
    numberTestsCompleted: scala.Double,
    numberTestsTotal: scala.Double,
    startDate: java.lang.String,
    status: java.lang.String,
    success: scala.Boolean,
    details: js.Array[js.Object] = null,
    errorMessage: java.lang.String = null,
    errorStatusCode: java.lang.String = null,
    ignoreWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    rollbackOnError: js.UndefOr[scala.Boolean] = js.undefined
  ): DeployResult = {
    val __obj = js.Dynamic.literal(checkOnly = checkOnly, completedDate = completedDate, createdDate = createdDate, done = done, id = id, lastModifiedDate = lastModifiedDate, numberComponentErrors = numberComponentErrors, numberComponentsDeployed = numberComponentsDeployed, numberComponentsTotal = numberComponentsTotal, numberTestErrors = numberTestErrors, numberTestsCompleted = numberTestsCompleted, numberTestsTotal = numberTestsTotal, startDate = startDate, status = status, success = success)
    if (details != null) __obj.updateDynamic("details")(details)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (errorStatusCode != null) __obj.updateDynamic("errorStatusCode")(errorStatusCode)
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings)
    if (!js.isUndefined(rollbackOnError)) __obj.updateDynamic("rollbackOnError")(rollbackOnError)
    __obj.asInstanceOf[DeployResult]
  }
}

