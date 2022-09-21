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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Datastreams$Measurementprotocolsecrets")
@js.native
open class ResourcePropertiesDatastreamsMeasurementprotocolsecrets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def create(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  /**
    * Creates a measurement protocol secret.
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
    *     await analyticsadmin.properties.dataStreams.measurementProtocolSecrets.create(
    *       {
    *         // Required. The parent resource where this secret will be created. Format: properties/{property\}/dataStreams/{dataStream\}
    *         parent: 'properties/my-propertie/dataStreams/my-dataStream',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "displayName": "my_displayName",
    *           //   "name": "my_name",
    *           //   "secretValue": "my_secretValue"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "secretValue": "my_secretValue"
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
  def create(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes target MeasurementProtocolSecret.
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
    *     await analyticsadmin.properties.dataStreams.measurementProtocolSecrets.delete(
    *       {
    *         // Required. The name of the MeasurementProtocolSecret to delete. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets/{measurementProtocolSecret\}
    *         name: 'properties/my-propertie/dataStreams/my-dataStream/measurementProtocolSecrets/my-measurementProtocolSecret',
    *       }
    *     );
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
  def delete(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def get(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  /**
    * Lookup for a single "GA4" MeasurementProtocolSecret.
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
    *     await analyticsadmin.properties.dataStreams.measurementProtocolSecrets.get({
    *       // Required. The name of the measurement protocol secret to lookup. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets/{measurementProtocolSecret\}
    *       name: 'properties/my-propertie/dataStreams/my-dataStream/measurementProtocolSecrets/my-measurementProtocolSecret',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "secretValue": "my_secretValue"
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
  def get(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  def list(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse] = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListMeasurementProtocolSecretsResponse]
  ): Unit = js.native
  /**
    * Returns child MeasurementProtocolSecrets under the specified parent Property.
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
    *     await analyticsadmin.properties.dataStreams.measurementProtocolSecrets.list(
    *       {
    *         // The maximum number of resources to return. If unspecified, at most 10 resources will be returned. The maximum value is 10. Higher values will be coerced to the maximum.
    *         pageSize: 'placeholder-value',
    *         // A page token, received from a previous `ListMeasurementProtocolSecrets` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListMeasurementProtocolSecrets` must match the call that provided the page token.
    *         pageToken: 'placeholder-value',
    *         // Required. The resource name of the parent stream. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets
    *         parent: 'properties/my-propertie/dataStreams/my-dataStream',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "measurementProtocolSecrets": [],
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
  def list(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def patch(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  def patch(params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret] = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaMeasurementProtocolSecret]
  ): Unit = js.native
  /**
    * Updates a measurement protocol secret.
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
    *     await analyticsadmin.properties.dataStreams.measurementProtocolSecrets.patch(
    *       {
    *         // Output only. Resource name of this secret. This secret may be a child of any type of stream. Format: properties/{property\}/dataStreams/{dataStream\}/measurementProtocolSecrets/{measurementProtocolSecret\}
    *         name: 'properties/my-propertie/dataStreams/my-dataStream/measurementProtocolSecrets/my-measurementProtocolSecret',
    *         // The list of fields to be updated. Omitted fields will not be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "displayName": "my_displayName",
    *           //   "name": "my_name",
    *           //   "secretValue": "my_secretValue"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "secretValue": "my_secretValue"
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
  def patch(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePropertiesDatastreamsMeasurementprotocolsecretsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
