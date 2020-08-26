package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the pan control. */
@js.native
trait PanControlOptions extends js.Object {
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_LEFT.
    */
  var position: js.UndefOr[ControlPosition] = js.native
}

object PanControlOptions {
  @scala.inline
  def apply(): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanControlOptions]
  }
  @scala.inline
  implicit class PanControlOptionsOps[Self <: PanControlOptions] (val x: Self) extends AnyVal {
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
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

