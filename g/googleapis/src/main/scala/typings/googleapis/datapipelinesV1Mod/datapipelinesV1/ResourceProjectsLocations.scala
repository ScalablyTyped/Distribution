package typings.googleapis.datapipelinesV1Mod.datapipelinesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datapipelines/v1", "datapipelines_v1.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listPipelines(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse] = js.native
  def listPipelines(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse]): Unit = js.native
  def listPipelines(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse] = js.native
  def listPipelines(params: ParamsResourceProjectsLocationsListpipelines): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse] = js.native
  def listPipelines(
    params: ParamsResourceProjectsLocationsListpipelines,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse]
  ): Unit = js.native
  def listPipelines(
    params: ParamsResourceProjectsLocationsListpipelines,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse]
  ): Unit = js.native
  def listPipelines(params: ParamsResourceProjectsLocationsListpipelines, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse] = js.native
  def listPipelines(
    params: ParamsResourceProjectsLocationsListpipelines,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1ListPipelinesResponse]
  ): Unit = js.native
  /**
    * Lists pipelines. Returns a "FORBIDDEN" error if the caller doesn't have permission to access it.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datapipelines.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datapipelines = google.datapipelines('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await datapipelines.projects.locations.listPipelines({
    *     // An expression for filtering the results of the request. If unspecified, all pipelines will be returned. Multiple filters can be applied and must be comma separated. Fields eligible for filtering are: + `type`: The type of the pipeline (streaming or batch). Allowed values are `ALL`, `BATCH`, and `STREAMING`. + `status`: The activity status of the pipeline. Allowed values are `ALL`, `ACTIVE`, `ARCHIVED`, and `PAUSED`. For example, to limit results to active batch processing pipelines: type:BATCH,status:ACTIVE
    *     filter: 'placeholder-value',
    *     // The maximum number of entities to return. The service may return fewer than this value, even if there are additional pages. If unspecified, the max limit is yet to be determined by the backend implementation.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListPipelines` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListPipelines` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "pipelines": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def listPipelines(params: ParamsResourceProjectsLocationsListpipelines, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listPipelines(
    params: ParamsResourceProjectsLocationsListpipelines,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var pipelines: ResourceProjectsLocationsPipelines = js.native
}
