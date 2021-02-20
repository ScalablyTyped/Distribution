package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Resource$Operations")
@js.native
class ResourceOperations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicemanagement.operations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias servicemanagement.operations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceOperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceOperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceOperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * servicemanagement.operations.list
    * @desc Lists service operations that match the specified filter in the
    * request.
    * @alias servicemanagement.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A string for filtering Operations.   The following filter fields are supported&#58;    * serviceName&#58; Required. Only `=` operator is allowed.   * startTime&#58; The time this job was started, in ISO 8601 format.     Allowed operators are `>=`,  `>`, `<=`, and `<`.   * status&#58; Can be `done`, `in_progress`, or `failed`. Allowed     operators are `=`, and `!=`.    Filter expression supports conjunction (AND) and disjunction (OR)   logical operators. However, the serviceName restriction must be at the   top-level and can only be combined with other restrictions via the AND   logical operator.    Examples&#58;    * `serviceName={some-service}.googleapis.com`   * `serviceName={some-service}.googleapis.com AND startTime>="2017-02-01"`   * `serviceName={some-service}.googleapis.com AND status=done`   * `serviceName={some-service}.googleapis.com AND (status=done OR startTime>="2017-02-01")`
    * @param {string=} params.name Not used.
    * @param {integer=} params.pageSize The maximum number of operations to return. If unspecified, defaults to 50. The maximum value is 100.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceOperationsList, callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: BodyResponseCallback[SchemaListOperationsResponse],
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
}
