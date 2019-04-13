package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Features extends js.Object {
  var features: js.UndefOr[js.Array[mapboxDashGlLib.mapboxDashGlMod.MapboxGeoJSONFeature]] = js.undefined
}

object Anon_Features {
  @scala.inline
  def apply(features: js.Array[mapboxDashGlLib.mapboxDashGlMod.MapboxGeoJSONFeature] = null): Anon_Features = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    __obj.asInstanceOf[Anon_Features]
  }
}

