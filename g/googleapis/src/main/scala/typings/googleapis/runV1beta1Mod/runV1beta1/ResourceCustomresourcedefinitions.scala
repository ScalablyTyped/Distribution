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

@JSImport("googleapis/build/src/apis/run/v1beta1", "run_v1beta1.Resource$Customresourcedefinitions")
@js.native
open class ResourceCustomresourcedefinitions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListCustomResourceDefinitionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomResourceDefinitionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCustomResourceDefinitionsResponse] = js.native
  def list(params: ParamsResourceCustomresourcedefinitionsList): GaxiosPromise[SchemaListCustomResourceDefinitionsResponse] = js.native
  def list(
    params: ParamsResourceCustomresourcedefinitionsList,
    callback: BodyResponseCallback[SchemaListCustomResourceDefinitionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomresourcedefinitionsList,
    options: BodyResponseCallback[Readable | SchemaListCustomResourceDefinitionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListCustomResourceDefinitionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomresourcedefinitionsList, options: MethodOptions): GaxiosPromise[SchemaListCustomResourceDefinitionsResponse] = js.native
  def list(
    params: ParamsResourceCustomresourcedefinitionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomResourceDefinitionsResponse]
  ): Unit = js.native
  /**
    * Rpc to list custom resource definitions.
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
    *   const res = await run.customresourcedefinitions.list({
    *     // Optional encoded string to continue paging.
    *     continue: 'placeholder-value',
    *     // Allows to filter resources based on a specific value for a field name. Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not currently used by Cloud Run.
    *     fieldSelector: 'placeholder-value',
    *     // Not currently used by Cloud Run.
    *     includeUninitialized: 'placeholder-value',
    *     // Allows to filter resources based on a label. Supported operations are =, !=, exists, in, and notIn.
    *     labelSelector: 'placeholder-value',
    *
    *     limit: 'placeholder-value',
    *     // The project ID or project number from which the storages should be listed.
    *     parent: 'placeholder-value',
    *     // The baseline resource version from which the list or watch operation should start. Not currently used by Cloud Run.
    *     resourceVersion: 'placeholder-value',
    *     // Flag that indicates that the client expects to watch this resource as well. Not currently used by Cloud Run.
    *     watch: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiVersion": "my_apiVersion",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "metadata": {},
    *   //   "unreachable": []
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
  def list(params: ParamsResourceCustomresourcedefinitionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomresourcedefinitionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
