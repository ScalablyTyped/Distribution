package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the Street View pegman control on the map. */
@js.native
trait StreetViewControlOptions extends js.Object {
  /**
    * Position id. Used to specify the position of the control on the map. The
    * default position is embedded within the navigation (zoom and pan)
    * controls. If this position is empty or the same as that specified in the
    * zoomControlOptions or panControlOptions, the Street View control will be
    * displayed as part of the navigation controls. Otherwise, it will be
    * displayed separately.
    */
  var position: js.UndefOr[ControlPosition] = js.native
}

object StreetViewControlOptions {
  @scala.inline
  def apply(): StreetViewControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewControlOptions]
  }
  @scala.inline
  implicit class StreetViewControlOptionsOps[Self <: StreetViewControlOptions] (val x: Self) extends AnyVal {
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

