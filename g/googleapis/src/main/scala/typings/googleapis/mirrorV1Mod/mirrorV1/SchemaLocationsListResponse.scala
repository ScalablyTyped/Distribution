package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Locations. This is the response from the server to GET requests
  * on the locations collection.
  */
@js.native
trait SchemaLocationsListResponse extends js.Object {
  /**
    * The list of locations.
    */
  var items: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * The type of resource. This is always mirror#locationsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaLocationsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaLocation] = null, kind: String = null): SchemaLocationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocationsListResponse]
  }
}

