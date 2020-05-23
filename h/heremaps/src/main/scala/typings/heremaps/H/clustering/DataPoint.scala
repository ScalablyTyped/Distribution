package typings.heremaps.H.clustering

import typings.heremaps.H.geo.Altitude
import typings.heremaps.H.geo.AltitudeContext
import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Latitude
import typings.heremaps.H.geo.Longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the input data structure for data points to be clustered.
  * @property lat {H.geo.Latitude} - The latitude coordinate of the data point's position
  * @property lng {H.geo.Longitude} - The longitude coordinate of the data point's position
  * @property wt {number} - The weight of the data point
  * @property data {*} - Data associated with this data point
  */
trait DataPoint extends IPoint {
  @JSName("alt")
  var alt_DataPoint: Altitude
  @JSName("ctx")
  var ctx_DataPoint: AltitudeContext
  var data: js.Any
  var wt: Double
}

object DataPoint {
  @scala.inline
  def apply(alt: Altitude, ctx: AltitudeContext, data: js.Any, lat: Latitude, lng: Longitude, wt: Double): DataPoint = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], wt = wt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
}

