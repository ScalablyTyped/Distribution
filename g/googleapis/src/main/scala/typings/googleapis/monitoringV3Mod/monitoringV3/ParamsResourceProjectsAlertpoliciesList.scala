package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAlertpoliciesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If provided, this field specifies the criteria that must be met by alert
    * policies to be included in the response.For more details, see sorting and
    * filtering.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The project whose alert policies are to be listed. The format is
    * projects/[PROJECT_ID] Note that this field names the parent container in
    * which the alerting policies to be listed are stored. To retrieve a single
    * alerting policy by name, use the GetAlertPolicy operation, instead.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of fields by which to sort the result. Supports
    * the same set of field references as the filter field. Entries can be
    * prefixed with a minus sign to sort by the field in descending order.For
    * more details, see sorting and filtering.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return more results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}

