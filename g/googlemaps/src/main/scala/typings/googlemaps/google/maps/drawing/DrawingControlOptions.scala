package typings.googlemaps.google.maps.drawing

import typings.googlemaps.google.maps.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingControlOptions extends js.Object {
  var drawingModes: js.UndefOr[js.Array[OverlayType]] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
}

object DrawingControlOptions {
  @scala.inline
  def apply(): DrawingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingControlOptions]
  }
  @scala.inline
  implicit class DrawingControlOptionsOps[Self <: DrawingControlOptions] (val x: Self) extends AnyVal {
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
    def setDrawingModesVarargs(value: OverlayType*): Self = this.set("drawingModes", js.Array(value :_*))
    @scala.inline
    def setDrawingModes(value: js.Array[OverlayType]): Self = this.set("drawingModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingModes: Self = this.set("drawingModes", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

