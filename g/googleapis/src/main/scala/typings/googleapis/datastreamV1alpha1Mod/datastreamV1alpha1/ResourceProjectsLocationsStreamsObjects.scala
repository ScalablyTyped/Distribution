package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datastream/v1alpha1", "datastream_v1alpha1.Resource$Projects$Locations$Streams$Objects")
@js.native
open class ResourceProjectsLocationsStreamsObjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaStreamObject] = js.native
  def get(callback: BodyResponseCallback[SchemaStreamObject]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStreamObject] = js.native
  def get(params: ParamsResourceProjectsLocationsStreamsObjectsGet): GaxiosPromise[SchemaStreamObject] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStreamsObjectsGet,
    callback: BodyResponseCallback[SchemaStreamObject]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsStreamsObjectsGet,
    options: BodyResponseCallback[Readable | SchemaStreamObject],
    callback: BodyResponseCallback[Readable | SchemaStreamObject]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsStreamsObjectsGet, options: MethodOptions): GaxiosPromise[SchemaStreamObject] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStreamsObjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStreamObject]
  ): Unit = js.native
  /**
    * Use this method to get details about a stream object.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.streams.objects.get({
    *     // Required. The name of the stream object resource to get.
    *     name: 'projects/my-project/locations/my-location/streams/my-stream/objects/my-object',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backfillJob": {},
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "errors": [],
    *   //   "name": "my_name",
    *   //   "sourceObject": {},
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsStreamsObjectsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStreamsObjectsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListStreamObjectsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListStreamObjectsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListStreamObjectsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsStreamsObjectsList): GaxiosPromise[SchemaListStreamObjectsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStreamsObjectsList,
    callback: BodyResponseCallback[SchemaListStreamObjectsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsStreamsObjectsList,
    options: BodyResponseCallback[Readable | SchemaListStreamObjectsResponse],
    callback: BodyResponseCallback[Readable | SchemaListStreamObjectsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsStreamsObjectsList, options: MethodOptions): GaxiosPromise[SchemaListStreamObjectsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStreamsObjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListStreamObjectsResponse]
  ): Unit = js.native
  /**
    * Use this method to list the objects of a specific stream.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.streams.objects.list({
    *     // Maximum number of objects to return. Default is 50. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Page token received from a previous `ListStreamObjectsRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListStreamObjectsRequest` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent stream that owns the collection of objects.
    *     parent: 'projects/my-project/locations/my-location/streams/my-stream',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "streamObjects": []
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
  def list(params: ParamsResourceProjectsLocationsStreamsObjectsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStreamsObjectsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startBackfillJob(): GaxiosPromise[SchemaStartBackfillJobResponse] = js.native
  def startBackfillJob(callback: BodyResponseCallback[SchemaStartBackfillJobResponse]): Unit = js.native
  def startBackfillJob(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStartBackfillJobResponse] = js.native
  def startBackfillJob(params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob): GaxiosPromise[SchemaStartBackfillJobResponse] = js.native
  def startBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob,
    callback: BodyResponseCallback[SchemaStartBackfillJobResponse]
  ): Unit = js.native
  def startBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob,
    options: BodyResponseCallback[Readable | SchemaStartBackfillJobResponse],
    callback: BodyResponseCallback[Readable | SchemaStartBackfillJobResponse]
  ): Unit = js.native
  def startBackfillJob(params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob, options: MethodOptions): GaxiosPromise[SchemaStartBackfillJobResponse] = js.native
  def startBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStartBackfillJobResponse]
  ): Unit = js.native
  /**
    * Starts backfill job for the specified stream object.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *     await datastream.projects.locations.streams.objects.startBackfillJob({
    *       // Required. The name of the stream object resource to start a backfill job for.
    *       object:
    *         'projects/my-project/locations/my-location/streams/my-stream/objects/my-object',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "object": {}
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
  def startBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def startBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStartbackfilljob,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stopBackfillJob(): GaxiosPromise[SchemaStopBackfillJobResponse] = js.native
  def stopBackfillJob(callback: BodyResponseCallback[SchemaStopBackfillJobResponse]): Unit = js.native
  def stopBackfillJob(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStopBackfillJobResponse] = js.native
  def stopBackfillJob(params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob): GaxiosPromise[SchemaStopBackfillJobResponse] = js.native
  def stopBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob,
    callback: BodyResponseCallback[SchemaStopBackfillJobResponse]
  ): Unit = js.native
  def stopBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob,
    options: BodyResponseCallback[Readable | SchemaStopBackfillJobResponse],
    callback: BodyResponseCallback[Readable | SchemaStopBackfillJobResponse]
  ): Unit = js.native
  def stopBackfillJob(params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob, options: MethodOptions): GaxiosPromise[SchemaStopBackfillJobResponse] = js.native
  def stopBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStopBackfillJobResponse]
  ): Unit = js.native
  /**
    * Stops the backfill job for the specified stream object.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *     await datastream.projects.locations.streams.objects.stopBackfillJob({
    *       // Required. The name of the stream object resource to stop the backfill job for.
    *       object:
    *         'projects/my-project/locations/my-location/streams/my-stream/objects/my-object',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "object": {}
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
  def stopBackfillJob(params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stopBackfillJob(
    params: ParamsResourceProjectsLocationsStreamsObjectsStopbackfilljob,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
