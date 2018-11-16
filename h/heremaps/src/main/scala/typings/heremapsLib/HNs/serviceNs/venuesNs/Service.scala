package typings
package heremapsLib.HNs.serviceNs.venuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This class encapsulates methods to call Venue Maps API endpoints.
             */
@JSGlobal("H.service.venues.Service")
@js.native
class Service ()
  extends heremapsLib.HNs.utilNs.EventTarget
     with heremapsLib.HNs.serviceNs.IConfigurable {
  /**
                   * Constructor
                   * @param opt_options {H.service.venues.Service.Options=} - additional service parameters
                   */
  def this(opt_options: heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.Options) = this()
  /**
                   * This method creates a tile layer which can be added to the map in order to see the venues. It uses Interaction Tile endpoint of the Venue Maps API, more at
                   * http://developer.here.com/rest-apis/documentation/venue-maps/topics/quick-start-get-interaction-tile.html.
                   * @param opt_options {H.service.venues.TileProvider.Options=} - Tile provider options
                   * @returns {H.map.layer.TileLayer} - the tile layer
                   */
  def createTileLayer(): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
  /**
                   * This method creates a tile layer which can be added to the map in order to see the venues. It uses Interaction Tile endpoint of the Venue Maps API, more at
                   * http://developer.here.com/rest-apis/documentation/venue-maps/topics/quick-start-get-interaction-tile.html.
                   * @param opt_options {H.service.venues.TileProvider.Options=} - Tile provider options
                   * @returns {H.map.layer.TileLayer} - the tile layer
                   */
  def createTileLayer(opt_options: heremapsLib.HNs.serviceNs.venuesNs.TileProviderNs.Options): heremapsLib.HNs.mapNs.layerNs.TileLayer = js.native
  /**
                   * This method sends a discovery request to the Venue Maps API and calls the onResult callback function once the service response was received - providing a H.service.ServiceResult
                   * object, or the onError callback if a communication error occured.
                   * @param serviceParams {H.service.ServiceParameters} - the service parameters to be sent with the discovery request
                   * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Venue Maps API provides a response to the request
                   * @param onError {function(string)} - this function will be called if a communication error occurs during request and error type is passed as an argument
                   */
  def discover(
    serviceParams: heremapsLib.HNs.serviceNs.ServiceParameters,
    onResult: js.Function1[/* res */ heremapsLib.HNs.serviceNs.ServiceResult, scala.Unit],
    onError: js.Function1[/* s */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
                   * Method returns current state of the service.
                   * @returns {H.service.venues.Service.State} - State of the service
                   */
  def getState(): heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.State = js.native
}

