package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Dnskeys")
@js.native
class ResourceDnskeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.dnsKeys.get
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud DNS API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dns
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var dns = google.dns('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request. Can be the
    * managed zone name or id. managedZone: 'my-managed-zone',  // TODO: Update
    * placeholder value.
    *
    *     // The identifier of the requested DnsKey.
    *     dnsKeyId: 'my-dns-key-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   dns.dnsKeys.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias dns.dnsKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string=} params.digestType
    * @param {string} params.dnsKeyId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDnsKey] = js.native
  def get(callback: BodyResponseCallback[SchemaDnsKey]): Unit = js.native
  def get(params: ParamsResourceDnskeysGet): GaxiosPromise[SchemaDnsKey] = js.native
  def get(params: ParamsResourceDnskeysGet, callback: BodyResponseCallback[SchemaDnsKey]): Unit = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: BodyResponseCallback[SchemaDnsKey],
    callback: BodyResponseCallback[SchemaDnsKey]
  ): Unit = js.native
  def get(params: ParamsResourceDnskeysGet, options: MethodOptions): GaxiosPromise[SchemaDnsKey] = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsKey]
  ): Unit = js.native
  /**
    * dns.dnsKeys.list
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud DNS API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dns
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var dns = google.dns('v2beta1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Identifies the project addressed by this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Identifies the managed zone addressed by this request. Can be the
    * managed zone name or id. managedZone: 'my-managed-zone',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var dnsKeysPage = response['dnsKeys'];
    *     if (!dnsKeysPage) {
    *       return;
    *     }
    *     for (var i = 0; i < dnsKeysPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `dnsKeysPage`: console.log(JSON.stringify(dnsKeysPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       dns.dnsKeys.list(request, handlePage);
    *     }
    *   };
    *
    *   dns.dnsKeys.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias dns.dnsKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.digestType
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDnsKeysListResponse]): Unit = js.native
  def list(params: ParamsResourceDnskeysList): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(params: ParamsResourceDnskeysList, callback: BodyResponseCallback[SchemaDnsKeysListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: BodyResponseCallback[SchemaDnsKeysListResponse],
    callback: BodyResponseCallback[SchemaDnsKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDnskeysList, options: MethodOptions): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsKeysListResponse]
  ): Unit = js.native
}

