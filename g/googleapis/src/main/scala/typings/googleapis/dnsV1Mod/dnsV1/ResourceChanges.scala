package typings.googleapis.dnsV1Mod.dnsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1", "dns_v1.Resource$Changes")
@js.native
class ResourceChanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.changes.create
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
    * var dns = google.dns('v1');
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dns.changes.create(request, function(err, response) {
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
    * @alias dns.changes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().Change} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaChange] = js.native
  def create(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def create(params: ParamsResourceChangesCreate): GaxiosPromise[SchemaChange] = js.native
  def create(params: ParamsResourceChangesCreate, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: BodyResponseCallback[SchemaChange],
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  def create(params: ParamsResourceChangesCreate, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  
  /**
    * dns.changes.get
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
    * var dns = google.dns('v1');
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
    *     // The identifier of the requested change, from a previous
    * ResourceRecordSetsChangeResponse. changeId: 'my-change-id',  // TODO:
    * Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   dns.changes.get(request, function(err, response) {
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
    * @alias dns.changes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.changeId
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaChange] = js.native
  def get(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: BodyResponseCallback[SchemaChange],
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  def get(params: ParamsResourceChangesGet, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  
  /**
    * dns.changes.list
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
    * var dns = google.dns('v1');
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
    *     var changesPage = response['changes'];
    *     if (!changesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < changesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `changesPage`: console.log(JSON.stringify(changesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       dns.changes.list(request, handlePage);
    *     }
    *   };
    *
    *   dns.changes.list(request, handlePage);
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
    * @alias dns.changes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {string=} params.sortOrder
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChangesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(params: ParamsResourceChangesList): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(params: ParamsResourceChangesList, callback: BodyResponseCallback[SchemaChangesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceChangesList,
    options: BodyResponseCallback[SchemaChangesListResponse],
    callback: BodyResponseCallback[SchemaChangesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChangesList, options: MethodOptions): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangesListResponse]
  ): Unit = js.native
}
