package typings.googleapis.scriptV1Mod.scriptV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects$Versions")
@js.native
open class ResourceProjectsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaVersion] = js.native
  def create(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceProjectsVersionsCreate): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceProjectsVersionsCreate, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(
    params: ParamsResourceProjectsVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaVersion],
    callback: BodyResponseCallback[Readable | SchemaVersion]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(
    params: ParamsResourceProjectsVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * Creates a new immutable version using the current code, with a unique version number.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/script.projects'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.versions.create({
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "scriptId": "my_scriptId",
    *       //   "versionNumber": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "scriptId": "my_scriptId",
    *   //   "versionNumber": 0
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
  def create(params: ParamsResourceProjectsVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceProjectsVersionsGet): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceProjectsVersionsGet, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(
    params: ParamsResourceProjectsVersionsGet,
    options: BodyResponseCallback[Readable | SchemaVersion],
    callback: BodyResponseCallback[Readable | SchemaVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(
    params: ParamsResourceProjectsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * Gets a version of a script project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/script.projects',
    *       'https://www.googleapis.com/auth/script.projects.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.versions.get({
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *     // The version number.
    *     versionNumber: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "scriptId": "my_scriptId",
    *   //   "versionNumber": 0
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
  def get(params: ParamsResourceProjectsVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    options: BodyResponseCallback[Readable | SchemaListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  /**
    * List the versions of a script project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/script.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const script = google.script('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/script.projects',
    *       'https://www.googleapis.com/auth/script.projects.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.versions.list({
    *     // The maximum number of versions on each returned page. Defaults to 50.
    *     pageSize: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    *     pageToken: 'placeholder-value',
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "versions": []
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
  def list(params: ParamsResourceProjectsVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
