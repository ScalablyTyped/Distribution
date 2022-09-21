package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Dnskeys")
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
    * dns.dnsKeys.get
    * @desc Fetch the representation of an existing DnsKey.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
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
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // An optional comma-separated list of digest types to compute and display
    *     // for key signing keys. If omitted, the recommended digest type will be
    *     // computed and displayed.
    *     digestType: 'placeholder-value',
    *     // The identifier of the requested DnsKey.
    *     dnsKeyId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed
    *     // zone name or id.
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
    * @alias dns.dnsKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string=} params.digestType An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type will be computed and displayed.
    * @param {string} params.dnsKeyId The identifier of the requested DnsKey.
    * @param {string} params.managedZone Identifies the managed zone addressed by this request. Can be the managed zone name or id.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
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
    * dns.dnsKeys.list
    * @desc Enumerate DnsKeys to a ResourceRecordSet collection.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v2beta1');
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
    *     // An optional comma-separated list of digest types to compute and display
    *     // for key signing keys. If omitted, the recommended digest type will be
    *     // computed and displayed.
    *     digestType: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed
    *     // zone name or id.
    *     managedZone: 'placeholder-value',
    *     // Optional. Maximum number of results to be returned. If unspecified, the
    *     // server will decide how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated.
    *     // Use this parameter to continue a previous list request.
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
    * @alias dns.dnsKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.digestType An optional comma-separated list of digest types to compute and display for key signing keys. If omitted, the recommended digest type will be computed and displayed.
    * @param {string} params.managedZone Identifies the managed zone addressed by this request. Can be the managed zone name or id.
    * @param {integer=} params.maxResults Optional. Maximum number of results to be returned. If unspecified, the server will decide how many results to return.
    * @param {string=} params.pageToken Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceDnskeysList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
