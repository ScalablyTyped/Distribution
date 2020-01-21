package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBeaconsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of records to return for this request, up to a
    * server-defined upper limit.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token obtained from a previous request to list beacons.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The project id to list beacons under. If not present then the project
    * credential that made the request is used as the project. Optional.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Filter query string that supports the following field filters:  *
    * **description:`"<string>"`**   For example: **description:"Room 3"**
    * Returns beacons whose description matches tokens in the string "Room 3"
    * (not necessarily that exact string).   The string must be double-quoted.
    * * **status:`<enum>`**   For example: **status:active**   Returns beacons
    * whose status matches the given value. Values must be   one of the
    * Beacon.Status enum values (case insensitive). Accepts   multiple filters
    * which will be combined with OR logic. * **stability:`<enum>`**   For
    * example: **stability:mobile**   Returns beacons whose expected stability
    * matches the given value.   Values must be one of the Beacon.Stability
    * enum values (case   insensitive). Accepts multiple filters which will be
    * combined with   OR logic. * **place\_id:`"<string>"`**   For example:
    * **place\_id:"ChIJVSZzVR8FdkgRXGmmm6SslKw="**   Returns beacons explicitly
    * registered at the given place, expressed as   a Place ID obtained from
    * [Google Places API](/places/place-id). Does not   match places inside the
    * given place. Does not consider the beacon's   actual location (which may
    * be different from its registered place).   Accepts multiple filters that
    * will be combined with OR logic. The place   ID must be double-quoted. *
    * **registration\_time`[<|>|<=|>=]<integer>`**   For example:
    * **registration\_time>=1433116800**   Returns beacons whose registration
    * time matches the given filter.   Supports the operators: <, >, <=, and
    * >=. Timestamp must be expressed as   an integer number of seconds since
    * midnight January 1, 1970 UTC. Accepts   at most two filters that will be
    * combined with AND logic, to support   "between" semantics. If more than
    * two are supplied, the latter ones are   ignored. * **lat:`<double>
    * lng:<double> radius:<integer>`**   For example: **lat:51.1232343
    * lng:-1.093852 radius:1000**   Returns beacons whose registered location
    * is within the given circle.   When any of these fields are given, all are
    * required. Latitude and   longitude must be decimal degrees between -90.0
    * and 90.0 and between   -180.0 and 180.0 respectively. Radius must be an
    * integer number of   meters between 10 and 1,000,000 (1000 km). *
    * **property:`"<string>=<string>"`**   For example:
    * **property:"battery-type=CR2032"**   Returns beacons which have a
    * property of the given name and value.   Supports multiple filters which
    * will be combined with OR logic.   The entire name=value string must be
    * double-quoted as one string. * **attachment\_type:`"<string>"`**   For
    * example: **attachment_type:"my-namespace/my-type"**   Returns beacons
    * having at least one attachment of the given namespaced   type. Supports
    * "any within this namespace" via the partial wildcard   syntax:
    * "my-namespace/x". Supports multiple filters which will be   combined with
    * OR logic. The string must be double-quoted. *
    * **indoor\_level:`"<string>"`**   For example: **indoor\_level:"1"**
    * Returns beacons which are located on the given indoor level. Accepts
    * multiple filters that will be combined with OR logic.  Multiple filters
    * on the same field are combined with OR logic (except registration_time
    * which is combined with AND logic). Multiple filters on different fields
    * are combined with AND logic. Filters should be separated by spaces.  As
    * with any HTTP query string parameter, the whole filter expression must be
    * URL-encoded.  Example REST request: `GET
    * /v1beta1/beacons?q=status:active%20lat:51.123%20lng:-1.095%20radius:1000`
    */
  var q: js.UndefOr[String] = js.native
}

