package typings.leafletRotatedmarker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  /*
    * Sets the rotation angle value.
    */
  def setRotationAngle(newAngle: Double): this.type
  /**
    * Sets the rotation origin value.
    */
  def setRotationOrigin(newOrigin: String): this.type
}

object Marker {
  @scala.inline
  def apply(setRotationAngle: Double => Marker, setRotationOrigin: String => Marker): Marker = {
    val __obj = js.Dynamic.literal(setRotationAngle = js.Any.fromFunction1(setRotationAngle), setRotationOrigin = js.Any.fromFunction1(setRotationOrigin))
    __obj.asInstanceOf[Marker]
  }
}

