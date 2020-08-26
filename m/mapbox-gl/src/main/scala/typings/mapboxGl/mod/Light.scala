package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Light extends js.Object {
  var anchor: js.UndefOr[map | viewport] = js.native
  var color: js.UndefOr[String] = js.native
  var `color-transition`: js.UndefOr[Transition] = js.native
  var intensity: js.UndefOr[Double] = js.native
  var `intensity-transition`: js.UndefOr[Transition] = js.native
  var position: js.UndefOr[js.Array[Double]] = js.native
  var `position-transition`: js.UndefOr[Transition] = js.native
}

object Light {
  @scala.inline
  def apply(): Light = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Light]
  }
  @scala.inline
  implicit class LightOps[Self <: Light] (val x: Self) extends AnyVal {
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
    def setAnchor(value: map | viewport): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def `setColor-transition`(value: Transition): Self = this.set("color-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-transition`: Self = this.set("color-transition", js.undefined)
    @scala.inline
    def setIntensity(value: Double): Self = this.set("intensity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntensity: Self = this.set("intensity", js.undefined)
    @scala.inline
    def `setIntensity-transition`(value: Transition): Self = this.set("intensity-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIntensity-transition`: Self = this.set("intensity-transition", js.undefined)
    @scala.inline
    def setPositionVarargs(value: Double*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Array[Double]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def `setPosition-transition`(value: Transition): Self = this.set("position-transition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePosition-transition`: Self = this.set("position-transition", js.undefined)
  }
  
}

