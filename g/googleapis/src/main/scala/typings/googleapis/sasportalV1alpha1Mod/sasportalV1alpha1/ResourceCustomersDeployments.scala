package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Customers$Deployments")
@js.native
open class ResourceCustomersDeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(callback: BodyResponseCallback[SchemaSasPortalDeployment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(params: ParamsResourceCustomersDeploymentsCreate): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(
    params: ParamsResourceCustomersDeploymentsCreate,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  def create(
    params: ParamsResourceCustomersDeploymentsCreate,
    options: BodyResponseCallback[Readable | SchemaSasPortalDeployment],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDeployment]
  ): Unit = js.native
  def create(params: ParamsResourceCustomersDeploymentsCreate, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(
    params: ParamsResourceCustomersDeploymentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  /**
    * Creates a new deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.customers.deployments.create({
    *     // Required. The parent resource name where the deployment is to be created.
    *     parent: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "frns": [],
    *       //   "name": "my_name",
    *       //   "sasUserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "frns": [],
    *   //   "name": "my_name",
    *   //   "sasUserIds": []
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
  def create(params: ParamsResourceCustomersDeploymentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustomersDeploymentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(params: ParamsResourceCustomersDeploymentsDelete): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(
    params: ParamsResourceCustomersDeploymentsDelete,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceCustomersDeploymentsDelete,
    options: BodyResponseCallback[Readable | SchemaSasPortalEmpty],
    callback: BodyResponseCallback[Readable | SchemaSasPortalEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomersDeploymentsDelete, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(
    params: ParamsResourceCustomersDeploymentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  /**
    * Deletes a deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.customers.deployments.delete({
    *     // Required. The name of the deployment.
    *     name: 'customers/my-customer/deployments/my-deployment',
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
  def delete(params: ParamsResourceCustomersDeploymentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCustomersDeploymentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var devices: ResourceCustomersDeploymentsDevices = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalDeployment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(params: ParamsResourceCustomersDeploymentsGet): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(
    params: ParamsResourceCustomersDeploymentsGet,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  def get(
    params: ParamsResourceCustomersDeploymentsGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalDeployment],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDeployment]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersDeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def get(
    params: ParamsResourceCustomersDeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  /**
    * Returns a requested deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.customers.deployments.get({
    *     // Required. The name of the deployment.
    *     name: 'customers/my-customer/deployments/my-deployment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "frns": [],
    *   //   "name": "my_name",
    *   //   "sasUserIds": []
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
  def get(params: ParamsResourceCustomersDeploymentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersDeploymentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListDeploymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(params: ParamsResourceCustomersDeploymentsList): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceCustomersDeploymentsList,
    callback: BodyResponseCallback[SchemaSasPortalListDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersDeploymentsList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListDeploymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersDeploymentsList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceCustomersDeploymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalListDeploymentsResponse]
  ): Unit = js.native
  /**
    * Lists deployments.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.customers.deployments.list({
    *     // The filter expression. The filter should have the following format: "DIRECT_CHILDREN" or format: "direct_children". The filter is case insensitive. If empty, then no deployments are filtered.
    *     filter: 'placeholder-value',
    *     // The maximum number of deployments to return in the response.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListDeployments that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name, for example, "nodes/1", customer/1/nodes/2.
    *     parent: 'customers/my-customer',
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
  def list(params: ParamsResourceCustomersDeploymentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersDeploymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(callback: BodyResponseCallback[SchemaSasPortalOperation]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(params: ParamsResourceCustomersDeploymentsMove): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(
    params: ParamsResourceCustomersDeploymentsMove,
    callback: BodyResponseCallback[SchemaSasPortalOperation]
  ): Unit = js.native
  def move(
    params: ParamsResourceCustomersDeploymentsMove,
    options: BodyResponseCallback[Readable | SchemaSasPortalOperation],
    callback: BodyResponseCallback[Readable | SchemaSasPortalOperation]
  ): Unit = js.native
  def move(params: ParamsResourceCustomersDeploymentsMove, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(
    params: ParamsResourceCustomersDeploymentsMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalOperation]
  ): Unit = js.native
  /**
    * Moves a deployment under another node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.customers.deployments.move({
    *     // Required. The name of the deployment to move.
    *     name: 'customers/my-customer/deployments/my-deployment',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "destination": "my_destination"
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
  def move(params: ParamsResourceCustomersDeploymentsMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceCustomersDeploymentsMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def patch(callback: BodyResponseCallback[SchemaSasPortalDeployment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def patch(params: ParamsResourceCustomersDeploymentsPatch): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def patch(
    params: ParamsResourceCustomersDeploymentsPatch,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCustomersDeploymentsPatch,
    options: BodyResponseCallback[Readable | SchemaSasPortalDeployment],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDeployment]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersDeploymentsPatch, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def patch(
    params: ParamsResourceCustomersDeploymentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  /**
    * Updates an existing deployment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.customers.deployments.patch({
    *     // Output only. Resource name.
    *     name: 'customers/my-customer/deployments/my-deployment',
    *     // Fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "frns": [],
    *       //   "name": "my_name",
    *       //   "sasUserIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "frns": [],
    *   //   "name": "my_name",
    *   //   "sasUserIds": []
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
  def patch(params: ParamsResourceCustomersDeploymentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustomersDeploymentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
