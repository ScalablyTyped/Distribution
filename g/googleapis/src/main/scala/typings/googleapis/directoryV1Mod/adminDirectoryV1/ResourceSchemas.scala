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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Schemas")
@js.native
open class ResourceSchemas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSchemasDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSchemasDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSchemasDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSchemasDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSchemasDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a schema.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.userschema'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.schemas.delete({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Name or immutable ID of the schema.
    *     schemaKey: 'placeholder-value',
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
  def delete(params: ParamsResourceSchemasDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSchemasDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSchema] = js.native
  def get(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def get(params: ParamsResourceSchemasGet): GaxiosPromise[SchemaSchema] = js.native
  def get(params: ParamsResourceSchemasGet, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def get(
    params: ParamsResourceSchemasGet,
    options: BodyResponseCallback[Readable | SchemaSchema],
    callback: BodyResponseCallback[Readable | SchemaSchema]
  ): Unit = js.native
  def get(params: ParamsResourceSchemasGet, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def get(
    params: ParamsResourceSchemasGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * Retrieves a schema.
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
    *       'https://www.googleapis.com/auth/admin.directory.userschema',
    *       'https://www.googleapis.com/auth/admin.directory.userschema.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.schemas.get({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Name or immutable ID of the schema.
    *     schemaKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "fields": [],
    *   //   "kind": "my_kind",
    *   //   "schemaId": "my_schemaId",
    *   //   "schemaName": "my_schemaName"
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
  def get(params: ParamsResourceSchemasGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSchemasGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSchema] = js.native
  def insert(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def insert(params: ParamsResourceSchemasInsert): GaxiosPromise[SchemaSchema] = js.native
  def insert(params: ParamsResourceSchemasInsert, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def insert(
    params: ParamsResourceSchemasInsert,
    options: BodyResponseCallback[Readable | SchemaSchema],
    callback: BodyResponseCallback[Readable | SchemaSchema]
  ): Unit = js.native
  def insert(params: ParamsResourceSchemasInsert, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def insert(
    params: ParamsResourceSchemasInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * Creates a schema.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.userschema'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.schemas.insert({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "fields": [],
    *       //   "kind": "my_kind",
    *       //   "schemaId": "my_schemaId",
    *       //   "schemaName": "my_schemaName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "fields": [],
    *   //   "kind": "my_kind",
    *   //   "schemaId": "my_schemaId",
    *   //   "schemaName": "my_schemaName"
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
  def insert(params: ParamsResourceSchemasInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceSchemasInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSchemas] = js.native
  def list(callback: BodyResponseCallback[SchemaSchemas]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchemas] = js.native
  def list(params: ParamsResourceSchemasList): GaxiosPromise[SchemaSchemas] = js.native
  def list(params: ParamsResourceSchemasList, callback: BodyResponseCallback[SchemaSchemas]): Unit = js.native
  def list(
    params: ParamsResourceSchemasList,
    options: BodyResponseCallback[Readable | SchemaSchemas],
    callback: BodyResponseCallback[Readable | SchemaSchemas]
  ): Unit = js.native
  def list(params: ParamsResourceSchemasList, options: MethodOptions): GaxiosPromise[SchemaSchemas] = js.native
  def list(
    params: ParamsResourceSchemasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchemas]
  ): Unit = js.native
  /**
    * Retrieves all schemas for a customer.
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
    *       'https://www.googleapis.com/auth/admin.directory.userschema',
    *       'https://www.googleapis.com/auth/admin.directory.userschema.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.schemas.list({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "kind": "my_kind",
    *   //   "schemas": []
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
  def list(params: ParamsResourceSchemasList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSchemasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSchema] = js.native
  def patch(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def patch(params: ParamsResourceSchemasPatch): GaxiosPromise[SchemaSchema] = js.native
  def patch(params: ParamsResourceSchemasPatch, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def patch(
    params: ParamsResourceSchemasPatch,
    options: BodyResponseCallback[Readable | SchemaSchema],
    callback: BodyResponseCallback[Readable | SchemaSchema]
  ): Unit = js.native
  def patch(params: ParamsResourceSchemasPatch, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def patch(
    params: ParamsResourceSchemasPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * Patches a schema.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.userschema'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.schemas.patch({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Name or immutable ID of the schema.
    *     schemaKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "fields": [],
    *       //   "kind": "my_kind",
    *       //   "schemaId": "my_schemaId",
    *       //   "schemaName": "my_schemaName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "fields": [],
    *   //   "kind": "my_kind",
    *   //   "schemaId": "my_schemaId",
    *   //   "schemaName": "my_schemaName"
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
  def patch(params: ParamsResourceSchemasPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSchemasPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaSchema] = js.native
  def update(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def update(params: ParamsResourceSchemasUpdate): GaxiosPromise[SchemaSchema] = js.native
  def update(params: ParamsResourceSchemasUpdate, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def update(
    params: ParamsResourceSchemasUpdate,
    options: BodyResponseCallback[Readable | SchemaSchema],
    callback: BodyResponseCallback[Readable | SchemaSchema]
  ): Unit = js.native
  def update(params: ParamsResourceSchemasUpdate, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def update(
    params: ParamsResourceSchemasUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * Updates a schema.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.userschema'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.schemas.update({
    *     // Immutable ID of the Google Workspace account.
    *     customerId: 'placeholder-value',
    *     // Name or immutable ID of the schema.
    *     schemaKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "etag": "my_etag",
    *       //   "fields": [],
    *       //   "kind": "my_kind",
    *       //   "schemaId": "my_schemaId",
    *       //   "schemaName": "my_schemaName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "fields": [],
    *   //   "kind": "my_kind",
    *   //   "schemaId": "my_schemaId",
    *   //   "schemaName": "my_schemaName"
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
  def update(params: ParamsResourceSchemasUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSchemasUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
