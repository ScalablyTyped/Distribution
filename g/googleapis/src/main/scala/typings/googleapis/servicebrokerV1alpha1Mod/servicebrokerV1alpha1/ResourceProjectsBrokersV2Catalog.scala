package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/servicebroker/v1alpha1", "servicebroker_v1alpha1.Resource$Projects$Brokers$V2$Catalog")
@js.native
class ResourceProjectsBrokersV2Catalog protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * servicebroker.projects.brokers.v2.catalog.list
    * @desc Lists all the Services registered with this broker for consumption
    * for given service registry broker, which contains an set of services.
    * Note, that Service producer API is separate from Broker API.
    * @alias servicebroker.projects.brokers.v2.catalog.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements. Optional. If unset or 0, all the results will be returned.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent Parent must match `projects/[PROJECT_ID]/brokers/[BROKER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse] = js.native
  def list(params: ParamsResourceProjectsBrokersV2CatalogList): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersV2CatalogList,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsBrokersV2CatalogList,
    options: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsBrokersV2CatalogList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse] = js.native
  def list(
    params: ParamsResourceProjectsBrokersV2CatalogList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudServicebrokerV1alpha1ListCatalogResponse]
  ): Unit = js.native
}
