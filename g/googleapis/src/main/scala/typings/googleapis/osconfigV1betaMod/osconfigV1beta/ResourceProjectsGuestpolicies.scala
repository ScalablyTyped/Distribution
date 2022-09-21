package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1beta", "osconfig_v1beta.Resource$Projects$Guestpolicies")
@js.native
open class ResourceProjectsGuestpolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGuestPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaGuestPolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuestPolicy] = js.native
  def create(params: ParamsResourceProjectsGuestpoliciesCreate): GaxiosPromise[SchemaGuestPolicy] = js.native
  def create(
    params: ParamsResourceProjectsGuestpoliciesCreate,
    callback: BodyResponseCallback[SchemaGuestPolicy]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsGuestpoliciesCreate,
    options: BodyResponseCallback[Readable | SchemaGuestPolicy],
    callback: BodyResponseCallback[Readable | SchemaGuestPolicy]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsGuestpoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaGuestPolicy] = js.native
  def create(
    params: ParamsResourceProjectsGuestpoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuestPolicy]
  ): Unit = js.native
  /**
    * Create an OS Config guest policy.
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
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.guestPolicies.create({
    *     // Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
    *     guestPolicyId: 'placeholder-value',
    *     // Required. The resource name of the parent using one of the following forms: `projects/{project_number\}`.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assignment": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "packageRepositories": [],
    *       //   "packages": [],
    *       //   "recipes": [],
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignment": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "packageRepositories": [],
    *   //   "packages": [],
    *   //   "recipes": [],
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
  def create(params: ParamsResourceProjectsGuestpoliciesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsGuestpoliciesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsGuestpoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsGuestpoliciesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsGuestpoliciesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsGuestpoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsGuestpoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Delete an OS Config guest policy.
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
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.guestPolicies.delete({
    *     // Required. The resource name of the guest policy using one of the following forms: `projects/{project_number\}/guestPolicies/{guest_policy_id\}`.
    *     name: 'projects/my-project/guestPolicies/my-guestPolicie',
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
  def delete(params: ParamsResourceProjectsGuestpoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsGuestpoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGuestPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaGuestPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuestPolicy] = js.native
  def get(params: ParamsResourceProjectsGuestpoliciesGet): GaxiosPromise[SchemaGuestPolicy] = js.native
  def get(params: ParamsResourceProjectsGuestpoliciesGet, callback: BodyResponseCallback[SchemaGuestPolicy]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGuestpoliciesGet,
    options: BodyResponseCallback[Readable | SchemaGuestPolicy],
    callback: BodyResponseCallback[Readable | SchemaGuestPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGuestpoliciesGet, options: MethodOptions): GaxiosPromise[SchemaGuestPolicy] = js.native
  def get(
    params: ParamsResourceProjectsGuestpoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuestPolicy]
  ): Unit = js.native
  /**
    * Get an OS Config guest policy.
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
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.guestPolicies.get({
    *     // Required. The resource name of the guest policy using one of the following forms: `projects/{project_number\}/guestPolicies/{guest_policy_id\}`.
    *     name: 'projects/my-project/guestPolicies/my-guestPolicie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignment": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "packageRepositories": [],
    *   //   "packages": [],
    *   //   "recipes": [],
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
  def get(params: ParamsResourceProjectsGuestpoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsGuestpoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGuestPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGuestPoliciesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGuestPoliciesResponse] = js.native
  def list(params: ParamsResourceProjectsGuestpoliciesList): GaxiosPromise[SchemaListGuestPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsGuestpoliciesList,
    callback: BodyResponseCallback[SchemaListGuestPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsGuestpoliciesList,
    options: BodyResponseCallback[Readable | SchemaListGuestPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaListGuestPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsGuestpoliciesList, options: MethodOptions): GaxiosPromise[SchemaListGuestPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsGuestpoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGuestPoliciesResponse]
  ): Unit = js.native
  /**
    * Get a page of OS Config guest policies.
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
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.guestPolicies.list({
    *     // The maximum number of guest policies to return.
    *     pageSize: 'placeholder-value',
    *     // A pagination token returned from a previous call to `ListGuestPolicies` that indicates where this listing should continue from.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the parent using one of the following forms: `projects/{project_number\}`.
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "guestPolicies": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceProjectsGuestpoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsGuestpoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGuestPolicy] = js.native
  def patch(callback: BodyResponseCallback[SchemaGuestPolicy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGuestPolicy] = js.native
  def patch(params: ParamsResourceProjectsGuestpoliciesPatch): GaxiosPromise[SchemaGuestPolicy] = js.native
  def patch(
    params: ParamsResourceProjectsGuestpoliciesPatch,
    callback: BodyResponseCallback[SchemaGuestPolicy]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsGuestpoliciesPatch,
    options: BodyResponseCallback[Readable | SchemaGuestPolicy],
    callback: BodyResponseCallback[Readable | SchemaGuestPolicy]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsGuestpoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaGuestPolicy] = js.native
  def patch(
    params: ParamsResourceProjectsGuestpoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuestPolicy]
  ): Unit = js.native
  /**
    * Update an OS Config guest policy.
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
    * const osconfig = google.osconfig('v1beta');
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
    *   const res = await osconfig.projects.guestPolicies.patch({
    *     // Required. Unique name of the resource in this project using one of the following forms: `projects/{project_number\}/guestPolicies/{guest_policy_id\}`.
    *     name: 'projects/my-project/guestPolicies/my-guestPolicie',
    *     // Field mask that controls which fields of the guest policy should be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "assignment": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "name": "my_name",
    *       //   "packageRepositories": [],
    *       //   "packages": [],
    *       //   "recipes": [],
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignment": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "packageRepositories": [],
    *   //   "packages": [],
    *   //   "recipes": [],
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
  def patch(params: ParamsResourceProjectsGuestpoliciesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsGuestpoliciesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
