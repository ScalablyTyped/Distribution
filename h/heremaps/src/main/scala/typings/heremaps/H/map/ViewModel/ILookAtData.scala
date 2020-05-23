package typings.heremaps.H.map.ViewModel

import typings.heremaps.H.geo.AbstractGeometry
import typings.heremaps.H.geo.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://developer.here.com/documentation/maps/api_reference/H.map.ViewModel.html#.ILookAtData}
  */
trait ILookAtData extends js.Object {
  var bounds: js.UndefOr[AbstractGeometry] = js.undefined
  var heading: js.UndefOr[Double] = js.undefined
  var incline: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[IPoint] = js.undefined
  var tilt: js.UndefOr[Double] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object ILookAtData {
  @scala.inline
  def apply(
    bounds: AbstractGeometry = null,
    heading: js.UndefOr[Double] = js.undefined,
    incline: js.UndefOr[Double] = js.undefined,
    position: IPoint = null,
    tilt: js.UndefOr[Double] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): ILookAtData = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incline)) __obj.updateDynamic("incline")(incline.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(tilt)) __obj.updateDynamic("tilt")(tilt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookAtData]
  }
}

