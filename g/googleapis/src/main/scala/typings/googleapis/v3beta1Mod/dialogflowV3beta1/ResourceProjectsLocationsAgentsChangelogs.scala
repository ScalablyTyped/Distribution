package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3beta1", "dialogflow_v3beta1.Resource$Projects$Locations$Agents$Changelogs")
@js.native
open class ResourceProjectsLocationsAgentsChangelogs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Changelog] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Changelog]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Changelog] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsChangelogsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Changelog] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsChangelogsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Changelog]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsChangelogsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Changelog],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1Changelog]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsChangelogsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1Changelog] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsChangelogsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1Changelog]
  ): Unit = js.native
  /**
    * Retrieves the specified Changelog.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.agents.changelogs.get({
    *     // Required. The name of the changelog to get. Format: `projects//locations//agents//changelogs/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/changelogs/my-changelog',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "resource": "my_resource",
    *   //   "type": "my_type",
    *   //   "userEmail": "my_userEmail"
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
  def get(params: ParamsResourceProjectsLocationsAgentsChangelogsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsChangelogsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsChangelogsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsChangelogsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsChangelogsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsChangelogsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsChangelogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3beta1ListChangelogsResponse]
  ): Unit = js.native
  /**
    * Returns the list of Changelogs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dialogflow.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dialogflow = google.dialogflow('v3beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/dialogflow',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dialogflow.projects.locations.agents.changelogs.list({
    *     // The filter string. Supports filter by user_email, resource, type and create_time. Some examples: 1. By user email: user_email = "someone@google.com" 2. By resource name: resource = "projects/123/locations/global/agents/456/flows/789" 3. By resource display name: display_name = "my agent" 4. By action: action = "Create" 5. By type: type = "flows" 6. By create time. Currently predicates on `create_time` and `create_time_epoch_seconds` are supported: create_time_epoch_seconds \> 1551790877 AND create_time <= 2017-01-15T01:30:15.01Z 7. Combination of above filters: resource = "projects/123/locations/global/agents/456/flows/789" AND user_email = "someone@google.com" AND create_time <= 2017-01-15T01:30:15.01Z
    *     filter: 'placeholder-value',
    *     // The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent containing the changelogs. Format: `projects//locations//agents/`.
    *     parent: 'projects/my-project/locations/my-location/agents/my-agent',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "changelogs": [],
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
  def list(params: ParamsResourceProjectsLocationsAgentsChangelogsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsChangelogsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
