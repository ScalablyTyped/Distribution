package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1LatLongRect extends js.Object {
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[SchemaLatLng] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1LatLongRect {
  @scala.inline
  def apply(maxLatLng: SchemaLatLng = null, minLatLng: SchemaLatLng = null): SchemaGoogleCloudVisionV1p2beta1LatLongRect = {
    val __obj = js.Dynamic.literal()
    if (maxLatLng != null) __obj.updateDynamic("maxLatLng")(maxLatLng.asInstanceOf[js.Any])
    if (minLatLng != null) __obj.updateDynamic("minLatLng")(minLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1LatLongRect]
  }
}

