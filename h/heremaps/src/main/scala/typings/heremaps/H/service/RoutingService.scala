package typings.heremaps.H.service

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates the Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
  * H.service.Platform#getRoutingService.
  */
@js.native
trait RoutingService extends AbstractRestService {
  
  /**
    * This method sends a "calculateroute" request to Routing REST API and calls the onResult callback function once the service response was received - providing a
    * H.service.ServiceResult object - or the onError callback if a communication error occured.
    * @param calculateRouteParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def calculateRoute(
    calculateRouteParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}
object RoutingService {
  
  /**
    * @property subDomain {string=} - the sub-domain of the routing service relative to the platform's base URL, default is 'route'
    * @property path {string=} - the path of the map tile service, default is 'routing/7.2'
    * @property baseUrl {H.service.Url=} - an optional base URL if it differs from the platform's default base URL
    */
  @js.native
  trait Options extends StObject {
    
    var baseUrl: js.UndefOr[Url] = js.native
    
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
      def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
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
