package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Orgunits")
@js.native
open class ResourceOrgunits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceOrgunitsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceOrgunitsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceOrgunitsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceOrgunitsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceOrgunitsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Removes an organizational unit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.orgunit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.orgunits.delete({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The full path of the organizational unit (minus the leading `/`) or its unique ID.
    *     orgUnitPath: '.*',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceOrgunitsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrgunitsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(params: ParamsResourceOrgunitsGet): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(params: ParamsResourceOrgunitsGet, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def get(
    params: ParamsResourceOrgunitsGet,
    options: BodyResponseCallback[Readable | SchemaOrgUnit],
    callback: BodyResponseCallback[Readable | SchemaOrgUnit]
  ): Unit = js.native
  def get(params: ParamsResourceOrgunitsGet, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def get(
    params: ParamsResourceOrgunitsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * Retrieves an organizational unit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.orgunit',
    *       'https://www.googleapis.com/auth/admin.directory.orgunit.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.orgunits.get({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The full path of the organizational unit (minus the leading `/`) or its unique ID.
    *     orgUnitPath: '.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockInheritance": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "parentOrgUnitId": "my_parentOrgUnitId",
    *   //   "parentOrgUnitPath": "my_parentOrgUnitPath"
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
  def get(params: ParamsResourceOrgunitsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrgunitsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(params: ParamsResourceOrgunitsInsert): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(params: ParamsResourceOrgunitsInsert, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def insert(
    params: ParamsResourceOrgunitsInsert,
    options: BodyResponseCallback[Readable | SchemaOrgUnit],
    callback: BodyResponseCallback[Readable | SchemaOrgUnit]
  ): Unit = js.native
  def insert(params: ParamsResourceOrgunitsInsert, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def insert(
    params: ParamsResourceOrgunitsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * Adds an organizational unit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.orgunit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.orgunits.insert({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "blockInheritance": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "parentOrgUnitId": "my_parentOrgUnitId",
    *       //   "parentOrgUnitPath": "my_parentOrgUnitPath"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockInheritance": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "parentOrgUnitId": "my_parentOrgUnitId",
    *   //   "parentOrgUnitPath": "my_parentOrgUnitPath"
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
  def insert(params: ParamsResourceOrgunitsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceOrgunitsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(callback: BodyResponseCallback[SchemaOrgUnits]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(params: ParamsResourceOrgunitsList): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(params: ParamsResourceOrgunitsList, callback: BodyResponseCallback[SchemaOrgUnits]): Unit = js.native
  def list(
    params: ParamsResourceOrgunitsList,
    options: BodyResponseCallback[Readable | SchemaOrgUnits],
    callback: BodyResponseCallback[Readable | SchemaOrgUnits]
  ): Unit = js.native
  def list(params: ParamsResourceOrgunitsList, options: MethodOptions): GaxiosPromise[SchemaOrgUnits] = js.native
  def list(
    params: ParamsResourceOrgunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnits]
  ): Unit = js.native
  /**
    * Retrieves a list of all organizational units for an account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/admin.directory.orgunit',
    *       'https://www.googleapis.com/auth/admin.directory.orgunit.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.orgunits.list({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The full path to the organizational unit or its unique ID. Returns the children of the specified organizational unit.
    *     orgUnitPath: 'placeholder-value',
    *     // Whether to return all sub-organizations or just immediate children.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "organizationUnits": []
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
  def list(params: ParamsResourceOrgunitsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrgunitsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(params: ParamsResourceOrgunitsPatch): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(params: ParamsResourceOrgunitsPatch, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def patch(
    params: ParamsResourceOrgunitsPatch,
    options: BodyResponseCallback[Readable | SchemaOrgUnit],
    callback: BodyResponseCallback[Readable | SchemaOrgUnit]
  ): Unit = js.native
  def patch(params: ParamsResourceOrgunitsPatch, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def patch(
    params: ParamsResourceOrgunitsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * Updates an organizational unit. This method supports [patch semantics](/admin-sdk/directory/v1/guides/performance#patch)
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.orgunit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.orgunits.patch({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The full path of the organizational unit (minus the leading `/`) or its unique ID.
    *     orgUnitPath: '.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "blockInheritance": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "parentOrgUnitId": "my_parentOrgUnitId",
    *       //   "parentOrgUnitPath": "my_parentOrgUnitPath"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockInheritance": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "parentOrgUnitId": "my_parentOrgUnitId",
    *   //   "parentOrgUnitPath": "my_parentOrgUnitPath"
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
  def patch(params: ParamsResourceOrgunitsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrgunitsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(params: ParamsResourceOrgunitsUpdate): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(params: ParamsResourceOrgunitsUpdate, callback: BodyResponseCallback[SchemaOrgUnit]): Unit = js.native
  def update(
    params: ParamsResourceOrgunitsUpdate,
    options: BodyResponseCallback[Readable | SchemaOrgUnit],
    callback: BodyResponseCallback[Readable | SchemaOrgUnit]
  ): Unit = js.native
  def update(params: ParamsResourceOrgunitsUpdate, options: MethodOptions): GaxiosPromise[SchemaOrgUnit] = js.native
  def update(
    params: ParamsResourceOrgunitsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOrgUnit]
  ): Unit = js.native
  /**
    * Updates an organizational unit.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admin = google.admin('directory_v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.orgunit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.orgunits.update({
    *     // The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's `customerId`. The `customerId` is also returned as part of the [Users resource](/admin-sdk/directory/v1/reference/users).
    *     customerId: 'placeholder-value',
    *     // The full path of the organizational unit (minus the leading `/`) or its unique ID.
    *     orgUnitPath: '.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "blockInheritance": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "orgUnitPath": "my_orgUnitPath",
    *       //   "parentOrgUnitId": "my_parentOrgUnitId",
    *       //   "parentOrgUnitPath": "my_parentOrgUnitPath"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blockInheritance": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "orgUnitPath": "my_orgUnitPath",
    *   //   "parentOrgUnitId": "my_parentOrgUnitId",
    *   //   "parentOrgUnitPath": "my_parentOrgUnitPath"
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
  def update(params: ParamsResourceOrgunitsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceOrgunitsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
