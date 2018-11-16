package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Places service implements a low level places RestApi access. Please refer to Restful API documentation for providing parameters and handling response objects.
         */
@JSGlobal("H.service.PlacesService")
@js.native
class PlacesService () extends AbstractRestService {
  /**
               * Constructor
               * @param opt_options {H.service.PlacesService.Options=}
               */
  def this(opt_options: heremapsLib.HNs.serviceNs.PlacesServiceNs.Options) = this()
  /**
               * Function triggers places api 'around' entry point. Please refer to documentation for parameter specification and response handling.
               * @param aroundParams {H.service.ServiceParameters} - places api around entry point parameters please refer to places api documentation
               * @param onResult {Function}
               * @param onError {Function}
               * @returns {H.service.JsonpRequestHandle} - jsonp request handle
               */
  def around(
    aroundParams: ServiceParameters,
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    hyperlink: java.lang.String,
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    hyperlink: java.lang.String,
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit],
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
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    entryPoint: heremapsLib.HNs.serviceNs.PlacesServiceNs.EntryPoint,
    entryPointParams: js.Object,
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
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
    onResult: js.Function1[/* result */ ServiceResult, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): JsonpRequestHandle = js.native
}

