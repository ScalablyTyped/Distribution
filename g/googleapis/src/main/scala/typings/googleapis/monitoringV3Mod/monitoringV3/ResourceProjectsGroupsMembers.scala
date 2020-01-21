package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Groups$Members")
@js.native
class ResourceProjectsGroupsMembers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.projects.groups.members.list
    * @desc Lists the monitored resources that are members of a group.
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
    *     // The group whose members are listed. The format is
    *     // `"projects/{project_id_or_number}/groups/{group_id}"`.
    *     name: "projects/{MY-PROJECT}/groups/{MY-GROUP}",
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
    *         monitoring.projects.groups.members.list(request, recur);
    *       }
    *     }
    *   };
    *
    *   monitoring.projects.groups.members.list(request, recur);
    * });
    * @alias monitoring.projects.groups.members.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter An optional list filter describing the members to be returned. The filter may reference the type, labels, and metadata of monitored resources that comprise the group. For example, to return only resources representing Compute Engine VM instances, use this filter: resource.type = "gce_instance"
    * @param {string=} params.interval.endTime Required. The end of the time interval.
    * @param {string=} params.interval.startTime Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
    * @param {string} params.name The group whose members are listed. The format is "projects/{project_id_or_number}/groups/{group_id}".
    * @param {integer=} params.pageSize A positive number that is the maximum number of results to return.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupMembersResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsGroupsMembersList): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    callback: BodyResponseCallback[SchemaListGroupMembersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    options: BodyResponseCallback[SchemaListGroupMembersResponse],
    callback: BodyResponseCallback[SchemaListGroupMembersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsGroupsMembersList, options: MethodOptions): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupMembersResponse]
  ): Unit = js.native
}

