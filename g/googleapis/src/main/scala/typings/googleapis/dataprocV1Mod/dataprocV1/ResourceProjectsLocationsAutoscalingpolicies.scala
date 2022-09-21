package typings.googleapis.dataprocV1Mod.dataprocV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataproc/v1", "dataproc_v1.Resource$Projects$Locations$Autoscalingpolicies")
@js.native
open class ResourceProjectsLocationsAutoscalingpolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaAutoscalingPolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate,
    options: BodyResponseCallback[Readable | SchemaAutoscalingPolicy],
    callback: BodyResponseCallback[Readable | SchemaAutoscalingPolicy]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  /**
    * Creates new autoscaling policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *   const res = await dataproc.projects.locations.autoscalingPolicies.create({
    *     // Required. The "resource name" of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies.create, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.autoscalingPolicies.create, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "basicAlgorithm": {},
    *       //   "id": "my_id",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "secondaryWorkerConfig": {},
    *       //   "workerConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basicAlgorithm": {},
    *   //   "id": "my_id",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "secondaryWorkerConfig": {},
    *   //   "workerConfig": {}
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
  def create(params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an autoscaling policy. It is an error to delete an autoscaling policy that is in use by one or more clusters.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *   const res = await dataproc.projects.locations.autoscalingPolicies.delete({
    *     // Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies.delete, the resource name of the policy has the following format: projects/{project_id\}/regions/{region\}/autoscalingPolicies/{policy_id\} For projects.locations.autoscalingPolicies.delete, the resource name of the policy has the following format: projects/{project_id\}/locations/{location\}/autoscalingPolicies/{policy_id\}
    *     name: 'projects/my-project/locations/my-location/autoscalingPolicies/my-autoscalingPolicie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaAutoscalingPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet,
    options: BodyResponseCallback[Readable | SchemaAutoscalingPolicy],
    callback: BodyResponseCallback[Readable | SchemaAutoscalingPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  /**
    * Retrieves autoscaling policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *   const res = await dataproc.projects.locations.autoscalingPolicies.get({
    *     // Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies.get, the resource name of the policy has the following format: projects/{project_id\}/regions/{region\}/autoscalingPolicies/{policy_id\} For projects.locations.autoscalingPolicies.get, the resource name of the policy has the following format: projects/{project_id\}/locations/{location\}/autoscalingPolicies/{policy_id\}
    *     name: 'projects/my-project/locations/my-location/autoscalingPolicies/my-autoscalingPolicie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basicAlgorithm": {},
    *   //   "id": "my_id",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "secondaryWorkerConfig": {},
    *   //   "workerConfig": {}
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
  def get(params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *     await dataproc.projects.locations.autoscalingPolicies.getIamPolicy({
    *       // REQUIRED: The resource for which the policy is being requested. See Resource names (https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/autoscalingPolicies/my-autoscalingPolicie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "options": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAutoscalingpoliciesList): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesList,
    callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesList,
    options: BodyResponseCallback[Readable | SchemaListAutoscalingPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAutoscalingpoliciesList, options: MethodOptions): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]
  ): Unit = js.native
  /**
    * Lists autoscaling policies in the project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *   const res = await dataproc.projects.locations.autoscalingPolicies.list({
    *     // Optional. The maximum number of results to return in each response. Must be less than or equal to 1000. Defaults to 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. The page token, returned by a previous call, to request the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. The "resource name" of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies.list, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.autoscalingPolicies.list, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "policies": []
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
  def list(params: ParamsResourceProjectsLocationsAutoscalingpoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *     await dataproc.projects.locations.autoscalingPolicies.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See Resource names (https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/autoscalingPolicies/my-autoscalingPolicie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *     await dataproc.projects.locations.autoscalingPolicies.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See Resource names (https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/autoscalingPolicies/my-autoscalingPolicie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(callback: BodyResponseCallback[SchemaAutoscalingPolicy]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate,
    options: BodyResponseCallback[Readable | SchemaAutoscalingPolicy],
    callback: BodyResponseCallback[Readable | SchemaAutoscalingPolicy]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  /**
    * Updates (replaces) autoscaling policy.Disabled check for update_mask, because all updates will be full replacements.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1');
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
    *   const res = await dataproc.projects.locations.autoscalingPolicies.update({
    *     // Output only. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id\}/regions/{region\}/autoscalingPolicies/{policy_id\} For projects.locations.autoscalingPolicies, the resource name of the policy has the following format: projects/{project_id\}/locations/{location\}/autoscalingPolicies/{policy_id\}
    *     name: 'projects/my-project/locations/my-location/autoscalingPolicies/my-autoscalingPolicie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "basicAlgorithm": {},
    *       //   "id": "my_id",
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "secondaryWorkerConfig": {},
    *       //   "workerConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "basicAlgorithm": {},
    *   //   "id": "my_id",
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "secondaryWorkerConfig": {},
    *   //   "workerConfig": {}
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
  def update(params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsLocationsAutoscalingpoliciesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
