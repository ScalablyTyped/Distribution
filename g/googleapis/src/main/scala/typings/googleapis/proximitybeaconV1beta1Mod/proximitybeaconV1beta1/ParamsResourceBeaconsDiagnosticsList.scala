package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsDiagnosticsList extends StandardParameters {
  /**
    * Requests only beacons that have the given alert. For example, to find
    * beacons that have low batteries use `alert_filter=LOW_BATTERY`.
    */
  var alertFilter: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Beacon that the diagnostics are for.
    */
  var beaconName: js.UndefOr[String] = js.native
  /**
    * Specifies the maximum number of results to return. Defaults to 10.
    * Maximum 1000. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Requests results that occur after the `page_token`, obtained from the
    * response to a previous request. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Requests only diagnostic records for the given project id. If not set,
    * then the project making the request will be used for looking up
    * diagnostic records. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
}

