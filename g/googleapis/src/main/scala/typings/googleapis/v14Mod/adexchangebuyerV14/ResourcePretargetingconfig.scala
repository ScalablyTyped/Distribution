package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Pretargetingconfig")
@js.native
open class ResourcePretargetingconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePretargetingconfigDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePretargetingconfigDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePretargetingconfigDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePretargetingconfigDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePretargetingconfigDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes an existing pretargeting config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.pretargetingConfig.delete({
    *     // The account id to delete the pretargeting config for.
    *     accountId: 'placeholder-value',
    *     // The specific id of the configuration to delete.
    *     configId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourcePretargetingconfigDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePretargetingconfigDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(params: ParamsResourcePretargetingconfigGet): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def get(params: ParamsResourcePretargetingconfigGet, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Gets a specific pretargeting configuration
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.pretargetingConfig.get({
    *     // The account id to get the pretargeting config for.
    *     accountId: 'placeholder-value',
    *     // The specific id of the configuration to retrieve.
    *     configId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingId": "my_billingId",
    *   //   "configId": "my_configId",
    *   //   "configName": "my_configName",
    *   //   "creativeType": [],
    *   //   "dimensions": [],
    *   //   "excludedContentLabels": [],
    *   //   "excludedGeoCriteriaIds": [],
    *   //   "excludedPlacements": [],
    *   //   "excludedUserLists": [],
    *   //   "excludedVerticals": [],
    *   //   "geoCriteriaIds": [],
    *   //   "isActive": false,
    *   //   "kind": "my_kind",
    *   //   "languages": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "mobileCarriers": [],
    *   //   "mobileDevices": [],
    *   //   "mobileOperatingSystemVersions": [],
    *   //   "placements": [],
    *   //   "platforms": [],
    *   //   "supportedCreativeAttributes": [],
    *   //   "userIdentifierDataRequired": [],
    *   //   "userLists": [],
    *   //   "vendorTypes": [],
    *   //   "verticals": [],
    *   //   "videoPlayerSizes": []
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
  def get(params: ParamsResourcePretargetingconfigGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePretargetingconfigGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(params: ParamsResourcePretargetingconfigInsert): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def insert(params: ParamsResourcePretargetingconfigInsert, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Inserts a new pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.pretargetingConfig.insert({
    *     // The account id to insert the pretargeting config for.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingId": "my_billingId",
    *       //   "configId": "my_configId",
    *       //   "configName": "my_configName",
    *       //   "creativeType": [],
    *       //   "dimensions": [],
    *       //   "excludedContentLabels": [],
    *       //   "excludedGeoCriteriaIds": [],
    *       //   "excludedPlacements": [],
    *       //   "excludedUserLists": [],
    *       //   "excludedVerticals": [],
    *       //   "geoCriteriaIds": [],
    *       //   "isActive": false,
    *       //   "kind": "my_kind",
    *       //   "languages": [],
    *       //   "maximumQps": "my_maximumQps",
    *       //   "minimumViewabilityDecile": 0,
    *       //   "mobileCarriers": [],
    *       //   "mobileDevices": [],
    *       //   "mobileOperatingSystemVersions": [],
    *       //   "placements": [],
    *       //   "platforms": [],
    *       //   "supportedCreativeAttributes": [],
    *       //   "userIdentifierDataRequired": [],
    *       //   "userLists": [],
    *       //   "vendorTypes": [],
    *       //   "verticals": [],
    *       //   "videoPlayerSizes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingId": "my_billingId",
    *   //   "configId": "my_configId",
    *   //   "configName": "my_configName",
    *   //   "creativeType": [],
    *   //   "dimensions": [],
    *   //   "excludedContentLabels": [],
    *   //   "excludedGeoCriteriaIds": [],
    *   //   "excludedPlacements": [],
    *   //   "excludedUserLists": [],
    *   //   "excludedVerticals": [],
    *   //   "geoCriteriaIds": [],
    *   //   "isActive": false,
    *   //   "kind": "my_kind",
    *   //   "languages": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "mobileCarriers": [],
    *   //   "mobileDevices": [],
    *   //   "mobileOperatingSystemVersions": [],
    *   //   "placements": [],
    *   //   "platforms": [],
    *   //   "supportedCreativeAttributes": [],
    *   //   "userIdentifierDataRequired": [],
    *   //   "userLists": [],
    *   //   "vendorTypes": [],
    *   //   "verticals": [],
    *   //   "videoPlayerSizes": []
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
  def insert(params: ParamsResourcePretargetingconfigInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePretargetingconfigInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(callback: BodyResponseCallback[SchemaPretargetingConfigList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(params: ParamsResourcePretargetingconfigList): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    callback: BodyResponseCallback[SchemaPretargetingConfigList]
  ): Unit = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfigList],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfigList]
  ): Unit = js.native
  def list(params: ParamsResourcePretargetingconfigList, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfigList] = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfigList]
  ): Unit = js.native
  /**
    * Retrieves a list of the authenticated user's pretargeting configurations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.pretargetingConfig.list({
    *     // The account id to get the pretargeting configs for.
    *     accountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
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
  def list(params: ParamsResourcePretargetingconfigList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePretargetingconfigList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(params: ParamsResourcePretargetingconfigPatch): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def patch(params: ParamsResourcePretargetingconfigPatch, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Updates an existing pretargeting config. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.pretargetingConfig.patch({
    *     // The account id to update the pretargeting config for.
    *     accountId: 'placeholder-value',
    *     // The specific id of the configuration to update.
    *     configId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingId": "my_billingId",
    *       //   "configId": "my_configId",
    *       //   "configName": "my_configName",
    *       //   "creativeType": [],
    *       //   "dimensions": [],
    *       //   "excludedContentLabels": [],
    *       //   "excludedGeoCriteriaIds": [],
    *       //   "excludedPlacements": [],
    *       //   "excludedUserLists": [],
    *       //   "excludedVerticals": [],
    *       //   "geoCriteriaIds": [],
    *       //   "isActive": false,
    *       //   "kind": "my_kind",
    *       //   "languages": [],
    *       //   "maximumQps": "my_maximumQps",
    *       //   "minimumViewabilityDecile": 0,
    *       //   "mobileCarriers": [],
    *       //   "mobileDevices": [],
    *       //   "mobileOperatingSystemVersions": [],
    *       //   "placements": [],
    *       //   "platforms": [],
    *       //   "supportedCreativeAttributes": [],
    *       //   "userIdentifierDataRequired": [],
    *       //   "userLists": [],
    *       //   "vendorTypes": [],
    *       //   "verticals": [],
    *       //   "videoPlayerSizes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingId": "my_billingId",
    *   //   "configId": "my_configId",
    *   //   "configName": "my_configName",
    *   //   "creativeType": [],
    *   //   "dimensions": [],
    *   //   "excludedContentLabels": [],
    *   //   "excludedGeoCriteriaIds": [],
    *   //   "excludedPlacements": [],
    *   //   "excludedUserLists": [],
    *   //   "excludedVerticals": [],
    *   //   "geoCriteriaIds": [],
    *   //   "isActive": false,
    *   //   "kind": "my_kind",
    *   //   "languages": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "mobileCarriers": [],
    *   //   "mobileDevices": [],
    *   //   "mobileOperatingSystemVersions": [],
    *   //   "placements": [],
    *   //   "platforms": [],
    *   //   "supportedCreativeAttributes": [],
    *   //   "userIdentifierDataRequired": [],
    *   //   "userLists": [],
    *   //   "vendorTypes": [],
    *   //   "verticals": [],
    *   //   "videoPlayerSizes": []
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
  def patch(params: ParamsResourcePretargetingconfigPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePretargetingconfigPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(params: ParamsResourcePretargetingconfigUpdate): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def update(params: ParamsResourcePretargetingconfigUpdate, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Updates an existing pretargeting config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.pretargetingConfig.update({
    *     // The account id to update the pretargeting config for.
    *     accountId: 'placeholder-value',
    *     // The specific id of the configuration to update.
    *     configId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingId": "my_billingId",
    *       //   "configId": "my_configId",
    *       //   "configName": "my_configName",
    *       //   "creativeType": [],
    *       //   "dimensions": [],
    *       //   "excludedContentLabels": [],
    *       //   "excludedGeoCriteriaIds": [],
    *       //   "excludedPlacements": [],
    *       //   "excludedUserLists": [],
    *       //   "excludedVerticals": [],
    *       //   "geoCriteriaIds": [],
    *       //   "isActive": false,
    *       //   "kind": "my_kind",
    *       //   "languages": [],
    *       //   "maximumQps": "my_maximumQps",
    *       //   "minimumViewabilityDecile": 0,
    *       //   "mobileCarriers": [],
    *       //   "mobileDevices": [],
    *       //   "mobileOperatingSystemVersions": [],
    *       //   "placements": [],
    *       //   "platforms": [],
    *       //   "supportedCreativeAttributes": [],
    *       //   "userIdentifierDataRequired": [],
    *       //   "userLists": [],
    *       //   "vendorTypes": [],
    *       //   "verticals": [],
    *       //   "videoPlayerSizes": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingId": "my_billingId",
    *   //   "configId": "my_configId",
    *   //   "configName": "my_configName",
    *   //   "creativeType": [],
    *   //   "dimensions": [],
    *   //   "excludedContentLabels": [],
    *   //   "excludedGeoCriteriaIds": [],
    *   //   "excludedPlacements": [],
    *   //   "excludedUserLists": [],
    *   //   "excludedVerticals": [],
    *   //   "geoCriteriaIds": [],
    *   //   "isActive": false,
    *   //   "kind": "my_kind",
    *   //   "languages": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "mobileCarriers": [],
    *   //   "mobileDevices": [],
    *   //   "mobileOperatingSystemVersions": [],
    *   //   "placements": [],
    *   //   "platforms": [],
    *   //   "supportedCreativeAttributes": [],
    *   //   "userIdentifierDataRequired": [],
    *   //   "userLists": [],
    *   //   "vendorTypes": [],
    *   //   "verticals": [],
    *   //   "videoPlayerSizes": []
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
  def update(params: ParamsResourcePretargetingconfigUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePretargetingconfigUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
