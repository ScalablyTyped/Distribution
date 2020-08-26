package typings.leafletRotatedmarker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Marker extends js.Object {
  /*
    * Sets the rotation angle value.
    */
  def setRotationAngle(newAngle: Double): this.type = js.native
  /**
    * Sets the rotation origin value.
    */
  def setRotationOrigin(newOrigin: String): this.type = js.native
}

object Marker {
  @scala.inline
  def apply(setRotationAngle: Double => Marker, setRotationOrigin: String => Marker): Marker = {
    val __obj = js.Dynamic.literal(setRotationAngle = js.Any.fromFunction1(setRotationAngle), setRotationOrigin = js.Any.fromFunction1(setRotationOrigin))
    __obj.asInstanceOf[Marker]
  }
  @scala.inline
  implicit class MarkerOps[Self <: Marker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetRotationAngle(value: Double => Marker): Self = this.set("setRotationAngle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRotationOrigin(value: String => Marker): Self = this.set("setRotationOrigin", js.Any.fromFunction1(value))
  }
  
}

