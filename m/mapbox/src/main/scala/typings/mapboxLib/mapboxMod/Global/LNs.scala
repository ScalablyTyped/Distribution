package typings
package mapboxLib.mapboxMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("L")
@js.native
object LNs extends js.Object {
  @JSName("mapbox")
  @js.native
  object mapboxNs extends js.Object {
    //////////////////////////////////////////////////////////////////////
    //////////////////////////////// CONTROLS ////////////////////////////
    //////////////////////////////////////////////////////////////////////
    trait ControlOptions
      extends leafletLib.leafletMod.ControlOptions {
      var sanitizer: js.UndefOr[js.Function1[/* template */ java.lang.String, java.lang.String]] = js.undefined
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped any */ trait FeatureLayer extends js.Object {
      /**
      			 * Gets the filter function for this data layer.
      			 */
      def getFilter(): FilterFunction
      /**
      			 * Get the contents of this layer as GeoJSON data.
      			 */
      def getGeoJSON(): js.Any
      /**
      			 * Load marker GeoJSON data from a map with the given id on Mapbox.
      			 */
      def loadID(id: java.lang.String): js.Any
      /**
      			 * Load GeoJSON data for this layer from the URL given by url.
      			 */
      def loadURL(url: java.lang.String): js.Any
      /**
      			 * Sets the filter function for this data layer.
      			 */
      def setFilter(filter: FilterFunction): js.Any
      /**
      			 * Set the contents of a markers layer: run the provided features through
      			 * the filter function and then through the factory function to create
      			 * elements for the map. If the layer already has features, they are
      			 * replaced with the new features. An empty array will clear the
      			 * layer of all features.
      			 */
      def setGeoJSON(geojson: js.Any): FeatureLayer
    }
    
    trait FeatureLayerOptions extends js.Object {
      var filter: js.UndefOr[FilterFunction] = js.undefined
      var sanitizer: js.UndefOr[js.Function1[/* template */ java.lang.String, java.lang.String]] = js.undefined
    }
    
    trait Geocoder extends js.Object {
      def getURL(): java.lang.String
      /**
      			 * Queries the geocoder with a query string, and returns its result, if any.
      			 */
      def query(queryString: java.lang.String, callback: js.Function): js.Any
      def queryURL(url: java.lang.String): java.lang.String
      /**
      			 * Queries the geocoder with a location, and returns its result, if any.
      			 */
      def reverseQuery(location: js.Any, callback: js.Function): js.Any
      def setID(id: java.lang.String): js.Any
      def setTileJSON(tilejson: js.Any): js.Any
      def setURL(url: java.lang.String): js.Any
    }
    
    trait GeocoderControl extends js.Object {
      def getURL(): java.lang.String
      /**
      			 * Bind a listener to an event emitted by the geocoder control. Supported additional events are
      			 */
      def on(event: java.lang.String, callback: js.Function): js.Any
      def onAdd(map: Map): js.Any
      /**
      			 * Set the map id used for geocoding.
      			 */
      def setID(id: java.lang.String): js.Any
      /**
      			 * Set the TileJSON used for geocoding.
      			 */
      def setTileJSON(tilejson: js.Any): js.Any
      /**
      			 * Set the url used for geocoding.
      			 */
      def setURL(url: java.lang.String): js.Any
    }
    
    trait GeocoderControlOptions
      extends leafletLib.leafletMod.ControlOptions {
      var keepOpen: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped any */ trait GridControl extends js.Object {
      /**
      			 * If a tooltip is currently shown by the gridControl, hide and close it.
      			 */
      def hide(): js.Any
      def onAdd(map: Map): js.Any
      def onRemove(map: Map): js.Any
      /**
      			 * Change the Mustache template used to transform the UTFGrid data in the map's interactivity into HTML for display.
      			 */
      def setTemplate(template: java.lang.String): js.Any
    }
    
    trait GridControlOptions extends ControlOptions {
      var follow: js.UndefOr[scala.Boolean] = js.undefined
      var location: js.UndefOr[scala.Boolean] = js.undefined
      var pinnable: js.UndefOr[scala.Boolean] = js.undefined
      var template: js.UndefOr[java.lang.String] = js.undefined
      var touchTeaser: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    @js.native
    trait GridLayer extends js.Object {
      def active(): scala.Boolean = js.native
      def addTo(map: Map): js.Any = js.native
      /**
      			 * Load data for a given latitude, longitude point on the map, and call the callback function with that data, if any.
      			 */
      def getData(
        latlng: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify LatLng */ js.Any,
        callback: js.Function
      ): js.Any = js.native
      /**
      			 * Returns this layer's TileJSON object which determines its tile source, zoom bounds and other metadata.
      			 */
      def getTileJSON(): js.Any = js.native
      /**
      			 * Bind an event handler to a given event on this L.mapbox.gridLayer instance. GridLayers expose a number of useful events that give you access to UTFGrid data as the user interacts with the map.
      			 */
      def on(event: java.lang.String, handler: js.Function): js.Any = js.native
      def on(event: java.lang.String, handler: js.Function, context: js.Any): js.Any = js.native
      def onAdd(map: Map): js.Any = js.native
      def onRemove(): js.Any = js.native
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped any */ trait InfoControl extends js.Object {
      /**
      			 * Adds an info string to infoControl.
      			 */
      def addInfo(info: java.lang.String): js.Any
      def onAdd(map: Map): js.Any
      def onRemove(map: Map): js.Any
      /**
      			 * Removes an info string from infoControl
      			 */
      def removeInfo(info: java.lang.String): js.Any
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped any */ trait LegendControl extends js.Object {
      /**
      			 * Adds a legend to the legendControl.
      			 */
      def addLegend(legend: java.lang.String): js.Any
      def onAdd(map: Map): js.Any
      /**
      			 * Removes a legend from the legendControl.
      			 */
      def removeLegend(legend: java.lang.String): js.Any
    }
    
    @js.native
    trait Map
      extends leafletLib.leafletMod.Map {
      var featureLayer: FeatureLayer = js.native
      var gridControl: GridControl = js.native
      var gridLayer: GridLayer = js.native
      var infoControl: InfoControl = js.native
      var legendControl: LegendControl = js.native
      var shareControl: ShareControl = js.native
      var tileLayer: TileLayer = js.native
      def getTileJSON(): js.Any = js.native
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped any */ trait MapOptions extends js.Object {
      var featureLayer: js.UndefOr[FeatureLayerOptions] = js.undefined
      var gridLayer: js.UndefOr[js.Any] = js.undefined
      var infoControl: js.UndefOr[ControlOptions] = js.undefined
      var legendControl: js.UndefOr[ControlOptions] = js.undefined
      var shareControl: js.UndefOr[ShareControlOptions] = js.undefined
      var tileLayer: js.UndefOr[TileLayerOptions] = js.undefined
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped any */ trait ShareControl extends js.Object {
      def onAdd(map: Map): js.Any
    }
    
    trait ShareControlOptions extends ControlOptions {
      var url: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait StyleLayerOptions
      extends leafletLib.leafletMod.TileLayerOptions {
      var sanitizer: js.UndefOr[js.Function1[/* template */ java.lang.String, java.lang.String]] = js.undefined
    }
    
    @js.native
    trait TileLayer
      extends leafletLib.leafletMod.TileLayer {
      /**
      			 * Returns this layer's TileJSON object which determines its tile source, zoom bounds and other metadata.
      			 */
      def getTileJSON(): js.Any = js.native
      /**
      			 * Set the image format of tiles in this layer. You can use lower-quality tiles in order to load maps faster
      			 */
      def setFormat(format: java.lang.String): TileLayer = js.native
    }
    
    trait TileLayerOptions
      extends leafletLib.leafletMod.TileLayerOptions {
      var retinaVersion: js.UndefOr[java.lang.String] = js.undefined
    }
    
    //////////////////////////////////////////////////////////////////////
    ///////////////////////////// MAP OBJECT /////////////////////////////
    //////////////////////////////////////////////////////////////////////
    // Map
    //////////////////////////////////////////////////////////////////////
    var accessToken: java.lang.String = js.native
    // FeatureLayer
    //////////////////////////////////////////////////////////////////////
    /**
    		 * L.mapbox.featureLayer provides an easy way to integrate GeoJSON from Mapbox and elsewhere into your map.
    		 */
    def featureLayer(): FeatureLayer = js.native
    def featureLayer(idOrGeoJson: js.Any): FeatureLayer = js.native
    def featureLayer(idOrGeoJson: js.Any, options: FeatureLayerOptions): FeatureLayer = js.native
    //////////////////////////////////////////////////////////////////////
    ////////////////////////////// GEOCODING /////////////////////////////
    //////////////////////////////////////////////////////////////////////
    // Geocoder
    //////////////////////////////////////////////////////////////////////
    /**
    		 * A low-level interface to geocoding, useful for more complex uses and reverse-geocoding.
    		 */
    def geocoder(id: java.lang.String): Geocoder = js.native
    // GeocoderControl
    //////////////////////////////////////////////////////////////////////
    /**
    		 * Adds geocoder functionality as well as a UI element to a map. This uses the Mapbox Geocoding API.
    		 */
    def geocoderControl(id: java.lang.String): GeocoderControl = js.native
    def geocoderControl(id: java.lang.String, options: GeocoderControlOptions): GeocoderControl = js.native
    // GridControl
    //////////////////////////////////////////////////////////////////////
    /**
    		 * Interaction is what we call interactive parts of maps that are created with
    		 * the powerful tooltips & regions system in TileMill. Under the hood, it's powered by the open UTFGrid specification.
    		 */
    def gridControl(layer: java.lang.String): GridControl = js.native
    def gridControl(layer: java.lang.String, options: GridControlOptions): GridControl = js.native
    // GridLayer
    //////////////////////////////////////////////////////////////////////
    /**
    		 * An L.mapbox.gridLayer loads UTFGrid tiles of interactivity into your map, which you can easily access with L.mapbox.gridControl.
    		 */
    def gridLayer(idOrTileJson: js.Any): GridLayer = js.native
    // InfoControl
    //////////////////////////////////////////////////////////////////////
    /**
    		 * A map control that shows a toggleable info container. If set, attribution is auto-detected from active layers and added to the info container.
    		 */
    def infoControl(): InfoControl = js.native
    def infoControl(options: ControlOptions): InfoControl = js.native
    // LegendControl
    //////////////////////////////////////////////////////////////////////
    /**
    		 * A map control that shows legends added to maps in Mapbox.
    		 * Legends are auto-detected from active layers.
    		 */
    def legendControl(): LegendControl = js.native
    def legendControl(options: ControlOptions): LegendControl = js.native
    /**
    		 * Create and automatically configure a map with layers, markers, and interactivity.
    		 */
    def map(element: java.lang.String, idOrTileJson: js.Any): Map = js.native
    def map(element: java.lang.String, idOrTileJson: js.Any, options: MapOptions): Map = js.native
    def map(element: stdLib.Element, idOrTileJson: js.Any): Map = js.native
    def map(element: stdLib.Element, idOrTileJson: js.Any, options: MapOptions): Map = js.native
    //////////////////////////////////////////////////////////////////////
    /////////////////////////////// UTILITY //////////////////////////////
    //////////////////////////////////////////////////////////////////////
    /**
    		 * A HTML sanitization function, with the same effect as the default value of the sanitizer option of L.mapbox.featureLayer, L.mapbox.gridControl, and L.mapbox.legendControl.
    		 */
    def sanitize(text: java.lang.String): java.lang.String = js.native
    // ShareControl
    //////////////////////////////////////////////////////////////////////
    /**
    		 * Adds a "Share" button to the map, which can be used to share the map to Twitter or Facebook, or generate HTML for a map embed.
    		 */
    def shareControl(id: java.lang.String): ShareControl = js.native
    def shareControl(id: java.lang.String, options: ShareControlOptions): ShareControl = js.native
    // StyleLayer
    //////////////////////////////////////////////////////////////////////
    /**
      * L.mapbox.styleLayer provides a way to integrate styles created with Mapbox Studio into your map.
      */
    def styleLayer(url: java.lang.String): StyleLayer = js.native
    def styleLayer(url: java.lang.String, options: StyleLayerOptions): StyleLayer = js.native
    /**
    		 * A mustache template rendering function, as used by the templating feature provided by L.mapbox.gridControl.
    		 */
    def template(template: java.lang.String): java.lang.String = js.native
    def template(template: java.lang.String, data: js.Any): java.lang.String = js.native
    //////////////////////////////////////////////////////////////////////
    /////////////////////////////// LAYERS ///////////////////////////////
    //////////////////////////////////////////////////////////////////////
    // TileLayer
    //////////////////////////////////////////////////////////////////////
    /**
    		 * You can add a tiled layer to your map with L.mapbox.tileLayer(), a simple interface to layers from Mapbox and elsewhere.
    		 */
    def tileLayer(idOrTileJson: java.lang.String): TileLayer = js.native
    def tileLayer(idOrTileJson: java.lang.String, options: TileLayerOptions): TileLayer = js.native
    //////////////////////////////////////////////////////////////////////
    ///////////////////////////// CONFIGURATION //////////////////////////
    //////////////////////////////////////////////////////////////////////
    @JSName("config")
    @js.native
    object configNs extends js.Object {
      val FORCE_HTTPS: scala.Boolean = js.native
      val HTTPS_URLS: js.Array[java.lang.String] = js.native
      val HTTP_URLS: js.Array[java.lang.String] = js.native
    }
    
    //////////////////////////////////////////////////////////////////////
    ////////////////////////////// MARKERS ///////////////////////////////
    //////////////////////////////////////////////////////////////////////
    @JSName("marker")
    @js.native
    object markerNs extends js.Object {
      /**
      			 * A core icon generator used in L.mapbox.marker.style
      			 */
      def icon(feature: js.Any): js.Any = js.native
      /**
      			 * An icon generator for use in conjunction with pointToLayer to generate markers from the Mapbox Markers API and support the simplestyle-spec for features.
      			 */
      def style(feature: js.Any, latlng: js.Any): js.Any = js.native
    }
    
    //////////////////////////////////////////////////////////////////////
    ////////////////////////////// SIMPLESTYLE ///////////////////////////
    //////////////////////////////////////////////////////////////////////
    @JSName("simplestyle")
    @js.native
    object simplestyleNs extends js.Object {
      /**
      			 * Given a GeoJSON Feature with optional simplestyle-spec properties, return an options object formatted to be used as Leaflet Path options.
      			 */
      def style(feature: js.Any): js.Any = js.native
    }
    
    type FilterFunction = js.Function1[/* feature */ js.Any, scala.Boolean]
    type StyleLayer = leafletLib.leafletMod.TileLayer
  }
  
}

