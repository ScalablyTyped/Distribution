package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Audiences")
@js.native
open class ResourcePropertiesAudiences protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def archive(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def archive(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(params: ParamsResourcePropertiesAudiencesArchive): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(
    params: ParamsResourcePropertiesAudiencesArchive,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def archive(
    params: ParamsResourcePropertiesAudiencesArchive,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def archive(params: ParamsResourcePropertiesAudiencesArchive, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def archive(
    params: ParamsResourcePropertiesAudiencesArchive,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Archives an Audience on a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.audiences.archive({
    *     // Required. Example format: properties/1234/audiences/5678
    *     name: 'properties/my-propertie/audiences/my-audience',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
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
  def archive(params: ParamsResourcePropertiesAudiencesArchive, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def archive(
    params: ParamsResourcePropertiesAudiencesArchive,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def create(params: ParamsResourcePropertiesAudiencesCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def create(
    params: ParamsResourcePropertiesAudiencesCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesAudiencesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAudience],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesAudiencesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def create(
    params: ParamsResourcePropertiesAudiencesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  /**
    * Creates an Audience.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.audiences.create({
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adsPersonalizationEnabled": false,
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "eventTrigger": {},
    *       //   "exclusionDurationMode": "my_exclusionDurationMode",
    *       //   "filterClauses": [],
    *       //   "membershipDurationDays": 0,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "eventTrigger": {},
    *   //   "exclusionDurationMode": "my_exclusionDurationMode",
    *   //   "filterClauses": [],
    *   //   "membershipDurationDays": 0,
    *   //   "name": "my_name"
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
  def create(params: ParamsResourcePropertiesAudiencesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesAudiencesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def get(params: ParamsResourcePropertiesAudiencesGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def get(
    params: ParamsResourcePropertiesAudiencesGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesAudiencesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAudience],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesAudiencesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def get(
    params: ParamsResourcePropertiesAudiencesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  /**
    * Lookup for a single Audience. Audiences created before 2020 may not be supported. Default audiences will not show filter definitions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.audiences.get({
    *     // Required. The name of the Audience to get. Example format: properties/1234/audiences/5678
    *     name: 'properties/my-propertie/audiences/my-audience',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "eventTrigger": {},
    *   //   "exclusionDurationMode": "my_exclusionDurationMode",
    *   //   "filterClauses": [],
    *   //   "membershipDurationDays": 0,
    *   //   "name": "my_name"
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
  def get(params: ParamsResourcePropertiesAudiencesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesAudiencesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse] = js.native
  def list(params: ParamsResourcePropertiesAudiencesList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse] = js.native
  def list(
    params: ParamsResourcePropertiesAudiencesList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesAudiencesList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesAudiencesList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse] = js.native
  def list(
    params: ParamsResourcePropertiesAudiencesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListAudiencesResponse]
  ): Unit = js.native
  /**
    * Lists Audiences on a property. Audiences created before 2020 may not be supported. Default audiences will not show filter definitions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.audiences.list({
    *     // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAudiences` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAudiences` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "audiences": [],
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
  def list(params: ParamsResourcePropertiesAudiencesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesAudiencesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def patch(params: ParamsResourcePropertiesAudiencesPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def patch(
    params: ParamsResourcePropertiesAudiencesPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesAudiencesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAudience],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesAudiencesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAudience] = js.native
  def patch(
    params: ParamsResourcePropertiesAudiencesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAudience]
  ): Unit = js.native
  /**
    * Updates an Audience on a property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.audiences.patch({
    *     // Output only. The resource name for this Audience resource. Format: properties/{propertyId\}/audiences/{audienceId\}
    *     name: 'properties/my-propertie/audiences/my-audience',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adsPersonalizationEnabled": false,
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "eventTrigger": {},
    *       //   "exclusionDurationMode": "my_exclusionDurationMode",
    *       //   "filterClauses": [],
    *       //   "membershipDurationDays": 0,
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "eventTrigger": {},
    *   //   "exclusionDurationMode": "my_exclusionDurationMode",
    *   //   "filterClauses": [],
    *   //   "membershipDurationDays": 0,
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourcePropertiesAudiencesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesAudiencesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
