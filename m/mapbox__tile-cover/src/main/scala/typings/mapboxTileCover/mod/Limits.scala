package typings.mapboxTileCover.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limits extends js.Object {
  var max_zoom: Double = js.native
  var min_zoom: Double = js.native
}

object Limits {
  @scala.inline
  def apply(max_zoom: Double, min_zoom: Double): Limits = {
    val __obj = js.Dynamic.literal(max_zoom = max_zoom.asInstanceOf[js.Any], min_zoom = min_zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limits]
  }
  @scala.inline
  implicit class LimitsOps[Self <: Limits] (val x: Self) extends AnyVal {
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
    def setMax_zoom(value: Double): Self = this.set("max_zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_zoom(value: Double): Self = this.set("min_zoom", value.asInstanceOf[js.Any])
  }
  
}

