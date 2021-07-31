package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/genomics/v2alpha1", "genomics_v2alpha1.Resource$Projects$Operations")
@js.native
class ResourceProjectsOperations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * genomics.projects.operations.cancel
    * @desc Starts asynchronous cancellation on a long-running operation. The
    * server makes a best effort to cancel the operation, but success is not
    * guaranteed. Clients may use Operations.GetOperation or
    * Operations.ListOperations to check whether the cancellation succeeded or
    * the operation completed despite cancellation. Authorization requires the
    * following [Google IAM](https://cloud.google.com/iam) permission&#58;  *
    * `genomics.operations.cancel`
    * @alias genomics.projects.operations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {().CancelOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(params: ParamsResourceProjectsOperationsCancel): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(params: ParamsResourceProjectsOperationsCancel, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsOperationsCancel,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsOperationsCancel, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def cancel(
    params: ParamsResourceProjectsOperationsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * genomics.projects.operations.get
    * @desc Gets the latest state of a long-running operation. Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service. Authorization requires the following [Google
    * IAM](https://cloud.google.com/iam) permission&#58;  *
    * `genomics.operations.get`
    * @alias genomics.projects.operations.get
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
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceProjectsOperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceProjectsOperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceProjectsOperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsOperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceProjectsOperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * genomics.projects.operations.list
    * @desc Lists operations that match the specified filter in the request.
    * Authorization requires the following [Google
    * IAM](https://cloud.google.com/iam) permission&#58;  *
    * `genomics.operations.list`
    * @alias genomics.projects.operations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A string for filtering Operations. In v2alpha1, the following filter fields are supported&#58;  * createTime&#58; The time this job was created * events&#58; The set of event (names) that have occurred while running   the pipeline.  The &#58; operator can be used to determine if a   particular event has occurred. * error&#58; If the pipeline is running, this value is NULL.  Once the   pipeline finishes, the value is the standard Google error code. * labels.key or labels."key with space" where key is a label key. * done&#58; If the pipeline is running, this value is false. Once the   pipeline finishes, the value is true.  In v1 and v1alpha2, the following filter fields are supported&#58;  * projectId&#58; Required. Corresponds to   OperationMetadata.projectId. * createTime&#58; The time this job was created, in seconds from the   [epoch](http://en.wikipedia.org/wiki/Unix_time). Can use `>=` and/or `<=`   operators. * status&#58; Can be `RUNNING`, `SUCCESS`, `FAILURE`, or `CANCELED`. Only   one status may be specified. * labels.key where key is a label key.  Examples&#58;  * `projectId = my-project AND createTime >= 1432140000` * `projectId = my-project AND createTime >= 1432140000 AND createTime <= 1432150000 AND status = RUNNING` * `projectId = my-project AND labels.color = *` * `projectId = my-project AND labels.color = red`
    * @param {string} params.name The name of the operation's parent resource.
    * @param {integer=} params.pageSize The maximum number of results to return. The maximum value is 256.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOperationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(params: ParamsResourceProjectsOperationsList): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsOperationsList,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsOperationsList,
    options: BodyResponseCallback[SchemaListOperationsResponse],
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsOperationsList, options: MethodOptions): GaxiosPromise[SchemaListOperationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsOperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOperationsResponse]
  ): Unit = js.native
}
