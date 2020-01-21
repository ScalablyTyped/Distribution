package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Rectangle determined by min and max `LatLng` pairs.
  */
@js.native
trait SchemaLatLongRect extends js.Object {
  /**
    * Max lat/long pair.
    */
  var maxLatLng: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Min lat/long pair.
    */
  var minLatLng: js.UndefOr[SchemaLatLng] = js.native
}

object SchemaLatLongRect {
  @scala.inline
  def apply(maxLatLng: SchemaLatLng = null, minLatLng: SchemaLatLng = null): SchemaLatLongRect = {
    val __obj = js.Dynamic.literal()
    if (maxLatLng != null) __obj.updateDynamic("maxLatLng")(maxLatLng.asInstanceOf[js.Any])
    if (minLatLng != null) __obj.updateDynamic("minLatLng")(minLatLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLatLongRect]
  }
}

