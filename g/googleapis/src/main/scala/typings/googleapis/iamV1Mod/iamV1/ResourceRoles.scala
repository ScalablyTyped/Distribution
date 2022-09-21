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

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Roles")
@js.native
open class ResourceRoles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaRole] = js.native
  def get(callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
  def get(
    params: ParamsResourceRolesGet,
    options: BodyResponseCallback[Readable | SchemaRole],
    callback: BodyResponseCallback[Readable | SchemaRole]
  ): Unit = js.native
  def get(params: ParamsResourceRolesGet, options: MethodOptions): GaxiosPromise[SchemaRole] = js.native
  def get(params: ParamsResourceRolesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaRole]): Unit = js.native
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
    *   const res = await iam.roles.get({
    *     // The `name` parameter's value depends on the target resource for the request, namely [`roles`](https://cloud.google.com/iam/reference/rest/v1/roles), [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles), or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `name` value format is described below: * [`roles.get()`](https://cloud.google.com/iam/reference/rest/v1/roles/get): `roles/{ROLE_NAME\}`. This method returns results from all [predefined roles](https://cloud.google.com/iam/docs/understanding-roles#predefined_roles) in Cloud IAM. Example request URL: `https://iam.googleapis.com/v1/roles/{ROLE_NAME\}` * [`projects.roles.get()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/get): `projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method returns only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the project level. Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles/{CUSTOM_ROLE_ID\}` * [`organizations.roles.get()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/get): `organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}`. This method returns only [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that have been created at the organization level. Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles/{CUSTOM_ROLE_ID\}` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     name: 'roles/my-role',
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
  def get(params: ParamsResourceRolesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRolesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRolesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(params: ParamsResourceRolesList): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(params: ParamsResourceRolesList, callback: BodyResponseCallback[SchemaListRolesResponse]): Unit = js.native
  def list(
    params: ParamsResourceRolesList,
    options: BodyResponseCallback[Readable | SchemaListRolesResponse],
    callback: BodyResponseCallback[Readable | SchemaListRolesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRolesList, options: MethodOptions): GaxiosPromise[SchemaListRolesResponse] = js.native
  def list(
    params: ParamsResourceRolesList,
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
    *   const res = await iam.roles.list({
    *     // Optional limit on the number of roles to include in the response. The default is 300, and the maximum is 1,000.
    *     pageSize: 'placeholder-value',
    *     // Optional pagination token returned in an earlier ListRolesResponse.
    *     pageToken: 'placeholder-value',
    *     // The `parent` parameter's value depends on the target resource for the request, namely [`roles`](https://cloud.google.com/iam/reference/rest/v1/roles), [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles), or [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles). Each resource type's `parent` value format is described below: * [`roles.list()`](https://cloud.google.com/iam/reference/rest/v1/roles/list): An empty string. This method doesn't require a resource; it simply returns all [predefined roles](https://cloud.google.com/iam/docs/understanding-roles#predefined_roles) in Cloud IAM. Example request URL: `https://iam.googleapis.com/v1/roles` * [`projects.roles.list()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/list): `projects/{PROJECT_ID\}`. This method lists all project-level [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles). Example request URL: `https://iam.googleapis.com/v1/projects/{PROJECT_ID\}/roles` * [`organizations.roles.list()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/list): `organizations/{ORGANIZATION_ID\}`. This method lists all organization-level [custom roles](https://cloud.google.com/iam/docs/understanding-custom-roles). Example request URL: `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID\}/roles` Note: Wildcard (*) values are invalid; you must specify a complete project ID or organization ID.
    *     parent: 'placeholder-value',
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
  def list(params: ParamsResourceRolesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRolesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def queryGrantableRoles(): GaxiosPromise[SchemaQueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(callback: BodyResponseCallback[SchemaQueryGrantableRolesResponse]): Unit = js.native
  def queryGrantableRoles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(params: ParamsResourceRolesQuerygrantableroles): GaxiosPromise[SchemaQueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(
    params: ParamsResourceRolesQuerygrantableroles,
    callback: BodyResponseCallback[SchemaQueryGrantableRolesResponse]
  ): Unit = js.native
  def queryGrantableRoles(
    params: ParamsResourceRolesQuerygrantableroles,
    options: BodyResponseCallback[Readable | SchemaQueryGrantableRolesResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryGrantableRolesResponse]
  ): Unit = js.native
  def queryGrantableRoles(params: ParamsResourceRolesQuerygrantableroles, options: MethodOptions): GaxiosPromise[SchemaQueryGrantableRolesResponse] = js.native
  def queryGrantableRoles(
    params: ParamsResourceRolesQuerygrantableroles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryGrantableRolesResponse]
  ): Unit = js.native
  /**
    * Lists roles that can be granted on a Google Cloud resource. A role is grantable if the IAM policy for the resource can contain bindings to the role.
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
    *   const res = await iam.roles.queryGrantableRoles({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fullResourceName": "my_fullResourceName",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "view": "my_view"
    *       // }
    *     },
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
  def queryGrantableRoles(params: ParamsResourceRolesQuerygrantableroles, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def queryGrantableRoles(
    params: ParamsResourceRolesQuerygrantableroles,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
