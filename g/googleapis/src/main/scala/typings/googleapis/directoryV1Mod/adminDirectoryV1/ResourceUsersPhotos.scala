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

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users$Photos")
@js.native
open class ResourceUsersPhotos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersPhotosDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersPhotosDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersPhotosDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersPhotosDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersPhotosDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes the user's photo.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.photos.delete({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
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
  def delete(params: ParamsResourceUsersPhotosDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersPhotosDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(params: ParamsResourceUsersPhotosGet): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(params: ParamsResourceUsersPhotosGet, callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def get(
    params: ParamsResourceUsersPhotosGet,
    options: BodyResponseCallback[Readable | SchemaUserPhoto],
    callback: BodyResponseCallback[Readable | SchemaUserPhoto]
  ): Unit = js.native
  def get(params: ParamsResourceUsersPhotosGet, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def get(
    params: ParamsResourceUsersPhotosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  /**
    * Retrieves the user's photo.
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
    *       'https://www.googleapis.com/auth/admin.directory.user',
    *       'https://www.googleapis.com/auth/admin.directory.user.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.photos.get({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "height": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mimeType": "my_mimeType",
    *   //   "photoData": "my_photoData",
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "width": 0
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
  def get(params: ParamsResourceUsersPhotosGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersPhotosGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(params: ParamsResourceUsersPhotosPatch): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(params: ParamsResourceUsersPhotosPatch, callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def patch(
    params: ParamsResourceUsersPhotosPatch,
    options: BodyResponseCallback[Readable | SchemaUserPhoto],
    callback: BodyResponseCallback[Readable | SchemaUserPhoto]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersPhotosPatch, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def patch(
    params: ParamsResourceUsersPhotosPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  /**
    * Adds a photo for the user. This method supports [patch semantics](/admin-sdk/directory/v1/guides/performance#patch).
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.photos.patch({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "height": 0,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "mimeType": "my_mimeType",
    *       //   "photoData": "my_photoData",
    *       //   "primaryEmail": "my_primaryEmail",
    *       //   "width": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "height": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mimeType": "my_mimeType",
    *   //   "photoData": "my_photoData",
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "width": 0
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
  def patch(params: ParamsResourceUsersPhotosPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersPhotosPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(params: ParamsResourceUsersPhotosUpdate): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(params: ParamsResourceUsersPhotosUpdate, callback: BodyResponseCallback[SchemaUserPhoto]): Unit = js.native
  def update(
    params: ParamsResourceUsersPhotosUpdate,
    options: BodyResponseCallback[Readable | SchemaUserPhoto],
    callback: BodyResponseCallback[Readable | SchemaUserPhoto]
  ): Unit = js.native
  def update(params: ParamsResourceUsersPhotosUpdate, options: MethodOptions): GaxiosPromise[SchemaUserPhoto] = js.native
  def update(
    params: ParamsResourceUsersPhotosUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserPhoto]
  ): Unit = js.native
  /**
    * Adds a photo for the user.
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
    *     scopes: ['https://www.googleapis.com/auth/admin.directory.user'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await directory.users.photos.update({
    *     // Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    *     userKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "etag": "my_etag",
    *       //   "height": 0,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "mimeType": "my_mimeType",
    *       //   "photoData": "my_photoData",
    *       //   "primaryEmail": "my_primaryEmail",
    *       //   "width": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "height": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "mimeType": "my_mimeType",
    *   //   "photoData": "my_photoData",
    *   //   "primaryEmail": "my_primaryEmail",
    *   //   "width": 0
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
  def update(params: ParamsResourceUsersPhotosUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersPhotosUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
