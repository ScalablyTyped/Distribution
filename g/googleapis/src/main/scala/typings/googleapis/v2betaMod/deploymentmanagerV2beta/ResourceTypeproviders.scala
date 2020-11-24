package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager/v2beta", "deploymentmanager_v2beta.Resource$Typeproviders")
@js.native
class ResourceTypeproviders protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * deploymentmanager.typeProviders.delete
    * @desc Deletes a type provider.
    * @alias deploymentmanager.typeProviders.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.typeProvider The name of the type provider for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTypeprovidersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTypeprovidersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceTypeprovidersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceTypeprovidersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceTypeprovidersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.get
    * @desc Gets information about a specific type provider.
    * @alias deploymentmanager.typeProviders.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.typeProvider The name of the type provider for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTypeProvider] = js.native
  def get(callback: BodyResponseCallback[SchemaTypeProvider]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTypeProvider] = js.native
  def get(params: ParamsResourceTypeprovidersGet): GaxiosPromise[SchemaTypeProvider] = js.native
  def get(params: ParamsResourceTypeprovidersGet, callback: BodyResponseCallback[SchemaTypeProvider]): Unit = js.native
  def get(
    params: ParamsResourceTypeprovidersGet,
    options: BodyResponseCallback[SchemaTypeProvider],
    callback: BodyResponseCallback[SchemaTypeProvider]
  ): Unit = js.native
  def get(params: ParamsResourceTypeprovidersGet, options: MethodOptions): GaxiosPromise[SchemaTypeProvider] = js.native
  def get(
    params: ParamsResourceTypeprovidersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTypeProvider]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.getType
    * @desc Gets a type info for a type provided by a TypeProvider.
    * @alias deploymentmanager.typeProviders.getType
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type provider type for this request.
    * @param {string} params.typeProvider The name of the type provider for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getType(): GaxiosPromise[SchemaTypeInfo] = js.native
  def getType(callback: BodyResponseCallback[SchemaTypeInfo]): Unit = js.native
  def getType(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTypeInfo] = js.native
  def getType(params: ParamsResourceTypeprovidersGettype): GaxiosPromise[SchemaTypeInfo] = js.native
  def getType(params: ParamsResourceTypeprovidersGettype, callback: BodyResponseCallback[SchemaTypeInfo]): Unit = js.native
  def getType(
    params: ParamsResourceTypeprovidersGettype,
    options: BodyResponseCallback[SchemaTypeInfo],
    callback: BodyResponseCallback[SchemaTypeInfo]
  ): Unit = js.native
  def getType(params: ParamsResourceTypeprovidersGettype, options: MethodOptions): GaxiosPromise[SchemaTypeInfo] = js.native
  def getType(
    params: ParamsResourceTypeprovidersGettype,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTypeInfo]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.insert
    * @desc Creates a type provider.
    * @alias deploymentmanager.typeProviders.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {().TypeProvider} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTypeprovidersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTypeprovidersInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceTypeprovidersInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceTypeprovidersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceTypeprovidersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.list
    * @desc Lists all resource type providers for Deployment Manager.
    * @alias deploymentmanager.typeProviders.list
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
  def list(): GaxiosPromise[SchemaTypeProvidersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTypeProvidersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTypeProvidersListResponse] = js.native
  def list(params: ParamsResourceTypeprovidersList): GaxiosPromise[SchemaTypeProvidersListResponse] = js.native
  def list(
    params: ParamsResourceTypeprovidersList,
    callback: BodyResponseCallback[SchemaTypeProvidersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTypeprovidersList,
    options: BodyResponseCallback[SchemaTypeProvidersListResponse],
    callback: BodyResponseCallback[SchemaTypeProvidersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTypeprovidersList, options: MethodOptions): GaxiosPromise[SchemaTypeProvidersListResponse] = js.native
  def list(
    params: ParamsResourceTypeprovidersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTypeProvidersListResponse]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.listTypes
    * @desc Lists all the type info for a TypeProvider.
    * @alias deploymentmanager.typeProviders.listTypes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project The project ID for this request.
    * @param {string} params.typeProvider The name of the type provider for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listTypes(): GaxiosPromise[SchemaTypeProvidersListTypesResponse] = js.native
  def listTypes(callback: BodyResponseCallback[SchemaTypeProvidersListTypesResponse]): Unit = js.native
  def listTypes(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTypeProvidersListTypesResponse] = js.native
  def listTypes(params: ParamsResourceTypeprovidersListtypes): GaxiosPromise[SchemaTypeProvidersListTypesResponse] = js.native
  def listTypes(
    params: ParamsResourceTypeprovidersListtypes,
    callback: BodyResponseCallback[SchemaTypeProvidersListTypesResponse]
  ): Unit = js.native
  def listTypes(
    params: ParamsResourceTypeprovidersListtypes,
    options: BodyResponseCallback[SchemaTypeProvidersListTypesResponse],
    callback: BodyResponseCallback[SchemaTypeProvidersListTypesResponse]
  ): Unit = js.native
  def listTypes(params: ParamsResourceTypeprovidersListtypes, options: MethodOptions): GaxiosPromise[SchemaTypeProvidersListTypesResponse] = js.native
  def listTypes(
    params: ParamsResourceTypeprovidersListtypes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTypeProvidersListTypesResponse]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.patch
    * @desc Updates a type provider. This method supports patch semantics.
    * @alias deploymentmanager.typeProviders.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.typeProvider The name of the type provider for this request.
    * @param {().TypeProvider} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceTypeprovidersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceTypeprovidersPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceTypeprovidersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceTypeprovidersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceTypeprovidersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * deploymentmanager.typeProviders.update
    * @desc Updates a type provider.
    * @alias deploymentmanager.typeProviders.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.typeProvider The name of the type provider for this request.
    * @param {().TypeProvider} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceTypeprovidersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceTypeprovidersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceTypeprovidersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceTypeprovidersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceTypeprovidersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
