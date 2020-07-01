package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for coordinates of a building in Directory API.
  */
@js.native
trait SchemaBuildingCoordinates extends js.Object {
  /**
    * Latitude in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
}

object SchemaBuildingCoordinates {
  @scala.inline
  def apply(latitude: js.UndefOr[Double] = js.undefined, longitude: js.UndefOr[Double] = js.undefined): SchemaBuildingCoordinates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildingCoordinates]
  }
}

