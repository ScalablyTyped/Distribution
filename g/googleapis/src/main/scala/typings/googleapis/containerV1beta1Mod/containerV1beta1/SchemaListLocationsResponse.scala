package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListLocationsResponse returns the list of all GKE locations and their
  * recommendation state.
  */
@js.native
trait SchemaListLocationsResponse extends js.Object {
  /**
    * A full list of GKE locations.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * Only return ListLocationsResponse that occur after the page_token. This
    * value should be populated from the ListLocationsResponse.next_page_token
    * if that response token was set (which happens when listing more Locations
    * than fit in a single ListLocationsResponse).
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

