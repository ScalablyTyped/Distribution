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

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects$Deployments")
@js.native
open class ResourceProjectsDeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDeployment] = js.native
  def create(callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def create(params: ParamsResourceProjectsDeploymentsCreate): GaxiosPromise[SchemaDeployment] = js.native
  def create(params: ParamsResourceProjectsDeploymentsCreate, callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def create(
    params: ParamsResourceProjectsDeploymentsCreate,
    options: BodyResponseCallback[Readable | SchemaDeployment],
    callback: BodyResponseCallback[Readable | SchemaDeployment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDeploymentsCreate, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def create(
    params: ParamsResourceProjectsDeploymentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  /**
    * Creates a deployment of an Apps Script project.
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
    *     scopes: ['https://www.googleapis.com/auth/script.deployments'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.deployments.create({
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "manifestFileName": "my_manifestFileName",
    *       //   "scriptId": "my_scriptId",
    *       //   "versionNumber": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deploymentConfig": {},
    *   //   "deploymentId": "my_deploymentId",
    *   //   "entryPoints": [],
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
  def create(params: ParamsResourceProjectsDeploymentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsDeploymentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDeploymentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDeploymentsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDeploymentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDeploymentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDeploymentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a deployment of an Apps Script project.
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
    *     scopes: ['https://www.googleapis.com/auth/script.deployments'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.deployments.delete({
    *     // The deployment ID to be undeployed.
    *     deploymentId: 'placeholder-value',
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
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
  def delete(params: ParamsResourceProjectsDeploymentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsDeploymentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDeployment] = js.native
  def get(callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def get(params: ParamsResourceProjectsDeploymentsGet): GaxiosPromise[SchemaDeployment] = js.native
  def get(params: ParamsResourceProjectsDeploymentsGet, callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def get(
    params: ParamsResourceProjectsDeploymentsGet,
    options: BodyResponseCallback[Readable | SchemaDeployment],
    callback: BodyResponseCallback[Readable | SchemaDeployment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def get(
    params: ParamsResourceProjectsDeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  /**
    * Gets a deployment of an Apps Script project.
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
    *       'https://www.googleapis.com/auth/script.deployments',
    *       'https://www.googleapis.com/auth/script.deployments.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.deployments.get({
    *     // The deployment ID.
    *     deploymentId: 'placeholder-value',
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deploymentConfig": {},
    *   //   "deploymentId": "my_deploymentId",
    *   //   "entryPoints": [],
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
  def get(params: ParamsResourceProjectsDeploymentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDeploymentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeploymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(params: ParamsResourceProjectsDeploymentsList): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    callback: BodyResponseCallback[SchemaListDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    options: BodyResponseCallback[Readable | SchemaListDeploymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDeploymentsList, options: MethodOptions): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeploymentsResponse]
  ): Unit = js.native
  /**
    * Lists the deployments of an Apps Script project.
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
    *       'https://www.googleapis.com/auth/script.deployments',
    *       'https://www.googleapis.com/auth/script.deployments.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.deployments.list({
    *     // The maximum number of deployments on each returned page. Defaults to 50.
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
    *   //   "deployments": [],
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
  def list(params: ParamsResourceProjectsDeploymentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDeployment] = js.native
  def update(callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def update(params: ParamsResourceProjectsDeploymentsUpdate): GaxiosPromise[SchemaDeployment] = js.native
  def update(params: ParamsResourceProjectsDeploymentsUpdate, callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def update(
    params: ParamsResourceProjectsDeploymentsUpdate,
    options: BodyResponseCallback[Readable | SchemaDeployment],
    callback: BodyResponseCallback[Readable | SchemaDeployment]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsDeploymentsUpdate, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def update(
    params: ParamsResourceProjectsDeploymentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  /**
    * Updates a deployment of an Apps Script project.
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
    *     scopes: ['https://www.googleapis.com/auth/script.deployments'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await script.projects.deployments.update({
    *     // The deployment ID for this deployment.
    *     deploymentId: 'placeholder-value',
    *     // The script project's Drive ID.
    *     scriptId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deploymentConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deploymentConfig": {},
    *   //   "deploymentId": "my_deploymentId",
    *   //   "entryPoints": [],
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
  def update(params: ParamsResourceProjectsDeploymentsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsDeploymentsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
