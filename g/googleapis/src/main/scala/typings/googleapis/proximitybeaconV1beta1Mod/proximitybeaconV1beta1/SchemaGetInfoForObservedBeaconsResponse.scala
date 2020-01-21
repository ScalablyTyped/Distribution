package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the requested beacons, optionally including attachment
  * data.
  */
@js.native
trait SchemaGetInfoForObservedBeaconsResponse extends js.Object {
  /**
    * Public information about beacons. May be empty if the request matched no
    * beacons.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeaconInfo]] = js.native
}

object SchemaGetInfoForObservedBeaconsResponse {
  @scala.inline
  def apply(beacons: js.Array[SchemaBeaconInfo] = null): SchemaGetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    if (beacons != null) __obj.updateDynamic("beacons")(beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetInfoForObservedBeaconsResponse]
  }
}

