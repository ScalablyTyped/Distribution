package typings
package heremapsLib.HNs.clusteringNs

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
@JSGlobal("H.clustering.DataPoint")
@js.native
class DataPoint protected ()
  extends heremapsLib.HNs.geoNs.IPoint {
  /**
               * Constructor
               * @param lat {H.geo.Latitude} - The latitude coordinate of the data point's position
               * @param lng {H.geo.Longitude} - The longitude coordinate of the data point's position
               * @param opt_weight {number=} - The weight of the data point as a positive number > 0. If not specified it , default is 1.
               * @param opt_data {*=} - Optional data, which will be associated with this DataPoint
               */
  def this(lat: heremapsLib.HNs.geoNs.Latitude, lng: heremapsLib.HNs.geoNs.Longitude) = this()
  /**
               * Constructor
               * @param lat {H.geo.Latitude} - The latitude coordinate of the data point's position
               * @param lng {H.geo.Longitude} - The longitude coordinate of the data point's position
               * @param opt_weight {number=} - The weight of the data point as a positive number > 0. If not specified it , default is 1.
               * @param opt_data {*=} - Optional data, which will be associated with this DataPoint
               */
  def this(lat: heremapsLib.HNs.geoNs.Latitude, lng: heremapsLib.HNs.geoNs.Longitude, opt_weight: scala.Double) = this()
  /**
               * Constructor
               * @param lat {H.geo.Latitude} - The latitude coordinate of the data point's position
               * @param lng {H.geo.Longitude} - The longitude coordinate of the data point's position
               * @param opt_weight {number=} - The weight of the data point as a positive number > 0. If not specified it , default is 1.
               * @param opt_data {*=} - Optional data, which will be associated with this DataPoint
               */
  def this(lat: heremapsLib.HNs.geoNs.Latitude, lng: heremapsLib.HNs.geoNs.Longitude, opt_weight: scala.Double, opt_data: js.Any) = this()
  @JSName("alt")
  var alt_DataPoint: heremapsLib.HNs.geoNs.Altitude = js.native
  @JSName("ctx")
  var ctx_DataPoint: heremapsLib.HNs.geoNs.AltitudeContext = js.native
  var data: js.Any = js.native
  /* CompleteClass */
  override var lat: heremapsLib.HNs.geoNs.Latitude = js.native
  /* CompleteClass */
  override var lng: heremapsLib.HNs.geoNs.Longitude = js.native
  var wt: scala.Double = js.native
}

