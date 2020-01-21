package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * The list of requested instances.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListInstances call to fetch
    * more of the matching instances.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[SchemaInstance] = null, nextPageToken: String = null): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
}

