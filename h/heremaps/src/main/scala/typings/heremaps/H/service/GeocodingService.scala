package typings.heremaps.H.service

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates the Geocoding REST API in a service stub with calls to its various resources implemented.
  */
@js.native
trait GeocodingService extends AbstractRestService {
  
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
object GeocodingService {
  
  /**
    * @property subDomain {string=} - the sub-domain of the geo-coding service relative to the platform's base URL, default is 'geocoder'
    * @property path {string=} - the path of the Geocoding service, default is '6.2'
    */
  @js.native
  trait Options extends StObject {
    
    var path: js.UndefOr[String] = js.native
    
    var subDomain: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
    }
  }
}
