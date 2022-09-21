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

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Locations$Inspecttemplates")
@js.native
open class ResourceOrganizationsLocationsInspecttemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def create(params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectTemplate],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  /**
    * Creates an InspectTemplate for reusing frequently used configuration for inspecting content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
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
    *   const res = await dlp.organizations.locations.inspectTemplates.create({
    *     // Required. Parent resource name. The format of this value varies depending on the scope of the request (project or organization) and whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID + Organizations scope, location specified: `organizations/`ORG_ID`/locations/`LOCATION_ID + Organizations scope, no location specified (defaults to global): `organizations/`ORG_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'organizations/my-organization/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inspectTemplate": {},
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
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "inspectConfig": {},
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
  def create(params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
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
    *   const res = await dlp.organizations.locations.inspectTemplates.delete({
    *     // Required. Resource name of the organization and inspectTemplate to be deleted, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    *     name: 'organizations/my-organization/locations/my-location/inspectTemplates/my-inspectTemplate',
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
  def delete(params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def get(params: ParamsResourceOrganizationsLocationsInspecttemplatesGet): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesGet,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesGet,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectTemplate],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceOrganizationsLocationsInspecttemplatesGet, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  /**
    * Gets an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
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
    *   const res = await dlp.organizations.locations.inspectTemplates.get({
    *     // Required. Resource name of the organization and inspectTemplate to be read, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    *     name: 'organizations/my-organization/locations/my-location/inspectTemplates/my-inspectTemplate',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "inspectConfig": {},
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
  def get(params: ParamsResourceOrganizationsLocationsInspecttemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(params: ParamsResourceOrganizationsLocationsInspecttemplatesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesList,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceOrganizationsLocationsInspecttemplatesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInspectTemplatesResponse]
  ): Unit = js.native
  /**
    * Lists InspectTemplates. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
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
    *   const res = await dlp.organizations.locations.inspectTemplates.list({
    *     // Deprecated. This field has no effect.
    *     locationId: 'placeholder-value',
    *     // Comma separated list of fields to order by, followed by `asc` or `desc` postfix. This list is case-insensitive, default sorting order is ascending, redundant space characters are insignificant. Example: `name asc,update_time, create_time desc` Supported fields are: - `create_time`: corresponds to the time the template was created. - `update_time`: corresponds to the time the template was last updated. - `name`: corresponds to the template's name. - `display_name`: corresponds to the template's display name.
    *     orderBy: 'placeholder-value',
    *     // Size of the page, can be limited by the server. If zero server returns a page of max size 100.
    *     pageSize: 'placeholder-value',
    *     // Page token to continue retrieval. Comes from previous call to `ListInspectTemplates`.
    *     pageToken: 'placeholder-value',
    *     // Required. Parent resource name. The format of this value varies depending on the scope of the request (project or organization) and whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID + Organizations scope, location specified: `organizations/`ORG_ID`/locations/`LOCATION_ID + Organizations scope, no location specified (defaults to global): `organizations/`ORG_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'organizations/my-organization/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inspectTemplates": [],
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
  def list(params: ParamsResourceOrganizationsLocationsInspecttemplatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectTemplate],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  def patch(params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectTemplate]
  ): Unit = js.native
  /**
    * Updates the InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
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
    *   const res = await dlp.organizations.locations.inspectTemplates.patch({
    *     // Required. Resource name of organization and inspectTemplate to be updated, for example `organizations/433245324/inspectTemplates/432452342` or projects/project-id/inspectTemplates/432452342.
    *     name: 'organizations/my-organization/locations/my-location/inspectTemplates/my-inspectTemplate',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inspectTemplate": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "inspectConfig": {},
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
  def patch(params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceOrganizationsLocationsInspecttemplatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
