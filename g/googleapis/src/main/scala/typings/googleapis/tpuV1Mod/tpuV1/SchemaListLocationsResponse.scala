package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Locations.ListLocations.
  */
@js.native
trait SchemaListLocationsResponse extends js.Object {
  /**
    * A list of locations that matches the specified filter in the request.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLocationsResponse {
  @scala.inline
  def apply(locations: js.Array[SchemaLocation] = null, nextPageToken: String = null): SchemaListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLocationsResponse]
  }
}

