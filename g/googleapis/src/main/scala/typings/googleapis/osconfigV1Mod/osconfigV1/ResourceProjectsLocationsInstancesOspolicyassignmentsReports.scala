package typings.googleapis.osconfigV1Mod.osconfigV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1", "osconfig_v1.Resource$Projects$Locations$Instances$Ospolicyassignments$Reports")
@js.native
open class ResourceProjectsLocationsInstancesOspolicyassignmentsReports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaOSPolicyAssignmentReport] = js.native
  def get(callback: BodyResponseCallback[SchemaOSPolicyAssignmentReport]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOSPolicyAssignmentReport] = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet): GaxiosPromise[SchemaOSPolicyAssignmentReport] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet,
    callback: BodyResponseCallback[SchemaOSPolicyAssignmentReport]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet,
    options: BodyResponseCallback[Readable | SchemaOSPolicyAssignmentReport],
    callback: BodyResponseCallback[Readable | SchemaOSPolicyAssignmentReport]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaOSPolicyAssignmentReport] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOSPolicyAssignmentReport]
  ): Unit = js.native
  /**
    * Get the OS policy asssignment report for the specified Compute Engine VM instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await osconfig.projects.locations.instances.osPolicyAssignments.reports.get(
    *       {
    *         // Required. API resource name for OS policy assignment report. Format: `/projects/{project\}/locations/{location\}/instances/{instance\}/osPolicyAssignments/{assignment\}/report` For `{project\}`, either `project-number` or `project-id` can be provided. For `{instance_id\}`, either Compute Engine `instance-id` or `instance-name` can be provided. For `{assignment_id\}`, the OSPolicyAssignment id must be provided.
    *         name: 'projects/my-project/locations/my-location/instances/my-instance/osPolicyAssignments/my-osPolicyAssignment/report',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instance": "my_instance",
    *   //   "lastRunId": "my_lastRunId",
    *   //   "name": "my_name",
    *   //   "osPolicyAssignment": "my_osPolicyAssignment",
    *   //   "osPolicyCompliances": [],
    *   //   "updateTime": "my_updateTime"
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
  def get(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListOSPolicyAssignmentReportsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOSPolicyAssignmentReportsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOSPolicyAssignmentReportsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList): GaxiosPromise[SchemaListOSPolicyAssignmentReportsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList,
    callback: BodyResponseCallback[SchemaListOSPolicyAssignmentReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList,
    options: BodyResponseCallback[Readable | SchemaListOSPolicyAssignmentReportsResponse],
    callback: BodyResponseCallback[Readable | SchemaListOSPolicyAssignmentReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListOSPolicyAssignmentReportsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOSPolicyAssignmentReportsResponse]
  ): Unit = js.native
  /**
    * List OS policy asssignment reports for all Compute Engine VM instances in the specified zone.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/osconfig.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const osconfig = google.osconfig('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await osconfig.projects.locations.instances.osPolicyAssignments.reports.list(
    *       {
    *         // If provided, this field specifies the criteria that must be met by the `OSPolicyAssignmentReport` API resource that is included in the response.
    *         filter: 'placeholder-value',
    *         // The maximum number of results to return.
    *         pageSize: 'placeholder-value',
    *         // A pagination token returned from a previous call to the `ListOSPolicyAssignmentReports` method that indicates where this listing should continue from.
    *         pageToken: 'placeholder-value',
    *         // Required. The parent resource name. Format: `projects/{project\}/locations/{location\}/instances/{instance\}/osPolicyAssignments/{assignment\}/reports` For `{project\}`, either `project-number` or `project-id` can be provided. For `{instance\}`, either `instance-name`, `instance-id`, or `-` can be provided. If '-' is provided, the response will include OSPolicyAssignmentReports for all instances in the project/location. For `{assignment\}`, either `assignment-id` or `-` can be provided. If '-' is provided, the response will include OSPolicyAssignmentReports for all OSPolicyAssignments in the project/location. Either {instance\} or {assignment\} must be `-`. For example: `projects/{project\}/locations/{location\}/instances/{instance\}/osPolicyAssignments/-/reports` returns all reports for the instance `projects/{project\}/locations/{location\}/instances/-/osPolicyAssignments/{assignment-id\}/reports` returns all the reports for the given assignment across all instances. `projects/{project\}/locations/{location\}/instances/-/osPolicyAssignments/-/reports` returns all the reports for all assignments across all instances.
    *         parent:
    *           'projects/my-project/locations/my-location/instances/my-instance/osPolicyAssignments/my-osPolicyAssignment',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "osPolicyAssignmentReports": []
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
  def list(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
