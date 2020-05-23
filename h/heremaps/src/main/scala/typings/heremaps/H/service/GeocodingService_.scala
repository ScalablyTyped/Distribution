package typings.heremaps.H.service

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class encapsulates the Geocoding REST API in a service stub with calls to its various resources implemented.
  */
@js.native
trait GeocodingService_ extends AbstractRestService {
  /**
    * This method sends a reverse geocoding request to Geocoder REST API and calls the onResult callback function once the service response was received - providing a H.service.ServiceResult
    * object - or the onError callback if a communication error occured.
    * @param geoodingParams {H.service.ServiceParameters} - the service parameters to be sent with the geocoding request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Geocoder REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    * @returns {H.service.JsonpRequestHandle}
    */
  def geocode(
    geoodingParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  /**
    * This method sends a reverse geocoding request to Geocoder REST API and calls the onResult callback function once the service response was received - providing a H.service.ServiceResult
    * object - or the onError callback if a communication error occured.
    * @param reverseGeocodingParams {H.service.ServiceParameters} - the service parameters to be sent with the reverse geocoding request
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Geocoder REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    * @returns {H.service.JsonpRequestHandle}
    */
  def reverseGeocode(
    reverseGeocodingParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  /**
    * This method sends a landmark search request to Geocoder REST API and calls the onResult callback function once the service response was received - providing a H.service.ServiceResult
    * object - or the onError callback if a communication error occured.
    * @param searchParams {H.service.ServiceParameters} - the service parameters to be sent with the reverse geocoding request
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Geocoder REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    * @returns {H.service.JsonpRequestHandle}
    */
  def search(
    searchParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
}

