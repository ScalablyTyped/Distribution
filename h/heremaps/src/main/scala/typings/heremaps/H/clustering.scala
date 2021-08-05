package typings.heremaps.H

import typings.heremaps.H.geo.Altitude
import typings.heremaps.H.geo.AltitudeContext
import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.IProjection
import typings.heremaps.H.geo.Latitude
import typings.heremaps.H.geo.Longitude
import typings.heremaps.H.geo.Point
import typings.heremaps.H.geo.Rect
import typings.heremaps.H.map.DomMarker
import typings.heremaps.H.map.Marker
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.Spatial
import typings.heremaps.H.map.provider.Invalidations
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.math.BitMask
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** clustering *****/
object clustering {
  
  /**
    * The clustering provider serves clusters and noise point representation for the map depending on the provided data set.
    * Levels for clustering as well as custom cluster representation can be set via Options.
    * @property min {number} - Minimum zoom level at which provider can cluster data
    * @property max {number} - Maximum zoom level at which provider can cluster data
    */
  @js.native
  trait Provider
    extends StObject
       with EventTarget {
    
    /**
      * This method adds a data point to the provider. Beware that this method provokes reclustering of the whole data set.
      * @param dataPoint {H.clustering.DataPoint}
      */
    def addDataPoint(dataPoint: DataPoint): Unit = js.native
    
    /**
      * This method adds a list of data points to the provider. Beware that this method provokes reclustering of the whole data set.
      * @param dataPoints {Array<H.clustering.DataPoint>}
      */
    def addDataPoints(dataPoints: js.Array[DataPoint]): Unit = js.native
    
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
    
    /**
      * Returns the accumulate invalidations of this provider's objects that have occurred.
      * @returns {H.map.provider.Invalidations} - an invalidations object
      */
    def getInvalidations(): Invalidations = js.native
    
    /**
      * This method returns current theme used for creating cluster visualization
      * @returns {H.clustering.ITheme}
      */
    def getTheme(): ITheme = js.native
    
    /**
      * To signal to this provider that a map object has been changed. The method updates the Invalidations of this provider and the given map object and triggers dispatchUpdate()
      * @param mapObject {!H.map.Object} - The map object to be invalidated
      * @param changes {H.math.BitMask} - The flags indicating the types of occurred changes
      */
    def invalidateObject(mapObject: Object, changes: BitMask): Unit = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    /**
      * This method always returns true as we don't have information about visual representation until we have the clustering result and apply the theme.
      * @returns {boolean}
      */
    def providesDomMarkers(): Boolean = js.native
    
    /**
      * This method always returns true as we don't have information about visual representation until we have the clustering result and apply the theme.
      * @returns {boolean}
      */
    def providesMarkers(): Boolean = js.native
    
    /**
      * This method always returns true as we don't have information about visual representation until we have the clustering result and apply the theme.
      * @returns {boolean}
      */
    def providesSpatials(): Boolean = js.native
    
    /**
      * This method removes a data point from the provider. Beware that this method provokes reclustering of the whole data set.
      * @param dataPoint {H.clustering.DataPoint}
      */
    def removeDataPoint(dataPoint: DataPoint): Unit = js.native
    
    /**
      * Returns all DomMarker cluster and noise point representations which intersect with the provided rectangular area.
      * @param bounds {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.DomMarker>} - a list of intersecting objects
      */
    def requestDomMarkers(bounds: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[DomMarker] = js.native
    
    /**
      * Returns all cluster and noise point markers which intersect with the provided rectangular area.
      * @param bounds {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Marker>} - a list of intersecting objects
      */
    def requestMarkers(bounds: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Marker] = js.native
    
    /**
      * Returns all polyline, polygon, circle and rect objects which represent cluster and noise points and intersect with the provided area.
      * @param bounds {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Spatial>} - a list of intersecting objects
      */
    def requestSpatials(bounds: Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
    
    /**
      * Returns the spatial objects which intersect the given tile
      * @param tile {H.map.provider.SpatialTile} - The tile for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Spatial>} - a list of intersecting objects
      */
    def requestSpatialsByTile(tile: Tile, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
    
    /**
      * This method sets new data to the provider
      * @param dataPoints {Array<H.clustering.DataPoint>}
      */
    def setDataPoints(dataPoints: js.Array[DataPoint]): Unit = js.native
    
    /**
      * This method sets new theme on the provider. Calling this method will change visuals for displayed clusters and noise points.
      * @param theme {H.clustering.ITheme}
      */
    def setTheme(theme: ITheme): Unit = js.native
  }
  object Provider {
    
    @js.native
    sealed trait Strategy extends StObject
    /**
      * Enumeration represents possible clustering strategies. FASTGRID clustering is the efficient way to cluster large sets of data points.
      * GRID clustering is slower but has greater precision due to the bigger range of epsilon values, this strategy suitable for clustering smaller data sets (up to 1000 data points)
      * on desktop devices. DYNAMICGRID clustering uses the same algorithm of clustering as the GRID, but clusters on the viewport basis is meant to be used with data sets that are subject
      * to the frequent update operations.
      */
    @JSGlobal("H.clustering.Provider.Strategy")
    @js.native
    object Strategy extends StObject {
      
      @js.native
      sealed trait DYNAMICGRID
        extends StObject
           with Strategy
      
      @js.native
      sealed trait FASTGRID
        extends StObject
           with Strategy
      
      @js.native
      sealed trait GRID
        extends StObject
           with Strategy
    }
    
    /**
      * Options which are used within cluster calculations.
      * @property eps {number=} - epsilon parameter for cluster calculation. For the FASTGRID strategy it must not exceed 256 and must take values that are power of 2.
      * For the GRID and DYNAMICGRID strategies it can take values from 10 to 127. Default is 32.
      * @property minWeight {number=} - the minimum points weight sum to form a cluster, default is 2
      * @property projection {H.geo.IProjection=} - projection to use for clustering, default is H.geo.mercator
      * @property strategy {H.clustering.Provider.Strategy=} - clustering stretegy, defaults to H.clustering.Provider.Strategy.FASTGRID
      */
    trait ClusteringOptions extends StObject {
      
      var eps: js.UndefOr[Double] = js.undefined
      
      var minWeight: js.UndefOr[Double] = js.undefined
      
      var projection: js.UndefOr[IProjection] = js.undefined
      
      var strategy: js.UndefOr[Strategy] = js.undefined
    }
    object ClusteringOptions {
      
      inline def apply(): ClusteringOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClusteringOptions]
      }
      
      extension [Self <: ClusteringOptions](x: Self) {
        
        inline def setEps(value: Double): Self = StObject.set(x, "eps", value.asInstanceOf[js.Any])
        
        inline def setEpsUndefined: Self = StObject.set(x, "eps", js.undefined)
        
        inline def setMinWeight(value: Double): Self = StObject.set(x, "minWeight", value.asInstanceOf[js.Any])
        
        inline def setMinWeightUndefined: Self = StObject.set(x, "minWeight", js.undefined)
        
        inline def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
        
        inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
        
        inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      }
    }
    
    /**
      * Options which are used to initialize the clustering Provider
      * @property min {number=} - The minimal supported zoom level, default is 0
      * @property max {number=} - The maximal supported zoom level, default is 22
      * @property clusteringOptions {H.clustering.Provider.ClusteringOptions=} - options for clustering algorithm
      * @property theme {H.clustering.ITheme=} - cluster and noise point graphical representation
      */
    trait Options extends StObject {
      
      var clusteringOptions: js.UndefOr[ClusteringOptions] = js.undefined
      
      var max: js.UndefOr[Double] = js.undefined
      
      var min: js.UndefOr[Double] = js.undefined
      
      var theme: js.UndefOr[ITheme] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setClusteringOptions(value: ClusteringOptions): Self = StObject.set(x, "clusteringOptions", value.asInstanceOf[js.Any])
        
        inline def setClusteringOptionsUndefined: Self = StObject.set(x, "clusteringOptions", js.undefined)
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        
        inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      }
    }
  }
  
  /**
    * This class represents the input data structure for data points to be clustered.
    * @property lat {H.geo.Latitude} - The latitude coordinate of the data point's position
    * @property lng {H.geo.Longitude} - The longitude coordinate of the data point's position
    * @property wt {number} - The weight of the data point
    * @property data {*} - Data associated with this data point
    */
  trait DataPoint
    extends StObject
       with IPoint {
    
    @JSName("alt")
    var alt_DataPoint: Altitude
    
    @JSName("ctx")
    var ctx_DataPoint: AltitudeContext
    
    var data: js.Any
    
    var wt: Double
  }
  object DataPoint {
    
    inline def apply(alt: Altitude, ctx: AltitudeContext, data: js.Any, lat: Latitude, lng: Longitude, wt: Double): DataPoint = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], wt = wt.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPoint]
    }
    
    extension [Self <: DataPoint](x: Self) {
      
      inline def setAlt(value: Altitude): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: AltitudeContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setWt(value: Double): Self = StObject.set(x, "wt", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This interface describes a cluster of data points, which fulfill the clustering specification (i.e. data points are within the epsilon and there are enough points to form a cluster).
    */
  trait ICluster extends StObject {
    
    /**
      * Invokes the specified callback for each data point which is part of this cluster, even indirectly.
      * @param callback {function(H.clustering.INoisePoint)} - The callback gets the currently traversed noise point as argument.
      */
    def forEachDataPoint(callback: js.Function1[/* noise */ INoisePoint, Unit]): Unit
    
    /**
      * Invokes the specified callback for each "entry" of the cluster.
      * That "entry" can be either a cluster which implements H.clustering.ICluster interface or a noise point which implements H.clustering.INoisePoint interface.
      * @param callback {function(H.clustering.IResult)} - The callback gets the currently traversed entry as an argument, which is cluster or noise point.
      */
    def forEachEntry(callback: js.Function1[/* result */ IResult, Unit]): Unit
    
    /**
      * Returns the bounding rectangle of this cluster.
      * @returns {H.geo.Rect}
      */
    def getBounds(): Rect
    
    /**
      * Returns the maximum zoom level where this cluster doesn't fall apart into sub clusters and/or noise poinst
      * @returns {number}
      */
    def getMaxZoom(): Double
    
    /**
      * Returns the minimum zoom level where this item is not part of another cluster
      * @returns {number}
      */
    def getMinZoom(): Double
    
    /**
      * Returns the geographical position of this cluster result.
      * @returns {H.geo.Point}
      */
    def getPosition(): Point
    
    /**
      * Returns the weight of this cluster result.
      * @returns {number}
      */
    def getWeight(): Double
    
    /**
      * To indicate whether this cluster result is a cluster or noise point
      * @returns {boolean}
      */
    def isCluster(): Boolean
  }
  object ICluster {
    
    inline def apply(
      forEachDataPoint: js.Function1[/* noise */ INoisePoint, Unit] => Unit,
      forEachEntry: js.Function1[/* result */ IResult, Unit] => Unit,
      getBounds: () => Rect,
      getMaxZoom: () => Double,
      getMinZoom: () => Double,
      getPosition: () => Point,
      getWeight: () => Double,
      isCluster: () => Boolean
    ): ICluster = {
      val __obj = js.Dynamic.literal(forEachDataPoint = js.Any.fromFunction1(forEachDataPoint), forEachEntry = js.Any.fromFunction1(forEachEntry), getBounds = js.Any.fromFunction0(getBounds), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
      __obj.asInstanceOf[ICluster]
    }
    
    extension [Self <: ICluster](x: Self) {
      
      inline def setForEachDataPoint(value: js.Function1[/* noise */ INoisePoint, Unit] => Unit): Self = StObject.set(x, "forEachDataPoint", js.Any.fromFunction1(value))
      
      inline def setForEachEntry(value: js.Function1[/* result */ IResult, Unit] => Unit): Self = StObject.set(x, "forEachEntry", js.Any.fromFunction1(value))
      
      inline def setGetBounds(value: () => Rect): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
      
      inline def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
      
      inline def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
      
      inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      inline def setGetWeight(value: () => Double): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      inline def setIsCluster(value: () => Boolean): Self = StObject.set(x, "isCluster", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * This interface represents a data point which does not belong to a cluster.
    */
  trait INoisePoint extends StObject {
    
    /**
      * This method returns data which coresponds to this noise point.
      * @returns {*}
      */
    def getData(): js.Any
    
    /**
      * Returns the minimum zoom level where this item is not part of another cluster
      * @returns {number}
      */
    def getMinZoom(): Double
    
    /**
      * Returns the geographical position of this cluster result.
      * @returns {H.geo.Point}
      */
    def getPosition(): Point
    
    /**
      * Returns the weight of this cluster result.
      * @returns {number}
      */
    def getWeight(): Double
    
    /**
      * To indicate whether this cluster result is a cluster or noise point
      * @returns {boolean}
      */
    def isCluster(): Boolean
  }
  object INoisePoint {
    
    inline def apply(
      getData: () => js.Any,
      getMinZoom: () => Double,
      getPosition: () => Point,
      getWeight: () => Double,
      isCluster: () => Boolean
    ): INoisePoint = {
      val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
      __obj.asInstanceOf[INoisePoint]
    }
    
    extension [Self <: INoisePoint](x: Self) {
      
      inline def setGetData(value: () => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
      
      inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      inline def setGetWeight(value: () => Double): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      inline def setIsCluster(value: () => Boolean): Self = StObject.set(x, "isCluster", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * This interface represents the result item of a clustering operation.
    */
  trait IResult extends StObject {
    
    /**
      * Returns the minimum zoom level where this item is not part of another cluster
      * @returns {number}
      */
    def getMinZoom(): Double
    
    /**
      * Returns the geographical position of this cluster result.
      * @returns {H.geo.Point}
      */
    def getPosition(): Point
    
    /**
      * Returns the weight of this cluster result.
      * @returns {number}
      */
    def getWeight(): Double
    
    /**
      * To indicate whether this cluster result is a cluster or noise point
      * @returns {boolean}
      */
    def isCluster(): Boolean
  }
  object IResult {
    
    inline def apply(
      getMinZoom: () => Double,
      getPosition: () => Point,
      getWeight: () => Double,
      isCluster: () => Boolean
    ): IResult = {
      val __obj = js.Dynamic.literal(getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
      __obj.asInstanceOf[IResult]
    }
    
    extension [Self <: IResult](x: Self) {
      
      inline def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
      
      inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      inline def setGetWeight(value: () => Double): Self = StObject.set(x, "getWeight", js.Any.fromFunction0(value))
      
      inline def setIsCluster(value: () => Boolean): Self = StObject.set(x, "isCluster", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface which specifies the methods a theme must implement.
    */
  trait ITheme extends StObject {
    
    /**
      * Function returns a cluster presentation as a map object.
      * @param cluster {H.clustering.ICluster}
      * @returns {H.map.Object}
      */
    def getClusterPresentation(cluster: ICluster): Object
    
    /**
      * Function returns noise point presentation as a map object
      * @param noisePoint {H.clustering.INoisePoint}
      * @returns {H.map.Object}
      */
    def getNoisePresentation(noisePoint: INoisePoint): Object
  }
  object ITheme {
    
    inline def apply(getClusterPresentation: ICluster => Object, getNoisePresentation: INoisePoint => Object): ITheme = {
      val __obj = js.Dynamic.literal(getClusterPresentation = js.Any.fromFunction1(getClusterPresentation), getNoisePresentation = js.Any.fromFunction1(getNoisePresentation))
      __obj.asInstanceOf[ITheme]
    }
    
    extension [Self <: ITheme](x: Self) {
      
      inline def setGetClusterPresentation(value: ICluster => Object): Self = StObject.set(x, "getClusterPresentation", js.Any.fromFunction1(value))
      
      inline def setGetNoisePresentation(value: INoisePoint => Object): Self = StObject.set(x, "getNoisePresentation", js.Any.fromFunction1(value))
    }
  }
}
