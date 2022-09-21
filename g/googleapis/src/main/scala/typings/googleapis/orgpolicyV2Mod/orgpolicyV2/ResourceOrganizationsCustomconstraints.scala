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

@JSImport("googleapis/build/src/apis/orgpolicy/v2", "orgpolicy_v2.Resource$Organizations$Customconstraints")
@js.native
open class ResourceOrganizationsCustomconstraints protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def create(params: ParamsResourceOrganizationsCustomconstraintsCreate): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def create(
    params: ParamsResourceOrganizationsCustomconstraintsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsCustomconstraintsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2CustomConstraint],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsCustomconstraintsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def create(
    params: ParamsResourceOrganizationsCustomconstraintsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  /**
    * Creates a CustomConstraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the organization does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the constraint already exists on the given organization.
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
    *   const res = await orgpolicy.organizations.customConstraints.create({
    *     // Required. Must be in the following form: * `organizations/{organization_id\}`
    *     parent: 'organizations/my-organization',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "actionType": "my_actionType",
    *       //   "condition": "my_condition",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "methodTypes": [],
    *       //   "name": "my_name",
    *       //   "resourceTypes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actionType": "my_actionType",
    *   //   "condition": "my_condition",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "methodTypes": [],
    *   //   "name": "my_name",
    *   //   "resourceTypes": []
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
  def create(params: ParamsResourceOrganizationsCustomconstraintsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsCustomconstraintsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsCustomconstraintsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsCustomconstraintsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsCustomconstraintsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsCustomconstraintsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsCustomconstraintsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a Custom Constraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist.
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
    *   const res = await orgpolicy.organizations.customConstraints.delete({
    *     // Required. Name of the custom constraint to delete. See `CustomConstraint` for naming rules.
    *     name: 'organizations/my-organization/customConstraints/my-customConstraint',
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
  def delete(params: ParamsResourceOrganizationsCustomconstraintsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsCustomconstraintsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def get(params: ParamsResourceOrganizationsCustomconstraintsGet): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def get(
    params: ParamsResourceOrganizationsCustomconstraintsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsCustomconstraintsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2CustomConstraint],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsCustomconstraintsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def get(
    params: ParamsResourceOrganizationsCustomconstraintsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  /**
    * Gets a CustomConstraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the CustomConstraint does not exist.
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
    *   const res = await orgpolicy.organizations.customConstraints.get({
    *     // Required. Resource name of the custom constraint. See `CustomConstraint` for naming requirements.
    *     name: 'organizations/my-organization/customConstraints/my-customConstraint',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actionType": "my_actionType",
    *   //   "condition": "my_condition",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "methodTypes": [],
    *   //   "name": "my_name",
    *   //   "resourceTypes": []
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
  def get(params: ParamsResourceOrganizationsCustomconstraintsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsCustomconstraintsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse] = js.native
  def list(params: ParamsResourceOrganizationsCustomconstraintsList): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsCustomconstraintsList,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsCustomconstraintsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsCustomconstraintsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsCustomconstraintsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse]
  ): Unit = js.native
  /**
    * Retrieves all of the `CustomConstraints` that exist on a particular organization resource.
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
    *   const res = await orgpolicy.organizations.customConstraints.list({
    *     // Size of the pages to be returned. This is currently unsupported and will be ignored. The server may at any point start using this field to limit page size.
    *     pageSize: 'placeholder-value',
    *     // Page token used to retrieve the next page. This is currently unsupported and will be ignored. The server may at any point start using this field.
    *     pageToken: 'placeholder-value',
    *     // Required. The target Cloud resource that parents the set of custom constraints that will be returned from this call. Must be in one of the following forms: * `organizations/{organization_id\}`
    *     parent: 'organizations/my-organization',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customConstraints": [],
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
  def list(params: ParamsResourceOrganizationsCustomconstraintsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsCustomconstraintsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def patch(params: ParamsResourceOrganizationsCustomconstraintsPatch): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def patch(
    params: ParamsResourceOrganizationsCustomconstraintsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsCustomconstraintsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2CustomConstraint],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsCustomconstraintsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudOrgpolicyV2CustomConstraint] = js.native
  def patch(
    params: ParamsResourceOrganizationsCustomconstraintsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  ): Unit = js.native
  /**
    * Updates a Custom Constraint. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Note: the supplied policy will perform a full overwrite of all fields.
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
    *   const res = await orgpolicy.organizations.customConstraints.patch({
    *     // Immutable. Name of the constraint. This is unique within the organization. Format of the name should be * `organizations/{organization_id\}/customConstraints/{custom_constraint_id\}` Example : "organizations/123/customConstraints/custom.createOnlyE2TypeVms"
    *     name: 'organizations/my-organization/customConstraints/my-customConstraint',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "actionType": "my_actionType",
    *       //   "condition": "my_condition",
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "methodTypes": [],
    *       //   "name": "my_name",
    *       //   "resourceTypes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actionType": "my_actionType",
    *   //   "condition": "my_condition",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "methodTypes": [],
    *   //   "name": "my_name",
    *   //   "resourceTypes": []
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
  def patch(params: ParamsResourceOrganizationsCustomconstraintsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsCustomconstraintsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
