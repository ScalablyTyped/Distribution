package typings.materialMenuSurface.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANCHORTOMENUSURFACEWIDTHRATIO extends js.Object {
  var ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
  var MARGIN_TO_EDGE: Double = js.native
  var TRANSITION_CLOSE_DURATION: Double = js.native
  var TRANSITION_OPEN_DURATION: Double = js.native
}

object ANCHORTOMENUSURFACEWIDTHRATIO {
  @scala.inline
  def apply(
    ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double,
    MARGIN_TO_EDGE: Double,
    TRANSITION_CLOSE_DURATION: Double,
    TRANSITION_OPEN_DURATION: Double
  ): ANCHORTOMENUSURFACEWIDTHRATIO = {
    val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO = ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO.asInstanceOf[js.Any], MARGIN_TO_EDGE = MARGIN_TO_EDGE.asInstanceOf[js.Any], TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION.asInstanceOf[js.Any], TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANCHORTOMENUSURFACEWIDTHRATIO]
  }
  @scala.inline
  implicit class ANCHORTOMENUSURFACEWIDTHRATIOOps[Self <: ANCHORTOMENUSURFACEWIDTHRATIO] (val x: Self) extends AnyVal {
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
    def setANCHOR_TO_MENU_SURFACE_WIDTH_RATIO(value: Double): Self = this.set("ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setMARGIN_TO_EDGE(value: Double): Self = this.set("MARGIN_TO_EDGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRANSITION_CLOSE_DURATION(value: Double): Self = this.set("TRANSITION_CLOSE_DURATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setTRANSITION_OPEN_DURATION(value: Double): Self = this.set("TRANSITION_OPEN_DURATION", value.asInstanceOf[js.Any])
  }
  
}

