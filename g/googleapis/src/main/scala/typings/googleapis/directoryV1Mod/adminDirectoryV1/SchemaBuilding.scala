package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Building object in Directory API.
  */
@js.native
trait SchemaBuilding extends js.Object {
  /**
    * The postal address of the building. See PostalAddress for details. Note
    * that only a single address line and region code are required.
    */
  var address: js.UndefOr[SchemaBuildingAddress] = js.native
  /**
    * Unique identifier for the building. The maximum length is 100 characters.
    */
  var buildingId: js.UndefOr[String] = js.native
  /**
    * The building name as seen by users in Calendar. Must be unique for the
    * customer. For example, &quot;NYC-CHEL&quot;. The maximum length is 100
    * characters.
    */
  var buildingName: js.UndefOr[String] = js.native
  /**
    * The geographic coordinates of the center of the building, expressed as
    * latitude and longitude in decimal degrees.
    */
  var coordinates: js.UndefOr[SchemaBuildingCoordinates] = js.native
  /**
    * A brief description of the building. For example, &quot;Chelsea
    * Market&quot;.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  /**
    * The display names for all floors in this building. The floors are
    * expected to be sorted in ascending order, from lowest floor to highest
    * floor. For example, [&quot;B2&quot;, &quot;B1&quot;, &quot;L&quot;,
    * &quot;1&quot;, &quot;2&quot;, &quot;2M&quot;, &quot;3&quot;,
    * &quot;PH&quot;] Must contain at least one entry.
    */
  var floorNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBuilding {
  @scala.inline
  def apply(
    address: SchemaBuildingAddress = null,
    buildingId: String = null,
    buildingName: String = null,
    coordinates: SchemaBuildingCoordinates = null,
    description: String = null,
    etags: String = null,
    floorNames: js.Array[String] = null,
    kind: String = null
  ): SchemaBuilding = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId.asInstanceOf[js.Any])
    if (buildingName != null) __obj.updateDynamic("buildingName")(buildingName.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etags != null) __obj.updateDynamic("etags")(etags.asInstanceOf[js.Any])
    if (floorNames != null) __obj.updateDynamic("floorNames")(floorNames.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuilding]
  }
}

