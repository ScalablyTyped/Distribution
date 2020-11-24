package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager/alpha", "deploymentmanager_alpha.Resource$Types")
@js.native
class ResourceTypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * deploymentmanager.types.delete
    * @desc Deletes a type and all of the resources in the type.
    * @alias deploymentmanager.types.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTypesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTypesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceTypesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceTypesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceTypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.types.get
    * @desc Gets information about a specific type.
    * @alias deploymentmanager.types.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaType] = js.native
  def get(callback: BodyResponseCallback[SchemaType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaType] = js.native
  def get(params: ParamsResourceTypesGet): GaxiosPromise[SchemaType] = js.native
  def get(params: ParamsResourceTypesGet, callback: BodyResponseCallback[SchemaType]): Unit = js.native
  def get(
    params: ParamsResourceTypesGet,
    options: BodyResponseCallback[SchemaType],
    callback: BodyResponseCallback[SchemaType]
  ): Unit = js.native
  def get(params: ParamsResourceTypesGet, options: MethodOptions): GaxiosPromise[SchemaType] = js.native
  def get(params: ParamsResourceTypesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaType]): Unit = js.native
  
  /**
    * deploymentmanager.types.insert
    * @desc Creates a type.
    * @alias deploymentmanager.types.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {().Type} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTypesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTypesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceTypesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceTypesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceTypesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.types.list
    * @desc Lists all resource types for Deployment Manager.
    * @alias deploymentmanager.types.list
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
  def list(): GaxiosPromise[SchemaTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTypesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTypesListResponse] = js.native
  def list(params: ParamsResourceTypesList): GaxiosPromise[SchemaTypesListResponse] = js.native
  def list(params: ParamsResourceTypesList, callback: BodyResponseCallback[SchemaTypesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceTypesList,
    options: BodyResponseCallback[SchemaTypesListResponse],
    callback: BodyResponseCallback[SchemaTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTypesList, options: MethodOptions): GaxiosPromise[SchemaTypesListResponse] = js.native
  def list(
    params: ParamsResourceTypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTypesListResponse]
  ): Unit = js.native
  
  /**
    * deploymentmanager.types.patch
    * @desc Updates a type. This method supports patch semantics.
    * @alias deploymentmanager.types.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {().Type} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceTypesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceTypesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceTypesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceTypesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceTypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.types.update
    * @desc Updates a type.
    * @alias deploymentmanager.types.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {().Type} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceTypesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceTypesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceTypesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceTypesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceTypesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
