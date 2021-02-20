package typings.heremaps.H.service

import typings.heremaps.H.service.PlacesService.EntryPoint
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Places service implements a low level places RestApi access. Please refer to Restful API documentation for providing parameters and handling response objects.
  */
@js.native
trait PlacesService extends AbstractRestService {
  
  /**
    * Function triggers places api 'around' entry point. Please refer to documentation for parameter specification and response handling.
    * @param aroundParams {H.service.ServiceParameters} - places api around entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def around(
    aroundParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'categories' entry point. Please refer to documentation for parameter specification and response handling.
    * @param categoriesParams {H.service.ServiceParameters} - places api here entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def categories(
    categoriesParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'explore' entry point. Please refer to documentation for parameter specification and response handling.
    * @param exploreParams {H.service.ServiceParameters} - places api explore entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def explore(
    exploreParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * This method should be used to follow hyperlinks available in results returned by dicovery queries.
    * @param hyperlink {string}
    * @param onResult {Function}
    * @param onError {Function}
    * @param opt_additionalParameters {Object=} - additional parameters to send with request
    * @returns {H.service.JsonpRequestHandle} - jsonp resquest handle
    */
  def follow(
    hyperlink: String,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  def follow(
    hyperlink: String,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit],
    opt_additionalParameters: js.Object
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'here' entry point. Please refer to documentation for parameter specification and response handling.
    * @param hereParams {H.service.ServiceParameters} - places api here entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def here(
    hereParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * This is generic method to query places RestAPI.
    * @param entryPoint {H.service.PlacesService.EntryPoint} - can be one of available entry points H.service.PlacesService.EntryPoint i.e value of H.service.PlacesService.EntryPoint.SEARCH
    * @param entryPointParams {Object} - parameter map key value pairs will be transformed into the url key=value parametes. For entry point parameters description please refer to places
    * restful api documentation documentation for available parameters for chose entry point
    * @param onResult {Function} - callback which is called when result is returned
    * @param onError {Function} - callback which is called when error occured (i.e request timeout)
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def request(
    entryPoint: EntryPoint,
    entryPointParams: js.Object,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'search' entry point. Please refer to documentation for parameter specification and response handling.
    * @param searchParams {H.service.ServiceParameters} - places api search entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def search(
    searchParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
  
  /**
    * Function triggers places api 'suggestions' entry point. Please refer to documentation for parameter specification and response handling.
    * @param suggestParams {H.service.ServiceParameters} - places api suggest entry point parameters please refer to places api documentation
    * @param onResult {Function}
    * @param onError {Function}
    * @returns {H.service.JsonpRequestHandle} - jsonp request handle
    */
  def suggest(
    suggestParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): JsonpRequestHandle = js.native
}
object PlacesService {
  
  @js.native
  sealed trait EntryPoint extends StObject
  /**
    * List of available entry points
    */
  @JSGlobal("H.service.PlacesService.EntryPoint")
  @js.native
  object EntryPoint extends StObject {
    
    @js.native
    sealed trait AROUND extends EntryPoint
    
    @js.native
    sealed trait CATEGORIES extends EntryPoint
    
    @js.native
    sealed trait EXPLORE extends EntryPoint
    
    @js.native
    sealed trait HERE extends EntryPoint
    
    @js.native
    sealed trait SEARCH extends EntryPoint
    
    @js.native
    sealed trait SUGGEST extends EntryPoint
  }
  
  /**
    * @property subDomain {string=} - the sub-domain of the places service relative to the platform's base URL, default is 'places'
    * @property path {string=} - the path of the places service, default is 'places/v1'
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
