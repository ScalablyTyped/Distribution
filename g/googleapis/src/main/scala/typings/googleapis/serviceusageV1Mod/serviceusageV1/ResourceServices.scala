package typings.googleapis.serviceusageV1Mod.serviceusageV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceusage/v1", "serviceusage_v1.Resource$Services")
@js.native
class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * serviceusage.services.batchEnable
    * @desc Enable multiple services on a project. The operation is atomic: if
    * enabling any service fails, then the entire batch fails, and no state
    * changes occur.
    * @alias serviceusage.services.batchEnable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent to enable services on.  An example name would be: `projects/123` where `123` is the project number (not project ID).  The `BatchEnableServices` method currently only supports projects.
    * @param {().BatchEnableServicesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchEnable(): GaxiosPromise[SchemaOperation] = js.native
  def batchEnable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchEnable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchEnable(params: ParamsResourceServicesBatchenable): GaxiosPromise[SchemaOperation] = js.native
  def batchEnable(params: ParamsResourceServicesBatchenable, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchEnable(
    params: ParamsResourceServicesBatchenable,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchEnable(params: ParamsResourceServicesBatchenable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchEnable(
    params: ParamsResourceServicesBatchenable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * serviceusage.services.disable
    * @desc Disable a service so that it can no longer be used with a project.
    * This prevents unintended usage that may cause unexpected billing charges
    * or security leaks.  It is not valid to call the disable method on a
    * service that is not currently enabled. Callers will receive a
    * `FAILED_PRECONDITION` status if the target service is not currently
    * enabled.
    * @alias serviceusage.services.disable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the consumer and service to disable the service on.  The enable and disable methods currently only support projects.  An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number (not project ID).
    * @param {().DisableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disable(): GaxiosPromise[SchemaOperation] = js.native
  def disable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(params: ParamsResourceServicesDisable): GaxiosPromise[SchemaOperation] = js.native
  def disable(params: ParamsResourceServicesDisable, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disable(
    params: ParamsResourceServicesDisable,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disable(params: ParamsResourceServicesDisable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disable(
    params: ParamsResourceServicesDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * serviceusage.services.enable
    * @desc Enable a service so that it can be used with a project.
    * @alias serviceusage.services.enable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the consumer and service to enable the service on.  The `EnableService` and `DisableService` methods currently only support projects.  Enabling a service requires that the service is public or is shared with the user enabling the service.  An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number (not project ID).
    * @param {().EnableServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enable(): GaxiosPromise[SchemaOperation] = js.native
  def enable(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(params: ParamsResourceServicesEnable): GaxiosPromise[SchemaOperation] = js.native
  def enable(params: ParamsResourceServicesEnable, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enable(
    params: ParamsResourceServicesEnable,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enable(params: ParamsResourceServicesEnable, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enable(
    params: ParamsResourceServicesEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * serviceusage.services.get
    * @desc Returns the service configuration and enabled state for a given
    * service.
    * @alias serviceusage.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the consumer and service to get the `ConsumerState` for.  An example name would be: `projects/123/services/serviceusage.googleapis.com` where `123` is the project number (not project ID).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleApiServiceusageV1Service] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleApiServiceusageV1Service]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleApiServiceusageV1Service] = js.native
  def get(params: ParamsResourceServicesGet): GaxiosPromise[SchemaGoogleApiServiceusageV1Service] = js.native
  def get(
    params: ParamsResourceServicesGet,
    callback: BodyResponseCallback[SchemaGoogleApiServiceusageV1Service]
  ): Unit = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: BodyResponseCallback[SchemaGoogleApiServiceusageV1Service],
    callback: BodyResponseCallback[SchemaGoogleApiServiceusageV1Service]
  ): Unit = js.native
  def get(params: ParamsResourceServicesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleApiServiceusageV1Service] = js.native
  def get(
    params: ParamsResourceServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleApiServiceusageV1Service]
  ): Unit = js.native
  
  /**
    * serviceusage.services.list
    * @desc List all services available to the specified project, and the
    * current state of those services with respect to the project. The list
    * includes all public services, all services for which the calling user has
    * the `servicemanagement.services.bind` permission, and all services that
    * have already been enabled on the project. The list can be filtered to
    * only include services in a specific state, for example to only include
    * services enabled on the project.
    * @alias serviceusage.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Only list services that conform to the given filter. The allowed filter strings are `state:ENABLED` and `state:DISABLED`.
    * @param {integer=} params.pageSize Requested size of the next page of data. Requested page size cannot exceed 200.  If not set, the default page size is 50.
    * @param {string=} params.pageToken Token identifying which result to start with, which is returned by a previous list call.
    * @param {string} params.parent Parent to search for services on.  An example name would be: `projects/123` where `123` is the project number (not project ID).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceServicesList): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceServicesList, callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceServicesList,
    options: BodyResponseCallback[SchemaListServicesResponse],
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesList, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
}
