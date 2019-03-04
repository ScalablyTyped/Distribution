package typings
package leafletDashRotatedmarkerLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  /*
    * Sets the rotation angle value.
    */
  def setRotationAngle(newAngle: scala.Double): this.type
  /**
    * Sets the rotation origin value.
    */
  def setRotationOrigin(newOrigin: java.lang.String): this.type
}

object Marker {
  @scala.inline
  def apply(
    setRotationAngle: js.Function1[scala.Double, Marker],
    setRotationOrigin: js.Function1[java.lang.String, Marker]
  ): Marker = {
    val __obj = js.Dynamic.literal(setRotationAngle = setRotationAngle, setRotationOrigin = setRotationOrigin)
  
    __obj.asInstanceOf[Marker]
  }
}

