package typings.mapboxGl

import typings.mapboxGl.mod.MapboxGeoJSONFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatures extends js.Object {
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.undefined
}

object AnonFeatures {
  @scala.inline
  def apply(features: js.Array[MapboxGeoJSONFeature] = null): AnonFeatures = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
}

