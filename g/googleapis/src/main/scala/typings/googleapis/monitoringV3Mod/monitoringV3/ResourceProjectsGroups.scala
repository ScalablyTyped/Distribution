package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Groups")
@js.native
class ResourceProjectsGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.projects.groups.create
    * @desc Creates a new group.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'create' method:
    *
    *     // The project in which to create the group. The format is
    * `"projects/{project_id_or_number}"`. name: "projects/{MY-PROJECT}",
    *     resource: {},
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.groups.create(request, function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.groups.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project in which to create the group. The format is "projects/{project_id_or_number}".
    * @param {boolean=} params.validateOnly If true, validate this request but do not create the group.
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGroup] = js.native
  def create(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def create(params: ParamsResourceProjectsGroupsCreate): GaxiosPromise[SchemaGroup] = js.native
  def create(params: ParamsResourceProjectsGroupsCreate, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def create(
    params: ParamsResourceProjectsGroupsCreate,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsGroupsCreate, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def create(
    params: ParamsResourceProjectsGroupsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  
  /**
    * monitoring.projects.groups.delete
    * @desc Deletes an existing group.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'delete' method:
    *
    *     // The group to delete. The format is
    * `"projects/{project_id_or_number}/groups/{group_id}"`. name:
    * "projects/{MY-PROJECT}/groups/{MY-GROUP}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.groups.delete(request, function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The group to delete. The format is "projects/{project_id_or_number}/groups/{group_id}".
    * @param {boolean=} params.recursive If this field is true, then the request means to delete a group with all its descendants. Otherwise, the request means to delete a group only when it has no descendants. The default value is false.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsGroupsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsGroupsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsGroupsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsGroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsGroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * monitoring.projects.groups.get
    * @desc Gets a single group.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'get' method:
    *
    *     // The group to retrieve. The format is
    * `"projects/{project_id_or_number}/groups/{group_id}"`. name:
    * "projects/{MY-PROJECT}/groups/{MY-GROUP}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.groups.get(request, function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The group to retrieve. The format is "projects/{project_id_or_number}/groups/{group_id}".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def get(params: ParamsResourceProjectsGroupsGet): GaxiosPromise[SchemaGroup] = js.native
  def get(params: ParamsResourceProjectsGroupsGet, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGroupsGet,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGroupsGet, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def get(
    params: ParamsResourceProjectsGroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  
  /**
    * monitoring.projects.groups.list
    * @desc Lists the existing groups.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'list' method:
    *
    *     // The project whose groups are to be listed. The format is
    * `"projects/{project_id_or_number}"`. name: "projects/{MY-PROJECT}",
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *
    *   var recur = function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *       if (result.nextPageToken) {
    *         request.pageToken = result.nextPageToken;
    *         monitoring.projects.groups.list(request, recur);
    *       }
    *     }
    *   };
    *
    *   monitoring.projects.groups.list(request, recur);
    * });
    * @alias monitoring.projects.groups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ancestorsOfGroup A group name: "projects/{project_id_or_number}/groups/{group_id}". Returns groups that are ancestors of the specified group. The groups are returned in order, starting with the immediate parent and ending with the most distant ancestor. If the specified group has no immediate parent, the results are empty.
    * @param {string=} params.childrenOfGroup A group name: "projects/{project_id_or_number}/groups/{group_id}". Returns groups whose parentName field contains the group name. If no groups have this parent, the results are empty.
    * @param {string=} params.descendantsOfGroup A group name: "projects/{project_id_or_number}/groups/{group_id}". Returns the descendants of the specified group. This is a superset of the results returned by the childrenOfGroup filter, and includes children-of-children, and so forth.
    * @param {string} params.name The project whose groups are to be listed. The format is "projects/{project_id_or_number}".
    * @param {integer=} params.pageSize A positive number that is the maximum number of results to return.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(params: ParamsResourceProjectsGroupsList): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(params: ParamsResourceProjectsGroupsList, callback: BodyResponseCallback[SchemaListGroupsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsGroupsList,
    options: BodyResponseCallback[SchemaListGroupsResponse],
    callback: BodyResponseCallback[SchemaListGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsGroupsList, options: MethodOptions): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupsResponse]
  ): Unit = js.native
  
  var members: ResourceProjectsGroupsMembers = js.native
  
  /**
    * monitoring.projects.groups.update
    * @desc Updates an existing group. You can change any group attributes
    * except name.
    * @example
    * * // PRE-REQUISITES:
    * // ---------------
    * // 1. If not already done, enable the Google Monitoring API and check the
    * quota for your project at
    * //
    * https://console.developers.google.com/apis/api/monitoring_component/quotas
    * // 2. This sample uses Application Default Credentials for Auth. If not
    * already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk/ and run 'gcloud beta auth
    * application-default login'
    * // 3. To install the client library and Application Default Credentials
    * library, run:
    * //    'npm install googleapis --save'
    * var google = require('googleapis');
    * var monitoring = google.monitoring('v3');
    *
    * google.auth.getApplicationDefault(function(err, authClient) {
    *   if (err) {
    *     console.log('Authentication failed because of ', err);
    *     return;
    *   }
    *   if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *   }
    *
    *   var request = {
    *     // TODO: Change placeholders below to appropriate parameter values
    * for the 'update' method:
    *
    *     // The name of this group. The format is
    * `"projects/{project_id_or_number}/groups/{group_id}"`. When
    *     // creating a group, this field is ignored and a new name is created
    * consisting of the project
    *     // specified in the call to `CreateGroup` and a unique `{group_id}`
    * that is generated automatically.
    *     // @OutputOnly
    *     name: "projects/{MY-PROJECT}/groups/{MY-GROUP}",
    *     resource: {},
    *     // Auth client
    *     auth: authClient
    *   };
    *
    *   monitoring.projects.groups.update(request, function(err, result) {
    *     if (err) {
    *       console.log(err);
    *     } else {
    *       console.log(result);
    *     }
    *   });
    * });
    * @alias monitoring.projects.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The name of this group. The format is "projects/{project_id_or_number}/groups/{group_id}". When creating a group, this field is ignored and a new name is created consisting of the project specified in the call to CreateGroup and a unique {group_id} that is generated automatically.
    * @param {boolean=} params.validateOnly If true, validate this request but do not update the existing group.
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceProjectsGroupsUpdate): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceProjectsGroupsUpdate, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(
    params: ParamsResourceProjectsGroupsUpdate,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(
    params: ParamsResourceProjectsGroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
}
