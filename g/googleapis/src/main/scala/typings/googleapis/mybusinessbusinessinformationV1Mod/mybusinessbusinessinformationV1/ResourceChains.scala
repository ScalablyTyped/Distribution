package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessbusinessinformation/v1", "mybusinessbusinessinformation_v1.Resource$Chains")
@js.native
open class ResourceChains protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaChain] = js.native
  def get(callback: BodyResponseCallback[SchemaChain]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChain] = js.native
  def get(params: ParamsResourceChainsGet): GaxiosPromise[SchemaChain] = js.native
  def get(params: ParamsResourceChainsGet, callback: BodyResponseCallback[SchemaChain]): Unit = js.native
  def get(
    params: ParamsResourceChainsGet,
    options: BodyResponseCallback[Readable | SchemaChain],
    callback: BodyResponseCallback[Readable | SchemaChain]
  ): Unit = js.native
  def get(params: ParamsResourceChainsGet, options: MethodOptions): GaxiosPromise[SchemaChain] = js.native
  def get(
    params: ParamsResourceChainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChain]
  ): Unit = js.native
  /**
    * Gets the specified chain. Returns `NOT_FOUND` if the chain does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.chains.get({
    *     // Required. The chain's resource name, in the format `chains/{chain_place_id\}`.
    *     name: 'chains/my-chain',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "chainNames": [],
    *   //   "locationCount": 0,
    *   //   "name": "my_name",
    *   //   "websites": []
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
  def get(params: ParamsResourceChainsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceChainsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchChainsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchChainsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchChainsResponse] = js.native
  def search(params: ParamsResourceChainsSearch): GaxiosPromise[SchemaSearchChainsResponse] = js.native
  def search(params: ParamsResourceChainsSearch, callback: BodyResponseCallback[SchemaSearchChainsResponse]): Unit = js.native
  def search(
    params: ParamsResourceChainsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchChainsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchChainsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceChainsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchChainsResponse] = js.native
  def search(
    params: ParamsResourceChainsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchChainsResponse]
  ): Unit = js.native
  /**
    * Searches the chain based on chain name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessbusinessinformation.chains.search({
    *     // Required. Search for a chain by its name. Exact/partial/fuzzy/related queries are supported. Examples: "walmart", "wal-mart", "walmmmart", "沃尔玛"
    *     chainName: 'placeholder-value',
    *     // The maximum number of matched chains to return from this query. The default is 10. The maximum possible value is 500.
    *     pageSize: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "chains": []
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
  def search(params: ParamsResourceChainsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceChainsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
