package typings.atMapboxMapboxDashSdk.servicesMatrixMod

import typings.atMapboxMapboxDashSdk.servicesDirectionsMod.DirectionsAnnotation
import typings.atMapboxMapboxDashSdk.servicesDirectionsMod.DirectionsProfile
import typings.atMapboxMapboxDashSdk.servicesMapDashMatchingMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixRequest extends js.Object {
  var annotations: js.UndefOr[DirectionsAnnotation] = js.undefined
  var destinations: js.UndefOr[js.Array[Double]] = js.undefined
  var points: js.Array[Point]
  var profile: js.UndefOr[DirectionsProfile] = js.undefined
  var sources: js.UndefOr[js.Array[Double]] = js.undefined
}

object MatrixRequest {
  @scala.inline
  def apply(
    points: js.Array[Point],
    annotations: DirectionsAnnotation = null,
    destinations: js.Array[Double] = null,
    profile: DirectionsProfile = null,
    sources: js.Array[Double] = null
  ): MatrixRequest = {
    val __obj = js.Dynamic.literal(points = points)
    if (annotations != null) __obj.updateDynamic("annotations")(annotations)
    if (destinations != null) __obj.updateDynamic("destinations")(destinations)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[MatrixRequest]
  }
}

