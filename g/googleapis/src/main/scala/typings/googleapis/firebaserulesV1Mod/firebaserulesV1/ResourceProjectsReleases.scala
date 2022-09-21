package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Resource$Projects$Releases")
@js.native
open class ResourceProjectsReleases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRelease] = js.native
  def create(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def create(params: ParamsResourceProjectsReleasesCreate): GaxiosPromise[SchemaRelease] = js.native
  def create(params: ParamsResourceProjectsReleasesCreate, callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def create(
    params: ParamsResourceProjectsReleasesCreate,
    options: BodyResponseCallback[Readable | SchemaRelease],
    callback: BodyResponseCallback[Readable | SchemaRelease]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsReleasesCreate, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def create(
    params: ParamsResourceProjectsReleasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  /**
    * Create a `Release`. Release names should reflect the developer's deployment practices. For example, the release name may include the environment name, application name, application version, or any other name meaningful to the developer. Once a `Release` refers to a `Ruleset`, the rules can be enforced by Firebase Rules-enabled services. More than one `Release` may be 'live' concurrently. Consider the following three `Release` names for `projects/foo` and the `Ruleset` to which they refer. Release Name -\> Ruleset Name * projects/foo/releases/prod -\> projects/foo/rulesets/uuid123 * projects/foo/releases/prod/beta -\> projects/foo/rulesets/uuid123 * projects/foo/releases/prod/v23 -\> projects/foo/rulesets/uuid456 The relationships reflect a `Ruleset` rollout in progress. The `prod` and `prod/beta` releases refer to the same `Ruleset`. However, `prod/v23` refers to a new `Ruleset`. The `Ruleset` reference for a `Release` may be updated using the UpdateRelease method.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
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
    *   const res = await firebaserules.projects.releases.create({
    *     // Required. Resource name for the project which owns this `Release`. Format: `projects/{project_id\}`
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "rulesetName": "my_rulesetName",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "rulesetName": "my_rulesetName",
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
  def create(params: ParamsResourceProjectsReleasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsReleasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsReleasesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsReleasesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsReleasesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsReleasesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsReleasesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a `Release` by resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
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
    *   const res = await firebaserules.projects.releases.delete({
    *     // Required. Resource name for the `Release` to delete. Format: `projects/{project_id\}/releases/{release_id\}`
    *     name: 'projects/my-project/releases/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsReleasesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsReleasesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRelease] = js.native
  def get(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def get(params: ParamsResourceProjectsReleasesGet): GaxiosPromise[SchemaRelease] = js.native
  def get(params: ParamsResourceProjectsReleasesGet, callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def get(
    params: ParamsResourceProjectsReleasesGet,
    options: BodyResponseCallback[Readable | SchemaRelease],
    callback: BodyResponseCallback[Readable | SchemaRelease]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsReleasesGet, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def get(
    params: ParamsResourceProjectsReleasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  /**
    * Get a `Release` by name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaserules.projects.releases.get({
    *     // Required. Resource name of the `Release`. Format: `projects/{project_id\}/releases/{release_id\}`
    *     name: 'projects/my-project/releases/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "rulesetName": "my_rulesetName",
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
  def get(params: ParamsResourceProjectsReleasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsReleasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getExecutable(): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]): Unit = js.native
  def getExecutable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(params: ParamsResourceProjectsReleasesGetexecutable): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]
  ): Unit = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    options: BodyResponseCallback[Readable | SchemaGetReleaseExecutableResponse],
    callback: BodyResponseCallback[Readable | SchemaGetReleaseExecutableResponse]
  ): Unit = js.native
  def getExecutable(params: ParamsResourceProjectsReleasesGetexecutable, options: MethodOptions): GaxiosPromise[SchemaGetReleaseExecutableResponse] = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetReleaseExecutableResponse]
  ): Unit = js.native
  /**
    * Get the `Release` executable to use when enforcing rules.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaserules.projects.releases.getExecutable({
    *     // The requested runtime executable version. Defaults to FIREBASE_RULES_EXECUTABLE_V1.
    *     executableVersion: 'placeholder-value',
    *     // Required. Resource name of the `Release`. Format: `projects/{project_id\}/releases/{release_id\}`
    *     name: 'projects/my-project/releases/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "executable": "my_executable",
    *   //   "executableVersion": "my_executableVersion",
    *   //   "language": "my_language",
    *   //   "rulesetName": "my_rulesetName",
    *   //   "syncTime": "my_syncTime",
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
  def getExecutable(params: ParamsResourceProjectsReleasesGetexecutable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getExecutable(
    params: ParamsResourceProjectsReleasesGetexecutable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReleasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(params: ParamsResourceProjectsReleasesList): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    options: BodyResponseCallback[Readable | SchemaListReleasesResponse],
    callback: BodyResponseCallback[Readable | SchemaListReleasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsReleasesList, options: MethodOptions): GaxiosPromise[SchemaListReleasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReleasesResponse]
  ): Unit = js.native
  /**
    * List the `Release` values for a project. This list may optionally be filtered by `Release` name, `Ruleset` name, `TestSuite` name, or any combination thereof.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebaserules.projects.releases.list({
    *     // `Release` filter. The list method supports filters with restrictions on the `Release.name`, and `Release.ruleset_name`. Example 1: A filter of 'name=prod*' might return `Release`s with names within 'projects/foo' prefixed with 'prod': Name -\> Ruleset Name: * projects/foo/releases/prod -\> projects/foo/rulesets/uuid1234 * projects/foo/releases/prod/v1 -\> projects/foo/rulesets/uuid1234 * projects/foo/releases/prod/v2 -\> projects/foo/rulesets/uuid8888 Example 2: A filter of `name=prod* ruleset_name=uuid1234` would return only `Release` instances for 'projects/foo' with names prefixed with 'prod' referring to the same `Ruleset` name of 'uuid1234': Name -\> Ruleset Name: * projects/foo/releases/prod -\> projects/foo/rulesets/1234 * projects/foo/releases/prod/v1 -\> projects/foo/rulesets/1234 In the examples, the filter parameters refer to the search filters are relative to the project. Fully qualified prefixed may also be used.
    *     filter: 'placeholder-value',
    *     // Required. Resource name for the project. Format: `projects/{project_id\}`
    *     name: 'projects/my-project',
    *     // Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is just a hint and the service may choose to load fewer than `page_size` results due to the size of the output. To traverse all of the releases, the caller should iterate until the `page_token` on the response is empty.
    *     pageSize: 'placeholder-value',
    *     // Next page token for the next batch of `Release` instances.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "releases": []
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
  def list(params: ParamsResourceProjectsReleasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsReleasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRelease] = js.native
  def patch(callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def patch(params: ParamsResourceProjectsReleasesPatch): GaxiosPromise[SchemaRelease] = js.native
  def patch(params: ParamsResourceProjectsReleasesPatch, callback: BodyResponseCallback[SchemaRelease]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsReleasesPatch,
    options: BodyResponseCallback[Readable | SchemaRelease],
    callback: BodyResponseCallback[Readable | SchemaRelease]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsReleasesPatch, options: MethodOptions): GaxiosPromise[SchemaRelease] = js.native
  def patch(
    params: ParamsResourceProjectsReleasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRelease]
  ): Unit = js.native
  /**
    * Update a `Release` via PATCH. Only updates to `ruleset_name` will be honored. `Release` rename is not supported. To create a `Release` use the CreateRelease method.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebaserules.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebaserules = google.firebaserules('v1');
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
    *   const res = await firebaserules.projects.releases.patch({
    *     // Required. Resource name for the project which owns this `Release`. Format: `projects/{project_id\}`
    *     name: 'projects/my-project/releases/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "release": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "rulesetName": "my_rulesetName",
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
  def patch(params: ParamsResourceProjectsReleasesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsReleasesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
