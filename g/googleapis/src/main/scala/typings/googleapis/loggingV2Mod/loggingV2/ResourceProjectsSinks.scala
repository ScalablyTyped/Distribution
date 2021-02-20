package typings.googleapis.loggingV2Mod.loggingV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Projects$Sinks")
@js.native
class ResourceProjectsSinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * logging.projects.sinks.create
    * @desc Creates a sink that exports specified log entries to a destination.
    * The export of newly-ingested log entries begins immediately, unless the
    * sink's writer_identity is not permitted to write to the destination. A
    * sink can export log entries only from the resource owning the sink.
    * @alias logging.projects.sinks.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The resource in which to create the sink: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" Examples: "projects/my-logging-project", "organizations/123456789".
    * @param {boolean=} params.uniqueWriterIdentity Optional. Determines the kind of IAM identity returned as writer_identity in the new sink. If this value is omitted or set to false, and if the sink's parent is a project, then the value returned as writer_identity is the same group or service account used by Logging before the addition of writer identities to this API. The sink's destination must be in the same project as the sink itself.If this field is set to true, or if the sink is owned by a non-project resource such as an organization, then the value of writer_identity will be a unique service account used only for exports from the new sink. For more information, see writer_identity in LogSink.
    * @param {().LogSink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaLogSink] = js.native
  def create(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def create(params: ParamsResourceProjectsSinksCreate): GaxiosPromise[SchemaLogSink] = js.native
  def create(params: ParamsResourceProjectsSinksCreate, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def create(
    params: ParamsResourceProjectsSinksCreate,
    options: BodyResponseCallback[SchemaLogSink],
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsSinksCreate, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def create(
    params: ParamsResourceProjectsSinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  
  /**
    * logging.projects.sinks.delete
    * @desc Deletes a sink. If the sink has a unique writer_identity, then that
    * service account is also deleted.
    * @alias logging.projects.sinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sinkName Required. The full resource name of the sink to delete, including the parent resource and the sink identifier: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example: "projects/my-project-id/sinks/my-sink-id".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSinksDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSinksDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsSinksDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsSinksDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsSinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * logging.projects.sinks.get
    * @desc Gets a sink.
    * @alias logging.projects.sinks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sinkName Required. The resource name of the sink: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example: "projects/my-project-id/sinks/my-sink-id".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaLogSink] = js.native
  def get(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def get(params: ParamsResourceProjectsSinksGet): GaxiosPromise[SchemaLogSink] = js.native
  def get(params: ParamsResourceProjectsSinksGet, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def get(
    params: ParamsResourceProjectsSinksGet,
    options: BodyResponseCallback[SchemaLogSink],
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsSinksGet, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def get(
    params: ParamsResourceProjectsSinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  
  /**
    * logging.projects.sinks.list
    * @desc Lists sinks.
    * @alias logging.projects.sinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {string} params.parent Required. The parent resource whose sinks are to be listed: "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSinksResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(params: ParamsResourceProjectsSinksList): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(params: ParamsResourceProjectsSinksList, callback: BodyResponseCallback[SchemaListSinksResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsSinksList,
    options: BodyResponseCallback[SchemaListSinksResponse],
    callback: BodyResponseCallback[SchemaListSinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSinksList, options: MethodOptions): GaxiosPromise[SchemaListSinksResponse] = js.native
  def list(
    params: ParamsResourceProjectsSinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSinksResponse]
  ): Unit = js.native
  
  /**
    * logging.projects.sinks.patch
    * @desc Updates a sink. This method replaces the following fields in the
    * existing sink with values from the new sink: destination, and filter.The
    * updated sink might also have a new writer_identity; see the
    * unique_writer_identity field.
    * @alias logging.projects.sinks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sinkName Required. The full resource name of the sink to update, including the parent resource and the sink identifier: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example: "projects/my-project-id/sinks/my-sink-id".
    * @param {boolean=} params.uniqueWriterIdentity Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a unique service account. It is an error if the old value is true and the new value is set to false or defaulted to false.
    * @param {string=} params.updateMask Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:  destination,filter,includeChildren At some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskExample: updateMask=filter.
    * @param {().LogSink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaLogSink] = js.native
  def patch(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def patch(params: ParamsResourceProjectsSinksPatch): GaxiosPromise[SchemaLogSink] = js.native
  def patch(params: ParamsResourceProjectsSinksPatch, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsSinksPatch,
    options: BodyResponseCallback[SchemaLogSink],
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsSinksPatch, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def patch(
    params: ParamsResourceProjectsSinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  
  /**
    * logging.projects.sinks.update
    * @desc Updates a sink. This method replaces the following fields in the
    * existing sink with values from the new sink: destination, and filter.The
    * updated sink might also have a new writer_identity; see the
    * unique_writer_identity field.
    * @alias logging.projects.sinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sinkName Required. The full resource name of the sink to update, including the parent resource and the sink identifier: "projects/[PROJECT_ID]/sinks/[SINK_ID]" "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]" "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example: "projects/my-project-id/sinks/my-sink-id".
    * @param {boolean=} params.uniqueWriterIdentity Optional. See sinks.create for a description of this field. When updating a sink, the effect of this field on the value of writer_identity in the updated sink depends on both the old and new values of this field: If the old and new values of this field are both false or both true, then there is no change to the sink's writer_identity. If the old value is false and the new value is true, then writer_identity is changed to a unique service account. It is an error if the old value is true and the new value is set to false or defaulted to false.
    * @param {string=} params.updateMask Optional. Field mask that specifies the fields in sink that need an update. A sink field will be overwritten if, and only if, it is in the update mask. name and output only fields cannot be updated.An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes:  destination,filter,includeChildren At some point in the future, behavior will be removed and specifying an empty updateMask will be an error.For a detailed FieldMask definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMaskExample: updateMask=filter.
    * @param {().LogSink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaLogSink] = js.native
  def update(callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def update(params: ParamsResourceProjectsSinksUpdate): GaxiosPromise[SchemaLogSink] = js.native
  def update(params: ParamsResourceProjectsSinksUpdate, callback: BodyResponseCallback[SchemaLogSink]): Unit = js.native
  def update(
    params: ParamsResourceProjectsSinksUpdate,
    options: BodyResponseCallback[SchemaLogSink],
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsSinksUpdate, options: MethodOptions): GaxiosPromise[SchemaLogSink] = js.native
  def update(
    params: ParamsResourceProjectsSinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLogSink]
  ): Unit = js.native
}
