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

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Changes")
@js.native
open class ResourceChanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaChange] = js.native
  def create(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def create(params: ParamsResourceChangesCreate): GaxiosPromise[SchemaChange] = js.native
  def create(params: ParamsResourceChangesCreate, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: BodyResponseCallback[Readable | SchemaChange],
    callback: BodyResponseCallback[Readable | SchemaChange]
  ): Unit = js.native
  def create(params: ParamsResourceChangesCreate, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  /**
    * dns.changes.create
    * @desc Atomically update the ResourceRecordSet collection.
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
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.changes.create({
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the managed zone addressed by this request. Can be the managed
    *     // zone name or id.
    *     managedZone: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additions": [],
    *       //   "deletions": [],
    *       //   "id": "my_id",
    *       //   "isServing": false,
    *       //   "kind": "my_kind",
    *       //   "startTime": "my_startTime",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additions": [],
    *   //   "deletions": [],
    *   //   "id": "my_id",
    *   //   "isServing": false,
    *   //   "kind": "my_kind",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias dns.changes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.managedZone Identifies the managed zone addressed by this request. Can be the managed zone name or id.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {().Change} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(params: ParamsResourceChangesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaChange] = js.native
  def get(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: BodyResponseCallback[Readable | SchemaChange],
    callback: BodyResponseCallback[Readable | SchemaChange]
  ): Unit = js.native
  def get(params: ParamsResourceChangesGet, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  /**
    * dns.changes.get
    * @desc Fetch the representation of an existing Change.
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
    *   const res = await dns.changes.get({
    *     // The identifier of the requested change, from a previous
    *     // ResourceRecordSetsChangeResponse.
    *     changeId: 'placeholder-value',
    *     // For mutating operation requests only. An optional identifier
    *     // specified by the client. Must be unique for operation resources in the
    *     // Operations collection.
    *     clientOperationId: 'placeholder-value',
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
    *   //   "additions": [],
    *   //   "deletions": [],
    *   //   "id": "my_id",
    *   //   "isServing": false,
    *   //   "kind": "my_kind",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias dns.changes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.changeId The identifier of the requested change, from a previous ResourceRecordSetsChangeResponse.
    * @param {string=} params.clientOperationId For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    * @param {string} params.managedZone Identifies the managed zone addressed by this request. Can be the managed zone name or id.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceChangesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChangesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(params: ParamsResourceChangesList): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(params: ParamsResourceChangesList, callback: BodyResponseCallback[SchemaChangesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceChangesList,
    options: BodyResponseCallback[Readable | SchemaChangesListResponse],
    callback: BodyResponseCallback[Readable | SchemaChangesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChangesList, options: MethodOptions): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangesListResponse]
  ): Unit = js.native
  /**
    * dns.changes.list
    * @desc Enumerate Changes to a ResourceRecordSet collection.
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
    *   const res = await dns.changes.list({
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
    *     // Sorting criterion. The only supported value is change sequence.
    *     sortBy: 'placeholder-value',
    *     // Sorting order direction: 'ascending' or 'descending'.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "changes": [],
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
    * @alias dns.changes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone Identifies the managed zone addressed by this request. Can be the managed zone name or id.
    * @param {integer=} params.maxResults Optional. Maximum number of results to be returned. If unspecified, the server will decide how many results to return.
    * @param {string=} params.pageToken Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    * @param {string} params.project Identifies the project addressed by this request.
    * @param {string=} params.sortBy Sorting criterion. The only supported value is change sequence.
    * @param {string=} params.sortOrder Sorting order direction: 'ascending' or 'descending'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceChangesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
