package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v2beta1", "dns_v2beta1.Resource$Managedzones")
@js.native
class ResourceManagedzones protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.managedZones.create
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dns.managedZones.create(request, function(err, response) {
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
    * @alias dns.managedZones.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaManagedZone] = js.native
  def create(callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def create(params: ParamsResourceManagedzonesCreate): GaxiosPromise[SchemaManagedZone] = js.native
  def create(params: ParamsResourceManagedzonesCreate, callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: BodyResponseCallback[SchemaManagedZone],
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  def create(params: ParamsResourceManagedzonesCreate, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def create(
    params: ParamsResourceManagedzonesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  
  /**
    * dns.managedZones.delete
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
    *   dns.managedZones.delete(request, function(err, response) {
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
    * @alias dns.managedZones.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedzonesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedzonesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedzonesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedzonesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dns.managedZones.get
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
    *   dns.managedZones.get(request, function(err, response) {
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
    * @alias dns.managedZones.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaManagedZone] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def get(params: ParamsResourceManagedzonesGet): GaxiosPromise[SchemaManagedZone] = js.native
  def get(params: ParamsResourceManagedzonesGet, callback: BodyResponseCallback[SchemaManagedZone]): Unit = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: BodyResponseCallback[SchemaManagedZone],
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  def get(params: ParamsResourceManagedzonesGet, options: MethodOptions): GaxiosPromise[SchemaManagedZone] = js.native
  def get(
    params: ParamsResourceManagedzonesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZone]
  ): Unit = js.native
  
  /**
    * dns.managedZones.list
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
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var managedZonesPage = response['managedZones'];
    *     if (!managedZonesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < managedZonesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `managedZonesPage`: console.log(JSON.stringify(managedZonesPage[i], null,
    * 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       dns.managedZones.list(request, handlePage);
    *     }
    *   };
    *
    *   dns.managedZones.list(request, handlePage);
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
    * @alias dns.managedZones.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dnsName
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedZonesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(params: ParamsResourceManagedzonesList): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: BodyResponseCallback[SchemaManagedZonesListResponse],
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedzonesList, options: MethodOptions): GaxiosPromise[SchemaManagedZonesListResponse] = js.native
  def list(
    params: ParamsResourceManagedzonesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZonesListResponse]
  ): Unit = js.native
  
  /**
    * dns.managedZones.patch
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
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dns.managedZones.patch(request, function(err, response) {
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
    * @alias dns.managedZones.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceManagedzonesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceManagedzonesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceManagedzonesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceManagedzonesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * dns.managedZones.update
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
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dns.managedZones.update(request, function(err, response) {
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
    * @alias dns.managedZones.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().ManagedZone} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceManagedzonesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceManagedzonesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceManagedzonesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceManagedzonesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
