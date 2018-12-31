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

