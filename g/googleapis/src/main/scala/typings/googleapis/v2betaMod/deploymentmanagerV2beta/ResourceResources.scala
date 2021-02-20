package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/deploymentmanager/v2beta", "deploymentmanager_v2beta.Resource$Resources")
@js.native
class ResourceResources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * deploymentmanager.resources.get
    * @desc Gets information about a single resource.
    * @alias deploymentmanager.resources.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string} params.project The project ID for this request.
    * @param {string} params.resource_ The name of the resource for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaResource] = js.native
  def get(callback: BodyResponseCallback[SchemaResource]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResource] = js.native
  def get(params: ParamsResourceResourcesGet): GaxiosPromise[SchemaResource] = js.native
  def get(params: ParamsResourceResourcesGet, callback: BodyResponseCallback[SchemaResource]): Unit = js.native
  def get(
    params: ParamsResourceResourcesGet,
    options: BodyResponseCallback[SchemaResource],
    callback: BodyResponseCallback[SchemaResource]
  ): Unit = js.native
  def get(params: ParamsResourceResourcesGet, options: MethodOptions): GaxiosPromise[SchemaResource] = js.native
  def get(
    params: ParamsResourceResourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResource]
  ): Unit = js.native
  
  /**
    * deploymentmanager.resources.list
    * @desc Lists all resources in a given deployment.
    * @alias deploymentmanager.resources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deployment The name of the deployment for this request.
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaResourcesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResourcesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResourcesListResponse] = js.native
  def list(params: ParamsResourceResourcesList): GaxiosPromise[SchemaResourcesListResponse] = js.native
  def list(params: ParamsResourceResourcesList, callback: BodyResponseCallback[SchemaResourcesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceResourcesList,
    options: BodyResponseCallback[SchemaResourcesListResponse],
    callback: BodyResponseCallback[SchemaResourcesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResourcesList, options: MethodOptions): GaxiosPromise[SchemaResourcesListResponse] = js.native
  def list(
    params: ParamsResourceResourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourcesListResponse]
  ): Unit = js.native
}
