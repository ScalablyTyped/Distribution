package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Locations$Storedinfotypes")
@js.native
open class ResourceOrganizationsLocationsStoredinfotypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * Creates a pre-built stored infoType to be used for inspection. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.organizations.locations.storedInfoTypes.create({
    *     // Required. Parent resource name. The format of this value varies depending on the scope of the request (project or organization) and whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID + Organizations scope, location specified: `organizations/`ORG_ID`/locations/`LOCATION_ID + Organizations scope, no location specified (defaults to global): `organizations/`ORG_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'organizations/my-organization/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "config": {},
    *       //   "locationId": "my_locationId",
    *       //   "storedInfoTypeId": "my_storedInfoTypeId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentVersion": {},
    *   //   "name": "my_name",
    *   //   "pendingVersions": []
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
  def create(params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.organizations.locations.storedInfoTypes.delete({
    *     // Required. Resource name of the organization and storedInfoType to be deleted, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    *     name: 'organizations/my-organization/locations/my-location/storedInfoTypes/my-storedInfoType',
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
  def delete(params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(params: ParamsResourceOrganizationsLocationsStoredinfotypesGet): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesGet,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsLocationsStoredinfotypesGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.organizations.locations.storedInfoTypes.get({
    *     // Required. Resource name of the organization and storedInfoType to be read, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    *     name: 'organizations/my-organization/locations/my-location/storedInfoTypes/my-storedInfoType',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentVersion": {},
    *   //   "name": "my_name",
    *   //   "pendingVersions": []
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
  def get(params: ParamsResourceOrganizationsLocationsStoredinfotypesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(params: ParamsResourceOrganizationsLocationsStoredinfotypesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesList,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsLocationsStoredinfotypesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  ): Unit = js.native
  /**
    * Lists stored infoTypes. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.organizations.locations.storedInfoTypes.list({
    *     // Deprecated. This field has no effect.
    *     locationId: 'placeholder-value',
    *     // Comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant. Example: `name asc, display_name, create_time desc` Supported fields are: - `create_time`: corresponds to the time the most recent version of the resource was created. - `state`: corresponds to the state of the resource. - `name`: corresponds to resource name. - `display_name`: corresponds to info type's display name.
    *     orderBy: 'placeholder-value',
    *     // Size of the page, can be limited by the server. If zero server returns a page of max size 100.
    *     pageSize: 'placeholder-value',
    *     // Page token to continue retrieval. Comes from previous call to `ListStoredInfoTypes`.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource name. The format of this value varies depending on the scope of the request (project or organization) and whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'organizations/my-organization/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "storedInfoTypes": []
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
  def list(params: ParamsResourceOrganizationsLocationsStoredinfotypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2StoredInfoType],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2StoredInfoType] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2StoredInfoType]
  ): Unit = js.native
  /**
    * Updates the stored infoType by creating a new version. The existing version will continue to be used until the new version is ready. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.organizations.locations.storedInfoTypes.patch({
    *     // Required. Resource name of organization and storedInfoType to be updated, for example `organizations/433245324/storedInfoTypes/432452342` or projects/project-id/storedInfoTypes/432452342.
    *     name: 'organizations/my-organization/locations/my-location/storedInfoTypes/my-storedInfoType',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "config": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "currentVersion": {},
    *   //   "name": "my_name",
    *   //   "pendingVersions": []
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
  def patch(params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsStoredinfotypesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
