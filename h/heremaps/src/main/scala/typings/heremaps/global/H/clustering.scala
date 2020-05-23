package typings.heremaps.global.H

import typings.heremaps.H.clustering.Provider.Options
import typings.heremaps.H.geo.Altitude
import typings.heremaps.H.geo.AltitudeContext
import typings.heremaps.H.geo.Latitude
import typings.heremaps.H.geo.Longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** clustering *****/
@JSGlobal("H.clustering")
@js.native
object clustering extends js.Object {
  /**
    * This class represents the input data structure for data points to be clustered.
    * @property lat {H.geo.Latitude} - The latitude coordinate of the data point's position
    * @property lng {H.geo.Longitude} - The longitude coordinate of the data point's position
    * @property wt {number} - The weight of the data point
    * @property data {*} - Data associated with this data point
    */
  @js.native
  class DataPoint protected ()
    extends typings.heremaps.H.clustering.DataPoint {
    /**
      * Constructor
      * @param lat {H.geo.Latitude} - The latitude coordinate of the data point's position
      * @param lng {H.geo.Longitude} - The longitude coordinate of the data point's position
      * @param opt_weight {number=} - The weight of the data point as a positive number > 0. If not specified it , default is 1.
      * @param opt_data {*=} - Optional data, which will be associated with this DataPoint
      */
    def this(lat: Latitude, lng: Longitude) = this()
    def this(lat: Latitude, lng: Longitude, opt_weight: Double) = this()
    def this(lat: Latitude, lng: Longitude, opt_weight: Double, opt_data: js.Any) = this()
    /* CompleteClass */
    @JSName("alt")
    override var alt_DataPoint: Altitude = js.native
    /* CompleteClass */
    @JSName("ctx")
    override var ctx_DataPoint: AltitudeContext = js.native
    /* CompleteClass */
    override var data: js.Any = js.native
    /* CompleteClass */
    override var lat: Latitude = js.native
    /* CompleteClass */
    override var lng: Longitude = js.native
    /* CompleteClass */
    override var wt: Double = js.native
  }
  
  /**
    * The clustering provider serves clusters and noise point representation for the map depending on the provided data set.
    * Levels for clustering as well as custom cluster representation can be set via Options.
    * @property min {number} - Minimum zoom level at which provider can cluster data
    * @property max {number} - Maximum zoom level at which provider can cluster data
    */
  @js.native
  class Provider protected ()
    extends typings.heremaps.H.clustering.Provider {
    /**
      * Constructor
      * @param dataPoints {Array<H.clustering.DataPoint>}
      * @param opt_options {H.clustering.Provider.Options=}
      */
    def this(dataPoints: js.Array[typings.heremaps.H.clustering.DataPoint]) = this()
    def this(dataPoints: js.Array[typings.heremaps.H.clustering.DataPoint], opt_options: Options) = this()
  }
  
  @js.native
  object Provider extends js.Object {
    /**
      * Enumeration represents possible clustering strategies. FASTGRID clustering is the efficient way to cluster large sets of data points.
      * GRID clustering is slower but has greater precision due to the bigger range of epsilon values, this strategy suitable for clustering smaller data sets (up to 1000 data points)
      * on desktop devices. DYNAMICGRID clustering uses the same algorithm of clustering as the GRID, but clusters on the viewport basis is meant to be used with data sets that are subject
      * to the frequent update operations.
      */
    @js.native
    object Strategy extends js.Object {
      /* 2 */ val DYNAMICGRID: typings.heremaps.H.clustering.Provider.Strategy.DYNAMICGRID with Double = js.native
      /* 0 */ val FASTGRID: typings.heremaps.H.clustering.Provider.Strategy.FASTGRID with Double = js.native
      /* 1 */ val GRID: typings.heremaps.H.clustering.Provider.Strategy.GRID with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.clustering.Provider.Strategy with Double] = js.native
    }
    
  }
  
}

