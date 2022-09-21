package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Locations$Agent$Versions")
@js.native
open class ResourceProjectsLocationsAgentVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def create(params: ParamsResourceProjectsLocationsAgentVersionsCreate): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentVersionsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAgentVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  /**
    * Creates an agent version. The new version points to the agent instance in the "default" environment.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.agent.versions.create({
    *     // Required. The agent to create a version for. Supported formats: - `projects//agent` - `projects//locations//agent`
    *     parent: 'projects/my-project/locations/my-location/agent',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "name": "my_name",
    *       //   "status": "my_status",
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
    *   //   "name": "my_name",
    *   //   "status": "my_status",
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
  def create(params: ParamsResourceProjectsLocationsAgentVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAgentVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentVersionsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentVersionsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentVersionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAgentVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Delete the specified agent version.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.agent.versions.delete({
    *     // Required. The name of the version to delete. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    *     name: 'projects/my-project/locations/my-location/agent/versions/my-version',
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
  def delete(params: ParamsResourceProjectsLocationsAgentVersionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAgentVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def get(params: ParamsResourceProjectsLocationsAgentVersionsGet): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentVersionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentVersionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAgentVersionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  /**
    * Retrieves the specified agent version.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.agent.versions.get({
    *     // Required. The name of the version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    *     name: 'projects/my-project/locations/my-location/agent/versions/my-version',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "status": "my_status",
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
  def get(params: ParamsResourceProjectsLocationsAgentVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAgentVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAgentVersionsList): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentVersionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentVersionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAgentVersionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1ListVersionsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all versions of the specified agent.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.agent.versions.list({
    *     // Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The next_page_token value returned from a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Required. The agent to list all versions from. Supported formats: - `projects//agent` - `projects//locations//agent`
    *     parent: 'projects/my-project/locations/my-location/agent',
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
  def list(params: ParamsResourceProjectsLocationsAgentVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAgentVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentVersionsPatch): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentVersionsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentVersionsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Version],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsAgentVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDialogflowV2beta1Version] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDialogflowV2beta1Version]
  ): Unit = js.native
  /**
    * Updates the specified agent version. Note that this method does not allow you to update the state of the agent the given version points to. It allows you to update only mutable properties of the version resource.
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
    * const dialogflow = google.dialogflow('v2beta1');
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
    *   const res = await dialogflow.projects.locations.agent.versions.patch({
    *     // Output only. The unique identifier of this agent version. Supported formats: - `projects//agent/versions/` - `projects//locations//agent/versions/`
    *     name: 'projects/my-project/locations/my-location/agent/versions/my-version',
    *     // Required. The mask to control which fields get updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "name": "my_name",
    *       //   "status": "my_status",
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
    *   //   "name": "my_name",
    *   //   "status": "my_status",
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
  def patch(params: ParamsResourceProjectsLocationsAgentVersionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsAgentVersionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
