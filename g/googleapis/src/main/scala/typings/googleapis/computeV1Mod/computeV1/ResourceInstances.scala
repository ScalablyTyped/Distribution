package typings.googleapis.computeV1Mod.computeV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Instances")
@js.native
class ResourceInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.instances.addAccessConfig
    * @desc Adds an access config to an instance's network interface.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The instance name for this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     // The name of the network interface to add to this instance.
    *     networkInterface: '',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.addAccessConfig(request, function(err, response) {
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
    * @alias compute.instances.addAccessConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface to add to this instance.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().AccessConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addAccessConfig(): GaxiosPromise[SchemaOperation] = js.native
  def addAccessConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addAccessConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addAccessConfig(params: ParamsResourceInstancesAddaccessconfig): GaxiosPromise[SchemaOperation] = js.native
  def addAccessConfig(params: ParamsResourceInstancesAddaccessconfig, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addAccessConfig(
    params: ParamsResourceInstancesAddaccessconfig,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addAccessConfig(params: ParamsResourceInstancesAddaccessconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addAccessConfig(
    params: ParamsResourceInstancesAddaccessconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.aggregatedList
    * @desc Retrieves aggregated list of all of the instances in your project
    * across all regions and zones.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
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
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     Object.keys(itemsPage).forEach(function(name) {
    *       // TODO: Change code below to process each `name` property:
    *       console.log(name + ': ' + JSON.stringify(itemsPage[name], null,
    * 2));
    *     });
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.instances.aggregatedList(request, handlePage);
    *     }
    *   };
    *
    *   compute.instances.aggregatedList(request, handlePage);
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
    * @alias compute.instances.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaInstanceAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaInstanceAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceInstancesAggregatedlist): GaxiosPromise[SchemaInstanceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceInstancesAggregatedlist,
    callback: BodyResponseCallback[SchemaInstanceAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceInstancesAggregatedlist,
    options: BodyResponseCallback[SchemaInstanceAggregatedList],
    callback: BodyResponseCallback[SchemaInstanceAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceInstancesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaInstanceAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceInstancesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceAggregatedList]
  ): Unit = js.native
  
  /**
    * compute.instances.attachDisk
    * @desc Attaches an existing Disk resource to an instance. You must first
    * create the disk before you can attach it. It is not possible to create
    * and attach a disk at the same time. For more information, read Adding a
    * persistent disk to your instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The instance name for this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.attachDisk(request, function(err, response) {
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
    * @alias compute.instances.attachDisk
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.forceAttach Whether to force attach the disk even if it's currently attached to another instance.
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().AttachedDisk} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def attachDisk(): GaxiosPromise[SchemaOperation] = js.native
  def attachDisk(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def attachDisk(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachDisk(params: ParamsResourceInstancesAttachdisk): GaxiosPromise[SchemaOperation] = js.native
  def attachDisk(params: ParamsResourceInstancesAttachdisk, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def attachDisk(
    params: ParamsResourceInstancesAttachdisk,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def attachDisk(params: ParamsResourceInstancesAttachdisk, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachDisk(
    params: ParamsResourceInstancesAttachdisk,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.instances.delete
    * @desc Deletes the specified Instance resource. For more information, see
    * Stopping or Deleting an Instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance resource to delete.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.delete(request, function(err, response) {
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
    * @alias compute.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.deleteAccessConfig
    * @desc Deletes an access config from an instance's network interface.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The instance name for this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     // The name of the access config to delete.
    *     accessConfig: '',  // TODO: Update placeholder value.
    *
    *     // The name of the network interface.
    *     networkInterface: '',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.deleteAccessConfig(request, function(err, response) {
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
    * @alias compute.instances.deleteAccessConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accessConfig The name of the access config to delete.
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteAccessConfig(): GaxiosPromise[SchemaOperation] = js.native
  def deleteAccessConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteAccessConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteAccessConfig(params: ParamsResourceInstancesDeleteaccessconfig): GaxiosPromise[SchemaOperation] = js.native
  def deleteAccessConfig(params: ParamsResourceInstancesDeleteaccessconfig, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteAccessConfig(
    params: ParamsResourceInstancesDeleteaccessconfig,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteAccessConfig(params: ParamsResourceInstancesDeleteaccessconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteAccessConfig(
    params: ParamsResourceInstancesDeleteaccessconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.detachDisk
    * @desc Detaches a disk from an instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Instance name.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     // Disk device name to detach.
    *     deviceName: '',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.detachDisk(request, function(err, response) {
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
    * @alias compute.instances.detachDisk
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deviceName The device name of the disk to detach. Make a get() request on the instance to view currently attached disks and device names.
    * @param {string} params.instance Instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detachDisk(): GaxiosPromise[SchemaOperation] = js.native
  def detachDisk(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def detachDisk(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def detachDisk(params: ParamsResourceInstancesDetachdisk): GaxiosPromise[SchemaOperation] = js.native
  def detachDisk(params: ParamsResourceInstancesDetachdisk, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def detachDisk(
    params: ParamsResourceInstancesDetachdisk,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def detachDisk(params: ParamsResourceInstancesDetachdisk, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def detachDisk(
    params: ParamsResourceInstancesDetachdisk,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.get
    * @desc Returns the specified Instance resource. Gets a list of available
    * instances by making a list() request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance resource to return.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.get(request, function(err, response) {
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
    * @alias compute.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceInstancesGet, callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: BodyResponseCallback[SchemaInstance],
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  
  /**
    * compute.instances.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.instances.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceInstancesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceInstancesGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceInstancesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceInstancesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceInstancesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * compute.instances.getSerialPortOutput
    * @desc Returns the last 1 MB of serial port output from the specified
    * instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.getSerialPortOutput(request, function(err, response)
    * { if (err) { console.error(err); return;
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
    * @alias compute.instances.getSerialPortOutput
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {integer=} params.port Specifies which COM or serial port to retrieve data from.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.start Returns output starting from a specific byte position. Use this to page through output when the output is too large to return in a single request. For the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value returned in the previous call.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getSerialPortOutput(): GaxiosPromise[SchemaSerialPortOutput] = js.native
  def getSerialPortOutput(callback: BodyResponseCallback[SchemaSerialPortOutput]): Unit = js.native
  def getSerialPortOutput(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSerialPortOutput] = js.native
  def getSerialPortOutput(params: ParamsResourceInstancesGetserialportoutput): GaxiosPromise[SchemaSerialPortOutput] = js.native
  def getSerialPortOutput(
    params: ParamsResourceInstancesGetserialportoutput,
    callback: BodyResponseCallback[SchemaSerialPortOutput]
  ): Unit = js.native
  def getSerialPortOutput(
    params: ParamsResourceInstancesGetserialportoutput,
    options: BodyResponseCallback[SchemaSerialPortOutput],
    callback: BodyResponseCallback[SchemaSerialPortOutput]
  ): Unit = js.native
  def getSerialPortOutput(params: ParamsResourceInstancesGetserialportoutput, options: MethodOptions): GaxiosPromise[SchemaSerialPortOutput] = js.native
  def getSerialPortOutput(
    params: ParamsResourceInstancesGetserialportoutput,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSerialPortOutput]
  ): Unit = js.native
  
  /**
    * compute.instances.getShieldedInstanceIdentity
    * @desc Returns the Shielded Instance Identity of an instance
    * @alias compute.instances.getShieldedInstanceIdentity
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name or id of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getShieldedInstanceIdentity(): GaxiosPromise[SchemaShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(callback: BodyResponseCallback[SchemaShieldedInstanceIdentity]): Unit = js.native
  def getShieldedInstanceIdentity(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(params: ParamsResourceInstancesGetshieldedinstanceidentity): GaxiosPromise[SchemaShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(
    params: ParamsResourceInstancesGetshieldedinstanceidentity,
    callback: BodyResponseCallback[SchemaShieldedInstanceIdentity]
  ): Unit = js.native
  def getShieldedInstanceIdentity(
    params: ParamsResourceInstancesGetshieldedinstanceidentity,
    options: BodyResponseCallback[SchemaShieldedInstanceIdentity],
    callback: BodyResponseCallback[SchemaShieldedInstanceIdentity]
  ): Unit = js.native
  def getShieldedInstanceIdentity(params: ParamsResourceInstancesGetshieldedinstanceidentity, options: MethodOptions): GaxiosPromise[SchemaShieldedInstanceIdentity] = js.native
  def getShieldedInstanceIdentity(
    params: ParamsResourceInstancesGetshieldedinstanceidentity,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaShieldedInstanceIdentity]
  ): Unit = js.native
  
  /**
    * compute.instances.insert
    * @desc Creates an instance resource in the specified project using the
    * data included in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.insert(request, function(err, response) {
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
    * @alias compute.instances.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string=} params.sourceInstanceTemplate Specifies instance template to create the instance.  This field is optional. It can be a full or partial URL. For example, the following are all valid URLs to an instance template:   - https://www.googleapis.com/compute/v1/projects/project/global/instanceTemplates/instanceTemplate  - projects/project/global/instanceTemplates/instanceTemplate  - global/instanceTemplates/instanceTemplate
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Instance} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceInstancesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceInstancesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.list
    * @desc Retrieves the list of instances contained within the specified
    * zone.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
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
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.instances.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.instances.list(request, handlePage);
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
    * @alias compute.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaInstanceList] = js.native
  def list(callback: BodyResponseCallback[SchemaInstanceList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceList] = js.native
  def list(params: ParamsResourceInstancesList): GaxiosPromise[SchemaInstanceList] = js.native
  def list(params: ParamsResourceInstancesList, callback: BodyResponseCallback[SchemaInstanceList]): Unit = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: BodyResponseCallback[SchemaInstanceList],
    callback: BodyResponseCallback[SchemaInstanceList]
  ): Unit = js.native
  def list(params: ParamsResourceInstancesList, options: MethodOptions): GaxiosPromise[SchemaInstanceList] = js.native
  def list(
    params: ParamsResourceInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceList]
  ): Unit = js.native
  
  /**
    * compute.instances.listReferrers
    * @desc Retrieves the list of referrers to instances contained within the
    * specified zone. For more information, read Viewing Referrers to VM
    * Instances.
    * @alias compute.instances.listReferrers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instance Name of the target instance scoping this request, or '-' if the request should span over all instances in the container.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listReferrers(): GaxiosPromise[SchemaInstanceListReferrers] = js.native
  def listReferrers(callback: BodyResponseCallback[SchemaInstanceListReferrers]): Unit = js.native
  def listReferrers(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceListReferrers] = js.native
  def listReferrers(params: ParamsResourceInstancesListreferrers): GaxiosPromise[SchemaInstanceListReferrers] = js.native
  def listReferrers(
    params: ParamsResourceInstancesListreferrers,
    callback: BodyResponseCallback[SchemaInstanceListReferrers]
  ): Unit = js.native
  def listReferrers(
    params: ParamsResourceInstancesListreferrers,
    options: BodyResponseCallback[SchemaInstanceListReferrers],
    callback: BodyResponseCallback[SchemaInstanceListReferrers]
  ): Unit = js.native
  def listReferrers(params: ParamsResourceInstancesListreferrers, options: MethodOptions): GaxiosPromise[SchemaInstanceListReferrers] = js.native
  def listReferrers(
    params: ParamsResourceInstancesListreferrers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceListReferrers]
  ): Unit = js.native
  
  /**
    * compute.instances.reset
    * @desc Performs a reset on the instance. This is a hard reset the VM does
    * not do a graceful shutdown. For more information, see Resetting an
    * instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.reset(request, function(err, response) {
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
    * @alias compute.instances.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[SchemaOperation] = js.native
  def reset(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reset(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(params: ParamsResourceInstancesReset): GaxiosPromise[SchemaOperation] = js.native
  def reset(params: ParamsResourceInstancesReset, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reset(
    params: ParamsResourceInstancesReset,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reset(params: ParamsResourceInstancesReset, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceInstancesReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setDeletionProtection
    * @desc Sets deletion protection on the instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the resource for this request.
    *     resource_: 'my-resource',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setDeletionProtection(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias compute.instances.setDeletionProtection
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.deletionProtection Whether the resource should be protected against deletion.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDeletionProtection(): GaxiosPromise[SchemaOperation] = js.native
  def setDeletionProtection(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setDeletionProtection(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDeletionProtection(params: ParamsResourceInstancesSetdeletionprotection): GaxiosPromise[SchemaOperation] = js.native
  def setDeletionProtection(
    params: ParamsResourceInstancesSetdeletionprotection,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDeletionProtection(
    params: ParamsResourceInstancesSetdeletionprotection,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDeletionProtection(params: ParamsResourceInstancesSetdeletionprotection, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDeletionProtection(
    params: ParamsResourceInstancesSetdeletionprotection,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setDiskAutoDelete
    * @desc Sets the auto-delete flag for a disk attached to an instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The instance name.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     // Whether to auto-delete the disk when the instance is deleted.
    *     autoDelete: false,  // TODO: Update placeholder value.
    *
    *     // The device name of the disk to modify.
    *     deviceName: '',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setDiskAutoDelete(request, function(err, response) {
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
    * @alias compute.instances.setDiskAutoDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean} params.autoDelete Whether to auto-delete the disk when the instance is deleted.
    * @param {string} params.deviceName The device name of the disk to modify. Make a get() request on the instance to view currently attached disks and device names.
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDiskAutoDelete(): GaxiosPromise[SchemaOperation] = js.native
  def setDiskAutoDelete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setDiskAutoDelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDiskAutoDelete(params: ParamsResourceInstancesSetdiskautodelete): GaxiosPromise[SchemaOperation] = js.native
  def setDiskAutoDelete(params: ParamsResourceInstancesSetdiskautodelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setDiskAutoDelete(
    params: ParamsResourceInstancesSetdiskautodelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDiskAutoDelete(params: ParamsResourceInstancesSetdiskautodelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDiskAutoDelete(
    params: ParamsResourceInstancesSetdiskautodelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.instances.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ZoneSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceInstancesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceInstancesSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceInstancesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceInstancesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceInstancesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * compute.instances.setLabels
    * @desc Sets labels on an instance. To learn more about labels, read the
    * Labeling Resources documentation.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setLabels(request, function(err, response) {
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
    * @alias compute.instances.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceInstancesSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceInstancesSetlabels, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(
    params: ParamsResourceInstancesSetlabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceInstancesSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceInstancesSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setMachineResources
    * @desc Changes the number and/or type of accelerator for a stopped
    * instance to the values specified in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setMachineResources(request, function(err, response)
    * { if (err) { console.error(err); return;
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
    * @alias compute.instances.setMachineResources
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetMachineResourcesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMachineResources(): GaxiosPromise[SchemaOperation] = js.native
  def setMachineResources(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMachineResources(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMachineResources(params: ParamsResourceInstancesSetmachineresources): GaxiosPromise[SchemaOperation] = js.native
  def setMachineResources(
    params: ParamsResourceInstancesSetmachineresources,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMachineResources(
    params: ParamsResourceInstancesSetmachineresources,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMachineResources(params: ParamsResourceInstancesSetmachineresources, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMachineResources(
    params: ParamsResourceInstancesSetmachineresources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setMachineType
    * @desc Changes the machine type for a stopped instance to the machine type
    * specified in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setMachineType(request, function(err, response) {
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
    * @alias compute.instances.setMachineType
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetMachineTypeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMachineType(): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMachineType(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(params: ParamsResourceInstancesSetmachinetype): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(params: ParamsResourceInstancesSetmachinetype, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMachineType(
    params: ParamsResourceInstancesSetmachinetype,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMachineType(params: ParamsResourceInstancesSetmachinetype, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(
    params: ParamsResourceInstancesSetmachinetype,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setMetadata
    * @desc Sets metadata for the specified instance to the data included in
    * the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setMetadata(request, function(err, response) {
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
    * @alias compute.instances.setMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Metadata} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMetadata(): GaxiosPromise[SchemaOperation] = js.native
  def setMetadata(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMetadata(params: ParamsResourceInstancesSetmetadata): GaxiosPromise[SchemaOperation] = js.native
  def setMetadata(params: ParamsResourceInstancesSetmetadata, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMetadata(
    params: ParamsResourceInstancesSetmetadata,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMetadata(params: ParamsResourceInstancesSetmetadata, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMetadata(
    params: ParamsResourceInstancesSetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setMinCpuPlatform
    * @desc Changes the minimum CPU platform that this instance should use.
    * This method can only be called on a stopped instance. For more
    * information, read Specifying a Minimum CPU Platform.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setMinCpuPlatform(request, function(err, response) {
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
    * @alias compute.instances.setMinCpuPlatform
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetMinCpuPlatformRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMinCpuPlatform(): GaxiosPromise[SchemaOperation] = js.native
  def setMinCpuPlatform(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMinCpuPlatform(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMinCpuPlatform(params: ParamsResourceInstancesSetmincpuplatform): GaxiosPromise[SchemaOperation] = js.native
  def setMinCpuPlatform(params: ParamsResourceInstancesSetmincpuplatform, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMinCpuPlatform(
    params: ParamsResourceInstancesSetmincpuplatform,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMinCpuPlatform(params: ParamsResourceInstancesSetmincpuplatform, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMinCpuPlatform(
    params: ParamsResourceInstancesSetmincpuplatform,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setScheduling
    * @desc Sets an instance's scheduling options.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Instance name.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setScheduling(request, function(err, response) {
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
    * @alias compute.instances.setScheduling
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Instance name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Scheduling} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setScheduling(): GaxiosPromise[SchemaOperation] = js.native
  def setScheduling(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setScheduling(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setScheduling(params: ParamsResourceInstancesSetscheduling): GaxiosPromise[SchemaOperation] = js.native
  def setScheduling(params: ParamsResourceInstancesSetscheduling, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setScheduling(
    params: ParamsResourceInstancesSetscheduling,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setScheduling(params: ParamsResourceInstancesSetscheduling, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setScheduling(
    params: ParamsResourceInstancesSetscheduling,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setServiceAccount
    * @desc Sets the service account on the instance. For more information,
    * read Changing the service account and access scopes for an instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance resource to start.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setServiceAccount(request, function(err, response) {
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
    * @alias compute.instances.setServiceAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to start.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesSetServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setServiceAccount(): GaxiosPromise[SchemaOperation] = js.native
  def setServiceAccount(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setServiceAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setServiceAccount(params: ParamsResourceInstancesSetserviceaccount): GaxiosPromise[SchemaOperation] = js.native
  def setServiceAccount(params: ParamsResourceInstancesSetserviceaccount, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setServiceAccount(
    params: ParamsResourceInstancesSetserviceaccount,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setServiceAccount(params: ParamsResourceInstancesSetserviceaccount, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setServiceAccount(
    params: ParamsResourceInstancesSetserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setShieldedInstanceIntegrityPolicy
    * @desc Sets the Shielded Instance integrity policy for an instance. You
    * can only use this method on a running instance. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.instances.setShieldedInstanceIntegrityPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name or id of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ShieldedInstanceIntegrityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setShieldedInstanceIntegrityPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setShieldedInstanceIntegrityPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setShieldedInstanceIntegrityPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setShieldedInstanceIntegrityPolicy(params: ParamsResourceInstancesSetshieldedinstanceintegritypolicy): GaxiosPromise[SchemaOperation] = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsResourceInstancesSetshieldedinstanceintegritypolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsResourceInstancesSetshieldedinstanceintegritypolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setShieldedInstanceIntegrityPolicy(params: ParamsResourceInstancesSetshieldedinstanceintegritypolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setShieldedInstanceIntegrityPolicy(
    params: ParamsResourceInstancesSetshieldedinstanceintegritypolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.setTags
    * @desc Sets network tags for the specified instance to the data included
    * in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance scoping this request.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.setTags(request, function(err, response) {
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
    * @alias compute.instances.setTags
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().Tags} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTags(): GaxiosPromise[SchemaOperation] = js.native
  def setTags(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setTags(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setTags(params: ParamsResourceInstancesSettags): GaxiosPromise[SchemaOperation] = js.native
  def setTags(params: ParamsResourceInstancesSettags, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setTags(
    params: ParamsResourceInstancesSettags,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setTags(params: ParamsResourceInstancesSettags, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setTags(
    params: ParamsResourceInstancesSettags,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.simulateMaintenanceEvent
    * @desc Simulates a maintenance event on the instance.
    * @alias compute.instances.simulateMaintenanceEvent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def simulateMaintenanceEvent(): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def simulateMaintenanceEvent(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(params: ParamsResourceInstancesSimulatemaintenanceevent): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceInstancesSimulatemaintenanceevent,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceInstancesSimulatemaintenanceevent,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def simulateMaintenanceEvent(params: ParamsResourceInstancesSimulatemaintenanceevent, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def simulateMaintenanceEvent(
    params: ParamsResourceInstancesSimulatemaintenanceevent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.start
    * @desc Starts an instance that was stopped using the instances().stop
    * method. For more information, see Restart an instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance resource to start.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.start(request, function(err, response) {
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
    * @alias compute.instances.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to start.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceInstancesStart): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceInstancesStart, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(
    params: ParamsResourceInstancesStart,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceInstancesStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceInstancesStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.startWithEncryptionKey
    * @desc Starts an instance that was stopped using the instances().stop
    * method. For more information, see Restart an instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance resource to start.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.startWithEncryptionKey(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias compute.instances.startWithEncryptionKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to start.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().InstancesStartWithEncryptionKeyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startWithEncryptionKey(): GaxiosPromise[SchemaOperation] = js.native
  def startWithEncryptionKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def startWithEncryptionKey(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startWithEncryptionKey(params: ParamsResourceInstancesStartwithencryptionkey): GaxiosPromise[SchemaOperation] = js.native
  def startWithEncryptionKey(
    params: ParamsResourceInstancesStartwithencryptionkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startWithEncryptionKey(
    params: ParamsResourceInstancesStartwithencryptionkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def startWithEncryptionKey(params: ParamsResourceInstancesStartwithencryptionkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def startWithEncryptionKey(
    params: ParamsResourceInstancesStartwithencryptionkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.stop
    * @desc Stops a running instance, shutting it down cleanly, and allows you
    * to restart the instance at a later time. Stopped instances do not incur
    * VM usage charges while they are stopped. However, resources that the VM
    * is using, such as persistent disks and static IP addresses, will continue
    * to be charged until they are deleted. For more information, see Stopping
    * an instance.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the instance resource to stop.
    *     instance: 'my-instance',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instances.stop(request, function(err, response) {
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
    * @alias compute.instances.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name of the instance resource to stop.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[SchemaOperation] = js.native
  def stop(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceInstancesStop): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceInstancesStop, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(
    params: ParamsResourceInstancesStop,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def stop(params: ParamsResourceInstancesStop, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceInstancesStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.instances.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceInstancesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceInstancesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceInstancesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceInstancesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceInstancesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.instances.updateAccessConfig
    * @desc Updates the specified access config from an instance's network
    * interface with the data included in the request. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.instances.updateAccessConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface where the access config is attached.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().AccessConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateAccessConfig(): GaxiosPromise[SchemaOperation] = js.native
  def updateAccessConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateAccessConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateAccessConfig(params: ParamsResourceInstancesUpdateaccessconfig): GaxiosPromise[SchemaOperation] = js.native
  def updateAccessConfig(params: ParamsResourceInstancesUpdateaccessconfig, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateAccessConfig(
    params: ParamsResourceInstancesUpdateaccessconfig,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateAccessConfig(params: ParamsResourceInstancesUpdateaccessconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateAccessConfig(
    params: ParamsResourceInstancesUpdateaccessconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.updateNetworkInterface
    * @desc Updates an instance's network interface. This method follows PATCH
    * semantics.
    * @alias compute.instances.updateNetworkInterface
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance The instance name for this request.
    * @param {string} params.networkInterface The name of the network interface to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NetworkInterface} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateNetworkInterface(): GaxiosPromise[SchemaOperation] = js.native
  def updateNetworkInterface(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateNetworkInterface(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateNetworkInterface(params: ParamsResourceInstancesUpdatenetworkinterface): GaxiosPromise[SchemaOperation] = js.native
  def updateNetworkInterface(
    params: ParamsResourceInstancesUpdatenetworkinterface,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateNetworkInterface(
    params: ParamsResourceInstancesUpdatenetworkinterface,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateNetworkInterface(params: ParamsResourceInstancesUpdatenetworkinterface, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateNetworkInterface(
    params: ParamsResourceInstancesUpdatenetworkinterface,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instances.updateShieldedInstanceConfig
    * @desc Updates the Shielded Instance config for an instance. You can only
    * use this method on a stopped instance. This method supports PATCH
    * semantics and uses the JSON merge patch format and processing rules.
    * @alias compute.instances.updateShieldedInstanceConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instance Name or id of the instance scoping this request.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ShieldedInstanceConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateShieldedInstanceConfig(): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateShieldedInstanceConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(params: ParamsResourceInstancesUpdateshieldedinstanceconfig): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceInstancesUpdateshieldedinstanceconfig,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceInstancesUpdateshieldedinstanceconfig,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateShieldedInstanceConfig(params: ParamsResourceInstancesUpdateshieldedinstanceconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceInstancesUpdateshieldedinstanceconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
