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

@JSImport("googleapis/build/src/apis/prod_tt_sasportal/v1alpha1", "prod_tt_sasportal_v1alpha1.Resource$Customers$Nodes$Nodes")
@js.native
open class ResourceCustomersNodesNodes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(params: ParamsResourceCustomersNodesNodesCreate): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(
    params: ParamsResourceCustomersNodesNodesCreate,
    callback: BodyResponseCallback[SchemaSasPortalNode]
  ): Unit = js.native
  def create(
    params: ParamsResourceCustomersNodesNodesCreate,
    options: BodyResponseCallback[Readable | SchemaSasPortalNode],
    callback: BodyResponseCallback[Readable | SchemaSasPortalNode]
  ): Unit = js.native
  def create(params: ParamsResourceCustomersNodesNodesCreate, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def create(
    params: ParamsResourceCustomersNodesNodesCreate,
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
    *   const res = await prod_tt_sasportal.customers.nodes.nodes.create({
    *     // Required. The parent resource name where the node is to be created.
    *     parent: 'customers/my-customer/nodes/my-node',
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
  def create(params: ParamsResourceCustomersNodesNodesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCustomersNodesNodesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListNodesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(params: ParamsResourceCustomersNodesNodesList): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(
    params: ParamsResourceCustomersNodesNodesList,
    callback: BodyResponseCallback[SchemaSasPortalListNodesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersNodesNodesList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListNodesResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListNodesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersNodesNodesList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListNodesResponse] = js.native
  def list(
    params: ParamsResourceCustomersNodesNodesList,
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
    *   const res = await prod_tt_sasportal.customers.nodes.nodes.list({
    *     // The filter expression. The filter should have the following format: "DIRECT_CHILDREN" or format: "direct_children". The filter is case insensitive. If empty, then no nodes are filtered.
    *     filter: 'placeholder-value',
    *     // The maximum number of nodes to return in the response.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListNodes that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name, for example, "nodes/1".
    *     parent: 'customers/my-customer/nodes/my-node',
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
  def list(params: ParamsResourceCustomersNodesNodesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersNodesNodesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
