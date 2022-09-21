package typings.mapboxMapboxGlGeocoder

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.Point
import typings.mapboxGl.mod.FitBoundsOptions
import typings.mapboxGl.mod.FlyToOptions
import typings.mapboxGl.mod.IControl
import typings.mapboxGl.mod.Map
import typings.mapboxGl.mod.Marker
import typings.mapboxMapboxGlGeocoder.anon.Typeofmapboxgl
import typings.mapboxMapboxGlGeocoder.mapboxMapboxGlGeocoderStrings.`mapboxDotplaces-permanent`
import typings.mapboxMapboxGlGeocoder.mapboxMapboxGlGeocoderStrings.mapboxDotplaces
import typings.std.Event
import typings.std.HTMLElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/mapbox-gl-geocoder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MapboxGeocoder {
    def this(options: GeocoderOptions) = this()
    
    /* CompleteClass */
    override def onAdd(map: Map): HTMLElement = js.native
    
    /* CompleteClass */
    override def onRemove(map: Map): Unit = js.native
  }
  
  type Bbox = js.Tuple4[Double, Double, Double, Double]
  
  trait GeocoderOptions extends StObject {
    
    var accessToken: String
    
    /**
      * a bounding box argument: this is a bounding box given as an array in the format [minX, minY, maxX, maxY].
      * Search results will be limited to the bounding box.
      */
    var bbox: js.UndefOr[Bbox] = js.undefined
    
    /**
      * If `true`, the geocoder control will clear it's contents and blur when user presses the escape key. (optional, default false)
      */
    var clearAndBlurOnEsc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the geocoder control will clear its value when the input blurs. (optional, default false)
      */
    var clearOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the geocoder control will collapse until hovered or in focus. (optional, default false)
      */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a comma separated list of country codes to limit results to specified country or countries.
      */
    var countries: js.UndefOr[String] = js.undefined
    
    /**
      * Allow Mapbox to collect anonymous usage statistics from the plugin. (optional, default true)
      */
    var enableEventLogging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function accepting the query string and current features list which performs geocoding to supplement results from the Mapbox Geocoding API.
      * Expected to return a Promise which resolves to an Array of GeoJSON Features in the [Carmen GeoJSON](https://github.com/mapbox/carmen/blob/master/carmen-geojson.md) format.
      */
    var externalGeocoder: js.UndefOr[
        js.Function2[
          /* searchInput */ String, 
          /* features */ FeatureCollection[Geometry, GeoJsonProperties], 
          js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]
        ]
      ] = js.undefined
    
    /**
      * A function which accepts a Feature in the [Carmen GeoJSON](https://github.com/mapbox/carmen/blob/master/carmen-geojson.md)
      * format to filter out results from the Geocoding API response before they are included in the suggestions list.
      * Return `true` to keep the item, `false` otherwise.
      */
    var filter: js.UndefOr[js.Function1[/* feature */ Result, Boolean]] = js.undefined
    
    /**
      * If `false`, animating the map to a selected result is disabled. If `true`, animating the map will use the default animation parameters.
      * If an object, it will be passed as `options` to the map [`flyTo`](https://docs.mapbox.com/mapbox-gl-js/api/#map#flyto)
      * or [`fitBounds`](https://docs.mapbox.com/mapbox-gl-js/api/#map#fitbounds) method providing control over the animation of the transition. (optional, default true)
      */
    var flyTo: js.UndefOr[Boolean | FlyToOptions | FitBoundsOptions] = js.undefined
    
    /**
      * A function that specifies how the selected result should be rendered in the search bar.
      * This function should accept a single [Carmen GeoJSON](https://github.com/mapbox/carmen/blob/master/carmen-geojson.md) object as input and return a string.
      * HTML tags in the output string will not be rendered. Defaults to `(item) => item.place_name`.
      */
    var getItemValue: js.UndefOr[js.Function1[/* feature */ Result, String]] = js.undefined
    
    /**
      * Specify the language to use for response text and query result weighting.
      * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more IETF subtags for country or script.
      * More than one value can also be specified, separated by commas. Defaults to the browser's language settings.
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum number of results to show. (optional, default 5)
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * A function accepting the query string which performs local geocoding to supplement results from the Mapbox Geocoding API.
      * Expected to return an Array of GeoJSON Features in the [Carmen GeoJSON](https://github.com/mapbox/carmen/blob/master/carmen-geojson.md) format.
      */
    var localGeocoder: js.UndefOr[js.Function1[/* query */ String, js.Array[Result]]] = js.undefined
    
    /**
      * If `true`, indicates that the `localGeocoder` results should be the only ones returned to the user.
      * If `false`, indicates that the `localGeocoder` results should be combined with those from the Mapbox API with the `localGeocoder` results ranked higher. (optional, default false)
      */
    var localGeocoderOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A [mapbox-gl](https://github.com/mapbox/mapbox-gl-js) instance to use when creating [Markers](https://docs.mapbox.com/mapbox-gl-js/api/#marker). Required if `options.marker` is `true`.
      */
    var mapboxgl: js.UndefOr[Typeofmapboxgl] = js.undefined
    
    /**
      * If `true`, a [Marker](https://docs.mapbox.com/mapbox-gl-js/api/#marker) will be added to the map at the location of the user-selected result using a default set of Marker options.
      * If the value is an object, the marker will be constructed using these options. If `false`, no marker will be added to the map.
      * Requires that `options.mapboxgl` also be set. (optional, default true)
      */
    var marker: js.UndefOr[Boolean | Marker] = js.undefined
    
    /**
      * Minimum number of characters to enter before results are shown. (optional, default 2)
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      *  A string specifying the geocoding [endpoint](https://docs.mapbox.com/api/search/#endpoints) to query.
      * Options are `mapbox.places` and `mapbox.places`. The `mapbox.places-permanent` mode requires an enterprise license for permanent geocodes. (optional, default "mapbox.places")
      */
    var mode: js.UndefOr[mapboxDotplaces | `mapboxDotplaces-permanent`] = js.undefined
    
    /**
      * Use to set a custom API origin. (optional, default "https://api.mapbox.com"
      */
    var origin: js.UndefOr[String] = js.undefined
    
    /**
      * Override the default placeholder attribute value. (optional, default "Search")
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * a proximity argument: this is a geographical point given as an object with latitude and longitude properties. Search results closer to this point will be given higher priority.
      */
    var proximity: js.UndefOr[LngLatLiteral] = js.undefined
    
    /**
      * A function that specifies how the results should be rendered in the dropdown menu.
      * This function should accepts a single [Carmen GeoJSON](https://github.com/mapbox/carmen/blob/master/carmen-geojson.md)
      * object as input and return a string. Any HTML in the returned string will be rendered.
      */
    var render: js.UndefOr[js.Function1[/* feature */ Result, String]] = js.undefined
    
    /**
      * If `true`, enable reverse geocoding mode. In reverse geocoding, search input is expected to be coordinates in the form `lat, lon`, with suggestions being the reverse geocodes.
      * (optional, default false)
      */
    var reverseGeocode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the geocoder proximity will automatically update based on the map view. (optional, default true)
      */
    var trackProximity: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a comma seperated list of types that filter results to match those specified. See https://www.mapbox.com/developers/api/geocoding/#filter-type for available types.
      */
    var types: js.UndefOr[String] = js.undefined
    
    /**
      * On geocoded result what zoom level should the map animate to when a bbox isn't found in the response. If a bbox is found the map will fit to the bbox. (optional, default 16)
      */
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object GeocoderOptions {
    
    inline def apply(accessToken: String): GeocoderOptions = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocoderOptions]
    }
    
    extension [Self <: GeocoderOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: Bbox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setClearAndBlurOnEsc(value: Boolean): Self = StObject.set(x, "clearAndBlurOnEsc", value.asInstanceOf[js.Any])
      
      inline def setClearAndBlurOnEscUndefined: Self = StObject.set(x, "clearAndBlurOnEsc", js.undefined)
      
      inline def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      inline def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setCountries(value: String): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setEnableEventLogging(value: Boolean): Self = StObject.set(x, "enableEventLogging", value.asInstanceOf[js.Any])
      
      inline def setEnableEventLoggingUndefined: Self = StObject.set(x, "enableEventLogging", js.undefined)
      
      inline def setExternalGeocoder(
        value: (/* searchInput */ String, /* features */ FeatureCollection[Geometry, GeoJsonProperties]) => js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]
      ): Self = StObject.set(x, "externalGeocoder", js.Any.fromFunction2(value))
      
      inline def setExternalGeocoderUndefined: Self = StObject.set(x, "externalGeocoder", js.undefined)
      
      inline def setFilter(value: /* feature */ Result => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlyTo(value: Boolean | FlyToOptions | FitBoundsOptions): Self = StObject.set(x, "flyTo", value.asInstanceOf[js.Any])
      
      inline def setFlyToUndefined: Self = StObject.set(x, "flyTo", js.undefined)
      
      inline def setGetItemValue(value: /* feature */ Result => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction1(value))
      
      inline def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLocalGeocoder(value: /* query */ String => js.Array[Result]): Self = StObject.set(x, "localGeocoder", js.Any.fromFunction1(value))
      
      inline def setLocalGeocoderOnly(value: Boolean): Self = StObject.set(x, "localGeocoderOnly", value.asInstanceOf[js.Any])
      
      inline def setLocalGeocoderOnlyUndefined: Self = StObject.set(x, "localGeocoderOnly", js.undefined)
      
      inline def setLocalGeocoderUndefined: Self = StObject.set(x, "localGeocoder", js.undefined)
      
      inline def setMapboxgl(value: Typeofmapboxgl): Self = StObject.set(x, "mapboxgl", value.asInstanceOf[js.Any])
      
      inline def setMapboxglUndefined: Self = StObject.set(x, "mapboxgl", js.undefined)
      
      inline def setMarker(value: Boolean | Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMode(value: mapboxDotplaces | `mapboxDotplaces-permanent`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setProximity(value: LngLatLiteral): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
      
      inline def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
      
      inline def setRender(value: /* feature */ Result => String): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setReverseGeocode(value: Boolean): Self = StObject.set(x, "reverseGeocode", value.asInstanceOf[js.Any])
      
      inline def setReverseGeocodeUndefined: Self = StObject.set(x, "reverseGeocode", js.undefined)
      
      inline def setTrackProximity(value: Boolean): Self = StObject.set(x, "trackProximity", value.asInstanceOf[js.Any])
      
      inline def setTrackProximityUndefined: Self = StObject.set(x, "trackProximity", js.undefined)
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait LngLatLiteral extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object LngLatLiteral {
    
    inline def apply(latitude: Double, longitude: Double): LngLatLiteral = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[LngLatLiteral]
    }
    
    extension [Self <: LngLatLiteral](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapboxGeocoder
    extends StObject
       with IControl {
    
    def addTo(container: String): this.type = js.native
    def addTo(container: Map): this.type = js.native
    def addTo(container: HTMLElement): this.type = js.native
    
    /**
      * Clear and then focus the input.
      * [ev] the event that triggered the clear, if available
      */
    def clear(): Unit = js.native
    def clear(ev: Event): Unit = js.native
    
    def createIcon(name: String, path: Any): SVGSVGElement = js.native
    
    def getBbox(): Bbox = js.native
    
    def getCountries(): String = js.native
    
    def getFilter(): js.Function1[/* feature */ Result, Boolean] = js.native
    
    /**
      * Get the parameters used to fly to the selected response, if any
      */
    def getFlyTo(): Boolean | FlyToOptions | FitBoundsOptions = js.native
    
    /**
      * Get the language to use in UI elements and when making search requests
      */
    def getLanguage(): String = js.native
    
    def getLimit(): Double = js.native
    
    def getMinLength(): Double = js.native
    
    def getOrigin(): String = js.native
    
    /**
      * Get the value of the placeholder string
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Get the geocoder proximity
      */
    def getProximity(): LngLatLiteral = js.native
    
    /**
      * Get the function used to render the results dropdown
      */
    def getRenderFunction(): js.Function1[/* feature */ Result, String] = js.native
    
    def getTypes(): String = js.native
    
    /**
      * Get the zoom level the map will move to when there is no bounding box on the selected result
      */
    def getZoom(): Double = js.native
    
    def off(`type`: String, fn: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Subscribe to events that happen within the plugin.
      * type name of event. Available events and the data passed into their respective event objects are:
      *
      * - __clear__ `Emitted when the input is cleared`
      * - __loading__ `{ query } Emitted when the geocoder is looking up a query`
      * - __results__ `{ results } Fired when the geocoder returns a response`
      * - __result__ `{ result } Fired when input is set`
      * - __error__ `{ error } Error as string`
      */
    def on(`type`: String, fn: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def onRemove(): this.type = js.native
    
    /**
      * Set & query the input
      */
    def query(searchInput: String): this.type = js.native
    
    def setBbox(bbox: Bbox): this.type = js.native
    
    def setCountries(countries: String): this.type = js.native
    
    def setFilter(filter: js.Function1[/* feature */ Result, Boolean]): this.type = js.native
    
    /**
      * Set the flyTo options
      * If false, animating the map to a selected result is disabled. If true, animating the map will use the default animation parameters.
      * If an object, it will be passed as `options` to the map [`flyTo`](https://docs.mapbox.com/mapbox-gl-js/api/#map#flyto) or [`fitBounds`](https://docs.mapbox.com/mapbox-gl-js/api/#map#fitbounds)
      * method providing control over the animation of the transition.
      */
    def setFlyTo(flyTo: Boolean): this.type = js.native
    def setFlyTo(flyTo: FitBoundsOptions): this.type = js.native
    def setFlyTo(flyTo: FlyToOptions): this.type = js.native
    
    /**
      * Set input
      * searchInput location name or other search input
      */
    def setInput(searchInput: String): this.type = js.native
    
    /**
      * Get the language to use in UI elements and when making search requests
      *
      * Look first at the explicitly set options otherwise use the browser's language settings
      * language Specify the language to use for response text and query result weighting.
      * Options are IETF language tags comprised of a mandatory ISO 639-1 language code and optionally one or more IETF subtags for country or script.
      * More than one value can also be specified, separated by commas.
      */
    def setLanguage(language: String): this.type = js.native
    
    def setLimit(limit: Double): this.type = js.native
    
    def setMinLength(minLength: Double): this.type = js.native
    
    def setOrigin(origin: String): this.type = js.native
    
    /**
      * Set the value of the input element's placeholder
      * placeholder the text to use as the input element's placeholder
      */
    def setPlaceholder(placeholder: String): this.type = js.native
    
    /**
      * Set proximity The new `options.proximity` value. This is a geographical point given as an object with `latitude` and `longitude` properties.
      */
    def setProximity(proximity: LngLatLiteral): this.type = js.native
    
    /**
      * Set the render function used in the results dropdown
      * The function to use as a render function. This function accepts a single [Carmen GeoJSON](https://github.com/mapbox/carmen/blob/master/carmen-geojson.md) object as input and returns a string.
      */
    def setRenderFunction(fn: js.Function1[/* feature */ Result, String]): this.type = js.native
    
    def setTypes(types: String): this.type = js.native
    
    /**
      * Set the zoom level that the map should animate to when a `bbox` isn't found in the response. If a `bbox` is found the map will fit to the `bbox`.
      */
    def setZoom(zoom: Double): this.type = js.native
  }
  
  trait Result
    extends StObject
       with Feature[Point, GeoJsonProperties] {
    
    var address: String
    
    @JSName("bbox")
    var bbox_Result: js.Tuple4[Double, Double, Double, Double]
    
    var center: js.Array[Double]
    
    var context: js.Array[Any]
    
    var place_name: String
    
    var place_type: js.Array[String]
    
    var relevance: Double
    
    var text: String
  }
  object Result {
    
    inline def apply(
      address: String,
      bbox: js.Tuple4[Double, Double, Double, Double],
      center: js.Array[Double],
      context: js.Array[Any],
      geometry: Point,
      place_name: String,
      place_type: js.Array[String],
      relevance: Double,
      text: String
    ): Result = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], place_name = place_name.asInstanceOf[js.Any], place_type = place_type.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], properties = null)
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setContext(value: js.Array[Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextVarargs(value: Any*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setPlace_name(value: String): Self = StObject.set(x, "place_name", value.asInstanceOf[js.Any])
      
      inline def setPlace_type(value: js.Array[String]): Self = StObject.set(x, "place_type", value.asInstanceOf[js.Any])
      
      inline def setPlace_typeVarargs(value: String*): Self = StObject.set(x, "place_type", js.Array(value*))
      
      inline def setRelevance(value: Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results
    extends StObject
       with FeatureCollection[Point, GeoJsonProperties] {
    
    var attribution: String
    
    var query: js.Array[String]
  }
  object Results {
    
    inline def apply(
      attribution: String,
      features: js.Array[Feature[Point, GeoJsonProperties]],
      query: js.Array[String]
    ): Results = {
      val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.Array[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryVarargs(value: String*): Self = StObject.set(x, "query", js.Array(value*))
    }
  }
}
