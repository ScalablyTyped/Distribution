package typings.leafletDashRotatedmarker.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var rotationAngle: js.UndefOr[Double] = js.undefined
   // Rotation angle, in degrees, clockwise. (Default = 0)
  var rotationOrigin: js.UndefOr[String] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(rotationAngle: Int | Double = null, rotationOrigin: String = null): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (rotationOrigin != null) __obj.updateDynamic("rotationOrigin")(rotationOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

