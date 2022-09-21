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

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Apps")
@js.native
open class ResourceApps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaApp] = js.native
  def get(callback: BodyResponseCallback[SchemaApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApp] = js.native
  def get(params: ParamsResourceAppsGet): GaxiosPromise[SchemaApp] = js.native
  def get(params: ParamsResourceAppsGet, callback: BodyResponseCallback[SchemaApp]): Unit = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: BodyResponseCallback[Readable | SchemaApp],
    callback: BodyResponseCallback[Readable | SchemaApp]
  ): Unit = js.native
  def get(params: ParamsResourceAppsGet, options: MethodOptions): GaxiosPromise[SchemaApp] = js.native
  def get(params: ParamsResourceAppsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaApp]): Unit = js.native
  /**
    * Gets a specific app.
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
    *       'https://www.googleapis.com/auth/drive.apps.readonly',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *       'https://www.googleapis.com/auth/drive.metadata.readonly',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.apps.get({
    *     // The ID of the app.
    *     appId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorized": false,
    *   //   "createInFolderTemplate": "my_createInFolderTemplate",
    *   //   "createUrl": "my_createUrl",
    *   //   "hasDriveWideScope": false,
    *   //   "icons": [],
    *   //   "id": "my_id",
    *   //   "installed": false,
    *   //   "kind": "my_kind",
    *   //   "longDescription": "my_longDescription",
    *   //   "name": "my_name",
    *   //   "objectType": "my_objectType",
    *   //   "openUrlTemplate": "my_openUrlTemplate",
    *   //   "primaryFileExtensions": [],
    *   //   "primaryMimeTypes": [],
    *   //   "productId": "my_productId",
    *   //   "productUrl": "my_productUrl",
    *   //   "secondaryFileExtensions": [],
    *   //   "secondaryMimeTypes": [],
    *   //   "shortDescription": "my_shortDescription",
    *   //   "supportsCreate": false,
    *   //   "supportsImport": false,
    *   //   "supportsMultiOpen": false,
    *   //   "supportsOfflineCreate": false,
    *   //   "useByDefault": false
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
  def get(params: ParamsResourceAppsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAppList] = js.native
  def list(callback: BodyResponseCallback[SchemaAppList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAppList] = js.native
  def list(params: ParamsResourceAppsList): GaxiosPromise[SchemaAppList] = js.native
  def list(params: ParamsResourceAppsList, callback: BodyResponseCallback[SchemaAppList]): Unit = js.native
  def list(
    params: ParamsResourceAppsList,
    options: BodyResponseCallback[Readable | SchemaAppList],
    callback: BodyResponseCallback[Readable | SchemaAppList]
  ): Unit = js.native
  def list(params: ParamsResourceAppsList, options: MethodOptions): GaxiosPromise[SchemaAppList] = js.native
  def list(
    params: ParamsResourceAppsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAppList]
  ): Unit = js.native
  /**
    * Lists a user's installed apps.
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
    *     scopes: ['https://www.googleapis.com/auth/drive.apps.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.apps.list({
    *     // A comma-separated list of file extensions for open with filtering. All apps within the given app query scope which can open any of the given file extensions will be included in the response. If appFilterMimeTypes are provided as well, the result is a union of the two resulting app lists.
    *     appFilterExtensions: 'placeholder-value',
    *     // A comma-separated list of MIME types for open with filtering. All apps within the given app query scope which can open any of the given MIME types will be included in the response. If appFilterExtensions are provided as well, the result is a union of the two resulting app lists.
    *     appFilterMimeTypes: 'placeholder-value',
    *     // A language or locale code, as defined by BCP 47, with some extensions from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    *     languageCode: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultAppIds": [],
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
  def list(params: ParamsResourceAppsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAppsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
