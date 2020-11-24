package typings.heremaps.H.clustering

import typings.heremaps.H.geo.Altitude
import typings.heremaps.H.geo.AltitudeContext
import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.Latitude
import typings.heremaps.H.geo.Longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the input data structure for data points to be clustered.
  * @property lat {H.geo.Latitude} - The latitude coordinate of the data point's position
  * @property lng {H.geo.Longitude} - The longitude coordinate of the data point's position
  * @property wt {number} - The weight of the data point
  * @property data {*} - Data associated with this data point
  */
@js.native
trait DataPoint extends IPoint {
  
  @JSName("alt")
  var alt_DataPoint: Altitude = js.native
  
  @JSName("ctx")
  var ctx_DataPoint: AltitudeContext = js.native
  
  var data: js.Any = js.native
  
  var wt: Double = js.native
}
object DataPoint {
  
  @scala.inline
  def apply(alt: Altitude, ctx: AltitudeContext, data: js.Any, lat: Latitude, lng: Longitude, wt: Double): DataPoint = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], wt = wt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
  
  @scala.inline
  implicit class DataPointOps[Self <: DataPoint] (val x: Self) extends AnyVal {
    
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
    def setAlt(value: Altitude): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: AltitudeContext): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWt(value: Double): Self = this.set("wt", value.asInstanceOf[js.Any])
  }
}
