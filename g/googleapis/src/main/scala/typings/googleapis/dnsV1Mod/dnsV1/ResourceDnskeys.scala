package typings.googleapis.dnsV1Mod.dnsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1", "dns_v1.Resource$Dnskeys")
@js.native
open class ResourceDnskeys protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDnsKey] = js.native
  def get(callback: BodyResponseCallback[SchemaDnsKey]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDnsKey] = js.native
  def get(params: ParamsResourceDnskeysGet): GaxiosPromise[SchemaDnsKey] = js.native
  def get(params: ParamsResourceDnskeysGet, callback: BodyResponseCallback[SchemaDnsKey]): Unit = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: BodyResponseCallback[Readable | SchemaDnsKey],
    callback: BodyResponseCallback[Readable | SchemaDnsKey]
  ): Unit = js.native
  def get(params: ParamsResourceDnskeysGet, options: MethodOptions): GaxiosPromise[SchemaDnsKey] = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsKey]
  ): Unit = js.native
  /**
    * Fetches the representation of an existing DnsKey.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.dnsKeys.get({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type is computed and displayed.
    *     digestType: 'placeholder-value',
    *     // The identifier of the requested DnsKey.
    *     dnsKeyId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "algorithm": "my_algorithm",
    *   //   "creationTime": "my_creationTime",
    *   //   "description": "my_description",
    *   //   "digests": [],
    *   //   "id": "my_id",
    *   //   "isActive": false,
    *   //   "keyLength": 0,
    *   //   "keyTag": 0,
    *   //   "kind": "my_kind",
    *   //   "publicKey": "my_publicKey",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceDnskeysGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDnsKeysListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(params: ParamsResourceDnskeysList): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(params: ParamsResourceDnskeysList, callback: BodyResponseCallback[SchemaDnsKeysListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: BodyResponseCallback[Readable | SchemaDnsKeysListResponse],
    callback: BodyResponseCallback[Readable | SchemaDnsKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDnskeysList, options: MethodOptions): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsKeysListResponse]
  ): Unit = js.native
  /**
    * Enumerates DnsKeys to a ResourceRecordSet collection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.dnsKeys.list({
    *     // An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type is computed and displayed.
    *     digestType: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    *     managedZone: 'placeholder-value',
    *     // Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dnsKeys": [],
    *   //   "header": {},
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceDnskeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
