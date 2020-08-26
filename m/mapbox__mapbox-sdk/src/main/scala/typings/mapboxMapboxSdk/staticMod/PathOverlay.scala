package typings.mapboxMapboxSdk.staticMod

import typings.mapboxGl.mod.LngLatBoundsLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathOverlay extends js.Object {
  /**
    * An array of coordinates describing the path.
    */
  var coordinates: js.Array[LngLatBoundsLike] = js.native
  /**
    * Must be paired with strokeColor.
    */
  var fillColor: js.UndefOr[String] = js.native
  /**
    * Must be paired with strokeColor.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Must be paired with strokeColor.
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object PathOverlay {
  @scala.inline
  def apply(coordinates: js.Array[LngLatBoundsLike]): PathOverlay = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOverlay]
  }
  @scala.inline
  implicit class PathOverlayOps[Self <: PathOverlay] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: LngLatBoundsLike*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[LngLatBoundsLike]): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

