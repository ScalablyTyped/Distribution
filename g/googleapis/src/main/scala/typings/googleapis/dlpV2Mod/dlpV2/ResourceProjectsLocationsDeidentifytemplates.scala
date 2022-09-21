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

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Locations$Deidentifytemplates")
@js.native
open class ResourceProjectsLocationsDeidentifytemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyTemplate],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  /**
    * Creates a DeidentifyTemplate for reusing frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
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
    *   const res = await dlp.projects.locations.deidentifyTemplates.create({
    *     // Required. Parent resource name. The format of this value varies depending on the scope of the request (project or organization) and whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID + Organizations scope, location specified: `organizations/`ORG_ID`/locations/`LOCATION_ID + Organizations scope, no location specified (defaults to global): `organizations/`ORG_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deidentifyTemplate": {},
    *       //   "locationId": "my_locationId",
    *       //   "templateId": "my_templateId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deidentifyConfig": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
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
    *   const res = await dlp.projects.locations.deidentifyTemplates.delete({
    *     // Required. Resource name of the organization and deidentify template to be deleted, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    *     name: 'projects/my-project/locations/my-location/deidentifyTemplates/my-deidentifyTemplate',
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
  def delete(params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(params: ParamsResourceProjectsLocationsDeidentifytemplatesGet): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesGet,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyTemplate],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDeidentifytemplatesGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  /**
    * Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
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
    *   const res = await dlp.projects.locations.deidentifyTemplates.get({
    *     // Required. Resource name of the organization and deidentify template to be read, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    *     name: 'projects/my-project/locations/my-location/deidentifyTemplates/my-deidentifyTemplate',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deidentifyConfig": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsDeidentifytemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDeidentifytemplatesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesList,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDeidentifytemplatesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  ): Unit = js.native
  /**
    * Lists DeidentifyTemplates. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
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
    *   const res = await dlp.projects.locations.deidentifyTemplates.list({
    *     // Deprecated. This field has no effect.
    *     locationId: 'placeholder-value',
    *     // Comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name.
    *     orderBy: 'placeholder-value',
    *     // Size of the page, can be limited by the server. If zero server returns a page of max size 100.
    *     pageSize: 'placeholder-value',
    *     // Page token to continue retrieval. Comes from previous call to `ListDeidentifyTemplates`.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource name. The format of this value varies depending on the scope of the request (project or organization) and whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID + Organizations scope, location specified: `organizations/`ORG_ID`/locations/`LOCATION_ID + Organizations scope, no location specified (defaults to global): `organizations/`ORG_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "deidentifyTemplates": [],
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
  def list(params: ParamsResourceProjectsLocationsDeidentifytemplatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyTemplate],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  ): Unit = js.native
  /**
    * Updates the DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
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
    *   const res = await dlp.projects.locations.deidentifyTemplates.patch({
    *     // Required. Resource name of organization and deidentify template to be updated, for example `organizations/433245324/deidentifyTemplates/432452342` or projects/project-id/deidentifyTemplates/432452342.
    *     name: 'projects/my-project/locations/my-location/deidentifyTemplates/my-deidentifyTemplate',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deidentifyTemplate": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deidentifyConfig": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDeidentifytemplatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
