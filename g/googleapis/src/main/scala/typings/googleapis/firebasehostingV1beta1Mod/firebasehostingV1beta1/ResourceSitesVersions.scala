package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Resource$Sites$Versions")
@js.native
open class ResourceSitesVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def clone(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def clone(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def clone(params: ParamsResourceSitesVersionsClone): GaxiosPromise[SchemaOperation] = js.native
  def clone(params: ParamsResourceSitesVersionsClone, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def clone(
    params: ParamsResourceSitesVersionsClone,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def clone(params: ParamsResourceSitesVersionsClone, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def clone(
    params: ParamsResourceSitesVersionsClone,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new version on the specified target site using the content of the specified version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.versions.clone({
    *     // Required. The target site for the cloned version, in the format: sites/ SITE_ID
    *     parent: 'sites/my-site',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "exclude": {},
    *       //   "finalize": false,
    *       //   "include": {},
    *       //   "sourceVersion": "my_sourceVersion"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def clone(params: ParamsResourceSitesVersionsClone, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clone(
    params: ParamsResourceSitesVersionsClone,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaVersion] = js.native
  def create(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceSitesVersionsCreate): GaxiosPromise[SchemaVersion] = js.native
  def create(params: ParamsResourceSitesVersionsCreate, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def create(
    params: ParamsResourceSitesVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaVersion],
    callback: BodyResponseCallback[Readable | SchemaVersion]
  ): Unit = js.native
  def create(params: ParamsResourceSitesVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def create(
    params: ParamsResourceSitesVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * Creates a new version for the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.versions.create({
    *     // Required. The site in which to create the version, in the format: sites/ SITE_ID
    *     parent: 'sites/my-site',
    *     // The self-reported size of the version. This value is used for a pre-emptive quota check for legacy version uploads.
    *     sizeBytes: 'placeholder-value',
    *     // A unique id for the new version. This is was only specified for legacy version creations, and should be blank.
    *     versionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "config": {},
    *       //   "createTime": "my_createTime",
    *       //   "createUser": {},
    *       //   "deleteTime": "my_deleteTime",
    *       //   "deleteUser": {},
    *       //   "fileCount": "my_fileCount",
    *       //   "finalizeTime": "my_finalizeTime",
    *       //   "finalizeUser": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "status": "my_status",
    *       //   "versionBytes": "my_versionBytes"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "createUser": {},
    *   //   "deleteTime": "my_deleteTime",
    *   //   "deleteUser": {},
    *   //   "fileCount": "my_fileCount",
    *   //   "finalizeTime": "my_finalizeTime",
    *   //   "finalizeUser": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "versionBytes": "my_versionBytes"
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
  def create(params: ParamsResourceSitesVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSitesVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesVersionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSitesVersionsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSitesVersionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSitesVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSitesVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.versions.delete({
    *     // Required. The fully-qualified resource name for the version, in the format: sites/SITE_ID/versions/VERSION_ID
    *     name: 'sites/my-site/versions/my-version',
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
  def delete(params: ParamsResourceSitesVersionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSitesVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var files: ResourceSitesVersionsFiles = js.native
  
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourceSitesVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceSitesVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSitesVersionsList,
    options: BodyResponseCallback[Readable | SchemaListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSitesVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceSitesVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  /**
    * Lists the versions that have been created for the specified site. This list includes versions for both the default `live` channel and any active preview channels for the specified site.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/firebase',
    *       'https://www.googleapis.com/auth/firebase.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.versions.list({
    *     // A filter string used to return a subset of versions in the response. The currently supported fields for filtering are: `name`, `status`, and `create_time`. Learn more about filtering in Google's [AIP 160 standard](https://google.aip.dev/160).
    *     filter: 'placeholder-value',
    *     // The maximum number of versions to return. The service may return a lower number if fewer versions exist than this maximum number. If unspecified, defaults to 25. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // A token from a previous call to `ListVersions` that tells the server where to resume listing.
    *     pageToken: 'placeholder-value',
    *     // Required. The site or channel for which to list versions, in either of the following formats: - sites/SITE_ID - sites/SITE_ID/channels/CHANNEL_ID
    *     parent: 'sites/my-site',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "versions": []
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
  def list(params: ParamsResourceSitesVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSitesVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaVersion] = js.native
  def patch(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def patch(params: ParamsResourceSitesVersionsPatch): GaxiosPromise[SchemaVersion] = js.native
  def patch(params: ParamsResourceSitesVersionsPatch, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def patch(
    params: ParamsResourceSitesVersionsPatch,
    options: BodyResponseCallback[Readable | SchemaVersion],
    callback: BodyResponseCallback[Readable | SchemaVersion]
  ): Unit = js.native
  def patch(params: ParamsResourceSitesVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def patch(
    params: ParamsResourceSitesVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    *  Updates the specified metadata for the specified version. This method will fail with `FAILED_PRECONDITION` in the event of an invalid state transition. The supported [state](../sites.versions#versionstatus) transitions for a version are from `CREATED` to `FINALIZED`. Use [`DeleteVersion`](delete) to set the status of a version to `DELETED`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.versions.patch({
    *     // The fully-qualified resource name for the version, in the format: sites/ SITE_ID/versions/VERSION_ID This name is provided in the response body when you call [`CreateVersion`](sites.versions/create).
    *     name: 'sites/my-site/versions/my-version',
    *     // A set of field names from your [version](../sites.versions) that you want to update. A field will be overwritten if, and only if, it's in the mask. If a mask is not provided then a default mask of only [`status`](../sites.versions#Version.FIELDS.status) will be used.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "config": {},
    *       //   "createTime": "my_createTime",
    *       //   "createUser": {},
    *       //   "deleteTime": "my_deleteTime",
    *       //   "deleteUser": {},
    *       //   "fileCount": "my_fileCount",
    *       //   "finalizeTime": "my_finalizeTime",
    *       //   "finalizeUser": {},
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "status": "my_status",
    *       //   "versionBytes": "my_versionBytes"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "createUser": {},
    *   //   "deleteTime": "my_deleteTime",
    *   //   "deleteUser": {},
    *   //   "fileCount": "my_fileCount",
    *   //   "finalizeTime": "my_finalizeTime",
    *   //   "finalizeUser": {},
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "status": "my_status",
    *   //   "versionBytes": "my_versionBytes"
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
  def patch(params: ParamsResourceSitesVersionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceSitesVersionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def populateFiles(): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]): Unit = js.native
  def populateFiles(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(params: ParamsResourceSitesVersionsPopulatefiles): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]
  ): Unit = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    options: BodyResponseCallback[Readable | SchemaPopulateVersionFilesResponse],
    callback: BodyResponseCallback[Readable | SchemaPopulateVersionFilesResponse]
  ): Unit = js.native
  def populateFiles(params: ParamsResourceSitesVersionsPopulatefiles, options: MethodOptions): GaxiosPromise[SchemaPopulateVersionFilesResponse] = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPopulateVersionFilesResponse]
  ): Unit = js.native
  /**
    *  Adds content files to the specified version. Each file must be under 2 GB.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/firebasehosting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const firebasehosting = google.firebasehosting('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await firebasehosting.sites.versions.populateFiles({
    *     // Required. The version to which to add files, in the format: sites/SITE_ID /versions/VERSION_ID
    *     parent: 'sites/my-site/versions/my-version',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "files": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "uploadRequiredHashes": [],
    *   //   "uploadUrl": "my_uploadUrl"
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
  def populateFiles(params: ParamsResourceSitesVersionsPopulatefiles, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def populateFiles(
    params: ParamsResourceSitesVersionsPopulatefiles,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
