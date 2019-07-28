package typings.heremaps.HNs.serviceNs.venuesNs

import typings.heremaps.HNs.mapNs.layerNs.TileLayer
import typings.heremaps.HNs.serviceNs.IConfigurable
import typings.heremaps.HNs.serviceNs.ServiceParameters
import typings.heremaps.HNs.serviceNs.ServiceResult
import typings.heremaps.HNs.serviceNs.venuesNs.ServiceNs.Options
import typings.heremaps.HNs.serviceNs.venuesNs.ServiceNs.State
import typings.heremaps.HNs.utilNs.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates methods to call Venue Maps API endpoints.
  */
@JSGlobal("H.service.venues.Service")
@js.native
/**
  * Constructor
  * @param opt_options {H.service.venues.Service.Options=} - additional service parameters
  */
class Service ()
  extends EventTarget
     with IConfigurable {
  def this(opt_options: Options) = this()
  /**
    * This method creates a tile layer which can be added to the map in order to see the venues. It uses Interaction Tile endpoint of the Venue Maps API, more at
    * http://developer.here.com/rest-apis/documentation/venue-maps/topics/quick-start-get-interaction-tile.html.
    * @param opt_options {H.service.venues.TileProvider.Options=} - Tile provider options
    * @returns {H.map.layer.TileLayer} - the tile layer
    */
  def createTileLayer(): TileLayer = js.native
  def createTileLayer(opt_options: typings.heremaps.HNs.serviceNs.venuesNs.TileProviderNs.Options): TileLayer = js.native
  /**
    * This method sends a discovery request to the Venue Maps API and calls the onResult callback function once the service response was received - providing a H.service.ServiceResult
    * object, or the onError callback if a communication error occured.
    * @param serviceParams {H.service.ServiceParameters} - the service parameters to be sent with the discovery request
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Venue Maps API provides a response to the request
    * @param onError {function(string)} - this function will be called if a communication error occurs during request and error type is passed as an argument
    */
  def discover(
    serviceParams: ServiceParameters,
    onResult: js.Function1[/* res */ ServiceResult, Unit],
    onError: js.Function1[/* s */ String, Unit]
  ): Unit = js.native
  /**
    * Method returns current state of the service.
    * @returns {H.service.venues.Service.State} - State of the service
    */
  def getState(): State = js.native
}

