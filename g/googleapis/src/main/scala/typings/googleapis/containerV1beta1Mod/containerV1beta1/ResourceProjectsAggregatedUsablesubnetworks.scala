package typings.googleapis.containerV1beta1Mod.containerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/container/v1beta1", "container_v1beta1.Resource$Projects$Aggregated$Usablesubnetworks")
@js.native
class ResourceProjectsAggregatedUsablesubnetworks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * container.projects.aggregated.usableSubnetworks.list
    * @desc Lists subnetworks that are usable for creating clusters in a
    * project.
    * @alias container.projects.aggregated.usableSubnetworks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Filtering currently only supports equality on the networkProjectId and must be in the form: "networkProjectId=[PROJECTID]", where `networkProjectId` is the project which owns the listed subnetworks. This defaults to the parent project ID.
    * @param {integer=} params.pageSize The max number of results per page that should be returned. If the number of available results is larger than `page_size`, a `next_page_token` is returned which can be used to get the next page of results in subsequent requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.pageToken Specifies a page token to use. Set this to the nextPageToken returned by previous list requests to get the next page of results.
    * @param {string} params.parent The parent project where subnetworks are usable. Specified in the format 'projects/x'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(params: ParamsResourceProjectsAggregatedUsablesubnetworksList): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    options: BodyResponseCallback[SchemaListUsableSubnetworksResponse],
    callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsAggregatedUsablesubnetworksList, options: MethodOptions): GaxiosPromise[SchemaListUsableSubnetworksResponse] = js.native
  def list(
    params: ParamsResourceProjectsAggregatedUsablesubnetworksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUsableSubnetworksResponse]
  ): Unit = js.native
}
