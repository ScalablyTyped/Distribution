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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Googleadslinks")
@js.native
open class ResourcePropertiesGoogleadslinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def create(params: ParamsResourcePropertiesGoogleadslinksCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def create(
    params: ParamsResourcePropertiesGoogleadslinksCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesGoogleadslinksCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesGoogleadslinksCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def create(
    params: ParamsResourcePropertiesGoogleadslinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]
  ): Unit = js.native
  /**
    * Creates a GoogleAdsLink.
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
    *   const res = await analyticsadmin.properties.googleAdsLinks.create({
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adsPersonalizationEnabled": false,
    *       //   "canManageClients": false,
    *       //   "createTime": "my_createTime",
    *       //   "creatorEmailAddress": "my_creatorEmailAddress",
    *       //   "customerId": "my_customerId",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "canManageClients": false,
    *   //   "createTime": "my_createTime",
    *   //   "creatorEmailAddress": "my_creatorEmailAddress",
    *   //   "customerId": "my_customerId",
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
  def create(params: ParamsResourcePropertiesGoogleadslinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesGoogleadslinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePropertiesGoogleadslinksDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesGoogleadslinksDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesGoogleadslinksDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesGoogleadslinksDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesGoogleadslinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a GoogleAdsLink on a property
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
    *   const res = await analyticsadmin.properties.googleAdsLinks.delete({
    *     // Required. Example format: properties/1234/googleAdsLinks/5678
    *     name: 'properties/my-propertie/googleAdsLinks/my-googleAdsLink',
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
  def delete(params: ParamsResourcePropertiesGoogleadslinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesGoogleadslinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  def list(params: ParamsResourcePropertiesGoogleadslinksList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  def list(
    params: ParamsResourcePropertiesGoogleadslinksList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesGoogleadslinksList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesGoogleadslinksList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse] = js.native
  def list(
    params: ParamsResourcePropertiesGoogleadslinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListGoogleAdsLinksResponse]
  ): Unit = js.native
  /**
    * Lists GoogleAdsLinks on a property.
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
    *   const res = await analyticsadmin.properties.googleAdsLinks.list({
    *     // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListGoogleAdsLinks` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListGoogleAdsLinks` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Example format: properties/1234
    *     parent: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "googleAdsLinks": [],
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
  def list(params: ParamsResourcePropertiesGoogleadslinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesGoogleadslinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def patch(params: ParamsResourcePropertiesGoogleadslinksPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def patch(
    params: ParamsResourcePropertiesGoogleadslinksPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesGoogleadslinksPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesGoogleadslinksPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink] = js.native
  def patch(
    params: ParamsResourcePropertiesGoogleadslinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleAdsLink]
  ): Unit = js.native
  /**
    * Updates a GoogleAdsLink on a property
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
    *   const res = await analyticsadmin.properties.googleAdsLinks.patch({
    *     // Output only. Format: properties/{propertyId\}/googleAdsLinks/{googleAdsLinkId\} Note: googleAdsLinkId is not the Google Ads customer ID.
    *     name: 'properties/my-propertie/googleAdsLinks/my-googleAdsLink',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adsPersonalizationEnabled": false,
    *       //   "canManageClients": false,
    *       //   "createTime": "my_createTime",
    *       //   "creatorEmailAddress": "my_creatorEmailAddress",
    *       //   "customerId": "my_customerId",
    *       //   "name": "my_name",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "canManageClients": false,
    *   //   "createTime": "my_createTime",
    *   //   "creatorEmailAddress": "my_creatorEmailAddress",
    *   //   "customerId": "my_customerId",
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
  def patch(params: ParamsResourcePropertiesGoogleadslinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesGoogleadslinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
