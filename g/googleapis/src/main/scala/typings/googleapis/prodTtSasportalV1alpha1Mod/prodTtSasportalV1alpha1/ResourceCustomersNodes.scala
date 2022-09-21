package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/prod_tt_sasportal/v1alpha1", "prod_tt_sasportal_v1alpha1.Resource$Customers$Nodes")
@js.native
open class ResourceCustomersNodes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(params: ParamsResourceCustomersNodesCreate): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(params: ParamsResourceCustomersNodesCreate, callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def create(
    params: ParamsResourceCustomersNodesCreate,
    options: BodyResponseCallback[Readable | SchemaSasPortalNode],
    callback: BodyResponseCallback[Readable | SchemaSasPortalNode]
  ): Unit = js.native
  def create(params: ParamsResourceCustomersNodesCreate, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(
    params: ParamsResourceCustomersNodesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalNode]
  ): Unit = js.native
  /**
    * Creates a new node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.customers.nodes.create({
    *     // Required. The parent resource name where the node is to be created.
    *     parent: 'customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
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
  def create(params: ParamsResourceCustomersNodesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustomersNodesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(params: ParamsResourceCustomersNodesDelete): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(params: ParamsResourceCustomersNodesDelete, callback: BodyResponseCallback[SchemaSasPortalEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceCustomersNodesDelete,
    options: BodyResponseCallback[Readable | SchemaSasPortalEmpty],
    callback: BodyResponseCallback[Readable | SchemaSasPortalEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceCustomersNodesDelete, options: MethodOptions): GaxiosPromise[SchemaSasPortalEmpty] = js.native
  def delete(
    params: ParamsResourceCustomersNodesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalEmpty]
  ): Unit = js.native
  /**
    * Deletes a node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.customers.nodes.delete({
    *     // Required. The name of the node.
    *     name: 'customers/my-customer/nodes/my-node',
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
  def delete(params: ParamsResourceCustomersNodesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCustomersNodesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var deployments: ResourceCustomersNodesDeployments = js.native
  
  var devices: ResourceCustomersNodesDevices = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(params: ParamsResourceCustomersNodesGet): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(params: ParamsResourceCustomersNodesGet, callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def get(
    params: ParamsResourceCustomersNodesGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalNode],
    callback: BodyResponseCallback[Readable | SchemaSasPortalNode]
  ): Unit = js.native
  def get(params: ParamsResourceCustomersNodesGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(
    params: ParamsResourceCustomersNodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalNode]
  ): Unit = js.native
  /**
    * Returns a requested node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.customers.nodes.get({
    *     // Required. The name of the node.
    *     name: 'customers/my-customer/nodes/my-node',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
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
  def get(params: ParamsResourceCustomersNodesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCustomersNodesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListNodesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(params: ParamsResourceCustomersNodesList): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(
    params: ParamsResourceCustomersNodesList,
    callback: BodyResponseCallback[SchemaSasPortalListNodesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersNodesList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListNodesResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListNodesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersNodesList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(
    params: ParamsResourceCustomersNodesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalListNodesResponse]
  ): Unit = js.native
  /**
    * Lists nodes.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.customers.nodes.list({
    *     // The filter expression. The filter should have the following format: "DIRECT_CHILDREN" or format: "direct_children". The filter is case insensitive. If empty, then no nodes are filtered.
    *     filter: 'placeholder-value',
    *     // The maximum number of nodes to return in the response.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListNodes that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name, for example, "nodes/1".
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nodes": []
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
  def list(params: ParamsResourceCustomersNodesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersNodesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(callback: BodyResponseCallback[SchemaSasPortalOperation]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(params: ParamsResourceCustomersNodesMove): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(params: ParamsResourceCustomersNodesMove, callback: BodyResponseCallback[SchemaSasPortalOperation]): Unit = js.native
  def move(
    params: ParamsResourceCustomersNodesMove,
    options: BodyResponseCallback[Readable | SchemaSasPortalOperation],
    callback: BodyResponseCallback[Readable | SchemaSasPortalOperation]
  ): Unit = js.native
  def move(params: ParamsResourceCustomersNodesMove, options: MethodOptions): GaxiosPromise[SchemaSasPortalOperation] = js.native
  def move(
    params: ParamsResourceCustomersNodesMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalOperation]
  ): Unit = js.native
  /**
    * Moves a node under another node or customer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.customers.nodes.move({
    *     // Required. The name of the node to move.
    *     name: 'customers/my-customer/nodes/my-node',
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
  def move(params: ParamsResourceCustomersNodesMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceCustomersNodesMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var nodes: ResourceCustomersNodesNodes = js.native
  
  def patch(): GaxiosPromise[SchemaSasPortalNode] = js.native
  def patch(callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def patch(params: ParamsResourceCustomersNodesPatch): GaxiosPromise[SchemaSasPortalNode] = js.native
  def patch(params: ParamsResourceCustomersNodesPatch, callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def patch(
    params: ParamsResourceCustomersNodesPatch,
    options: BodyResponseCallback[Readable | SchemaSasPortalNode],
    callback: BodyResponseCallback[Readable | SchemaSasPortalNode]
  ): Unit = js.native
  def patch(params: ParamsResourceCustomersNodesPatch, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def patch(
    params: ParamsResourceCustomersNodesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalNode]
  ): Unit = js.native
  /**
    * Updates an existing node.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/prod_tt_sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const prod_tt_sasportal = google.prod_tt_sasportal('v1alpha1');
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
    *   const res = await prod_tt_sasportal.customers.nodes.patch({
    *     // Output only. Resource name.
    *     name: 'customers/my-customer/nodes/my-node',
    *     // Fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
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
  def patch(params: ParamsResourceCustomersNodesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCustomersNodesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
