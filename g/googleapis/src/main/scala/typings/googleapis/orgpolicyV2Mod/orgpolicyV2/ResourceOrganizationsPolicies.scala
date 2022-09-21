package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/orgpolicy/v2", "orgpolicy_v2.Resource$Organizations$Policies")
@js.native
open class ResourceOrganizationsPolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def create(params: ParamsResourceOrganizationsPoliciesCreate): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def create(
    params: ParamsResourceOrganizationsPoliciesCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsPoliciesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsPoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def create(
    params: ParamsResourceOrganizationsPoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  /**
    * Creates a Policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the policy already exists on the given Cloud resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.organizations.policies.create({
    *     // Required. The Cloud resource that will parent the new Policy. Must be in one of the following forms: * `projects/{project_number\}` * `projects/{project_id\}` * `folders/{folder_id\}` * `organizations/{organization_id\}`
    *     parent: 'organizations/my-organization',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternate": {},
    *       //   "name": "my_name",
    *       //   "spec": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternate": {},
    *   //   "name": "my_name",
    *   //   "spec": {}
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
  def create(params: ParamsResourceOrganizationsPoliciesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsPoliciesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsPoliciesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsPoliciesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsPoliciesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsPoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsPoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a Policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or Org Policy does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.organizations.policies.delete({
    *     // Required. Name of the policy to delete. See `Policy` for naming rules.
    *     name: 'organizations/my-organization/policies/my-policie',
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
  def delete(params: ParamsResourceOrganizationsPoliciesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsPoliciesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def get(params: ParamsResourceOrganizationsPoliciesGet): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def get(
    params: ParamsResourceOrganizationsPoliciesGet,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsPoliciesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsPoliciesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def get(
    params: ParamsResourceOrganizationsPoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  /**
    * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.organizations.policies.get({
    *     // Required. Resource name of the policy. See `Policy` for naming requirements.
    *     name: 'organizations/my-organization/policies/my-policie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternate": {},
    *   //   "name": "my_name",
    *   //   "spec": {}
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
  def get(params: ParamsResourceOrganizationsPoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsPoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getEffectivePolicy(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def getEffectivePolicy(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]): Unit = js.native
  def getEffectivePolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def getEffectivePolicy(params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def getEffectivePolicy(
    params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def getEffectivePolicy(
    params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def getEffectivePolicy(params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def getEffectivePolicy(
    params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging `Policies` in the resource hierarchy and evaluating conditions. The returned `Policy` will not have an `etag` or `condition` set because it is a computed `Policy` across multiple resources. Subtrees of Resource Manager resource hierarchy with 'under:' prefix will not be expanded.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.organizations.policies.getEffectivePolicy({
    *     // Required. The effective policy to compute. See `Policy` for naming rules.
    *     name: 'organizations/my-organization/policies/my-policie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternate": {},
    *   //   "name": "my_name",
    *   //   "spec": {}
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
  def getEffectivePolicy(params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEffectivePolicy(
    params: ParamsResourceOrganizationsPoliciesGeteffectivepolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse] = js.native
  def list(params: ParamsResourceOrganizationsPoliciesList): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsPoliciesList,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsPoliciesList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsPoliciesList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsPoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListPoliciesResponse]
  ): Unit = js.native
  /**
    * Retrieves all of the `Policies` that exist on a particular resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.organizations.policies.list({
    *     // Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size.
    *     pageSize: 'placeholder-value',
    *     // Page token used to retrieve the next page. This is currently unsupported and will be ignored. The server may at any point start using this field.
    *     pageToken: 'placeholder-value',
    *     // Required. The target Cloud resource that parents the set of constraints and policies that will be returned from this call. Must be in one of the following forms: * `projects/{project_number\}` * `projects/{project_id\}` * `folders/{folder_id\}` * `organizations/{organization_id\}`
    *     parent: 'organizations/my-organization',
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
  def list(params: ParamsResourceOrganizationsPoliciesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsPoliciesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def patch(params: ParamsResourceOrganizationsPoliciesPatch): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def patch(
    params: ParamsResourceOrganizationsPoliciesPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsPoliciesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsPoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2Policy] = js.native
  def patch(
    params: ParamsResourceOrganizationsPoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2Policy]
  ): Unit = js.native
  /**
    * Updates a Policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint or the policy do not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ABORTED` if the etag supplied in the request does not match the persisted etag of the policy Note: the supplied policy will perform a full overwrite of all fields.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/orgpolicy.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const orgpolicy = google.orgpolicy('v2');
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
    *   const res = await orgpolicy.organizations.policies.patch({
    *     // Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number\}/policies/{constraint_name\}` * `folders/{folder_id\}/policies/{constraint_name\}` * `organizations/{organization_id\}/policies/{constraint_name\}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id\}/policies/{constraint_name\}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
    *     name: 'organizations/my-organization/policies/my-policie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternate": {},
    *       //   "name": "my_name",
    *       //   "spec": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternate": {},
    *   //   "name": "my_name",
    *   //   "spec": {}
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
  def patch(params: ParamsResourceOrganizationsPoliciesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsPoliciesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
