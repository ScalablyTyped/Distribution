package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Floodlightconfigurations")
@js.native
open class ResourceFloodlightconfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(params: ParamsResourceFloodlightconfigurationsGet): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    options: BodyResponseCallback[Readable | SchemaFloodlightConfiguration],
    callback: BodyResponseCallback[Readable | SchemaFloodlightConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightconfigurationsGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  /**
    * Gets one floodlight configuration by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.floodlightConfigurations.get({
    *     // Floodlight configuration ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "analyticsDataSharingEnabled": false,
    *   //   "customViewabilityMetric": {},
    *   //   "exposureToConversionEnabled": false,
    *   //   "firstDayOfWeek": "my_firstDayOfWeek",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "inAppAttributionTrackingEnabled": false,
    *   //   "kind": "my_kind",
    *   //   "lookbackConfiguration": {},
    *   //   "naturalSearchConversionAttributionOption": "my_naturalSearchConversionAttributionOption",
    *   //   "omnitureSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagSettings": {},
    *   //   "thirdPartyAuthenticationTokens": [],
    *   //   "userDefinedVariableConfigurations": []
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
  def get(params: ParamsResourceFloodlightconfigurationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceFloodlightconfigurationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(params: ParamsResourceFloodlightconfigurationsList): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    options: BodyResponseCallback[Readable | SchemaFloodlightConfigurationsListResponse],
    callback: BodyResponseCallback[Readable | SchemaFloodlightConfigurationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFloodlightconfigurationsList, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfigurationsListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfigurationsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of floodlight configurations, possibly filtered.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.floodlightConfigurations.list({
    *     // Set of IDs of floodlight configurations to retrieve. Required field; otherwise an empty list will be returned.
    *     ids: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "floodlightConfigurations": [],
    *   //   "kind": "my_kind"
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
  def list(params: ParamsResourceFloodlightconfigurationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceFloodlightconfigurationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightConfiguration]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(params: ParamsResourceFloodlightconfigurationsPatch): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    options: BodyResponseCallback[Readable | SchemaFloodlightConfiguration],
    callback: BodyResponseCallback[Readable | SchemaFloodlightConfiguration]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightconfigurationsPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  /**
    * Updates an existing floodlight configuration. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.floodlightConfigurations.patch({
    *     // FloodlightConfiguration ID.
    *     id: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "analyticsDataSharingEnabled": false,
    *       //   "customViewabilityMetric": {},
    *       //   "exposureToConversionEnabled": false,
    *       //   "firstDayOfWeek": "my_firstDayOfWeek",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "inAppAttributionTrackingEnabled": false,
    *       //   "kind": "my_kind",
    *       //   "lookbackConfiguration": {},
    *       //   "naturalSearchConversionAttributionOption": "my_naturalSearchConversionAttributionOption",
    *       //   "omnitureSettings": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagSettings": {},
    *       //   "thirdPartyAuthenticationTokens": [],
    *       //   "userDefinedVariableConfigurations": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "analyticsDataSharingEnabled": false,
    *   //   "customViewabilityMetric": {},
    *   //   "exposureToConversionEnabled": false,
    *   //   "firstDayOfWeek": "my_firstDayOfWeek",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "inAppAttributionTrackingEnabled": false,
    *   //   "kind": "my_kind",
    *   //   "lookbackConfiguration": {},
    *   //   "naturalSearchConversionAttributionOption": "my_naturalSearchConversionAttributionOption",
    *   //   "omnitureSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagSettings": {},
    *   //   "thirdPartyAuthenticationTokens": [],
    *   //   "userDefinedVariableConfigurations": []
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
  def patch(params: ParamsResourceFloodlightconfigurationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceFloodlightconfigurationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaFloodlightConfiguration]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(params: ParamsResourceFloodlightconfigurationsUpdate): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    options: BodyResponseCallback[Readable | SchemaFloodlightConfiguration],
    callback: BodyResponseCallback[Readable | SchemaFloodlightConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceFloodlightconfigurationsUpdate, options: MethodOptions): GaxiosPromise[SchemaFloodlightConfiguration] = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightConfiguration]
  ): Unit = js.native
  /**
    * Updates an existing floodlight configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v3.3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.floodlightConfigurations.update({
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "advertiserIdDimensionValue": {},
    *       //   "analyticsDataSharingEnabled": false,
    *       //   "customViewabilityMetric": {},
    *       //   "exposureToConversionEnabled": false,
    *       //   "firstDayOfWeek": "my_firstDayOfWeek",
    *       //   "id": "my_id",
    *       //   "idDimensionValue": {},
    *       //   "inAppAttributionTrackingEnabled": false,
    *       //   "kind": "my_kind",
    *       //   "lookbackConfiguration": {},
    *       //   "naturalSearchConversionAttributionOption": "my_naturalSearchConversionAttributionOption",
    *       //   "omnitureSettings": {},
    *       //   "subaccountId": "my_subaccountId",
    *       //   "tagSettings": {},
    *       //   "thirdPartyAuthenticationTokens": [],
    *       //   "userDefinedVariableConfigurations": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "advertiserIdDimensionValue": {},
    *   //   "analyticsDataSharingEnabled": false,
    *   //   "customViewabilityMetric": {},
    *   //   "exposureToConversionEnabled": false,
    *   //   "firstDayOfWeek": "my_firstDayOfWeek",
    *   //   "id": "my_id",
    *   //   "idDimensionValue": {},
    *   //   "inAppAttributionTrackingEnabled": false,
    *   //   "kind": "my_kind",
    *   //   "lookbackConfiguration": {},
    *   //   "naturalSearchConversionAttributionOption": "my_naturalSearchConversionAttributionOption",
    *   //   "omnitureSettings": {},
    *   //   "subaccountId": "my_subaccountId",
    *   //   "tagSettings": {},
    *   //   "thirdPartyAuthenticationTokens": [],
    *   //   "userDefinedVariableConfigurations": []
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
  def update(params: ParamsResourceFloodlightconfigurationsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceFloodlightconfigurationsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
