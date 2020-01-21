package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistoryList extends StandardParameters {
  /**
    * Only include resource versions that were current at some point during the
    * time period specified in the date time value. The date parameter format
    * is yyyy-mm-ddThh:mm:ss[Z|(+|-)hh:mm] Clients may specify any of the
    * following: An entire year: `_at=2019` An entire month: `_at=2019-01` A
    * specific day: `_at=2019-01-20` A specific second:
    * `_at=2018-12-31T23:59:58Z`
    */
  var at: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of search results on a page.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The name of the resource to retrieve.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Used to retrieve the first, previous, next, or last page of resource
    * versions when using pagination. Value should be set to the value of the
    * `link.url` field returned in the response to the previous request, where
    * `link.relation` is "first", "previous", "next" or "last". Omit `page` if
    * no previous request has been made.
    */
  var page: js.UndefOr[String] = js.native
  /**
    * Only include resource versions that were created at or after the given
    * instant in time. The instant in time uses the format
    * YYYY-MM-DDThh:mm:ss.sss+zz:zz (for example 2015-02-07T13:28:17.239+02:00
    * or 2017-01-01T00:00:00Z). The time must be specified to the second and
    * include a time zone.
    */
  var since: js.UndefOr[String] = js.native
}

