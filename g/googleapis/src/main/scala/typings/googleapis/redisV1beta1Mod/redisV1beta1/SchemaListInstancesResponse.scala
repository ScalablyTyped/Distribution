package typings.googleapis.redisV1beta1Mod.redisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * A list of Redis instances in the project in the specified location, or
    * across all locations.  If the `location_id` in the parent field of the
    * request is &quot;-&quot;, all regions available to the project are
    * queried, and the results aggregated. If in such an aggregated query a
    * location is unavailable, a dummy Redis entry is included in the response
    * with the &quot;name&quot; field set to a value of the form
    * projects/{project_id}/locations/{location_id}/instances/- and the
    * &quot;status&quot; field set to ERROR and &quot;status_message&quot;
    * field set to &quot;location not available for ListInstances&quot;.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(
    instances: js.Array[SchemaInstance] = null,
    nextPageToken: String = null,
    unreachable: js.Array[String] = null
  ): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (unreachable != null) __obj.updateDynamic("unreachable")(unreachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
}

