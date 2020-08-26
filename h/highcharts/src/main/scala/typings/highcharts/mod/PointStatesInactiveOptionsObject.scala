package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointStatesInactiveOptionsObject extends js.Object {
  /**
    * (Highcharts) Animation when not hovering over the node.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highcharts) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[Double] = js.native
}

object PointStatesInactiveOptionsObject {
  @scala.inline
  def apply(): PointStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesInactiveOptionsObject]
  }
  @scala.inline
  implicit class PointStatesInactiveOptionsObjectOps[Self <: PointStatesInactiveOptionsObject] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

