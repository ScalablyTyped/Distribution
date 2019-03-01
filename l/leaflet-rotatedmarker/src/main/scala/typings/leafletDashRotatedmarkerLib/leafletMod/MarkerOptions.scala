package typings
package leafletDashRotatedmarkerLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var rotationAngle: js.UndefOr[scala.Double] = js.undefined
   // Rotation angle, in degrees, clockwise. (Default = 0)
  var rotationOrigin: js.UndefOr[java.lang.String] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(rotationAngle: scala.Int | scala.Double = null, rotationOrigin: java.lang.String = null): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (rotationOrigin != null) __obj.updateDynamic("rotationOrigin")(rotationOrigin)
    __obj.asInstanceOf[MarkerOptions]
  }
}

