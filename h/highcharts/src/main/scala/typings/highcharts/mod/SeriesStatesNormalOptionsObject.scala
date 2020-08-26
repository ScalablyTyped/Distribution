package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesStatesNormalOptionsObject extends js.Object {
  /**
    * (Highstock) Animation when returning to normal state after hovering.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
}

object SeriesStatesNormalOptionsObject {
  @scala.inline
  def apply(): SeriesStatesNormalOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesStatesNormalOptionsObject]
  }
  @scala.inline
  implicit class SeriesStatesNormalOptionsObjectOps[Self <: SeriesStatesNormalOptionsObject] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
  }
  
}

