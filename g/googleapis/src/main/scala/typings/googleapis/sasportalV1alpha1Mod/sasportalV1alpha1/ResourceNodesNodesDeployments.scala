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

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Nodes$Nodes$Deployments")
@js.native
open class ResourceNodesNodesDeployments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(callback: BodyResponseCallback[SchemaSasPortalDeployment]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(params: ParamsResourceNodesNodesDeploymentsCreate): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(
    params: ParamsResourceNodesNodesDeploymentsCreate,
    callback: BodyResponseCallback[SchemaSasPortalDeployment]
  ): Unit = js.native
  def create(
    params: ParamsResourceNodesNodesDeploymentsCreate,
    options: BodyResponseCallback[Readable | SchemaSasPortalDeployment],
    callback: BodyResponseCallback[Readable | SchemaSasPortalDeployment]
  ): Unit = js.native
  def create(params: ParamsResourceNodesNodesDeploymentsCreate, options: MethodOptions): GaxiosPromise[SchemaSasPortalDeployment] = js.native
  def create(
    params: ParamsResourceNodesNodesDeploymentsCreate,
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
    *   const res = await sasportal.nodes.nodes.deployments.create({
    *     // Required. The parent resource name where the deployment is to be created.
    *     parent: 'nodes/my-node/nodes/my-node',
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
  def create(params: ParamsResourceNodesNodesDeploymentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceNodesNodesDeploymentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaSasPortalListDeploymentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(params: ParamsResourceNodesNodesDeploymentsList): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceNodesNodesDeploymentsList,
    callback: BodyResponseCallback[SchemaSasPortalListDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceNodesNodesDeploymentsList,
    options: BodyResponseCallback[Readable | SchemaSasPortalListDeploymentsResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalListDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceNodesNodesDeploymentsList, options: MethodOptions): GaxiosPromise[SchemaSasPortalListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceNodesNodesDeploymentsList,
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
    *   const res = await sasportal.nodes.nodes.deployments.list({
    *     // The filter expression. The filter should have the following format: "DIRECT_CHILDREN" or format: "direct_children". The filter is case insensitive. If empty, then no deployments are filtered.
    *     filter: 'placeholder-value',
    *     // The maximum number of deployments to return in the response.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to ListDeployments that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name, for example, "nodes/1", customer/1/nodes/2.
    *     parent: 'nodes/my-node/nodes/my-node',
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
  def list(params: ParamsResourceNodesNodesDeploymentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceNodesNodesDeploymentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
