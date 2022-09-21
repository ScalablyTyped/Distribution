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

@JSImport("googleapis/build/src/apis/datapipelines/v1", "datapipelines_v1.Resource$Projects$Locations$Pipelines$Jobs")
@js.native
open class ResourceProjectsLocationsPipelinesJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1ListJobsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsPipelinesJobsList): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPipelinesJobsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsPipelinesJobsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1ListJobsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatapipelinesV1ListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsPipelinesJobsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatapipelinesV1ListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPipelinesJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatapipelinesV1ListJobsResponse]
  ): Unit = js.native
  /**
    * Lists jobs for a given pipeline. Throws a "FORBIDDEN" error if the caller doesn't have permission to access it.
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
    *   const res = await datapipelines.projects.locations.pipelines.jobs.list({
    *     // The maximum number of entities to return. The service may return fewer than this value, even if there are additional pages. If unspecified, the max limit will be determined by the backend implementation.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListJobs` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListJobs` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`.
    *     parent: 'projects/my-project/locations/my-location/pipelines/my-pipeline',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "jobs": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsLocationsPipelinesJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsPipelinesJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
