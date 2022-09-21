package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$About")
@js.native
open class ResourceAbout protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAbout] = js.native
  def get(callback: BodyResponseCallback[SchemaAbout]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAbout] = js.native
  def get(params: ParamsResourceAboutGet): GaxiosPromise[SchemaAbout] = js.native
  def get(params: ParamsResourceAboutGet, callback: BodyResponseCallback[SchemaAbout]): Unit = js.native
  def get(
    params: ParamsResourceAboutGet,
    options: BodyResponseCallback[Readable | SchemaAbout],
    callback: BodyResponseCallback[Readable | SchemaAbout]
  ): Unit = js.native
  def get(params: ParamsResourceAboutGet, options: MethodOptions): GaxiosPromise[SchemaAbout] = js.native
  def get(
    params: ParamsResourceAboutGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAbout]
  ): Unit = js.native
  /**
    * Gets information about the user, the user's Drive, and system capabilities.
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
    * const drive = google.drive('v3');
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
    *   const res = await drive.about.get({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appInstalled": false,
    *   //   "canCreateDrives": false,
    *   //   "canCreateTeamDrives": false,
    *   //   "driveThemes": [],
    *   //   "exportFormats": {},
    *   //   "folderColorPalette": [],
    *   //   "importFormats": {},
    *   //   "kind": "my_kind",
    *   //   "maxImportSizes": {},
    *   //   "maxUploadSize": "my_maxUploadSize",
    *   //   "storageQuota": {},
    *   //   "teamDriveThemes": [],
    *   //   "user": {}
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
  def get(params: ParamsResourceAboutGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAboutGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
