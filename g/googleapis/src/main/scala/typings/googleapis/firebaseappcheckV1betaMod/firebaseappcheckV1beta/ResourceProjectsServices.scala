package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaseappcheck/v1beta", "firebaseappcheck_v1beta.Resource$Projects$Services")
@js.native
open class ResourceProjectsServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchUpdate(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse]): Unit = js.native
  def batchUpdate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse] = js.native
  def batchUpdate(params: ParamsResourceProjectsServicesBatchupdate): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsServicesBatchupdate,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsResourceProjectsServicesBatchupdate,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse]
  ): Unit = js.native
  def batchUpdate(params: ParamsResourceProjectsServicesBatchupdate, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsServicesBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesResponse]
  ): Unit = js.native
  /**
    * Atomically updates the specified Service configurations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.services.batchUpdate({
    *     // Required. The parent project name shared by all Service configurations being updated, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being updated must match this field, or the entire batch fails.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "requests": [],
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "services": []
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
  def batchUpdate(params: ParamsResourceProjectsServicesBatchupdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchUpdate(
    params: ParamsResourceProjectsServicesBatchupdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaService]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def get(params: ParamsResourceProjectsServicesGet): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def get(
    params: ParamsResourceProjectsServicesGet,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaService]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsServicesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaService],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaService]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsServicesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def get(
    params: ParamsResourceProjectsServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaService]
  ): Unit = js.native
  /**
    * Gets the Service configuration for the specified service name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.services.get({
    *     // Required. The relative resource name of the Service to retrieve, in the format: ``` projects/{project_number\}/services/{service_id\} ``` Note that the `service_id` element must be a supported service ID. Currently, the following service IDs are supported: * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com` (Cloud Firestore)
    *     name: 'projects/my-project/services/my-service',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enforcementMode": "my_enforcementMode",
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsServicesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsServicesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse] = js.native
  def list(params: ParamsResourceProjectsServicesList): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse] = js.native
  def list(
    params: ParamsResourceProjectsServicesList,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsServicesList,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaListServicesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsServicesList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse] = js.native
  def list(
    params: ParamsResourceProjectsServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaListServicesResponse]
  ): Unit = js.native
  /**
    * Lists all Service configurations for the specified project. Only Services which were explicitly configured using UpdateService or BatchUpdateServices will be returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.services.list({
    *     // The maximum number of Services to return in the response. Only explicitly configured services are returned. The server may return fewer than this at its own discretion. If no value is specified (or too large a value is specified), the server will impose its own limit.
    *     pageSize: 'placeholder-value',
    *     // Token returned from a previous call to ListServices indicating where in the set of Services to resume listing. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListServices must match the call that provided the page token; if they do not match, the result is undefined.
    *     pageToken: 'placeholder-value',
    *     // Required. The relative resource name of the parent project for which to list each associated Service, in the format: ``` projects/{project_number\} ```
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "services": []
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
  def list(params: ParamsResourceProjectsServicesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsServicesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaService]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def patch(params: ParamsResourceProjectsServicesPatch): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def patch(
    params: ParamsResourceProjectsServicesPatch,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaService]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsServicesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaService],
    callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseAppcheckV1betaService]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsServicesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseAppcheckV1betaService] = js.native
  def patch(
    params: ParamsResourceProjectsServicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFirebaseAppcheckV1betaService]
  ): Unit = js.native
  /**
    * Updates the specified Service configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaseappcheck.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaseappcheck = google.firebaseappcheck('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaseappcheck.projects.services.patch({
    *     // Required. The relative resource name of the service configuration object, in the format: ``` projects/{project_number\}/services/{service_id\} ``` Note that the `service_id` element must be a supported service ID. Currently, the following service IDs are supported: * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com` (Cloud Firestore)
    *     name: 'projects/my-project/services/my-service',
    *     // Required. A comma-separated list of names of fields in the Service to update. Example: `enforcement_mode`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "enforcementMode": "my_enforcementMode",
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "enforcementMode": "my_enforcementMode",
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceProjectsServicesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsServicesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
