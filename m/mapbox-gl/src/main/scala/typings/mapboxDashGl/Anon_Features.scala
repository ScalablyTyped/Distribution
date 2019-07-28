package typings.mapboxDashGl

import typings.mapboxDashGl.mapboxDashGlMod.MapboxGeoJSONFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Features extends js.Object {
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.undefined
}

object Anon_Features {
  @scala.inline
  def apply(features: js.Array[MapboxGeoJSONFeature] = null): Anon_Features = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    __obj.asInstanceOf[Anon_Features]
  }
}

