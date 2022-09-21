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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties")
@js.native
open class ResourceProperties protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledgeUserDataCollection(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse] = js.native
  def acknowledgeUserDataCollection(
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse]
  ): Unit = js.native
  def acknowledgeUserDataCollection(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse] = js.native
  def acknowledgeUserDataCollection(params: ParamsResourcePropertiesAcknowledgeuserdatacollection): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse] = js.native
  def acknowledgeUserDataCollection(
    params: ParamsResourcePropertiesAcknowledgeuserdatacollection,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse]
  ): Unit = js.native
  def acknowledgeUserDataCollection(
    params: ParamsResourcePropertiesAcknowledgeuserdatacollection,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse
    ]
  ): Unit = js.native
  def acknowledgeUserDataCollection(params: ParamsResourcePropertiesAcknowledgeuserdatacollection, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse] = js.native
  def acknowledgeUserDataCollection(
    params: ParamsResourcePropertiesAcknowledgeuserdatacollection,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionResponse]
  ): Unit = js.native
  /**
    * Acknowledges the terms of user data collection for the specified property. This acknowledgement must be completed (either in the Google Analytics UI or via this API) before MeasurementProtocolSecret resources may be created.
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
    *   const res = await analyticsadmin.properties.acknowledgeUserDataCollection({
    *     // Required. The property for which to acknowledge user data collection.
    *     property: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acknowledgement": "my_acknowledgement"
    *       // }
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
  def acknowledgeUserDataCollection(params: ParamsResourcePropertiesAcknowledgeuserdatacollection, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledgeUserDataCollection(
    params: ParamsResourcePropertiesAcknowledgeuserdatacollection,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var audiences: ResourcePropertiesAudiences = js.native
  
  var context: APIRequestContext = js.native
  
  var conversionEvents: ResourcePropertiesConversionevents = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def create(params: ParamsResourcePropertiesCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def create(
    params: ParamsResourcePropertiesCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def create(
    params: ParamsResourcePropertiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  /**
    * Creates an "GA4" property with the specified location and attributes.
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
    *   const res = await analyticsadmin.properties.create({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "account": "my_account",
    *       //   "createTime": "my_createTime",
    *       //   "currencyCode": "my_currencyCode",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "displayName": "my_displayName",
    *       //   "expireTime": "my_expireTime",
    *       //   "industryCategory": "my_industryCategory",
    *       //   "name": "my_name",
    *       //   "parent": "my_parent",
    *       //   "propertyType": "my_propertyType",
    *       //   "serviceLevel": "my_serviceLevel",
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": "my_account",
    *   //   "createTime": "my_createTime",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "displayName": "my_displayName",
    *   //   "expireTime": "my_expireTime",
    *   //   "industryCategory": "my_industryCategory",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "propertyType": "my_propertyType",
    *   //   "serviceLevel": "my_serviceLevel",
    *   //   "timeZone": "my_timeZone",
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
  def create(params: ParamsResourcePropertiesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var customDimensions: ResourcePropertiesCustomdimensions = js.native
  
  var customMetrics: ResourcePropertiesCustommetrics = js.native
  
  var dataStreams: ResourcePropertiesDatastreams = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def delete(params: ParamsResourcePropertiesDelete): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  /**
    * Marks target Property as soft-deleted (ie: "trashed") and returns it. This API does not have a method to restore soft-deleted properties. However, they can be restored using the Trash Can UI. If the properties are not restored before the expiration time, the Property and all child resources (eg: GoogleAdsLinks, Streams, UserLinks) will be permanently purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found, or is not an GA4 Property.
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
    *   const res = await analyticsadmin.properties.delete({
    *     // Required. The name of the Property to soft-delete. Format: properties/{property_id\} Example: "properties/1000"
    *     name: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": "my_account",
    *   //   "createTime": "my_createTime",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "displayName": "my_displayName",
    *   //   "expireTime": "my_expireTime",
    *   //   "industryCategory": "my_industryCategory",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "propertyType": "my_propertyType",
    *   //   "serviceLevel": "my_serviceLevel",
    *   //   "timeZone": "my_timeZone",
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
  def delete(params: ParamsResourcePropertiesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var displayVideo360AdvertiserLinkProposals: ResourcePropertiesDisplayvideo360advertiserlinkproposals = js.native
  
  var displayVideo360AdvertiserLinks: ResourcePropertiesDisplayvideo360advertiserlinks = js.native
  
  var firebaseLinks: ResourcePropertiesFirebaselinks = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def get(params: ParamsResourcePropertiesGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  /**
    * Lookup for a single "GA4" Property.
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
    *   const res = await analyticsadmin.properties.get({
    *     // Required. The name of the property to lookup. Format: properties/{property_id\} Example: "properties/1000"
    *     name: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": "my_account",
    *   //   "createTime": "my_createTime",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "displayName": "my_displayName",
    *   //   "expireTime": "my_expireTime",
    *   //   "industryCategory": "my_industryCategory",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "propertyType": "my_propertyType",
    *   //   "serviceLevel": "my_serviceLevel",
    *   //   "timeZone": "my_timeZone",
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
  def get(params: ParamsResourcePropertiesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAttributionSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def getAttributionSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]): Unit = js.native
  def getAttributionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def getAttributionSettings(params: ParamsResourcePropertiesGetattributionsettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def getAttributionSettings(
    params: ParamsResourcePropertiesGetattributionsettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  ): Unit = js.native
  def getAttributionSettings(
    params: ParamsResourcePropertiesGetattributionsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAttributionSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  ): Unit = js.native
  def getAttributionSettings(params: ParamsResourcePropertiesGetattributionsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def getAttributionSettings(
    params: ParamsResourcePropertiesGetattributionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  ): Unit = js.native
  /**
    * Lookup for a AttributionSettings singleton.
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
    *   const res = await analyticsadmin.properties.getAttributionSettings({
    *     // Required. The name of the attribution settings to retrieve. Format: properties/{property\}/attributionSettings
    *     name: 'properties/my-propertie/attributionSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acquisitionConversionEventLookbackWindow": "my_acquisitionConversionEventLookbackWindow",
    *   //   "name": "my_name",
    *   //   "otherConversionEventLookbackWindow": "my_otherConversionEventLookbackWindow",
    *   //   "reportingAttributionModel": "my_reportingAttributionModel"
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
  def getAttributionSettings(params: ParamsResourcePropertiesGetattributionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAttributionSettings(
    params: ParamsResourcePropertiesGetattributionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getDataRetentionSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def getDataRetentionSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]): Unit = js.native
  def getDataRetentionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def getDataRetentionSettings(params: ParamsResourcePropertiesGetdataretentionsettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def getDataRetentionSettings(
    params: ParamsResourcePropertiesGetdataretentionsettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  ): Unit = js.native
  def getDataRetentionSettings(
    params: ParamsResourcePropertiesGetdataretentionsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  ): Unit = js.native
  def getDataRetentionSettings(params: ParamsResourcePropertiesGetdataretentionsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def getDataRetentionSettings(
    params: ParamsResourcePropertiesGetdataretentionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  ): Unit = js.native
  /**
    * Returns the singleton data retention settings for this property.
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
    *   const res = await analyticsadmin.properties.getDataRetentionSettings({
    *     // Required. The name of the settings to lookup. Format: properties/{property\}/dataRetentionSettings Example: "properties/1000/dataRetentionSettings"
    *     name: 'properties/my-propertie/dataRetentionSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "eventDataRetention": "my_eventDataRetention",
    *   //   "name": "my_name",
    *   //   "resetUserDataOnNewActivity": false
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
  def getDataRetentionSettings(params: ParamsResourcePropertiesGetdataretentionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getDataRetentionSettings(
    params: ParamsResourcePropertiesGetdataretentionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getGoogleSignalsSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def getGoogleSignalsSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]): Unit = js.native
  def getGoogleSignalsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def getGoogleSignalsSettings(params: ParamsResourcePropertiesGetgooglesignalssettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def getGoogleSignalsSettings(
    params: ParamsResourcePropertiesGetgooglesignalssettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  ): Unit = js.native
  def getGoogleSignalsSettings(
    params: ParamsResourcePropertiesGetgooglesignalssettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  ): Unit = js.native
  def getGoogleSignalsSettings(params: ParamsResourcePropertiesGetgooglesignalssettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def getGoogleSignalsSettings(
    params: ParamsResourcePropertiesGetgooglesignalssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  ): Unit = js.native
  /**
    * Lookup for Google Signals settings for a property.
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
    *   const res = await analyticsadmin.properties.getGoogleSignalsSettings({
    *     // Required. The name of the google signals settings to retrieve. Format: properties/{property\}/googleSignalsSettings
    *     name: 'properties/my-propertie/googleSignalsSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consent": "my_consent",
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def getGoogleSignalsSettings(params: ParamsResourcePropertiesGetgooglesignalssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGoogleSignalsSettings(
    params: ParamsResourcePropertiesGetgooglesignalssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var googleAdsLinks: ResourcePropertiesGoogleadslinks = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  def list(params: ParamsResourcePropertiesList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  def list(
    params: ParamsResourcePropertiesList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListPropertiesResponse]
  ): Unit = js.native
  /**
    * Returns child Properties under the specified parent Account. Only "GA4" properties will be returned. Properties will be excluded if the caller does not have access. Soft-deleted (ie: "trashed") properties are excluded by default. Returns an empty list if no relevant properties are found.
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
    *   const res = await analyticsadmin.properties.list({
    *     // Required. An expression for filtering the results of the request. Fields eligible for filtering are: `parent:`(The resource name of the parent account/property) or `ancestor:`(The resource name of the parent account) or `firebase_project:`(The id or number of the linked firebase project). Some examples of filters: ``` | Filter | Description | |-----------------------------|-------------------------------------------| | parent:accounts/123 | The account with account id: 123. | | parent:properties/123 | The property with property id: 123. | | ancestor:accounts/123 | The account with account id: 123. | | firebase_project:project-id | The firebase project with id: project-id. | | firebase_project:123 | The firebase project with number: 123. | ```
    *     filter: 'placeholder-value',
    *     // The maximum number of resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListProperties` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListProperties` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Whether to include soft-deleted (ie: "trashed") Properties in the results. Properties can be inspected to determine whether they are deleted or not.
    *     showDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "properties": []
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
  def list(params: ParamsResourcePropertiesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def patch(params: ParamsResourcePropertiesPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaProperty] = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaProperty]
  ): Unit = js.native
  /**
    * Updates a property.
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
    *   const res = await analyticsadmin.properties.patch({
    *     // Output only. Resource name of this property. Format: properties/{property_id\} Example: "properties/1000"
    *     name: 'properties/my-propertie',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "account": "my_account",
    *       //   "createTime": "my_createTime",
    *       //   "currencyCode": "my_currencyCode",
    *       //   "deleteTime": "my_deleteTime",
    *       //   "displayName": "my_displayName",
    *       //   "expireTime": "my_expireTime",
    *       //   "industryCategory": "my_industryCategory",
    *       //   "name": "my_name",
    *       //   "parent": "my_parent",
    *       //   "propertyType": "my_propertyType",
    *       //   "serviceLevel": "my_serviceLevel",
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": "my_account",
    *   //   "createTime": "my_createTime",
    *   //   "currencyCode": "my_currencyCode",
    *   //   "deleteTime": "my_deleteTime",
    *   //   "displayName": "my_displayName",
    *   //   "expireTime": "my_expireTime",
    *   //   "industryCategory": "my_industryCategory",
    *   //   "name": "my_name",
    *   //   "parent": "my_parent",
    *   //   "propertyType": "my_propertyType",
    *   //   "serviceLevel": "my_serviceLevel",
    *   //   "timeZone": "my_timeZone",
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
  def patch(params: ParamsResourcePropertiesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def runAccessReport(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse] = js.native
  def runAccessReport(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse]): Unit = js.native
  def runAccessReport(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse] = js.native
  def runAccessReport(params: ParamsResourcePropertiesRunaccessreport): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse] = js.native
  def runAccessReport(
    params: ParamsResourcePropertiesRunaccessreport,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse]
  ): Unit = js.native
  def runAccessReport(
    params: ParamsResourcePropertiesRunaccessreport,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse]
  ): Unit = js.native
  def runAccessReport(params: ParamsResourcePropertiesRunaccessreport, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse] = js.native
  def runAccessReport(
    params: ParamsResourcePropertiesRunaccessreport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportResponse]
  ): Unit = js.native
  /**
    * Returns a customized report of data access records. The report provides records of each time a user reads Google Analytics reporting data. Access records are retained for up to 2 years. Data Access Reports can be requested for a property. The property must be in Google Analytics 360. This method is only available to Administrators. These data access records include GA4 UI Reporting, GA4 UI Explorations, GA4 Data API, and other products like Firebase & Admob that can retrieve data from Google Analytics through a linkage. These records don't include property configuration changes like adding a stream or changing a property's time zone. For configuration change history, see [searchChangeHistoryEvents](https://developers.google.com/analytics/devguides/config/admin/v1/rest/v1alpha/accounts/searchChangeHistoryEvents).
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
    *   const res = await analyticsadmin.properties.runAccessReport({
    *     // The Data Access Report is requested for this property. For example if "123" is your GA4 property ID, then entity should be "properties/123".
    *     entity: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dateRanges": [],
    *       //   "dimensionFilter": {},
    *       //   "dimensions": [],
    *       //   "limit": "my_limit",
    *       //   "metricFilter": {},
    *       //   "metrics": [],
    *       //   "offset": "my_offset",
    *       //   "orderBys": [],
    *       //   "returnEntityQuota": false,
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dimensionHeaders": [],
    *   //   "metricHeaders": [],
    *   //   "quota": {},
    *   //   "rowCount": 0,
    *   //   "rows": []
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
  def runAccessReport(params: ParamsResourcePropertiesRunaccessreport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def runAccessReport(
    params: ParamsResourcePropertiesRunaccessreport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateAttributionSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def updateAttributionSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]): Unit = js.native
  def updateAttributionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def updateAttributionSettings(params: ParamsResourcePropertiesUpdateattributionsettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def updateAttributionSettings(
    params: ParamsResourcePropertiesUpdateattributionsettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  ): Unit = js.native
  def updateAttributionSettings(
    params: ParamsResourcePropertiesUpdateattributionsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAttributionSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  ): Unit = js.native
  def updateAttributionSettings(params: ParamsResourcePropertiesUpdateattributionsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def updateAttributionSettings(
    params: ParamsResourcePropertiesUpdateattributionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings]
  ): Unit = js.native
  /**
    * Updates attribution settings on a property.
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
    *   const res = await analyticsadmin.properties.updateAttributionSettings({
    *     // Output only. Resource name of this attribution settings resource. Format: properties/{property_id\}/attributionSettings Example: "properties/1000/attributionSettings"
    *     name: 'properties/my-propertie/attributionSettings',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acquisitionConversionEventLookbackWindow": "my_acquisitionConversionEventLookbackWindow",
    *       //   "name": "my_name",
    *       //   "otherConversionEventLookbackWindow": "my_otherConversionEventLookbackWindow",
    *       //   "reportingAttributionModel": "my_reportingAttributionModel"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acquisitionConversionEventLookbackWindow": "my_acquisitionConversionEventLookbackWindow",
    *   //   "name": "my_name",
    *   //   "otherConversionEventLookbackWindow": "my_otherConversionEventLookbackWindow",
    *   //   "reportingAttributionModel": "my_reportingAttributionModel"
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
  def updateAttributionSettings(params: ParamsResourcePropertiesUpdateattributionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateAttributionSettings(
    params: ParamsResourcePropertiesUpdateattributionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateDataRetentionSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def updateDataRetentionSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]): Unit = js.native
  def updateDataRetentionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def updateDataRetentionSettings(params: ParamsResourcePropertiesUpdatedataretentionsettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def updateDataRetentionSettings(
    params: ParamsResourcePropertiesUpdatedataretentionsettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  ): Unit = js.native
  def updateDataRetentionSettings(
    params: ParamsResourcePropertiesUpdatedataretentionsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  ): Unit = js.native
  def updateDataRetentionSettings(params: ParamsResourcePropertiesUpdatedataretentionsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def updateDataRetentionSettings(
    params: ParamsResourcePropertiesUpdatedataretentionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDataRetentionSettings]
  ): Unit = js.native
  /**
    * Updates the singleton data retention settings for this property.
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
    *   const res = await analyticsadmin.properties.updateDataRetentionSettings({
    *     // Output only. Resource name for this DataRetentionSetting resource. Format: properties/{property\}/dataRetentionSettings
    *     name: 'properties/my-propertie/dataRetentionSettings',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "eventDataRetention": "my_eventDataRetention",
    *       //   "name": "my_name",
    *       //   "resetUserDataOnNewActivity": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "eventDataRetention": "my_eventDataRetention",
    *   //   "name": "my_name",
    *   //   "resetUserDataOnNewActivity": false
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
  def updateDataRetentionSettings(params: ParamsResourcePropertiesUpdatedataretentionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateDataRetentionSettings(
    params: ParamsResourcePropertiesUpdatedataretentionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateGoogleSignalsSettings(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def updateGoogleSignalsSettings(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]): Unit = js.native
  def updateGoogleSignalsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def updateGoogleSignalsSettings(params: ParamsResourcePropertiesUpdategooglesignalssettings): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def updateGoogleSignalsSettings(
    params: ParamsResourcePropertiesUpdategooglesignalssettings,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  ): Unit = js.native
  def updateGoogleSignalsSettings(
    params: ParamsResourcePropertiesUpdategooglesignalssettings,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  ): Unit = js.native
  def updateGoogleSignalsSettings(params: ParamsResourcePropertiesUpdategooglesignalssettings, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def updateGoogleSignalsSettings(
    params: ParamsResourcePropertiesUpdategooglesignalssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaGoogleSignalsSettings]
  ): Unit = js.native
  /**
    * Updates Google Signals settings for a property.
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
    *   const res = await analyticsadmin.properties.updateGoogleSignalsSettings({
    *     // Output only. Resource name of this setting. Format: properties/{property_id\}/googleSignalsSettings Example: "properties/1000/googleSignalsSettings"
    *     name: 'properties/my-propertie/googleSignalsSettings',
    *     // Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "consent": "my_consent",
    *       //   "name": "my_name",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consent": "my_consent",
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def updateGoogleSignalsSettings(params: ParamsResourcePropertiesUpdategooglesignalssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateGoogleSignalsSettings(
    params: ParamsResourcePropertiesUpdategooglesignalssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var userLinks: ResourcePropertiesUserlinks = js.native
}
