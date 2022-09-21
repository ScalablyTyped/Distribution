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

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Files")
@js.native
open class ResourceFiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def copy(): GaxiosPromise[SchemaFile] = js.native
  def copy(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def copy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def copy(params: ParamsResourceFilesCopy): GaxiosPromise[SchemaFile] = js.native
  def copy(params: ParamsResourceFilesCopy, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def copy(
    params: ParamsResourceFilesCopy,
    options: BodyResponseCallback[Readable | SchemaFile],
    callback: BodyResponseCallback[Readable | SchemaFile]
  ): Unit = js.native
  def copy(params: ParamsResourceFilesCopy, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def copy(
    params: ParamsResourceFilesCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  /**
    * Creates a copy of a file and applies any requested updates with patch semantics. Folders cannot be copied.
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
    *       'https://www.googleapis.com/auth/drive.photos.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.copy({
    *     // Deprecated. Copying files into multiple folders is no longer supported. Use shortcuts instead.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
    *     ignoreDefaultVisibility: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
    *     keepRevisionForever: 'placeholder-value',
    *     // A language hint for OCR processing during image import (ISO 639-1 code).
    *     ocrLanguage: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appProperties": {},
    *       //   "capabilities": {},
    *       //   "contentHints": {},
    *       //   "contentRestrictions": [],
    *       //   "copyRequiresWriterPermission": false,
    *       //   "createdTime": "my_createdTime",
    *       //   "description": "my_description",
    *       //   "driveId": "my_driveId",
    *       //   "explicitlyTrashed": false,
    *       //   "exportLinks": {},
    *       //   "fileExtension": "my_fileExtension",
    *       //   "folderColorRgb": "my_folderColorRgb",
    *       //   "fullFileExtension": "my_fullFileExtension",
    *       //   "hasAugmentedPermissions": false,
    *       //   "hasThumbnail": false,
    *       //   "headRevisionId": "my_headRevisionId",
    *       //   "iconLink": "my_iconLink",
    *       //   "id": "my_id",
    *       //   "imageMediaMetadata": {},
    *       //   "isAppAuthorized": false,
    *       //   "kind": "my_kind",
    *       //   "labelInfo": {},
    *       //   "lastModifyingUser": {},
    *       //   "linkShareMetadata": {},
    *       //   "md5Checksum": "my_md5Checksum",
    *       //   "mimeType": "my_mimeType",
    *       //   "modifiedByMe": false,
    *       //   "modifiedByMeTime": "my_modifiedByMeTime",
    *       //   "modifiedTime": "my_modifiedTime",
    *       //   "name": "my_name",
    *       //   "originalFilename": "my_originalFilename",
    *       //   "ownedByMe": false,
    *       //   "owners": [],
    *       //   "parents": [],
    *       //   "permissionIds": [],
    *       //   "permissions": [],
    *       //   "properties": {},
    *       //   "quotaBytesUsed": "my_quotaBytesUsed",
    *       //   "resourceKey": "my_resourceKey",
    *       //   "sha1Checksum": "my_sha1Checksum",
    *       //   "sha256Checksum": "my_sha256Checksum",
    *       //   "shared": false,
    *       //   "sharedWithMeTime": "my_sharedWithMeTime",
    *       //   "sharingUser": {},
    *       //   "shortcutDetails": {},
    *       //   "size": "my_size",
    *       //   "spaces": [],
    *       //   "starred": false,
    *       //   "teamDriveId": "my_teamDriveId",
    *       //   "thumbnailLink": "my_thumbnailLink",
    *       //   "thumbnailVersion": "my_thumbnailVersion",
    *       //   "trashed": false,
    *       //   "trashedTime": "my_trashedTime",
    *       //   "trashingUser": {},
    *       //   "version": "my_version",
    *       //   "videoMediaMetadata": {},
    *       //   "viewedByMe": false,
    *       //   "viewedByMeTime": "my_viewedByMeTime",
    *       //   "viewersCanCopyContent": false,
    *       //   "webContentLink": "my_webContentLink",
    *       //   "webViewLink": "my_webViewLink",
    *       //   "writersCanShare": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appProperties": {},
    *   //   "capabilities": {},
    *   //   "contentHints": {},
    *   //   "contentRestrictions": [],
    *   //   "copyRequiresWriterPermission": false,
    *   //   "createdTime": "my_createdTime",
    *   //   "description": "my_description",
    *   //   "driveId": "my_driveId",
    *   //   "explicitlyTrashed": false,
    *   //   "exportLinks": {},
    *   //   "fileExtension": "my_fileExtension",
    *   //   "folderColorRgb": "my_folderColorRgb",
    *   //   "fullFileExtension": "my_fullFileExtension",
    *   //   "hasAugmentedPermissions": false,
    *   //   "hasThumbnail": false,
    *   //   "headRevisionId": "my_headRevisionId",
    *   //   "iconLink": "my_iconLink",
    *   //   "id": "my_id",
    *   //   "imageMediaMetadata": {},
    *   //   "isAppAuthorized": false,
    *   //   "kind": "my_kind",
    *   //   "labelInfo": {},
    *   //   "lastModifyingUser": {},
    *   //   "linkShareMetadata": {},
    *   //   "md5Checksum": "my_md5Checksum",
    *   //   "mimeType": "my_mimeType",
    *   //   "modifiedByMe": false,
    *   //   "modifiedByMeTime": "my_modifiedByMeTime",
    *   //   "modifiedTime": "my_modifiedTime",
    *   //   "name": "my_name",
    *   //   "originalFilename": "my_originalFilename",
    *   //   "ownedByMe": false,
    *   //   "owners": [],
    *   //   "parents": [],
    *   //   "permissionIds": [],
    *   //   "permissions": [],
    *   //   "properties": {},
    *   //   "quotaBytesUsed": "my_quotaBytesUsed",
    *   //   "resourceKey": "my_resourceKey",
    *   //   "sha1Checksum": "my_sha1Checksum",
    *   //   "sha256Checksum": "my_sha256Checksum",
    *   //   "shared": false,
    *   //   "sharedWithMeTime": "my_sharedWithMeTime",
    *   //   "sharingUser": {},
    *   //   "shortcutDetails": {},
    *   //   "size": "my_size",
    *   //   "spaces": [],
    *   //   "starred": false,
    *   //   "teamDriveId": "my_teamDriveId",
    *   //   "thumbnailLink": "my_thumbnailLink",
    *   //   "thumbnailVersion": "my_thumbnailVersion",
    *   //   "trashed": false,
    *   //   "trashedTime": "my_trashedTime",
    *   //   "trashingUser": {},
    *   //   "version": "my_version",
    *   //   "videoMediaMetadata": {},
    *   //   "viewedByMe": false,
    *   //   "viewedByMeTime": "my_viewedByMeTime",
    *   //   "viewersCanCopyContent": false,
    *   //   "webContentLink": "my_webContentLink",
    *   //   "webViewLink": "my_webViewLink",
    *   //   "writersCanShare": false
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
  def copy(params: ParamsResourceFilesCopy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def copy(
    params: ParamsResourceFilesCopy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def create(): GaxiosPromise[SchemaFile] = js.native
  def create(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def create(params: ParamsResourceFilesCreate): GaxiosPromise[SchemaFile] = js.native
  def create(params: ParamsResourceFilesCreate, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def create(
    params: ParamsResourceFilesCreate,
    options: BodyResponseCallback[Readable | SchemaFile],
    callback: BodyResponseCallback[Readable | SchemaFile]
  ): Unit = js.native
  def create(params: ParamsResourceFilesCreate, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def create(
    params: ParamsResourceFilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  /**
    * Creates a new file.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.create({
    *     // Deprecated. Creating files in multiple folders is no longer supported.
    *     enforceSingleParent: 'placeholder-value',
    *     // Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
    *     ignoreDefaultVisibility: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
    *     keepRevisionForever: 'placeholder-value',
    *     // A language hint for OCR processing during image import (ISO 639-1 code).
    *     ocrLanguage: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Whether to use the uploaded content as indexable text.
    *     useContentAsIndexableText: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appProperties": {},
    *       //   "capabilities": {},
    *       //   "contentHints": {},
    *       //   "contentRestrictions": [],
    *       //   "copyRequiresWriterPermission": false,
    *       //   "createdTime": "my_createdTime",
    *       //   "description": "my_description",
    *       //   "driveId": "my_driveId",
    *       //   "explicitlyTrashed": false,
    *       //   "exportLinks": {},
    *       //   "fileExtension": "my_fileExtension",
    *       //   "folderColorRgb": "my_folderColorRgb",
    *       //   "fullFileExtension": "my_fullFileExtension",
    *       //   "hasAugmentedPermissions": false,
    *       //   "hasThumbnail": false,
    *       //   "headRevisionId": "my_headRevisionId",
    *       //   "iconLink": "my_iconLink",
    *       //   "id": "my_id",
    *       //   "imageMediaMetadata": {},
    *       //   "isAppAuthorized": false,
    *       //   "kind": "my_kind",
    *       //   "labelInfo": {},
    *       //   "lastModifyingUser": {},
    *       //   "linkShareMetadata": {},
    *       //   "md5Checksum": "my_md5Checksum",
    *       //   "mimeType": "my_mimeType",
    *       //   "modifiedByMe": false,
    *       //   "modifiedByMeTime": "my_modifiedByMeTime",
    *       //   "modifiedTime": "my_modifiedTime",
    *       //   "name": "my_name",
    *       //   "originalFilename": "my_originalFilename",
    *       //   "ownedByMe": false,
    *       //   "owners": [],
    *       //   "parents": [],
    *       //   "permissionIds": [],
    *       //   "permissions": [],
    *       //   "properties": {},
    *       //   "quotaBytesUsed": "my_quotaBytesUsed",
    *       //   "resourceKey": "my_resourceKey",
    *       //   "sha1Checksum": "my_sha1Checksum",
    *       //   "sha256Checksum": "my_sha256Checksum",
    *       //   "shared": false,
    *       //   "sharedWithMeTime": "my_sharedWithMeTime",
    *       //   "sharingUser": {},
    *       //   "shortcutDetails": {},
    *       //   "size": "my_size",
    *       //   "spaces": [],
    *       //   "starred": false,
    *       //   "teamDriveId": "my_teamDriveId",
    *       //   "thumbnailLink": "my_thumbnailLink",
    *       //   "thumbnailVersion": "my_thumbnailVersion",
    *       //   "trashed": false,
    *       //   "trashedTime": "my_trashedTime",
    *       //   "trashingUser": {},
    *       //   "version": "my_version",
    *       //   "videoMediaMetadata": {},
    *       //   "viewedByMe": false,
    *       //   "viewedByMeTime": "my_viewedByMeTime",
    *       //   "viewersCanCopyContent": false,
    *       //   "webContentLink": "my_webContentLink",
    *       //   "webViewLink": "my_webViewLink",
    *       //   "writersCanShare": false
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appProperties": {},
    *   //   "capabilities": {},
    *   //   "contentHints": {},
    *   //   "contentRestrictions": [],
    *   //   "copyRequiresWriterPermission": false,
    *   //   "createdTime": "my_createdTime",
    *   //   "description": "my_description",
    *   //   "driveId": "my_driveId",
    *   //   "explicitlyTrashed": false,
    *   //   "exportLinks": {},
    *   //   "fileExtension": "my_fileExtension",
    *   //   "folderColorRgb": "my_folderColorRgb",
    *   //   "fullFileExtension": "my_fullFileExtension",
    *   //   "hasAugmentedPermissions": false,
    *   //   "hasThumbnail": false,
    *   //   "headRevisionId": "my_headRevisionId",
    *   //   "iconLink": "my_iconLink",
    *   //   "id": "my_id",
    *   //   "imageMediaMetadata": {},
    *   //   "isAppAuthorized": false,
    *   //   "kind": "my_kind",
    *   //   "labelInfo": {},
    *   //   "lastModifyingUser": {},
    *   //   "linkShareMetadata": {},
    *   //   "md5Checksum": "my_md5Checksum",
    *   //   "mimeType": "my_mimeType",
    *   //   "modifiedByMe": false,
    *   //   "modifiedByMeTime": "my_modifiedByMeTime",
    *   //   "modifiedTime": "my_modifiedTime",
    *   //   "name": "my_name",
    *   //   "originalFilename": "my_originalFilename",
    *   //   "ownedByMe": false,
    *   //   "owners": [],
    *   //   "parents": [],
    *   //   "permissionIds": [],
    *   //   "permissions": [],
    *   //   "properties": {},
    *   //   "quotaBytesUsed": "my_quotaBytesUsed",
    *   //   "resourceKey": "my_resourceKey",
    *   //   "sha1Checksum": "my_sha1Checksum",
    *   //   "sha256Checksum": "my_sha256Checksum",
    *   //   "shared": false,
    *   //   "sharedWithMeTime": "my_sharedWithMeTime",
    *   //   "sharingUser": {},
    *   //   "shortcutDetails": {},
    *   //   "size": "my_size",
    *   //   "spaces": [],
    *   //   "starred": false,
    *   //   "teamDriveId": "my_teamDriveId",
    *   //   "thumbnailLink": "my_thumbnailLink",
    *   //   "thumbnailVersion": "my_thumbnailVersion",
    *   //   "trashed": false,
    *   //   "trashedTime": "my_trashedTime",
    *   //   "trashingUser": {},
    *   //   "version": "my_version",
    *   //   "videoMediaMetadata": {},
    *   //   "viewedByMe": false,
    *   //   "viewedByMeTime": "my_viewedByMeTime",
    *   //   "viewersCanCopyContent": false,
    *   //   "webContentLink": "my_webContentLink",
    *   //   "webViewLink": "my_webViewLink",
    *   //   "writersCanShare": false
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
  def create(params: ParamsResourceFilesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceFilesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceFilesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceFilesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceFilesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceFilesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceFilesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a shared drive the user must be an organizer on the parent. If the target is a folder, all descendants owned by the user are also deleted.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.delete({
    *     // Deprecated. If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
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
  def delete(params: ParamsResourceFilesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceFilesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def emptyTrash(): GaxiosPromise[Unit] = js.native
  def emptyTrash(callback: BodyResponseCallback[Unit]): Unit = js.native
  def emptyTrash(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def emptyTrash(params: ParamsResourceFilesEmptytrash): GaxiosPromise[Unit] = js.native
  def emptyTrash(params: ParamsResourceFilesEmptytrash, callback: BodyResponseCallback[Unit]): Unit = js.native
  def emptyTrash(
    params: ParamsResourceFilesEmptytrash,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def emptyTrash(params: ParamsResourceFilesEmptytrash, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def emptyTrash(
    params: ParamsResourceFilesEmptytrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Permanently deletes all of the user's trashed files.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.emptyTrash({
    *     // Deprecated. If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root.
    *     enforceSingleParent: 'placeholder-value',
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
  def emptyTrash(params: ParamsResourceFilesEmptytrash, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def emptyTrash(
    params: ParamsResourceFilesEmptytrash,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[Any] = js.native
  def `export`(callback: BodyResponseCallback[Any]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[Any] = js.native
  def `export`(params: ParamsResourceFilesExport): GaxiosPromise[Any] = js.native
  def `export`(params: ParamsResourceFilesExport, callback: BodyResponseCallback[Any]): Unit = js.native
  def `export`(
    params: ParamsResourceFilesExport,
    options: BodyResponseCallback[Any | Readable],
    callback: BodyResponseCallback[Any | Readable]
  ): Unit = js.native
  def `export`(params: ParamsResourceFilesExport, options: MethodOptions): GaxiosPromise[Any] = js.native
  def `export`(params: ParamsResourceFilesExport, options: MethodOptions, callback: BodyResponseCallback[Any]): Unit = js.native
  /**
    * Exports a Google Workspace document to the requested MIME type and returns exported byte content. Note that the exported content is limited to 10MB.
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
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.export({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The MIME type of the format requested for this export.
    *     mimeType: 'placeholder-value',
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
  def `export`(params: ParamsResourceFilesExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceFilesExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateIds(): GaxiosPromise[SchemaGeneratedIds] = js.native
  def generateIds(callback: BodyResponseCallback[SchemaGeneratedIds]): Unit = js.native
  def generateIds(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGeneratedIds] = js.native
  def generateIds(params: ParamsResourceFilesGenerateids): GaxiosPromise[SchemaGeneratedIds] = js.native
  def generateIds(params: ParamsResourceFilesGenerateids, callback: BodyResponseCallback[SchemaGeneratedIds]): Unit = js.native
  def generateIds(
    params: ParamsResourceFilesGenerateids,
    options: BodyResponseCallback[Readable | SchemaGeneratedIds],
    callback: BodyResponseCallback[Readable | SchemaGeneratedIds]
  ): Unit = js.native
  def generateIds(params: ParamsResourceFilesGenerateids, options: MethodOptions): GaxiosPromise[SchemaGeneratedIds] = js.native
  def generateIds(
    params: ParamsResourceFilesGenerateids,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGeneratedIds]
  ): Unit = js.native
  /**
    * Generates a set of file IDs which can be provided in create or copy requests.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.generateIds({
    *     // The number of IDs to return.
    *     count: 'placeholder-value',
    *     // The space in which the IDs can be used to create new files. Supported values are 'drive' and 'appDataFolder'. (Default: 'drive')
    *     space: 'placeholder-value',
    *     // The type of items which the IDs can be used for. Supported values are 'files' and 'shortcuts'. Note that 'shortcuts' are only supported in the drive 'space'. (Default: 'files')
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ids": [],
    *   //   "kind": "my_kind",
    *   //   "space": "my_space"
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
  def generateIds(params: ParamsResourceFilesGenerateids, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateIds(
    params: ParamsResourceFilesGenerateids,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFile] = js.native
  def get(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceFilesGet): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceFilesGet, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(
    params: ParamsResourceFilesGet,
    options: BodyResponseCallback[Readable | SchemaFile],
    callback: BodyResponseCallback[Readable | SchemaFile]
  ): Unit = js.native
  def get(params: ParamsResourceFilesGet, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceFilesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  /**
    * Gets a file's metadata or content by ID.
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
    *   const res = await drive.files.get({
    *     // Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
    *     acknowledgeAbuse: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appProperties": {},
    *   //   "capabilities": {},
    *   //   "contentHints": {},
    *   //   "contentRestrictions": [],
    *   //   "copyRequiresWriterPermission": false,
    *   //   "createdTime": "my_createdTime",
    *   //   "description": "my_description",
    *   //   "driveId": "my_driveId",
    *   //   "explicitlyTrashed": false,
    *   //   "exportLinks": {},
    *   //   "fileExtension": "my_fileExtension",
    *   //   "folderColorRgb": "my_folderColorRgb",
    *   //   "fullFileExtension": "my_fullFileExtension",
    *   //   "hasAugmentedPermissions": false,
    *   //   "hasThumbnail": false,
    *   //   "headRevisionId": "my_headRevisionId",
    *   //   "iconLink": "my_iconLink",
    *   //   "id": "my_id",
    *   //   "imageMediaMetadata": {},
    *   //   "isAppAuthorized": false,
    *   //   "kind": "my_kind",
    *   //   "labelInfo": {},
    *   //   "lastModifyingUser": {},
    *   //   "linkShareMetadata": {},
    *   //   "md5Checksum": "my_md5Checksum",
    *   //   "mimeType": "my_mimeType",
    *   //   "modifiedByMe": false,
    *   //   "modifiedByMeTime": "my_modifiedByMeTime",
    *   //   "modifiedTime": "my_modifiedTime",
    *   //   "name": "my_name",
    *   //   "originalFilename": "my_originalFilename",
    *   //   "ownedByMe": false,
    *   //   "owners": [],
    *   //   "parents": [],
    *   //   "permissionIds": [],
    *   //   "permissions": [],
    *   //   "properties": {},
    *   //   "quotaBytesUsed": "my_quotaBytesUsed",
    *   //   "resourceKey": "my_resourceKey",
    *   //   "sha1Checksum": "my_sha1Checksum",
    *   //   "sha256Checksum": "my_sha256Checksum",
    *   //   "shared": false,
    *   //   "sharedWithMeTime": "my_sharedWithMeTime",
    *   //   "sharingUser": {},
    *   //   "shortcutDetails": {},
    *   //   "size": "my_size",
    *   //   "spaces": [],
    *   //   "starred": false,
    *   //   "teamDriveId": "my_teamDriveId",
    *   //   "thumbnailLink": "my_thumbnailLink",
    *   //   "thumbnailVersion": "my_thumbnailVersion",
    *   //   "trashed": false,
    *   //   "trashedTime": "my_trashedTime",
    *   //   "trashingUser": {},
    *   //   "version": "my_version",
    *   //   "videoMediaMetadata": {},
    *   //   "viewedByMe": false,
    *   //   "viewedByMeTime": "my_viewedByMeTime",
    *   //   "viewersCanCopyContent": false,
    *   //   "webContentLink": "my_webContentLink",
    *   //   "webViewLink": "my_webViewLink",
    *   //   "writersCanShare": false
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
  def get(params: ParamsResourceFilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaFileList] = js.native
  def list(callback: BodyResponseCallback[SchemaFileList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFileList] = js.native
  def list(params: ParamsResourceFilesList): GaxiosPromise[SchemaFileList] = js.native
  def list(params: ParamsResourceFilesList, callback: BodyResponseCallback[SchemaFileList]): Unit = js.native
  def list(
    params: ParamsResourceFilesList,
    options: BodyResponseCallback[Readable | SchemaFileList],
    callback: BodyResponseCallback[Readable | SchemaFileList]
  ): Unit = js.native
  def list(params: ParamsResourceFilesList, options: MethodOptions): GaxiosPromise[SchemaFileList] = js.native
  def list(
    params: ParamsResourceFilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFileList]
  ): Unit = js.native
  /**
    * Lists or searches files.
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
    *   const res = await drive.files.list({
    *     // Groupings of files to which the query applies. Supported groupings are: 'user' (files created by, opened by, or shared directly with the user), 'drive' (files in the specified shared drive as indicated by the 'driveId'), 'domain' (files shared to the user's domain), and 'allDrives' (A combination of 'user' and 'drive' for all drives where the user is a member). When able, use 'user' or 'drive', instead of 'allDrives', for efficiency.
    *     corpora: 'placeholder-value',
    *     // The source of files to list. Deprecated: use 'corpora' instead.
    *     corpus: 'placeholder-value',
    *     // ID of the shared drive to search.
    *     driveId: 'placeholder-value',
    *     // Whether both My Drive and shared drive items should be included in results.
    *     includeItemsFromAllDrives: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Deprecated use includeItemsFromAllDrives instead.
    *     includeTeamDriveItems: 'placeholder-value',
    *     // A comma-separated list of sort keys. Valid keys are 'createdTime', 'folder', 'modifiedByMeTime', 'modifiedTime', 'name', 'name_natural', 'quotaBytesUsed', 'recency', 'sharedWithMeTime', 'starred', and 'viewedByMeTime'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedTime desc,name. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of files to return per page. Partial or empty result pages are possible even before the end of the files list has been reached.
    *     pageSize: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    *     pageToken: 'placeholder-value',
    *     // A query for filtering the file results. See the "Search for Files" guide for supported syntax.
    *     q: 'placeholder-value',
    *     // A comma-separated list of spaces to query within the corpus. Supported values are 'drive' and 'appDataFolder'.
    *     spaces: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Deprecated use driveId instead.
    *     teamDriveId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
    *   //   "incompleteSearch": false,
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourceFilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listLabels(): GaxiosPromise[SchemaLabelList] = js.native
  def listLabels(callback: BodyResponseCallback[SchemaLabelList]): Unit = js.native
  def listLabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLabelList] = js.native
  def listLabels(params: ParamsResourceFilesListlabels): GaxiosPromise[SchemaLabelList] = js.native
  def listLabels(params: ParamsResourceFilesListlabels, callback: BodyResponseCallback[SchemaLabelList]): Unit = js.native
  def listLabels(
    params: ParamsResourceFilesListlabels,
    options: BodyResponseCallback[Readable | SchemaLabelList],
    callback: BodyResponseCallback[Readable | SchemaLabelList]
  ): Unit = js.native
  def listLabels(params: ParamsResourceFilesListlabels, options: MethodOptions): GaxiosPromise[SchemaLabelList] = js.native
  def listLabels(
    params: ParamsResourceFilesListlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLabelList]
  ): Unit = js.native
  /**
    * Lists the labels on a file.
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
    *   const res = await drive.files.listLabels({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The maximum number of labels to return per page. When not set, this defaults to 100.
    *     maxResults: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "labels": [],
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
  def listLabels(params: ParamsResourceFilesListlabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listLabels(
    params: ParamsResourceFilesListlabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyLabels(): GaxiosPromise[SchemaModifyLabelsResponse] = js.native
  def modifyLabels(callback: BodyResponseCallback[SchemaModifyLabelsResponse]): Unit = js.native
  def modifyLabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaModifyLabelsResponse] = js.native
  def modifyLabels(params: ParamsResourceFilesModifylabels): GaxiosPromise[SchemaModifyLabelsResponse] = js.native
  def modifyLabels(
    params: ParamsResourceFilesModifylabels,
    callback: BodyResponseCallback[SchemaModifyLabelsResponse]
  ): Unit = js.native
  def modifyLabels(
    params: ParamsResourceFilesModifylabels,
    options: BodyResponseCallback[Readable | SchemaModifyLabelsResponse],
    callback: BodyResponseCallback[Readable | SchemaModifyLabelsResponse]
  ): Unit = js.native
  def modifyLabels(params: ParamsResourceFilesModifylabels, options: MethodOptions): GaxiosPromise[SchemaModifyLabelsResponse] = js.native
  def modifyLabels(
    params: ParamsResourceFilesModifylabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModifyLabelsResponse]
  ): Unit = js.native
  /**
    * Modifies the set of labels on a file.
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
    *   const res = await drive.files.modifyLabels({
    *     // The ID of the file for which the labels are modified.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "labelModifications": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "modifiedLabels": []
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
  def modifyLabels(params: ParamsResourceFilesModifylabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyLabels(
    params: ParamsResourceFilesModifylabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFile] = js.native
  def update(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def update(params: ParamsResourceFilesUpdate): GaxiosPromise[SchemaFile] = js.native
  def update(params: ParamsResourceFilesUpdate, callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def update(
    params: ParamsResourceFilesUpdate,
    options: BodyResponseCallback[Readable | SchemaFile],
    callback: BodyResponseCallback[Readable | SchemaFile]
  ): Unit = js.native
  def update(params: ParamsResourceFilesUpdate, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def update(
    params: ParamsResourceFilesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  /**
    * Updates a file's metadata and/or content. When calling this method, only populate fields in the request that you want to modify. When updating fields, some fields might change automatically, such as modifiedDate. This method supports patch semantics.
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
    *       'https://www.googleapis.com/auth/drive.scripts',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.files.update({
    *     // A comma-separated list of parent IDs to add.
    *     addParents: 'placeholder-value',
    *     // Deprecated. Adding files to multiple folders is no longer supported. Use shortcuts instead.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Google Drive. Only 200 revisions for the file can be kept forever. If the limit is reached, try deleting pinned revisions.
    *     keepRevisionForever: 'placeholder-value',
    *     // A language hint for OCR processing during image import (ISO 639-1 code).
    *     ocrLanguage: 'placeholder-value',
    *     // A comma-separated list of parent IDs to remove.
    *     removeParents: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Whether to use the uploaded content as indexable text.
    *     useContentAsIndexableText: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appProperties": {},
    *       //   "capabilities": {},
    *       //   "contentHints": {},
    *       //   "contentRestrictions": [],
    *       //   "copyRequiresWriterPermission": false,
    *       //   "createdTime": "my_createdTime",
    *       //   "description": "my_description",
    *       //   "driveId": "my_driveId",
    *       //   "explicitlyTrashed": false,
    *       //   "exportLinks": {},
    *       //   "fileExtension": "my_fileExtension",
    *       //   "folderColorRgb": "my_folderColorRgb",
    *       //   "fullFileExtension": "my_fullFileExtension",
    *       //   "hasAugmentedPermissions": false,
    *       //   "hasThumbnail": false,
    *       //   "headRevisionId": "my_headRevisionId",
    *       //   "iconLink": "my_iconLink",
    *       //   "id": "my_id",
    *       //   "imageMediaMetadata": {},
    *       //   "isAppAuthorized": false,
    *       //   "kind": "my_kind",
    *       //   "labelInfo": {},
    *       //   "lastModifyingUser": {},
    *       //   "linkShareMetadata": {},
    *       //   "md5Checksum": "my_md5Checksum",
    *       //   "mimeType": "my_mimeType",
    *       //   "modifiedByMe": false,
    *       //   "modifiedByMeTime": "my_modifiedByMeTime",
    *       //   "modifiedTime": "my_modifiedTime",
    *       //   "name": "my_name",
    *       //   "originalFilename": "my_originalFilename",
    *       //   "ownedByMe": false,
    *       //   "owners": [],
    *       //   "parents": [],
    *       //   "permissionIds": [],
    *       //   "permissions": [],
    *       //   "properties": {},
    *       //   "quotaBytesUsed": "my_quotaBytesUsed",
    *       //   "resourceKey": "my_resourceKey",
    *       //   "sha1Checksum": "my_sha1Checksum",
    *       //   "sha256Checksum": "my_sha256Checksum",
    *       //   "shared": false,
    *       //   "sharedWithMeTime": "my_sharedWithMeTime",
    *       //   "sharingUser": {},
    *       //   "shortcutDetails": {},
    *       //   "size": "my_size",
    *       //   "spaces": [],
    *       //   "starred": false,
    *       //   "teamDriveId": "my_teamDriveId",
    *       //   "thumbnailLink": "my_thumbnailLink",
    *       //   "thumbnailVersion": "my_thumbnailVersion",
    *       //   "trashed": false,
    *       //   "trashedTime": "my_trashedTime",
    *       //   "trashingUser": {},
    *       //   "version": "my_version",
    *       //   "videoMediaMetadata": {},
    *       //   "viewedByMe": false,
    *       //   "viewedByMeTime": "my_viewedByMeTime",
    *       //   "viewersCanCopyContent": false,
    *       //   "webContentLink": "my_webContentLink",
    *       //   "webViewLink": "my_webViewLink",
    *       //   "writersCanShare": false
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appProperties": {},
    *   //   "capabilities": {},
    *   //   "contentHints": {},
    *   //   "contentRestrictions": [],
    *   //   "copyRequiresWriterPermission": false,
    *   //   "createdTime": "my_createdTime",
    *   //   "description": "my_description",
    *   //   "driveId": "my_driveId",
    *   //   "explicitlyTrashed": false,
    *   //   "exportLinks": {},
    *   //   "fileExtension": "my_fileExtension",
    *   //   "folderColorRgb": "my_folderColorRgb",
    *   //   "fullFileExtension": "my_fullFileExtension",
    *   //   "hasAugmentedPermissions": false,
    *   //   "hasThumbnail": false,
    *   //   "headRevisionId": "my_headRevisionId",
    *   //   "iconLink": "my_iconLink",
    *   //   "id": "my_id",
    *   //   "imageMediaMetadata": {},
    *   //   "isAppAuthorized": false,
    *   //   "kind": "my_kind",
    *   //   "labelInfo": {},
    *   //   "lastModifyingUser": {},
    *   //   "linkShareMetadata": {},
    *   //   "md5Checksum": "my_md5Checksum",
    *   //   "mimeType": "my_mimeType",
    *   //   "modifiedByMe": false,
    *   //   "modifiedByMeTime": "my_modifiedByMeTime",
    *   //   "modifiedTime": "my_modifiedTime",
    *   //   "name": "my_name",
    *   //   "originalFilename": "my_originalFilename",
    *   //   "ownedByMe": false,
    *   //   "owners": [],
    *   //   "parents": [],
    *   //   "permissionIds": [],
    *   //   "permissions": [],
    *   //   "properties": {},
    *   //   "quotaBytesUsed": "my_quotaBytesUsed",
    *   //   "resourceKey": "my_resourceKey",
    *   //   "sha1Checksum": "my_sha1Checksum",
    *   //   "sha256Checksum": "my_sha256Checksum",
    *   //   "shared": false,
    *   //   "sharedWithMeTime": "my_sharedWithMeTime",
    *   //   "sharingUser": {},
    *   //   "shortcutDetails": {},
    *   //   "size": "my_size",
    *   //   "spaces": [],
    *   //   "starred": false,
    *   //   "teamDriveId": "my_teamDriveId",
    *   //   "thumbnailLink": "my_thumbnailLink",
    *   //   "thumbnailVersion": "my_thumbnailVersion",
    *   //   "trashed": false,
    *   //   "trashedTime": "my_trashedTime",
    *   //   "trashingUser": {},
    *   //   "version": "my_version",
    *   //   "videoMediaMetadata": {},
    *   //   "viewedByMe": false,
    *   //   "viewedByMeTime": "my_viewedByMeTime",
    *   //   "viewersCanCopyContent": false,
    *   //   "webContentLink": "my_webContentLink",
    *   //   "webViewLink": "my_webViewLink",
    *   //   "writersCanShare": false
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
  def update(params: ParamsResourceFilesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceFilesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceFilesWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceFilesWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceFilesWatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceFilesWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceFilesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Subscribes to changes to a file. While you can establish a channel for changes to a file on a shared drive, a change to a shared drive file won't create a notification.
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
    *   const res = await drive.files.watch({
    *     // Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
    *     acknowledgeAbuse: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": "my_address",
    *       //   "expiration": "my_expiration",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "params": {},
    *       //   "payload": false,
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceUri": "my_resourceUri",
    *       //   "token": "my_token",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "params": {},
    *   //   "payload": false,
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceUri": "my_resourceUri",
    *   //   "token": "my_token",
    *   //   "type": "my_type"
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
  def watch(params: ParamsResourceFilesWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceFilesWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
