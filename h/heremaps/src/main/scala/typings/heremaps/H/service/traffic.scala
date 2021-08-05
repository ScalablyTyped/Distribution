package typings.heremaps.H.service

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traffic {
  
  /**
    * TrafficIncindentsService provides functionality to the low level traffic incidents api Traffic API documentation where it is possible to retrieve traffic incident information on a
    * tile basis
    */
  @js.native
  trait Service
    extends StObject
       with AbstractRestService {
    
    /**
      * This method requests traffic incidents based on the service parameters provided.
      * @param serviceParams {H.service.ServiceParameters}
      * @param onResponse {function(H.service.ServiceResult)}
      * @param onError {function()}
      * @returns {H.service.JsonpRequestHandle}
      */
    def requestIncidents(
      serviceParams: ServiceParameters,
      onResponse: js.Function1[/* result */ ServiceResult, Unit],
      onError: js.Function1[/* error */ Error, Unit]
    ): JsonpRequestHandle = js.native
    
    /**
      * This method requests traffic incident information by tile coordinates
      * @param x {number} - tile column number
      * @param y {number} - tile row number
      * @param z {number} - zoom level
      * @param onResponse {function(H.service.ServiceResult)} - callback to handle service resposne
      * @param onError {function()} - callback to habdle communication error
      * @param opt_serviceParams {H.service.ServiceParameters=} - optional service parameters to be added to the request
      * @returns {H.service.JsonpRequestHandle}
      */
    def requestIncidentsByTile(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function1[/* result */ ServiceResult, Unit],
      onError: js.Function1[/* error */ Error, Unit]
    ): JsonpRequestHandle = js.native
    def requestIncidentsByTile(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function1[/* result */ ServiceResult, Unit],
      onError: js.Function1[/* error */ Error, Unit],
      opt_serviceParams: ServiceParameters
    ): JsonpRequestHandle = js.native
  }
  object Service {
    
    /**
      * @property subDomain {string=} - the sub-domain of the traffic incidents service relative to the platform's base URL, default is 'traffic'
      * @property path {string=} - the path of the traffic incidents service, default is 'traffic/6.1'
      * @property baseUrl {H.service.Url=} - an optional base URL if it differs from the platform's default base URL
      */
    trait Options extends StObject {
      
      var baseUrl: js.UndefOr[Url] = js.undefined
      
      var path: js.UndefOr[String] = js.undefined
      
      var subDomain: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
        
        inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
        
        inline def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
      }
    }
  }
}
