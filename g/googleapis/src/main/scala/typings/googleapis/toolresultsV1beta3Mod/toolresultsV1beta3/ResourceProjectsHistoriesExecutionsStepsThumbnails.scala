package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Thumbnails")
@js.native
open class ResourceProjectsHistoriesExecutionsStepsThumbnails protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListStepThumbnailsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListStepThumbnailsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListStepThumbnailsResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList): GaxiosPromise[SchemaListStepThumbnailsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList,
    callback: BodyResponseCallback[SchemaListStepThumbnailsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList,
    options: BodyResponseCallback[Readable | SchemaListStepThumbnailsResponse],
    callback: BodyResponseCallback[Readable | SchemaListStepThumbnailsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList, options: MethodOptions): GaxiosPromise[SchemaListStepThumbnailsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStepThumbnailsResponse]
  ): Unit = js.native
  /**
    * Lists thumbnails of images attached to a step. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from the project, or from any of the images - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step does not exist, or if any of the images do not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *   const res =
    *     await toolresults.projects.histories.executions.steps.thumbnails.list({
    *       // An Execution id. Required.
    *       executionId: 'placeholder-value',
    *       // A History id. Required.
    *       historyId: 'placeholder-value',
    *       // The maximum number of thumbnails to fetch. Default value: 50. The server will use this default if the field is not set or has a value of 0. Optional.
    *       pageSize: 'placeholder-value',
    *       // A continuation token to resume the query at the next item. Optional.
    *       pageToken: 'placeholder-value',
    *       // A Project id. Required.
    *       projectId: 'placeholder-value',
    *       // A Step id. Required.
    *       stepId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "thumbnails": []
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
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsThumbnailsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
