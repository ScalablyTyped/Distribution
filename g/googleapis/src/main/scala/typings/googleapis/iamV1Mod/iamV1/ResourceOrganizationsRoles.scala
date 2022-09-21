package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Organizations$Roles")
@js.native
open class ResourceOrganizationsRoles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRole] = js.native
  def create(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def create(params: ParamsResourceOrganizationsRolesCreate): GaxiosPromise[SchemaRole] = js.native
  def create(params: ParamsResourceOrganizationsRolesCreate, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsRolesCreate,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsRolesCreate, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def create(
    params: ParamsResourceOrganizationsRolesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Creates a new custom Role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.organizations.roles.create({
    *     // The `parent` parameter's value depends on the target resource for the request, namely [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles) or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `parent` value format is described below: * [`projects.roles.create()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/create): `projects/{PROJECT_ID\}`. This method creates project-level [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles). Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles` * [`organizations.roles.create()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/create): `organizations/{ORGANIZATION_ID\}`. This method creates organization-level [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles). Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     parent: 'organizations/my-organization',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "role": {},
    *       //   "roleId": "my_roleId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "includedPermissions": [],
    *   //   "name": "my_name",
    *   //   "stage": "my_stage",
    *   //   "title": "my_title"
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
  def create(params: ParamsResourceOrganizationsRolesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsRolesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaRole] = js.native
  def delete(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def delete(params: ParamsResourceOrganizationsRolesDelete): GaxiosPromise[SchemaRole] = js.native
  def delete(params: ParamsResourceOrganizationsRolesDelete, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsRolesDelete,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsRolesDelete, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def delete(
    params: ParamsResourceOrganizationsRolesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Deletes a custom Role. When you delete a custom role, the following changes occur immediately: * You cannot bind a principal to the custom role in an IAM Policy. * Existing bindings to the custom role are not changed, but they have no effect. * By default, the response from ListRoles does not include the custom role. You have 7 days to undelete the custom role. After 7 days, the following changes occur: * The custom role is permanently deleted and cannot be recovered. * If an IAM policy contains a binding to the custom role, the binding is permanently removed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.organizations.roles.delete({
    *     // Used to perform a consistent read-modify-write.
    *     etag: 'placeholder-value',
    *     // The `name` parameter's value depends on the target resource for the request, namely [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles) or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method deletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method deletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     name: 'organizations/my-organization/roles/my-role',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "includedPermissions": [],
    *   //   "name": "my_name",
    *   //   "stage": "my_stage",
    *   //   "title": "my_title"
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
  def delete(params: ParamsResourceOrganizationsRolesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsRolesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRole] = js.native
  def get(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceOrganizationsRolesGet): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceOrganizationsRolesGet, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsRolesGet,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsRolesGet, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(
    params: ParamsResourceOrganizationsRolesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Gets the definition of a Role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.organizations.roles.get({
    *     // The `name` parameter's value depends on the target resource for the request, namely [`roles`](https://cloud.google.com/iam/reference/rest/v1/roles), [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles), or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`roles.get()`](https://cloud.google.com/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME\}`. This method returns results from all [predefined roles](https://cloud.google.com/iam/docs/understanding-roles#predefined_roles) in Cloud IAM. Example request URL: `https://iam.googleapis.com/v1/roles/{ROLE_NAME\}` * [`projects.roles.get()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/get): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method returns only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.get()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/get): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method returns only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     name: 'organizations/my-organization/roles/my-role',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "includedPermissions": [],
    *   //   "name": "my_name",
    *   //   "stage": "my_stage",
    *   //   "title": "my_title"
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
  def get(params: ParamsResourceOrganizationsRolesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsRolesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRolesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(params: ParamsResourceOrganizationsRolesList): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    callback: BodyResponseCallback[SchemaListRolesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    options: BodyResponseCallback[Readable | SchemaListRolesResponse],
    callback: BodyResponseCallback[Readable | SchemaListRolesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsRolesList, options: MethodOptions): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRolesResponse]
  ): Unit = js.native
  /**
    * Lists every predefined Role that IAM supports, or every custom role that is defined for an organization or project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.organizations.roles.list({
    *     // Optional limit on the number of roles to include in the response. The default is 300, and the maximum is 1,000.
    *     pageSize: 'placeholder-value',
    *     // Optional pagination token returned in an earlier ListRolesResponse.
    *     pageToken: 'placeholder-value',
    *     // The `parent` parameter's value depends on the target resource for the request, namely [`roles`](https://cloud.google.com/iam/reference/rest/v1/roles), [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles), or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `parent` value format is described below: * [`roles.list()`](https://cloud.google.com/iam/reference/rest/v1/roles/list): An empty string. This method doesn't require a resource; it simply returns all [predefined roles](https://cloud.google.com/iam/docs/understanding-roles#predefined_roles) in Cloud IAM. Example request URL: `https://iam.googleapis.com/v1/roles` * [`projects.roles.list()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/list): `projects/{PROJECT_ID\}`. This method lists all project-level [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles). Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles` * [`organizations.roles.list()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/list): `organizations/{ORGANIZATION_ID\}`. This method lists all organization-level [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles). Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     parent: 'organizations/my-organization',
    *     // Include Roles that have been deleted.
    *     showDeleted: 'placeholder-value',
    *     // Optional view for the returned Role objects. When `FULL` is specified, the `includedPermissions` field is returned, which includes a list of all permissions in the role. The default value is `BASIC`, which does not return the `includedPermissions` field.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "roles": []
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
  def list(params: ParamsResourceOrganizationsRolesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsRolesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRole] = js.native
  def patch(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceOrganizationsRolesPatch): GaxiosPromise[SchemaRole] = js.native
  def patch(params: ParamsResourceOrganizationsRolesPatch, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsRolesPatch,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsRolesPatch, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def patch(
    params: ParamsResourceOrganizationsRolesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Updates the definition of a custom Role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.organizations.roles.patch({
    *     // The `name` parameter's value depends on the target resource for the request, namely [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles) or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`projects.roles.patch()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/patch): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method updates only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.patch()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/patch): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method updates only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     name: 'organizations/my-organization/roles/my-role',
    *     // A mask describing which fields in the Role have changed.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "includedPermissions": [],
    *       //   "name": "my_name",
    *       //   "stage": "my_stage",
    *       //   "title": "my_title"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "includedPermissions": [],
    *   //   "name": "my_name",
    *   //   "stage": "my_stage",
    *   //   "title": "my_title"
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
  def patch(params: ParamsResourceOrganizationsRolesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsRolesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undelete(): GaxiosPromise[SchemaRole] = js.native
  def undelete(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def undelete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def undelete(params: ParamsResourceOrganizationsRolesUndelete): GaxiosPromise[SchemaRole] = js.native
  def undelete(params: ParamsResourceOrganizationsRolesUndelete, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def undelete(
    params: ParamsResourceOrganizationsRolesUndelete,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def undelete(params: ParamsResourceOrganizationsRolesUndelete, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def undelete(
    params: ParamsResourceOrganizationsRolesUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRole]
  ): Unit = js.native
  /**
    * Undeletes a custom Role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.organizations.roles.undelete({
    *     // The `name` parameter's value depends on the target resource for the request, namely [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles) or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`projects.roles.undelete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/undelete): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method undeletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.undelete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/undelete): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method undeletes only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     name: 'organizations/my-organization/roles/my-role',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "includedPermissions": [],
    *   //   "name": "my_name",
    *   //   "stage": "my_stage",
    *   //   "title": "my_title"
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
  def undelete(params: ParamsResourceOrganizationsRolesUndelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undelete(
    params: ParamsResourceOrganizationsRolesUndelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
