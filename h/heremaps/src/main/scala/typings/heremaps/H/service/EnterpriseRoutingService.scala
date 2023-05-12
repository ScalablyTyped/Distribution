package typings.heremaps.H.service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates Enterprise Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
  * H.service.Platform#getEnterpriseRoutingService.
  */
@js.native
trait EnterpriseRoutingService
  extends StObject
     with AbstractRestService {
  
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
    onError: js.Function1[/* error */ js.Error, Unit]
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
    onError: js.Function1[/* error */ js.Error, Unit]
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
    onError: js.Function1[/* error */ js.Error, Unit]
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
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}
object EnterpriseRoutingService {
  
  /**
    * subDomain {string=} - The sub-domain of the routing service relative to the platform's base URL (default is 'route')
    * path {string=} - The path of the map tile service, default is "routing/7.2"
    * baseUrl {H.service.Url=} - The base URL of the service, defaults to the the platform's base URL if instance was created using H.service.Platform#getEnterpriseRoutingService
    * method.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
      
      inline def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
    }
  }
}
