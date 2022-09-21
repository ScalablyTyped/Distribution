package typings.googleapis.dialogflowV3Mod.dialogflowV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v3", "dialogflow_v3.Resource$Projects$Locations$Agents$Flows$Versions")
@js.native
open class ResourceProjectsLocationsAgentsFlowsVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def compareVersions(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse] = js.native
  def compareVersions(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse]): Unit = js.native
  def compareVersions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse] = js.native
  def compareVersions(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse] = js.native
  def compareVersions(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse]
  ): Unit = js.native
  def compareVersions(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse]
  ): Unit = js.native
  def compareVersions(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse] = js.native
  def compareVersions(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3CompareVersionsResponse]
  ): Unit = js.native
  /**
    * Compares the specified base version with target version.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res =
    *     await dialogflow.projects.locations.agents.flows.versions.compareVersions({
    *       // Required. Name of the base flow version to compare with the target version. Use version ID `0` to indicate the draft version of the specified flow. Format: `projects//locations//agents/ /flows//versions/`.
    *       baseVersion:
    *         'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/versions/my-version',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "languageCode": "my_languageCode",
    *         //   "targetVersion": "my_targetVersion"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "baseVersionContentJson": "my_baseVersionContentJson",
    *   //   "compareTime": "my_compareTime",
    *   //   "targetVersionContentJson": "my_targetVersionContentJson"
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
  def compareVersions(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def compareVersions(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCompareversions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates a Version in the specified Flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: CreateVersionOperationMetadata - `response`: Version
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.flows.versions.create({
    *     // Required. The Flow to create an Version for. Format: `projects//locations//agents//flows/`.
    *     parent:
    *       'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "nluSettings": {},
    *       //   "state": "my_state"
    *       // }
    *     },
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
  def create(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified Version.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.flows.versions.delete({
    *     // Required. The name of the Version to delete. Format: `projects//locations//agents//flows//versions/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/versions/my-version',
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
  def delete(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Version]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Version]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Version]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Version]
  ): Unit = js.native
  /**
    * Retrieves the specified Version.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.flows.versions.get({
    *     // Required. The name of the Version. Format: `projects//locations//agents//flows//versions/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "nluSettings": {},
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3ListVersionsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all versions in the specified Flow.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.flows.versions.list({
    *     // The maximum number of items to return in a single page. By default 20 and at most 100.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The Flow to list all versions for. Format: `projects//locations//agents//flows/`.
    *     parent:
    *       'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow',
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
  def list(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def load(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def load(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def load(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def load(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def load(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def load(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def load(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def load(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Loads resources in the specified version to the draft flow. This method is a [long-running operation](https://cloud.google.com/dialogflow/cx/docs/how/long-running-operation). The returned `Operation` type has the following method-specific fields: - `metadata`: An empty [Struct message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#struct) - `response`: An [Empty message](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#empty)
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.flows.versions.load({
    *     // Required. The Version to be loaded to draft flow. Format: `projects//locations//agents//flows//versions/`.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/versions/my-version',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowOverrideAgentResources": false
    *       // }
    *     },
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
  def load(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def load(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Version]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Version]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowCxV3Version]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowCxV3Version] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowCxV3Version]
  ): Unit = js.native
  /**
    * Updates the specified Version.
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
    * const dialogflow = google.dialogflow('v3');
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
    *   const res = await dialogflow.projects.locations.agents.flows.versions.patch({
    *     // Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow upon version creation.
    *     name: 'projects/my-project/locations/my-location/agents/my-agent/flows/my-flow/versions/my-version',
    *     // Required. The mask to control which fields get updated. Currently only `description` and `display_name` can be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "nluSettings": {},
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "nluSettings": {},
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentsFlowsVersionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
