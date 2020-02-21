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
    heading: Int | Double = null,
    incline: Int | Double = null,
    position: IPoint = null,
    tilt: Int | Double = null,
    zoom: Int | Double = null
  ): ILookAtData = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (incline != null) __obj.updateDynamic("incline")(incline.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookAtData]
  }
}

