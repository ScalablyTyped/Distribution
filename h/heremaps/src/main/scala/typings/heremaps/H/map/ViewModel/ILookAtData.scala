package typings.heremaps.H.map.ViewModel

import typings.heremaps.H.geo.AbstractGeometry
import typings.heremaps.H.geo.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#.ILookAtData}
  */
@js.native
trait ILookAtData extends js.Object {
  var bounds: js.UndefOr[AbstractGeometry] = js.native
  var heading: js.UndefOr[Double] = js.native
  var incline: js.UndefOr[Double] = js.native
  var position: js.UndefOr[IPoint] = js.native
  var tilt: js.UndefOr[Double] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object ILookAtData {
  @scala.inline
  def apply(): ILookAtData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILookAtData]
  }
  @scala.inline
  implicit class ILookAtDataOps[Self <: ILookAtData] (val x: Self) extends AnyVal {
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
    def setBounds(value: AbstractGeometry): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setIncline(value: Double): Self = this.set("incline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncline: Self = this.set("incline", js.undefined)
    @scala.inline
    def setPosition(value: IPoint): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

