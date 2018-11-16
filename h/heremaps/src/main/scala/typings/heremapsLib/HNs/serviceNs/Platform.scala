package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * The Platform class represents central class from which all other service stubs are created. It also contains the shared settings to be passed to the individual service stubs, for example
         * the root URL of the platform, application credentials, etc.
         */
@JSGlobal("H.service.Platform")
@js.native
class Platform protected () extends js.Object {
  /**
               * Constructor
               * @param options {H.service.Platform.Options}
               */
  def this(options: heremapsLib.HNs.serviceNs.PlatformNs.Options) = this()
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
    opt_tileSize: js.UndefOr[heremapsLib.HNs.serviceNs.PlatformNs.DefaultLayersOptions | scala.Double],
    opt_ppi: js.UndefOr[scala.Double],
    opt_lang: js.UndefOr[java.lang.String],
    opt_secondaryLang: js.UndefOr[java.lang.String],
    opt_style: js.UndefOr[java.lang.String],
    opt_pois: js.UndefOr[java.lang.String | scala.Boolean]
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
  /**
               * This method returns an instance of H.service.EnterpriseRoutingService to query the Enterprise Routing API.
               * @param opt_options {H.service.EnterpriseRoutingService.Options=}
               * @returns {H.service.EnterpriseRoutingService}
               */
  def getEnterpriseRoutingService(opt_options: heremapsLib.HNs.serviceNs.EnterpriseRoutingServiceNs.Options): EnterpriseRoutingService = js.native
  /**
               * This method returns an instance of H.service.GeocodingService to query the Geocoder API
               * @param opt_options {H.service.GeocodingService.Options=} - an optional set of options for the new geocoding service to connect to
               * @returns {H.service.GeocodingService} - a new geocoding service instance
               */
  def getGeocodingService(): GeocodingService = js.native
  /**
               * This method returns an instance of H.service.GeocodingService to query the Geocoder API
               * @param opt_options {H.service.GeocodingService.Options=} - an optional set of options for the new geocoding service to connect to
               * @returns {H.service.GeocodingService} - a new geocoding service instance
               */
  def getGeocodingService(opt_options: heremapsLib.HNs.serviceNs.GeocodingServiceNs.Options): GeocodingService = js.native
  /**
               * This method returns an instance of H.service.MapTileService to query the Map Tile API.
               * @param opt_options {H.service.MapTileService.Options=}
               * @returns {H.service.MapTileService}
               */
  def getMapTileService(): MapTileService = js.native
  /**
               * This method returns an instance of H.service.MapTileService to query the Map Tile API.
               * @param opt_options {H.service.MapTileService.Options=}
               * @returns {H.service.MapTileService}
               */
  def getMapTileService(opt_options: heremapsLib.HNs.serviceNs.MapTileServiceNs.Options): MapTileService = js.native
  /**
               * This method returns an instance of H.service.metaInfo.Service to query the Map Tile API Metainfo Tiles
               * @param opt_params {H.service.metaInfo.Service.Options=} - additional service parameters
               * @returns {H.service.metaInfo.Service}
               */
  def getMetaInfoService(): heremapsLib.HNs.serviceNs.metaInfoNs.Service = js.native
  /**
               * This method returns an instance of H.service.metaInfo.Service to query the Map Tile API Metainfo Tiles
               * @param opt_params {H.service.metaInfo.Service.Options=} - additional service parameters
               * @returns {H.service.metaInfo.Service}
               */
  def getMetaInfoService(opt_params: heremapsLib.HNs.serviceNs.metaInfoNs.ServiceNs.Options): heremapsLib.HNs.serviceNs.metaInfoNs.Service = js.native
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
  /**
               * This method returns an instance of H.service.RoutingService to query the Routing API.
               * @param opt_options {H.service.RoutingService.Options=}
               * @returns {H.service.RoutingService}
               */
  def getRoutingService(opt_options: heremapsLib.HNs.serviceNs.RoutingServiceNs.Options): RoutingService = js.native
  /**
               * This method returns an instance of H.service.TrafficIncidentsService to query the Traffic API Traffic Incident Data
               * @returns {H.service.TrafficIncidentsService} - a new places service instance
               */
  def getTrafficIncidentsService(): TrafficIncidentsService = js.native
  /**
               * This method returns an instance of H.service.venues.Service to query the Venue Maps API
               * @param opt_params {H.service.venues.Service.Options=} - additional service parameters
               * @returns {H.service.venues.Service}
               */
  def getVenueService(): heremapsLib.HNs.serviceNs.venuesNs.Service = js.native
  /**
               * This method returns an instance of H.service.venues.Service to query the Venue Maps API
               * @param opt_params {H.service.venues.Service.Options=} - additional service parameters
               * @returns {H.service.venues.Service}
               */
  def getVenueService(opt_params: heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.Options): heremapsLib.HNs.serviceNs.venuesNs.Service = js.native
  /**
               * This method modifies the base URL to be used when creating service stubs.
               * @param baseUrl {H.service.Url} - the new base URL to use
               */
  def setBaseUrl(baseUrl: Url): scala.Unit = js.native
  /**
               * This method configures whether to use the "customer integration testing" instance of the platform.
               * @param useCIT {boolean} - a boolean value indicating whether the CIT platform instance is to be used
               */
  def setUseCIT(useCIT: scala.Boolean): scala.Unit = js.native
  /**
               * This method enables or disables HTTPS communication with the platform
               * @param useHTTPS {boolean} - a boolean value indicating whether to communicate with the platform via HTTPS
               */
  def setUseHTTPS(useHTTPS: scala.Boolean): scala.Unit = js.native
}

