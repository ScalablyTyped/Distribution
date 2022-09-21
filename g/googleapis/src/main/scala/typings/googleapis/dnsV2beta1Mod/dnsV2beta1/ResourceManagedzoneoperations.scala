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

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Managedzoneoperations")
@js.native
open class ResourceManagedzoneoperations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceManagedzoneoperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceManagedzoneoperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceManagedzoneoperationsGet,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceManagedzoneoperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceManagedzoneoperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * dns.managedZoneOperations.get
    * @desc Fetch the representation of an existing Operation.
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
    *   const res = await dns.managedZoneOperations.get({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request.
    *     managedZone: 'placeholder-value',
    *     // Identifies the operation addressed by this request.
    *     operation: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dnsKeyContext": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "type": "my_type",
    *   //   "user": "my_user",
    *   //   "zoneContext": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias dns.managedZoneOperations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.managedZone Identifies the managed zone addressed by this request.
    * @param {string} params.operation Identifies the operation addressed by this request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceManagedzoneoperationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagedzoneoperationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(params: ParamsResourceManagedzoneoperationsList): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    options: BodyResponseCallback[Readable | SchemaManagedZoneOperationsListResponse],
    callback: BodyResponseCallback[Readable | SchemaManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedzoneoperationsList, options: MethodOptions): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]
  ): Unit = js.native
  /**
    * dns.managedZoneOperations.list
    * @desc Enumerate Operations for the given ManagedZone.
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
    *   const res = await dns.managedZoneOperations.list({
    *     // Identifies the managed zone addressed by this request.
    *     managedZone: 'placeholder-value',
    *     // Optional. Maximum number of results to be returned. If unspecified, the
    *     // server will decide how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated.
    *     // Use this parameter to continue a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // Sorting criterion. The only supported values are START_TIME and ID.
    *     sortBy: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "operations": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias dns.managedZoneOperations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone Identifies the managed zone addressed by this request.
    * @param {integer=} params.maxResults Optional. Maximum number of results to be returned. If unspecified, the server will decide how many results to return.
    * @param {string=} params.pageToken Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {string=} params.sortBy Sorting criterion. The only supported values are START_TIME and ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceManagedzoneoperationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
