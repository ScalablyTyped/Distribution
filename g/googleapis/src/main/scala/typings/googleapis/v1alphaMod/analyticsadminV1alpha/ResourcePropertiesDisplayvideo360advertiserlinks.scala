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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Displayvideo360advertiserlinks")
@js.native
open class ResourcePropertiesDisplayvideo360advertiserlinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def create(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  /**
    * Creates a DisplayVideo360AdvertiserLink. This can only be utilized by users who have proper authorization both on the Google Analytics property and on the Display & Video 360 advertiser. Users who do not have access to the Display & Video 360 advertiser should instead seek to create a DisplayVideo360LinkProposal.
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
    *   const res =
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinks.create({
    *       // Required. Example format: properties/1234
    *       parent: 'properties/my-propertie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "adsPersonalizationEnabled": false,
    *         //   "advertiserDisplayName": "my_advertiserDisplayName",
    *         //   "advertiserId": "my_advertiserId",
    *         //   "campaignDataSharingEnabled": false,
    *         //   "costDataSharingEnabled": false,
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "advertiserDisplayName": "my_advertiserDisplayName",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignDataSharingEnabled": false,
    *   //   "costDataSharingEnabled": false,
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
  def create(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a DisplayVideo360AdvertiserLink on a property.
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
    *   const res =
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinks.delete({
    *       // Required. The name of the DisplayVideo360AdvertiserLink to delete. Example format: properties/1234/displayVideo360AdvertiserLinks/5678
    *       name: 'properties/my-propertie/displayVideo360AdvertiserLinks/my-displayVideo360AdvertiserLink',
    *     });
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
  def delete(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def get(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  /**
    * Look up a single DisplayVideo360AdvertiserLink
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
    *   const res =
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinks.get({
    *       // Required. The name of the DisplayVideo360AdvertiserLink to get. Example format: properties/1234/displayVideo360AdvertiserLink/5678
    *       name: 'properties/my-propertie/displayVideo360AdvertiserLinks/my-displayVideo360AdvertiserLink',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "advertiserDisplayName": "my_advertiserDisplayName",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignDataSharingEnabled": false,
    *   //   "costDataSharingEnabled": false,
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
  def get(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse] = js.native
  def list(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse] = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse] = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinksResponse]
  ): Unit = js.native
  /**
    * Lists all DisplayVideo360AdvertiserLinks on a property.
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
    *   const res =
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinks.list({
    *       // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListDisplayVideo360AdvertiserLinks` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListDisplayVideo360AdvertiserLinks` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. Example format: properties/1234
    *       parent: 'properties/my-propertie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayVideo360AdvertiserLinks": [],
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
  def list(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def patch(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def patch(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink] = js.native
  def patch(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLink]
  ): Unit = js.native
  /**
    * Updates a DisplayVideo360AdvertiserLink on a property.
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
    *   const res =
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinks.patch({
    *       // Output only. The resource name for this DisplayVideo360AdvertiserLink resource. Format: properties/{propertyId\}/displayVideo360AdvertiserLinks/{linkId\} Note: linkId is not the Display & Video 360 Advertiser ID
    *       name: 'properties/my-propertie/displayVideo360AdvertiserLinks/my-displayVideo360AdvertiserLink',
    *       // Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "adsPersonalizationEnabled": false,
    *         //   "advertiserDisplayName": "my_advertiserDisplayName",
    *         //   "advertiserId": "my_advertiserId",
    *         //   "campaignDataSharingEnabled": false,
    *         //   "costDataSharingEnabled": false,
    *         //   "name": "my_name"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "advertiserDisplayName": "my_advertiserDisplayName",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignDataSharingEnabled": false,
    *   //   "costDataSharingEnabled": false,
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
  def patch(params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
