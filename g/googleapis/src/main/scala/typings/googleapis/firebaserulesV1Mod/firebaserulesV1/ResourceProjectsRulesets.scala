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

@JSImport("googleapis/build/src/apis/firebaserules/v1", "firebaserules_v1.Resource$Projects$Rulesets")
@js.native
open class ResourceProjectsRulesets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRuleset] = js.native
  def create(callback: BodyResponseCallback[SchemaRuleset]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRuleset] = js.native
  def create(params: ParamsResourceProjectsRulesetsCreate): GaxiosPromise[SchemaRuleset] = js.native
  def create(params: ParamsResourceProjectsRulesetsCreate, callback: BodyResponseCallback[SchemaRuleset]): Unit = js.native
  def create(
    params: ParamsResourceProjectsRulesetsCreate,
    options: BodyResponseCallback[Readable | SchemaRuleset],
    callback: BodyResponseCallback[Readable | SchemaRuleset]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsRulesetsCreate, options: MethodOptions): GaxiosPromise[SchemaRuleset] = js.native
  def create(
    params: ParamsResourceProjectsRulesetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuleset]
  ): Unit = js.native
  /**
    * Create a `Ruleset` from `Source`. The `Ruleset` is given a unique generated name which is returned to the caller. `Source` containing syntactic or semantics errors will result in an error response indicating the first error encountered. For a detailed view of `Source` issues, use TestRuleset.
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
    *   const res = await firebaserules.projects.rulesets.create({
    *     // Required. Resource name for Project which owns this `Ruleset`. Format: `projects/{project_id\}`
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "source": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "source": {}
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
  def create(params: ParamsResourceProjectsRulesetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsRulesetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsRulesetsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsRulesetsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsRulesetsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsRulesetsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsRulesetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete a `Ruleset` by resource name. If the `Ruleset` is referenced by a `Release` the operation will fail.
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
    *   const res = await firebaserules.projects.rulesets.delete({
    *     // Required. Resource name for the ruleset to delete. Format: `projects/{project_id\}/rulesets/{ruleset_id\}`
    *     name: 'projects/my-project/rulesets/my-ruleset',
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
  def delete(params: ParamsResourceProjectsRulesetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsRulesetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRuleset] = js.native
  def get(callback: BodyResponseCallback[SchemaRuleset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRuleset] = js.native
  def get(params: ParamsResourceProjectsRulesetsGet): GaxiosPromise[SchemaRuleset] = js.native
  def get(params: ParamsResourceProjectsRulesetsGet, callback: BodyResponseCallback[SchemaRuleset]): Unit = js.native
  def get(
    params: ParamsResourceProjectsRulesetsGet,
    options: BodyResponseCallback[Readable | SchemaRuleset],
    callback: BodyResponseCallback[Readable | SchemaRuleset]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsRulesetsGet, options: MethodOptions): GaxiosPromise[SchemaRuleset] = js.native
  def get(
    params: ParamsResourceProjectsRulesetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuleset]
  ): Unit = js.native
  /**
    * Get a `Ruleset` by name including the full `Source` contents.
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
    *   const res = await firebaserules.projects.rulesets.get({
    *     // Required. Resource name for the ruleset to get. Format: `projects/{project_id\}/rulesets/{ruleset_id\}`
    *     name: 'projects/my-project/rulesets/my-ruleset',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "source": {}
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
  def get(params: ParamsResourceProjectsRulesetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsRulesetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRulesetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRulesetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRulesetsResponse] = js.native
  def list(params: ParamsResourceProjectsRulesetsList): GaxiosPromise[SchemaListRulesetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRulesetsList,
    callback: BodyResponseCallback[SchemaListRulesetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRulesetsList,
    options: BodyResponseCallback[Readable | SchemaListRulesetsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRulesetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRulesetsList, options: MethodOptions): GaxiosPromise[SchemaListRulesetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsRulesetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRulesetsResponse]
  ): Unit = js.native
  /**
    * List `Ruleset` metadata only and optionally filter the results by `Ruleset` name. The full `Source` contents of a `Ruleset` may be retrieved with GetRuleset.
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
    *   const res = await firebaserules.projects.rulesets.list({
    *     // `Ruleset` filter. The list method supports filters with restrictions on `Ruleset.name`. Filters on `Ruleset.create_time` should use the `date` function which parses strings that conform to the RFC 3339 date/time specifications. Example: `create_time \> date("2017-01-01T00:00:00Z") AND name=UUID-*`
    *     filter: 'placeholder-value',
    *     // Required. Resource name for the project. Format: `projects/{project_id\}`
    *     name: 'projects/my-project',
    *     // Page size to load. Maximum of 100. Defaults to 10. Note: `page_size` is just a hint and the service may choose to load less than `page_size` due to the size of the output. To traverse all of the releases, caller should iterate until the `page_token` is empty.
    *     pageSize: 'placeholder-value',
    *     // Next page token for loading the next batch of `Ruleset` instances.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "rulesets": []
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
  def list(params: ParamsResourceProjectsRulesetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsRulesetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
