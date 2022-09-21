package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1alpha", "osconfig_v1alpha.Resource$Projects$Locations$Ospolicyassignments")
@js.native
open class ResourceProjectsLocationsOspolicyassignments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Create an OS policy assignment. This method also creates the first revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1alpha/projects.locations.osPolicyAssignments.operations/cancel).
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res = await osconfig.projects.locations.osPolicyAssignments.create({
    *     // Required. The logical name of the OS policy assignment in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
    *     osPolicyAssignmentId: 'placeholder-value',
    *     // Required. The parent resource name in the form: projects/{project\}/locations/{location\}
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "baseline": false,
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "instanceFilter": {},
    *       //   "name": "my_name",
    *       //   "osPolicies": [],
    *       //   "reconciling": false,
    *       //   "revisionCreateTime": "my_revisionCreateTime",
    *       //   "revisionId": "my_revisionId",
    *       //   "rollout": {},
    *       //   "rolloutState": "my_rolloutState",
    *       //   "uid": "my_uid"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Delete the OS policy assignment. This method creates a new revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. If the LRO completes and is not cancelled, all revisions associated with the OS policy assignment are deleted. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1alpha/projects.locations.osPolicyAssignments.operations/cancel).
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res = await osconfig.projects.locations.osPolicyAssignments.delete({
    *     // Required. The name of the OS policy assignment to be deleted
    *     name: 'projects/my-project/locations/my-location/osPolicyAssignments/my-osPolicyAssignment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaOSPolicyAssignment] = js.native
  def get(callback: BodyResponseCallback[SchemaOSPolicyAssignment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOSPolicyAssignment] = js.native
  def get(params: ParamsResourceProjectsLocationsOspolicyassignmentsGet): GaxiosPromise[SchemaOSPolicyAssignment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsGet,
    callback: BodyResponseCallback[SchemaOSPolicyAssignment]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsGet,
    options: BodyResponseCallback[Readable | SchemaOSPolicyAssignment],
    callback: BodyResponseCallback[Readable | SchemaOSPolicyAssignment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsOspolicyassignmentsGet, options: MethodOptions): GaxiosPromise[SchemaOSPolicyAssignment] = js.native
  def get(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOSPolicyAssignment]
  ): Unit = js.native
  /**
    * Retrieve an existing OS policy assignment. This method always returns the latest revision. In order to retrieve a previous revision of the assignment, also provide the revision ID in the `name` parameter.
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res = await osconfig.projects.locations.osPolicyAssignments.get({
    *     // Required. The resource name of OS policy assignment. Format: `projects/{project\}/locations/{location\}/osPolicyAssignments/{os_policy_assignment\}@{revisionId\}`
    *     name: 'projects/my-project/locations/my-location/osPolicyAssignments/my-osPolicyAssignment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "baseline": false,
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "instanceFilter": {},
    *   //   "name": "my_name",
    *   //   "osPolicies": [],
    *   //   "reconciling": false,
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "rollout": {},
    *   //   "rolloutState": "my_rolloutState",
    *   //   "uid": "my_uid"
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
  def get(params: ParamsResourceProjectsLocationsOspolicyassignmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListOSPolicyAssignmentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListOSPolicyAssignmentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOSPolicyAssignmentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsOspolicyassignmentsList): GaxiosPromise[SchemaListOSPolicyAssignmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsList,
    callback: BodyResponseCallback[SchemaListOSPolicyAssignmentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsList,
    options: BodyResponseCallback[Readable | SchemaListOSPolicyAssignmentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListOSPolicyAssignmentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsOspolicyassignmentsList, options: MethodOptions): GaxiosPromise[SchemaListOSPolicyAssignmentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOSPolicyAssignmentsResponse]
  ): Unit = js.native
  /**
    * List the OS policy assignments under the parent resource. For each OS policy assignment, the latest revision is returned.
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res = await osconfig.projects.locations.osPolicyAssignments.list({
    *     // The maximum number of assignments to return.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to `ListOSPolicyAssignments` that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "osPolicyAssignments": []
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
  def list(params: ParamsResourceProjectsLocationsOspolicyassignmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listRevisions(): GaxiosPromise[SchemaListOSPolicyAssignmentRevisionsResponse] = js.native
  def listRevisions(callback: BodyResponseCallback[SchemaListOSPolicyAssignmentRevisionsResponse]): Unit = js.native
  def listRevisions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListOSPolicyAssignmentRevisionsResponse] = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions): GaxiosPromise[SchemaListOSPolicyAssignmentRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions,
    callback: BodyResponseCallback[SchemaListOSPolicyAssignmentRevisionsResponse]
  ): Unit = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions,
    options: BodyResponseCallback[Readable | SchemaListOSPolicyAssignmentRevisionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListOSPolicyAssignmentRevisionsResponse]
  ): Unit = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions, options: MethodOptions): GaxiosPromise[SchemaListOSPolicyAssignmentRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListOSPolicyAssignmentRevisionsResponse]
  ): Unit = js.native
  /**
    * List the OS policy assignment revisions for a given OS policy assignment.
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
    * const osconfig = google.osconfig('v1alpha');
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
    *     await osconfig.projects.locations.osPolicyAssignments.listRevisions({
    *       // Required. The name of the OS policy assignment to list revisions for.
    *       name: 'projects/my-project/locations/my-location/osPolicyAssignments/my-osPolicyAssignment',
    *       // The maximum number of revisions to return.
    *       pageSize: 'placeholder-value',
    *       // A pagination token returned from a previous call to `ListOSPolicyAssignmentRevisions` that indicates where this listing should continue from.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "osPolicyAssignments": []
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
  def listRevisions(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsListrevisions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsOspolicyassignmentsOperations = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update an existing OS policy assignment. This method creates a new revision of the OS policy assignment. This method returns a long running operation (LRO) that contains the rollout details. The rollout can be cancelled by cancelling the LRO. For more information, see [Method: projects.locations.osPolicyAssignments.operations.cancel](https://cloud.google.com/compute/docs/osconfig/rest/v1alpha/projects.locations.osPolicyAssignments.operations/cancel).
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
    * const osconfig = google.osconfig('v1alpha');
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
    *   const res = await osconfig.projects.locations.osPolicyAssignments.patch({
    *     // Resource name. Format: `projects/{project_number\}/locations/{location\}/osPolicyAssignments/{os_policy_assignment_id\}` This field is ignored when you create an OS policy assignment.
    *     name: 'projects/my-project/locations/my-location/osPolicyAssignments/my-osPolicyAssignment',
    *     // Optional. Field mask that controls which fields of the assignment should be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "baseline": false,
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "instanceFilter": {},
    *       //   "name": "my_name",
    *       //   "osPolicies": [],
    *       //   "reconciling": false,
    *       //   "revisionCreateTime": "my_revisionCreateTime",
    *       //   "revisionId": "my_revisionId",
    *       //   "rollout": {},
    *       //   "rolloutState": "my_rolloutState",
    *       //   "uid": "my_uid"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsOspolicyassignmentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
