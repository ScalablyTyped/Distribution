package typings.heremaps.H.service

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.service.EnterpriseRoutingService.Options
import typings.heremaps.H.service.Platform.DefaultLayersOptions
import typings.heremaps.H.service.metaInfo.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Platform class represents central class from which all other service stubs are created. It also contains the shared settings to be passed to the individual service stubs, for example
  * the root URL of the platform, application credentials, etc.
  */
@js.native
trait Platform extends StObject {
  
  /**
    * Method attempts to configure object that implements H.service.IConfigurable
    * @param configurable {H.service.IConfigurable}
    * @returns {H.service.IConfigurable}
    */
  def configure(configurable: IConfigurable): IConfigurable = js.native
  
  /**
    * This method creates a pre-configured set of HERE tile layers for convenient use with the map.
    * @param opt_tileSize {(H.service.Platform.DefaultLayersOptions | number)=} - When a number – optional tile size to be queried from the HERE Map Tile API, default is 256.
    * If this parameter is a number, it indicates the tile size to be queried from the HERE Map Tile API (the default value is 256); if this parameter is an object, it represents
    * configuration options for the layer and all the remaining parameters (below) should be omitted
    * @param opt_ppi {number=} - optional 'ppi' parameter to use when querying tiles, default is not specified
    * @param opt_lang {string=} - optional primary language parameter, default is not specified
    * @param opt_secondaryLang {string=} - optional secondary language parameter, default is not specified
    * @param opt_style {string=} - optional 'style' parameter to use when querying map tiles, default is not specified
    * @param opt_pois {(string | boolean)=} - indicates if pois are displayed on the map. Pass true to indicate that all pois should be visible. Alternatively you can specify mask for the
    * POI Categories as described at the Map Tile API documentation POI Categories chapter.
    * @returns {H.service.DefaultLayers} - a set of tile layers ready to use
    */
  def createDefaultLayers(
    opt_tileSize: js.UndefOr[DefaultLayersOptions | Double],
    opt_ppi: js.UndefOr[Double],
    opt_lang: js.UndefOr[String],
    opt_secondaryLang: js.UndefOr[String],
    opt_style: js.UndefOr[String],
    opt_pois: js.UndefOr[String | Boolean]
  ): DefaultLayers = js.native
  
  /**
    * This method returns the currently used base URL.
    * @returns {H.service.Url}
    */
  def getBaseUrl(): Url = js.native
  
  /**
    * This method returns an instance of H.service.EnterpriseRoutingService to query the Enterprise Routing API.
    * @param opt_options {H.service.EnterpriseRoutingService.Options=}
    * @returns {H.service.EnterpriseRoutingService}
    */
  def getEnterpriseRoutingService(): EnterpriseRoutingService = js.native
  def getEnterpriseRoutingService(opt_options: Options): EnterpriseRoutingService = js.native
  
  /**
    * This method returns an instance of H.service.GeocodingService to query the Geocoder API
    * @param opt_options {H.service.GeocodingService.Options=} - an optional set of options for the new geocoding service to connect to
    * @returns {H.service.GeocodingService} - a new geocoding service instance
    */
  def getGeocodingService(): GeocodingService = js.native
  def getGeocodingService(opt_options: typings.heremaps.H.service.GeocodingService.Options): GeocodingService = js.native
  
  /**
    * This method returns an instance of H.service.MapTileService to query the Map Tile API.
    * @param opt_options {H.service.MapTileService.Options=}
    * @returns {H.service.MapTileService}
    */
  def getMapTileService(): MapTileService = js.native
  def getMapTileService(opt_options: typings.heremaps.H.service.MapTileService.Options): MapTileService = js.native
  
  /**
    * This method returns an instance of H.service.metaInfo.Service to query the Map Tile API Metainfo Tiles
    * @param opt_params {H.service.metaInfo.Service.Options=} - additional service parameters
    * @returns {H.service.metaInfo.Service}
    */
  def getMetaInfoService(): Service = js.native
  def getMetaInfoService(opt_params: typings.heremaps.H.service.metaInfo.Service.Options): Service = js.native
  
  /**
    * This method returns an instance of H.service.PlacesService to query the Places API.
    * @returns {H.service.PlacesService} - a new places service instance
    */
  def getPlacesService(): PlacesService = js.native
  
  /**
    * This method returns an instance of H.service.RoutingService to query the Routing API.
    * @param opt_options {H.service.RoutingService.Options=}
    * @returns {H.service.RoutingService}
    */
  def getRoutingService(): RoutingService = js.native
  def getRoutingService(opt_options: typings.heremaps.H.service.RoutingService.Options): RoutingService = js.native
  
  /**
    * This method returns an instance of {@link H.service.traffic.Service} to query the Traffic API Traffic Incident Data
    * @returns {H.service.traffic.Service} - a new places service instance
    */
  def getTrafficService(): typings.heremaps.H.service.traffic.Service = js.native
  def getTrafficService(opt_options: typings.heremaps.H.service.traffic.Service.Options): typings.heremaps.H.service.traffic.Service = js.native
  
  /**
    * This method returns an instance of H.service.venues.Service to query the Venue Maps API
    * @param opt_params {H.service.venues.Service.Options=} - additional service parameters
    * @returns {H.service.venues.Service}
    */
  def getVenueService(): typings.heremaps.H.service.venues.Service = js.native
  def getVenueService(opt_params: typings.heremaps.H.service.venues.Service.Options): typings.heremaps.H.service.venues.Service = js.native
  
  /**
    * This method modifies the base URL to be used when creating service stubs.
    * @param baseUrl {H.service.Url} - the new base URL to use
    */
  def setBaseUrl(baseUrl: Url): Unit = js.native
  
  /**
    * This method configures whether to use the "customer integration testing" instance of the platform.
    * @param useCIT {boolean} - a boolean value indicating whether the CIT platform instance is to be used
    */
  def setUseCIT(useCIT: Boolean): Unit = js.native
  
  /**
    * This method enables or disables HTTPS communication with the platform
    * @param useHTTPS {boolean} - a boolean value indicating whether to communicate with the platform via HTTPS
    */
  def setUseHTTPS(useHTTPS: Boolean): Unit = js.native
}
object Platform {
  
  /**
    * Options used to create default layers
    * @property tileSize {number=} - tile size to be queried from the HERE Map Tile API, default is 256
    * @property ppi {number=} - 'ppi' parameter to use when querying tiles, default is not specified
    * @property lg {string=} - optional primary language parameter, default is not specified
    * @property lg2 {string=} - optional secondary language parameter, default is not specified
    * @property style {string=} - optional 'style' parameter to use when querying map tiles, default is not specified
    * @property pois {boolean=} - indicates if pois are displayed on the map
    * @property crossOrigin {(string | boolean=)} - indicates if CORS headers should be used for default layers, if false is specified, CORS headers are not set, defaults to 'anonymous'.
    * Be aware that storing of content is not possible if crossOrigin is not set to true (see H.Map#storeContent).
    */
  trait DefaultLayersOptions extends StObject {
    
    var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
    
    var lg: js.UndefOr[String] = js.undefined
    
    var lg2: js.UndefOr[String] = js.undefined
    
    var pois: js.UndefOr[Boolean] = js.undefined
    
    var ppi: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var tileSize: js.UndefOr[Double] = js.undefined
  }
  object DefaultLayersOptions {
    
    @scala.inline
    def apply(): DefaultLayersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultLayersOptions]
    }
    
    @scala.inline
    implicit class DefaultLayersOptionsMutableBuilder[Self <: DefaultLayersOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLg2(value: String): Self = StObject.set(x, "lg2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLg2Undefined: Self = StObject.set(x, "lg2", js.undefined)
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setPois(value: Boolean): Self = StObject.set(x, "pois", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoisUndefined: Self = StObject.set(x, "pois", js.undefined)
      
      @scala.inline
      def setPpi(value: Double): Self = StObject.set(x, "ppi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpiUndefined: Self = StObject.set(x, "ppi", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    }
  }
  
  /**
    * pre-configured set of HERE tile layers for convenient use with the map.
    */
  trait MapTypes
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[MapType]] {
    
    var normal: js.UndefOr[MapType] = js.undefined
    
    var satellite: js.UndefOr[MapType] = js.undefined
    
    var terrain: js.UndefOr[MapType] = js.undefined
  }
  object MapTypes {
    
    @scala.inline
    def apply(): MapTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapTypes]
    }
    
    @scala.inline
    implicit class MapTypesMutableBuilder[Self <: MapTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNormal(value: MapType): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
      
      @scala.inline
      def setSatellite(value: MapType): Self = StObject.set(x, "satellite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSatelliteUndefined: Self = StObject.set(x, "satellite", js.undefined)
      
      @scala.inline
      def setTerrain(value: MapType): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerrainUndefined: Self = StObject.set(x, "terrain", js.undefined)
    }
  }
  
  /**
    * @property app_id {string} - The application ID to identify the client against the platform (mandatory to provide)
    * @property app_code {string} - The application code to identify the client against the platform (mandatory to provide)
    * @property baseUrl {H.service.Url=} - The base URL of the platform, default is http://api.here.com
    * @property useCIT {boolean=} - Indicates whether the Customer Integration Testing should be used, default is false
    * @property useHTTPS {boolean=} - Indicates whether secure communication should be used, default is false
    */
  trait Options extends StObject {
    
    var apikey: String
    
    var baseUrl: js.UndefOr[Url] = js.undefined
    
    var useCIT: js.UndefOr[Boolean] = js.undefined
    
    var useHTTPS: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(apikey: String): typings.heremaps.H.service.Platform.Options = {
      val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.heremaps.H.service.Platform.Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: typings.heremaps.H.service.Platform.Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setUseCIT(value: Boolean): Self = StObject.set(x, "useCIT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCITUndefined: Self = StObject.set(x, "useCIT", js.undefined)
      
      @scala.inline
      def setUseHTTPS(value: Boolean): Self = StObject.set(x, "useHTTPS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHTTPSUndefined: Self = StObject.set(x, "useHTTPS", js.undefined)
    }
  }
}
