package typings.heremaps.H.service.traffic

import typings.heremaps.H.service.AbstractRestService
import typings.heremaps.H.service.JsonpRequestHandle
import typings.heremaps.H.service.ServiceParameters
import typings.heremaps.H.service.ServiceResult
import typings.heremaps.H.service.traffic.Service.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TrafficIncindentsService provides functionality to the low level traffic incidents api Traffic API documentation where it is possible to retrieve traffic incident information on a
  * tile basis
  */
@JSGlobal("H.service.traffic.Service")
@js.native
/**
  * Constructor
  * @param opt_options {H.service.Service.Options=}
  */
class Service_ () extends AbstractRestService {
  def this(opt_options: Options) = this()
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

