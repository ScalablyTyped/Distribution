package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Groups$Members")
@js.native
open class ResourceProjectsGroupsMembers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupMembersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(params: ParamsResourceProjectsGroupsMembersList): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    callback: BodyResponseCallback[SchemaListGroupMembersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    options: BodyResponseCallback[Readable | SchemaListGroupMembersResponse],
    callback: BodyResponseCallback[Readable | SchemaListGroupMembersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsGroupsMembersList, options: MethodOptions): GaxiosPromise[SchemaListGroupMembersResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupMembersResponse]
  ): Unit = js.native
  /**
    * Lists the monitored resources that are members of a group.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/monitoring.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const monitoring = google.monitoring('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/monitoring',
    *       'https://www.googleapis.com/auth/monitoring.read',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await monitoring.projects.groups.members.list({
    *     // An optional list filter (https://cloud.google.com/monitoring/api/learn_more#filtering) describing the members to be returned. The filter may reference the type, labels, and metadata of monitored resources that comprise the group. For example, to return only resources representing Compute Engine VM instances, use this filter: `resource.type = "gce_instance"`
    *     filter: 'placeholder-value',
    *     // Required. The end of the time interval.
    *     'interval.endTime': 'placeholder-value',
    *     // Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time.
    *     'interval.startTime': 'placeholder-value',
    *     // Required. The group whose members are listed. The format is: projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
    *     name: 'projects/my-project/groups/my-group',
    *     // A positive number that is the maximum number of results to return.
    *     pageSize: 'placeholder-value',
    *     // If this field is not empty then it must contain the next_page_token value returned by a previous call to this method. Using this field causes the method to return additional results from the previous method call.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "members": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsGroupsMembersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsGroupsMembersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
