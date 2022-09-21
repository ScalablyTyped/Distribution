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

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Nodes")
@js.native
open class ResourceNodes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var deployments: ResourceNodesDeployments = js.native
  
  var devices: ResourceNodesDevices = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(params: ParamsResourceNodesGet): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(params: ParamsResourceNodesGet, callback: BodyResponseCallback[SchemaSasPortalNode]): Unit = js.native
  def get(
    params: ParamsResourceNodesGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalNode],
    callback: BodyResponseCallback[Readable | SchemaSasPortalNode]
  ): Unit = js.native
  def get(params: ParamsResourceNodesGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalNode] = js.native
  def get(
    params: ParamsResourceNodesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalNode]
  ): Unit = js.native
  /**
    * Returns a requested node.
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
    *   const res = await sasportal.nodes.get({
    *     // Required. The name of the node.
    *     name: 'nodes/my-node',
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
  def get(params: ParamsResourceNodesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNodesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var nodes: ResourceNodesNodes = js.native
}
