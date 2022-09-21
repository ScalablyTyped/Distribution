package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Properties")
@js.native
open class ResourceProperties protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePropertiesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePropertiesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.properties.delete({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The key of the property.
    *     propertyKey: 'placeholder-value',
    *     // The visibility of the property.
    *     visibility: 'placeholder-value',
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
  def delete(params: ParamsResourcePropertiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProperty] = js.native
  def get(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def get(params: ParamsResourcePropertiesGet): GaxiosPromise[SchemaProperty] = js.native
  def get(params: ParamsResourcePropertiesGet, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: BodyResponseCallback[Readable | SchemaProperty],
    callback: BodyResponseCallback[Readable | SchemaProperty]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesGet, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  /**
    * Gets a property by its key.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *       'https://www.googleapis.com/auth/drive.metadata.readonly',
    *       'https://www.googleapis.com/auth/drive.photos.readonly',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.properties.get({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The key of the property.
    *     propertyKey: 'placeholder-value',
    *     // The visibility of the property.
    *     visibility: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "key": "my_key",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "value": "my_value",
    *   //   "visibility": "my_visibility"
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
  def get(params: ParamsResourcePropertiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaProperty] = js.native
  def insert(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def insert(params: ParamsResourcePropertiesInsert): GaxiosPromise[SchemaProperty] = js.native
  def insert(params: ParamsResourcePropertiesInsert, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def insert(
    params: ParamsResourcePropertiesInsert,
    options: BodyResponseCallback[Readable | SchemaProperty],
    callback: BodyResponseCallback[Readable | SchemaProperty]
  ): Unit = js.native
  def insert(params: ParamsResourcePropertiesInsert, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def insert(
    params: ParamsResourcePropertiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  /**
    * Adds a property to a file, or updates it if it already exists.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.properties.insert({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "key": "my_key",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "value": "my_value",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "key": "my_key",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "value": "my_value",
    *   //   "visibility": "my_visibility"
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
  def insert(params: ParamsResourcePropertiesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePropertiesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPropertyList] = js.native
  def list(callback: BodyResponseCallback[SchemaPropertyList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPropertyList] = js.native
  def list(params: ParamsResourcePropertiesList): GaxiosPromise[SchemaPropertyList] = js.native
  def list(params: ParamsResourcePropertiesList, callback: BodyResponseCallback[SchemaPropertyList]): Unit = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: BodyResponseCallback[Readable | SchemaPropertyList],
    callback: BodyResponseCallback[Readable | SchemaPropertyList]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesList, options: MethodOptions): GaxiosPromise[SchemaPropertyList] = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPropertyList]
  ): Unit = js.native
  /**
    * Lists a file's properties.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *       'https://www.googleapis.com/auth/drive.metadata.readonly',
    *       'https://www.googleapis.com/auth/drive.photos.readonly',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.properties.list({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink"
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
  def list(params: ParamsResourcePropertiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaProperty] = js.native
  def patch(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def patch(params: ParamsResourcePropertiesPatch): GaxiosPromise[SchemaProperty] = js.native
  def patch(params: ParamsResourcePropertiesPatch, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: BodyResponseCallback[Readable | SchemaProperty],
    callback: BodyResponseCallback[Readable | SchemaProperty]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesPatch, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  /**
    * Updates a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.properties.patch({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The key of the property.
    *     propertyKey: 'placeholder-value',
    *     // The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    *     visibility: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "key": "my_key",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "value": "my_value",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "key": "my_key",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "value": "my_value",
    *   //   "visibility": "my_visibility"
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
  def patch(params: ParamsResourcePropertiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaProperty] = js.native
  def update(callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def update(params: ParamsResourcePropertiesUpdate): GaxiosPromise[SchemaProperty] = js.native
  def update(params: ParamsResourcePropertiesUpdate, callback: BodyResponseCallback[SchemaProperty]): Unit = js.native
  def update(
    params: ParamsResourcePropertiesUpdate,
    options: BodyResponseCallback[Readable | SchemaProperty],
    callback: BodyResponseCallback[Readable | SchemaProperty]
  ): Unit = js.native
  def update(params: ParamsResourcePropertiesUpdate, options: MethodOptions): GaxiosPromise[SchemaProperty] = js.native
  def update(
    params: ParamsResourcePropertiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProperty]
  ): Unit = js.native
  /**
    * Updates a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.properties.update({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The key of the property.
    *     propertyKey: 'placeholder-value',
    *     // The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    *     visibility: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "key": "my_key",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "value": "my_value",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "key": "my_key",
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "value": "my_value",
    *   //   "visibility": "my_visibility"
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
  def update(params: ParamsResourcePropertiesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePropertiesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
