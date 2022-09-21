package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessaccountmanagement/v1", "mybusinessaccountmanagement_v1.Resource$Locations$Admins")
@js.native
open class ResourceLocationsAdmins protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAdmin] = js.native
  def create(callback: BodyResponseCallback[SchemaAdmin]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdmin] = js.native
  def create(params: ParamsResourceLocationsAdminsCreate): GaxiosPromise[SchemaAdmin] = js.native
  def create(params: ParamsResourceLocationsAdminsCreate, callback: BodyResponseCallback[SchemaAdmin]): Unit = js.native
  def create(
    params: ParamsResourceLocationsAdminsCreate,
    options: BodyResponseCallback[Readable | SchemaAdmin],
    callback: BodyResponseCallback[Readable | SchemaAdmin]
  ): Unit = js.native
  def create(params: ParamsResourceLocationsAdminsCreate, options: MethodOptions): GaxiosPromise[SchemaAdmin] = js.native
  def create(
    params: ParamsResourceLocationsAdminsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdmin]
  ): Unit = js.native
  /**
    * Invites the specified user to become an administrator for the specified location. The invitee must accept the invitation in order to be granted access to the location. See AcceptInvitation to programmatically accept an invitation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.locations.admins.create({
    *     // Required. The resource name of the location this admin is created for. `locations/{location_id\}/admins`.
    *     parent: 'locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "account": "my_account",
    *       //   "admin": "my_admin",
    *       //   "name": "my_name",
    *       //   "pendingInvitation": false,
    *       //   "role": "my_role"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": "my_account",
    *   //   "admin": "my_admin",
    *   //   "name": "my_name",
    *   //   "pendingInvitation": false,
    *   //   "role": "my_role"
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
  def create(params: ParamsResourceLocationsAdminsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceLocationsAdminsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsAdminsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceLocationsAdminsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceLocationsAdminsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceLocationsAdminsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceLocationsAdminsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes the specified admin as a manager of the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.locations.admins.delete({
    *     // Required. The resource name of the admin to remove from the location.
    *     name: 'locations/my-location/admins/my-admin',
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
  def delete(params: ParamsResourceLocationsAdminsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceLocationsAdminsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListLocationAdminsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationAdminsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLocationAdminsResponse] = js.native
  def list(params: ParamsResourceLocationsAdminsList): GaxiosPromise[SchemaListLocationAdminsResponse] = js.native
  def list(
    params: ParamsResourceLocationsAdminsList,
    callback: BodyResponseCallback[SchemaListLocationAdminsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceLocationsAdminsList,
    options: BodyResponseCallback[Readable | SchemaListLocationAdminsResponse],
    callback: BodyResponseCallback[Readable | SchemaListLocationAdminsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceLocationsAdminsList, options: MethodOptions): GaxiosPromise[SchemaListLocationAdminsResponse] = js.native
  def list(
    params: ParamsResourceLocationsAdminsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationAdminsResponse]
  ): Unit = js.native
  /**
    * Lists all of the admins for the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.locations.admins.list({
    *     // Required. The name of the location to list admins of. `locations/{location_id\}/admins`.
    *     parent: 'locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "admins": []
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
  def list(params: ParamsResourceLocationsAdminsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLocationsAdminsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAdmin] = js.native
  def patch(callback: BodyResponseCallback[SchemaAdmin]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAdmin] = js.native
  def patch(params: ParamsResourceLocationsAdminsPatch): GaxiosPromise[SchemaAdmin] = js.native
  def patch(params: ParamsResourceLocationsAdminsPatch, callback: BodyResponseCallback[SchemaAdmin]): Unit = js.native
  def patch(
    params: ParamsResourceLocationsAdminsPatch,
    options: BodyResponseCallback[Readable | SchemaAdmin],
    callback: BodyResponseCallback[Readable | SchemaAdmin]
  ): Unit = js.native
  def patch(params: ParamsResourceLocationsAdminsPatch, options: MethodOptions): GaxiosPromise[SchemaAdmin] = js.native
  def patch(
    params: ParamsResourceLocationsAdminsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdmin]
  ): Unit = js.native
  /**
    * Updates the Admin for the specified location. Only the AdminRole of the Admin can be updated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessaccountmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessaccountmanagement = google.mybusinessaccountmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await mybusinessaccountmanagement.locations.admins.patch({
    *     // Immutable. The resource name. For account admins, this is in the form: `accounts/{account_id\}/admins/{admin_id\}` For location admins, this is in the form: `locations/{location_id\}/admins/{admin_id\}` This field will be ignored if set during admin creation.
    *     name: 'locations/my-location/admins/my-admin',
    *     // Required. The specific fields that should be updated. The only editable field is role.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "account": "my_account",
    *       //   "admin": "my_admin",
    *       //   "name": "my_name",
    *       //   "pendingInvitation": false,
    *       //   "role": "my_role"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": "my_account",
    *   //   "admin": "my_admin",
    *   //   "name": "my_name",
    *   //   "pendingInvitation": false,
    *   //   "role": "my_role"
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
  def patch(params: ParamsResourceLocationsAdminsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceLocationsAdminsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
