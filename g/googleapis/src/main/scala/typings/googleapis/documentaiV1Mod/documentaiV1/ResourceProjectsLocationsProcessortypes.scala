package typings.googleapis.documentaiV1Mod.documentaiV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/documentai/v1", "documentai_v1.Resource$Projects$Locations$Processortypes")
@js.native
open class ResourceProjectsLocationsProcessortypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProcessortypesList): GaxiosPromise[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessortypesList,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessortypesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProcessortypesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessortypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse]
  ): Unit = js.native
  /**
    * Lists the processor types that exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/documentai.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const documentai = google.documentai('v1');
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
    *   const res = await documentai.projects.locations.processorTypes.list({
    *     // The maximum number of processor types to return. If unspecified, at most 100 processor types will be returned. The maximum value is 500; values above 500 will be coerced to 500.
    *     pageSize: 'placeholder-value',
    *     // Used to retrieve the next page of results, empty if at the end of the list.
    *     pageToken: 'placeholder-value',
    *     // Required. The location of processor type to list. The available processor types may depend on the allow-listing on projects. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "processorTypes": []
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
  def list(params: ParamsResourceProjectsLocationsProcessortypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessortypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
