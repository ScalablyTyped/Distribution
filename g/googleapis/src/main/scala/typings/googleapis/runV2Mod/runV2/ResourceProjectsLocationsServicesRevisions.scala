package typings.googleapis.runV2Mod.runV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v2", "run_v2.Resource$Projects$Locations$Services$Revisions")
@js.native
open class ResourceProjectsLocationsServicesRevisions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsServicesRevisionsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsServicesRevisionsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsServicesRevisionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsServicesRevisionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsServicesRevisionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Delete a Revision.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v2');
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
    *   const res = await run.projects.locations.services.revisions.delete({
    *     // A system-generated fingerprint for this version of the resource. This may be used to detect modification conflict during updates.
    *     etag: 'placeholder-value',
    *     // Required. The name of the Revision to delete. Format: projects/{project\}/locations/{location\}/services/{service\}/revisions/{revision\}
    *     name: 'projects/my-project/locations/my-location/services/my-service/revisions/my-revision',
    *     // Indicates that the request should be validated without actually deleting any resources.
    *     validateOnly: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsServicesRevisionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsServicesRevisionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudRunV2Revision] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudRunV2Revision]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2Revision] = js.native
  def get(params: ParamsResourceProjectsLocationsServicesRevisionsGet): GaxiosPromise[SchemaGoogleCloudRunV2Revision] = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesRevisionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2Revision]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesRevisionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2Revision],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2Revision]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsServicesRevisionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2Revision] = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesRevisionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2Revision]
  ): Unit = js.native
  /**
    * Gets information about a Revision.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v2');
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
    *   const res = await run.projects.locations.services.revisions.get({
    *     // Required. The full name of the Revision. Format: projects/{project\}/locations/{location\}/services/{service\}/revisions/{revision\}
    *     name: 'projects/my-project/locations/my-location/services/my-service/revisions/my-revision',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": {},
    *   //   "conditions": [],
    *   //   "containers": [],
    *   //   "createTime": "my_createTime",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "encryptionKey": "my_encryptionKey",
    *   //   "etag": "my_etag",
    *   //   "executionEnvironment": "my_executionEnvironment",
    *   //   "expireTime": "my_expireTime",
    *   //   "generation": "my_generation",
    *   //   "labels": {},
    *   //   "launchStage": "my_launchStage",
    *   //   "logUri": "my_logUri",
    *   //   "maxInstanceRequestConcurrency": 0,
    *   //   "name": "my_name",
    *   //   "observedGeneration": "my_observedGeneration",
    *   //   "reconciling": false,
    *   //   "scaling": {},
    *   //   "service": "my_service",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "timeout": "my_timeout",
    *   //   "uid": "my_uid",
    *   //   "updateTime": "my_updateTime",
    *   //   "volumes": [],
    *   //   "vpcAccess": {}
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
  def get(params: ParamsResourceProjectsLocationsServicesRevisionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsServicesRevisionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudRunV2ListRevisionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListRevisionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2ListRevisionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsServicesRevisionsList): GaxiosPromise[SchemaGoogleCloudRunV2ListRevisionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesRevisionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListRevisionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesRevisionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2ListRevisionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRunV2ListRevisionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsServicesRevisionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRunV2ListRevisionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesRevisionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRunV2ListRevisionsResponse]
  ): Unit = js.native
  /**
    * List Revisions from a given Service, or from a given location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v2');
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
    *   const res = await run.projects.locations.services.revisions.list({
    *     // Maximum number of revisions to return in this call.
    *     pageSize: 'placeholder-value',
    *     // A page token received from a previous call to ListRevisions. All other parameters must match.
    *     pageToken: 'placeholder-value',
    *     // Required. The Service from which the Revisions should be listed. To list all Revisions across Services, use "-" instead of Service name. Format: projects/{project\}/locations/{location\}/services/{service\}
    *     parent: 'projects/my-project/locations/my-location/services/my-service',
    *     // If true, returns deleted (but unexpired) resources along with active ones.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "revisions": []
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
  def list(params: ParamsResourceProjectsLocationsServicesRevisionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsServicesRevisionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
