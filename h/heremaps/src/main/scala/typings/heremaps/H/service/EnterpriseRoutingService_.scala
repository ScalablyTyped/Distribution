package typings.heremaps.H.service

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates Enterprise Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
  * H.service.Platform#getEnterpriseRoutingService.
  */
@js.native
trait EnterpriseRoutingService_ extends AbstractRestService {
  
  /**
    * This method sends a "calculateisoline" request to Enterprise Routing REST API and calls the onResult callback function once the service response was received - providing
    * a H.service.ServiceResult object - or the onError callback if a communication error occurred.
    * @param calculateIsolineParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Enterprise Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def calculateIsoline(
    calculateIsolineParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  /**
    * This method sends a "calculateroute" request to Enterprise Routing REST API and calls the onResult callback function once the service response was received - providing
    * a H.service.ServiceResult object - or the onError callback if a communication error occurred.
    * @param calculateRouteParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Enterprise Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def calculateRoute(
    calculateRouteParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  /**
    * This method sends a "getlinkinfo" request to Enterprise Routing REST API and calls the onResult callback function once the service response was received - providing
    * a H.service.ServiceResult object - or the onError callback if a communication error occured.
    * @param getLinkInfoParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Enterprise Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def getLinkInfo(
    getLinkInfoParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  /**
    * This method sends a "getroute" request to Enterprise Routing REST API and calls the onResult callback function once the service response was received - providing
    * a H.service.ServiceResult object - or the onError callback if a communication error occurred.
    * @param getRouteParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Enterprise Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def getRoute(
    getRouteParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}
