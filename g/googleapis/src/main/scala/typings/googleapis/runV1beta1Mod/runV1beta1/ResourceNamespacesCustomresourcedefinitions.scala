package typings.googleapis.runV1beta1Mod.runV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/run/v1beta1", "run_v1beta1.Resource$Namespaces$Customresourcedefinitions")
@js.native
open class ResourceNamespacesCustomresourcedefinitions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaCustomResourceDefinition] = js.native
  def get(callback: BodyResponseCallback[SchemaCustomResourceDefinition]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomResourceDefinition] = js.native
  def get(params: ParamsResourceNamespacesCustomresourcedefinitionsGet): GaxiosPromise[SchemaCustomResourceDefinition] = js.native
  def get(
    params: ParamsResourceNamespacesCustomresourcedefinitionsGet,
    callback: BodyResponseCallback[SchemaCustomResourceDefinition]
  ): Unit = js.native
  def get(
    params: ParamsResourceNamespacesCustomresourcedefinitionsGet,
    options: BodyResponseCallback[Readable | SchemaCustomResourceDefinition],
    callback: BodyResponseCallback[Readable | SchemaCustomResourceDefinition]
  ): Unit = js.native
  def get(params: ParamsResourceNamespacesCustomresourcedefinitionsGet, options: MethodOptions): GaxiosPromise[SchemaCustomResourceDefinition] = js.native
  def get(
    params: ParamsResourceNamespacesCustomresourcedefinitionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomResourceDefinition]
  ): Unit = js.native
  /**
    * Rpc to get information about a CustomResourceDefinition.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/run.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const run = google.run('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await run.namespaces.customresourcedefinitions.get({
    *     // The name of the CustomResourceDefinition being retrieved. If needed, replace {namespace_id\} with the project ID.
    *     name: 'namespaces/my-namespace/customresourcedefinitions/my-customresourcedefinition',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "spec": {}
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
  def get(params: ParamsResourceNamespacesCustomresourcedefinitionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNamespacesCustomresourcedefinitionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
