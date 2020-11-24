package typings.googleapis.computeV1Mod.computeV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Nodetypes")
@js.native
class ResourceNodetypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.nodeTypes.aggregatedList
    * @desc Retrieves an aggregated list of node types.
    * @alias compute.nodeTypes.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaNodeTypeAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaNodeTypeAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNodeTypeAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceNodetypesAggregatedlist): GaxiosPromise[SchemaNodeTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceNodetypesAggregatedlist,
    callback: BodyResponseCallback[SchemaNodeTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceNodetypesAggregatedlist,
    options: BodyResponseCallback[SchemaNodeTypeAggregatedList],
    callback: BodyResponseCallback[SchemaNodeTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceNodetypesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaNodeTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceNodetypesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeTypeAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.nodeTypes.get
    * @desc Returns the specified node type. Gets a list of available node
    * types by making a list() request.
    * @alias compute.nodeTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeType Name of the node type to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNodeType] = js.native
  def get(callback: BodyResponseCallback[SchemaNodeType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNodeType] = js.native
  def get(params: ParamsResourceNodetypesGet): GaxiosPromise[SchemaNodeType] = js.native
  def get(params: ParamsResourceNodetypesGet, callback: BodyResponseCallback[SchemaNodeType]): Unit = js.native
  def get(
    params: ParamsResourceNodetypesGet,
    options: BodyResponseCallback[SchemaNodeType],
    callback: BodyResponseCallback[SchemaNodeType]
  ): Unit = js.native
  def get(params: ParamsResourceNodetypesGet, options: MethodOptions): GaxiosPromise[SchemaNodeType] = js.native
  def get(
    params: ParamsResourceNodetypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeType]
  ): Unit = js.native
  
  /**
    * compute.nodeTypes.list
    * @desc Retrieves a list of node types available to the specified project.
    * @alias compute.nodeTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaNodeTypeList] = js.native
  def list(callback: BodyResponseCallback[SchemaNodeTypeList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNodeTypeList] = js.native
  def list(params: ParamsResourceNodetypesList): GaxiosPromise[SchemaNodeTypeList] = js.native
  def list(params: ParamsResourceNodetypesList, callback: BodyResponseCallback[SchemaNodeTypeList]): Unit = js.native
  def list(
    params: ParamsResourceNodetypesList,
    options: BodyResponseCallback[SchemaNodeTypeList],
    callback: BodyResponseCallback[SchemaNodeTypeList]
  ): Unit = js.native
  def list(params: ParamsResourceNodetypesList, options: MethodOptions): GaxiosPromise[SchemaNodeTypeList] = js.native
  def list(
    params: ParamsResourceNodetypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeTypeList]
  ): Unit = js.native
}
