package typings.googleapis.computeV1Mod.computeV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Instancegroupmanagers")
@js.native
class ResourceInstancegroupmanagers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.instanceGroupManagers.abandonInstances
    * @desc Flags the specified instances to be removed from the managed
    * instance group. Abandoning an instance does not delete the instance, but
    * it does remove the instance from any target pools that are applied by the
    * managed instance group. This method reduces the targetSize of the managed
    * instance group by the number of instances that you abandon. This
    * operation is marked as DONE when the action is scheduled even if the
    * instances have not yet been removed from the group. You must separately
    * verify the status of the abandoning action with the listmanagedinstances
    * method.  If the group is part of a backend service that has enabled
    * connection draining, it can take up to 60 seconds after the connection
    * draining duration has elapsed before the VM instance is removed or
    * deleted.  You can specify a maximum of 1000 instances with this method
    * per request.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.abandonInstances(request, function(err,
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
    * @alias compute.instanceGroupManagers.abandonInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {().InstanceGroupManagersAbandonInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def abandonInstances(): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def abandonInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(params: ParamsResourceInstancegroupmanagersAbandoninstances): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(
    params: ParamsResourceInstancegroupmanagersAbandoninstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def abandonInstances(
    params: ParamsResourceInstancegroupmanagersAbandoninstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def abandonInstances(params: ParamsResourceInstancegroupmanagersAbandoninstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def abandonInstances(
    params: ParamsResourceInstancegroupmanagersAbandoninstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.aggregatedList
    * @desc Retrieves the list of managed instance groups and groups them by
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
    *       compute.instanceGroupManagers.aggregatedList(request, handlePage);
    *     }
    *   };
    *
    *   compute.instanceGroupManagers.aggregatedList(request, handlePage);
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
    * @alias compute.instanceGroupManagers.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaInstanceGroupManagerAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaInstanceGroupManagerAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManagerAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceInstancegroupmanagersAggregatedlist): GaxiosPromise[SchemaInstanceGroupManagerAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceInstancegroupmanagersAggregatedlist,
    callback: BodyResponseCallback[SchemaInstanceGroupManagerAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceInstancegroupmanagersAggregatedlist,
    options: BodyResponseCallback[SchemaInstanceGroupManagerAggregatedList],
    callback: BodyResponseCallback[SchemaInstanceGroupManagerAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceInstancegroupmanagersAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManagerAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceInstancegroupmanagersAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupManagerAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.instanceGroupManagers.delete
    * @desc Deletes the specified managed instance group and all of the
    * instances in that group. Note that the instance group must not belong to
    * a backend service. Read  Deleting an instance group for more information.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group to delete.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.delete(request, function(err, response) {
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
    * @alias compute.instanceGroupManagers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancegroupmanagersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancegroupmanagersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceInstancegroupmanagersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceInstancegroupmanagersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceInstancegroupmanagersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.deleteInstances
    * @desc Flags the specified instances in the managed instance group for
    * immediate deletion. The instances are also removed from any target pools
    * of which they were a member. This method reduces the targetSize of the
    * managed instance group by the number of instances that you delete. This
    * operation is marked as DONE when the action is scheduled even if the
    * instances are still being deleted. You must separately verify the status
    * of the deleting action with the listmanagedinstances method.  If the
    * group is part of a backend service that has enabled connection draining,
    * it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.  You can specify a
    * maximum of 1000 instances with this method per request.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.deleteInstances(request, function(err,
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
    * @alias compute.instanceGroupManagers.deleteInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {().InstanceGroupManagersDeleteInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteInstances(): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(params: ParamsResourceInstancegroupmanagersDeleteinstances): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(
    params: ParamsResourceInstancegroupmanagersDeleteinstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteInstances(
    params: ParamsResourceInstancegroupmanagersDeleteinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteInstances(params: ParamsResourceInstancegroupmanagersDeleteinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteInstances(
    params: ParamsResourceInstancegroupmanagersDeleteinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.get
    * @desc Returns all of the details about the specified managed instance
    * group. Gets a list of available managed instance groups by making a
    * list() request.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.get(request, function(err, response) {
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
    * @alias compute.instanceGroupManagers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceGroupManager]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(params: ParamsResourceInstancegroupmanagersGet): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(
    params: ParamsResourceInstancegroupmanagersGet,
    callback: BodyResponseCallback[SchemaInstanceGroupManager]
  ): Unit = js.native
  def get(
    params: ParamsResourceInstancegroupmanagersGet,
    options: BodyResponseCallback[SchemaInstanceGroupManager],
    callback: BodyResponseCallback[SchemaInstanceGroupManager]
  ): Unit = js.native
  def get(params: ParamsResourceInstancegroupmanagersGet, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManager] = js.native
  def get(
    params: ParamsResourceInstancegroupmanagersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupManager]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.insert
    * @desc Creates a managed instance group using the information that you
    * specify in the request. After the group is created, instances in the
    * group are created using the specified instance template. This operation
    * is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of
    * the individual instances with the listmanagedinstances method.  A managed
    * instance group can have up to 1000 VM instances per group. Please contact
    * Cloud Support if you need an increase in this limit.
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
    *     // The name of the zone where you want to create the managed instance
    * group. zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.insert(request, function(err, response) {
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
    * @alias compute.instanceGroupManagers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where you want to create the managed instance group.
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancegroupmanagersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancegroupmanagersInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceInstancegroupmanagersInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceInstancegroupmanagersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceInstancegroupmanagersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.list
    * @desc Retrieves a list of managed instance groups that are contained
    * within the specified project and zone.
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
    *     // The name of the zone where the managed instance group is located.
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
    *       compute.instanceGroupManagers.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.instanceGroupManagers.list(request, handlePage);
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
    * @alias compute.instanceGroupManagers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaInstanceGroupManagerList] = js.native
  def list(callback: BodyResponseCallback[SchemaInstanceGroupManagerList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManagerList] = js.native
  def list(params: ParamsResourceInstancegroupmanagersList): GaxiosPromise[SchemaInstanceGroupManagerList] = js.native
  def list(
    params: ParamsResourceInstancegroupmanagersList,
    callback: BodyResponseCallback[SchemaInstanceGroupManagerList]
  ): Unit = js.native
  def list(
    params: ParamsResourceInstancegroupmanagersList,
    options: BodyResponseCallback[SchemaInstanceGroupManagerList],
    callback: BodyResponseCallback[SchemaInstanceGroupManagerList]
  ): Unit = js.native
  def list(params: ParamsResourceInstancegroupmanagersList, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManagerList] = js.native
  def list(
    params: ParamsResourceInstancegroupmanagersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupManagerList]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.listManagedInstances
    * @desc Lists all of the instances in the managed instance group. Each
    * instance in the list has a currentAction, which indicates the action that
    * the managed instance group is performing on the instance. For example, if
    * the group is still creating an instance, the currentAction is CREATING.
    * If a previous action failed, the list displays the errors for that failed
    * action.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.listManagedInstances(request,
    * function(err, response) { if (err) { console.error(err); return;
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
    * @alias compute.instanceGroupManagers.listManagedInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.order_by Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listManagedInstances(): GaxiosPromise[SchemaInstanceGroupManagersListManagedInstancesResponse] = js.native
  def listManagedInstances(callback: BodyResponseCallback[SchemaInstanceGroupManagersListManagedInstancesResponse]): Unit = js.native
  def listManagedInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManagersListManagedInstancesResponse] = js.native
  def listManagedInstances(params: ParamsResourceInstancegroupmanagersListmanagedinstances): GaxiosPromise[SchemaInstanceGroupManagersListManagedInstancesResponse] = js.native
  def listManagedInstances(
    params: ParamsResourceInstancegroupmanagersListmanagedinstances,
    callback: BodyResponseCallback[SchemaInstanceGroupManagersListManagedInstancesResponse]
  ): Unit = js.native
  def listManagedInstances(
    params: ParamsResourceInstancegroupmanagersListmanagedinstances,
    options: BodyResponseCallback[SchemaInstanceGroupManagersListManagedInstancesResponse],
    callback: BodyResponseCallback[SchemaInstanceGroupManagersListManagedInstancesResponse]
  ): Unit = js.native
  def listManagedInstances(params: ParamsResourceInstancegroupmanagersListmanagedinstances, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupManagersListManagedInstancesResponse] = js.native
  def listManagedInstances(
    params: ParamsResourceInstancegroupmanagersListmanagedinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupManagersListManagedInstancesResponse]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.patch
    * @desc Updates a managed instance group using the information that you
    * specify in the request. This operation is marked as DONE when the group
    * is patched even if the instances in the group are still in the process of
    * being patched. You must separately verify the status of the individual
    * instances with the listManagedInstances method. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.instanceGroupManagers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the instance group manager.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where you want to create the managed instance group.
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceInstancegroupmanagersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceInstancegroupmanagersPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceInstancegroupmanagersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceInstancegroupmanagersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceInstancegroupmanagersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.recreateInstances
    * @desc Flags the specified instances in the managed instance group to be
    * immediately recreated. The instances are deleted and recreated using the
    * current instance template for the managed instance group. This operation
    * is marked as DONE when the flag is set even if the instances have not yet
    * been recreated. You must separately verify the status of the recreating
    * action with the listmanagedinstances method.  If the group is part of a
    * backend service that has enabled connection draining, it can take up to
    * 60 seconds after the connection draining duration has elapsed before the
    * VM instance is removed or deleted.  You can specify a maximum of 1000
    * instances with this method per request.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.recreateInstances(request, function(err,
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
    * @alias compute.instanceGroupManagers.recreateInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {().InstanceGroupManagersRecreateInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def recreateInstances(): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def recreateInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(params: ParamsResourceInstancegroupmanagersRecreateinstances): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(
    params: ParamsResourceInstancegroupmanagersRecreateinstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def recreateInstances(
    params: ParamsResourceInstancegroupmanagersRecreateinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def recreateInstances(params: ParamsResourceInstancegroupmanagersRecreateinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def recreateInstances(
    params: ParamsResourceInstancegroupmanagersRecreateinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.resize
    * @desc Resizes the managed instance group. If you increase the size, the
    * group creates new instances using the current instance template. If you
    * decrease the size, the group deletes instances. The resize operation is
    * marked DONE when the resize actions are scheduled even if the group has
    * not yet added or deleted any instances. You must separately verify the
    * status of the creating or deleting actions with the listmanagedinstances
    * method.  When resizing down, the instance group arbitrarily chooses the
    * order in which VMs are deleted. The group takes into account some VM
    * attributes when making the selection including:  + The status of the VM
    * instance. + The health of the VM instance. + The instance template
    * version the VM is based on. + For regional managed instance groups, the
    * location of the VM instance.  This list is subject to change.  If the
    * group is part of a backend service that has enabled connection draining,
    * it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     // The number of running instances that the managed instance group
    * should maintain at any given time.
    *     // The group automatically adds or removes instances to maintain the
    * number of instances specified by
    *     // this parameter.
    *     size: 0,  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.resize(request, function(err, response) {
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
    * @alias compute.instanceGroupManagers.resize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {integer} params.size The number of running instances that the managed instance group should maintain at any given time. The group automatically adds or removes instances to maintain the number of instances specified by this parameter.
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resize(): GaxiosPromise[SchemaOperation] = js.native
  def resize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(params: ParamsResourceInstancegroupmanagersResize): GaxiosPromise[SchemaOperation] = js.native
  def resize(params: ParamsResourceInstancegroupmanagersResize, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resize(
    params: ParamsResourceInstancegroupmanagersResize,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resize(params: ParamsResourceInstancegroupmanagersResize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(
    params: ParamsResourceInstancegroupmanagersResize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.setInstanceTemplate
    * @desc Specifies the instance template to use when creating new instances
    * in this group. The templates for existing instances in the group do not
    * change unless you recreate them.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.setInstanceTemplate(request,
    * function(err, response) { if (err) { console.error(err); return;
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
    * @alias compute.instanceGroupManagers.setInstanceTemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {().InstanceGroupManagersSetInstanceTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setInstanceTemplate(): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setInstanceTemplate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(params: ParamsResourceInstancegroupmanagersSetinstancetemplate): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(
    params: ParamsResourceInstancegroupmanagersSetinstancetemplate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setInstanceTemplate(
    params: ParamsResourceInstancegroupmanagersSetinstancetemplate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setInstanceTemplate(params: ParamsResourceInstancegroupmanagersSetinstancetemplate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setInstanceTemplate(
    params: ParamsResourceInstancegroupmanagersSetinstancetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.instanceGroupManagers.setTargetPools
    * @desc Modifies the target pools to which all instances in this managed
    * instance group are assigned. The target pools automatically apply to all
    * of the instances in the managed instance group. This operation is marked
    * DONE when you make the request even if the instances have not yet been
    * added to their target pools. The change might take some time to apply to
    * all of the instances in the group depending on the size of the group.
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
    *     // The name of the zone where the managed instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the managed instance group.
    *     instanceGroupManager: 'my-instance-group-manager',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroupManagers.setTargetPools(request, function(err,
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
    * @alias compute.instanceGroupManagers.setTargetPools
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the managed instance group is located.
    * @param {().InstanceGroupManagersSetTargetPoolsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTargetPools(): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setTargetPools(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(params: ParamsResourceInstancegroupmanagersSettargetpools): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(
    params: ParamsResourceInstancegroupmanagersSettargetpools,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setTargetPools(
    params: ParamsResourceInstancegroupmanagersSettargetpools,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setTargetPools(params: ParamsResourceInstancegroupmanagersSettargetpools, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setTargetPools(
    params: ParamsResourceInstancegroupmanagersSettargetpools,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
