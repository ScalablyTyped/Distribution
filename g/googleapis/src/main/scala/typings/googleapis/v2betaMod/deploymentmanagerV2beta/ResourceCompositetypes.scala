package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager/v2beta", "deploymentmanager_v2beta.Resource$Compositetypes")
@js.native
class ResourceCompositetypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * deploymentmanager.compositeTypes.delete
    * @desc Deletes a composite type.
    * @alias deploymentmanager.compositeTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceCompositetypesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceCompositetypesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceCompositetypesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceCompositetypesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceCompositetypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.compositeTypes.get
    * @desc Gets information about a specific composite type.
    * @alias deploymentmanager.compositeTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the composite type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCompositeType] = js.native
  def get(callback: BodyResponseCallback[SchemaCompositeType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompositeType] = js.native
  def get(params: ParamsResourceCompositetypesGet): GaxiosPromise[SchemaCompositeType] = js.native
  def get(params: ParamsResourceCompositetypesGet, callback: BodyResponseCallback[SchemaCompositeType]): Unit = js.native
  def get(
    params: ParamsResourceCompositetypesGet,
    options: BodyResponseCallback[SchemaCompositeType],
    callback: BodyResponseCallback[SchemaCompositeType]
  ): Unit = js.native
  def get(params: ParamsResourceCompositetypesGet, options: MethodOptions): GaxiosPromise[SchemaCompositeType] = js.native
  def get(
    params: ParamsResourceCompositetypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompositeType]
  ): Unit = js.native
  
  /**
    * deploymentmanager.compositeTypes.insert
    * @desc Creates a composite type.
    * @alias deploymentmanager.compositeTypes.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {().CompositeType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceCompositetypesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceCompositetypesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceCompositetypesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceCompositetypesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceCompositetypesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.compositeTypes.list
    * @desc Lists all composite types for Deployment Manager.
    * @alias deploymentmanager.compositeTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCompositeTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCompositeTypesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompositeTypesListResponse] = js.native
  def list(params: ParamsResourceCompositetypesList): GaxiosPromise[SchemaCompositeTypesListResponse] = js.native
  def list(
    params: ParamsResourceCompositetypesList,
    callback: BodyResponseCallback[SchemaCompositeTypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCompositetypesList,
    options: BodyResponseCallback[SchemaCompositeTypesListResponse],
    callback: BodyResponseCallback[SchemaCompositeTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCompositetypesList, options: MethodOptions): GaxiosPromise[SchemaCompositeTypesListResponse] = js.native
  def list(
    params: ParamsResourceCompositetypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompositeTypesListResponse]
  ): Unit = js.native
  
  /**
    * deploymentmanager.compositeTypes.patch
    * @desc Updates a composite type. This method supports patch semantics.
    * @alias deploymentmanager.compositeTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the composite type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {().CompositeType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceCompositetypesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceCompositetypesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceCompositetypesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceCompositetypesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceCompositetypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.compositeTypes.update
    * @desc Updates a composite type.
    * @alias deploymentmanager.compositeTypes.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the composite type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {().CompositeType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceCompositetypesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceCompositetypesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceCompositetypesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceCompositetypesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceCompositetypesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
