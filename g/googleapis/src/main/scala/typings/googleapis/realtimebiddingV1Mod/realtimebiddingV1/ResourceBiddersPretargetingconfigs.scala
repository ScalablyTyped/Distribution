package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Resource$Bidders$Pretargetingconfigs")
@js.native
open class ResourceBiddersPretargetingconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def activate(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def activate(params: ParamsResourceBiddersPretargetingconfigsActivate): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def activate(
    params: ParamsResourceBiddersPretargetingconfigsActivate,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def activate(
    params: ParamsResourceBiddersPretargetingconfigsActivate,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def activate(params: ParamsResourceBiddersPretargetingconfigsActivate, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def activate(
    params: ParamsResourceBiddersPretargetingconfigsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Activates a pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.activate({
    *     // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *     name: 'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
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
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def activate(params: ParamsResourceBiddersPretargetingconfigsActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceBiddersPretargetingconfigsActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addTargetedApps(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedApps(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def addTargetedApps(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedApps(params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def addTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def addTargetedApps(params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Adds targeted apps to the pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.addTargetedApps(
    *     {
    *       // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *       pretargetingConfig:
    *         'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "appIds": [],
    *         //   "targetingMode": "my_targetingMode"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def addTargetedApps(params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedapps,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addTargetedPublishers(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedPublishers(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def addTargetedPublishers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedPublishers(params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def addTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def addTargetedPublishers(params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Adds targeted publishers to the pretargeting config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await realtimebidding.bidders.pretargetingConfigs.addTargetedPublishers({
    *       // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *       pretargetingConfig:
    *         'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "publisherIds": [],
    *         //   "targetingMode": "my_targetingMode"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def addTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def addTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedpublishers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addTargetedSites(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedSites(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def addTargetedSites(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedSites(params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def addTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def addTargetedSites(params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def addTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Adds targeted sites to the pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await realtimebidding.bidders.pretargetingConfigs.addTargetedSites({
    *       // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *       pretargetingConfig:
    *         'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "sites": [],
    *         //   "targetingMode": "my_targetingMode"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def addTargetedSites(params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsAddtargetedsites,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def create(params: ParamsResourceBiddersPretargetingconfigsCreate): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def create(
    params: ParamsResourceBiddersPretargetingconfigsCreate,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceBiddersPretargetingconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def create(params: ParamsResourceBiddersPretargetingconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def create(
    params: ParamsResourceBiddersPretargetingconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Creates a pretargeting configuration. A pretargeting configuration's state (PretargetingConfig.state) is active upon creation, and it will start to affect traffic shortly after. A bidder may create a maximum of 10 pretargeting configurations. Attempts to exceed this maximum results in a 400 bad request error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.create({
    *     // Required. Name of the bidder to create the pretargeting configuration for. Format: bidders/{bidderAccountId\}
    *     parent: 'bidders/my-bidder',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowedUserTargetingModes": [],
    *       //   "appTargeting": {},
    *       //   "billingId": "my_billingId",
    *       //   "displayName": "my_displayName",
    *       //   "excludedContentLabelIds": [],
    *       //   "geoTargeting": {},
    *       //   "includedCreativeDimensions": [],
    *       //   "includedEnvironments": [],
    *       //   "includedFormats": [],
    *       //   "includedLanguages": [],
    *       //   "includedMobileOperatingSystemIds": [],
    *       //   "includedPlatforms": [],
    *       //   "includedUserIdTypes": [],
    *       //   "interstitialTargeting": "my_interstitialTargeting",
    *       //   "invalidGeoIds": [],
    *       //   "maximumQps": "my_maximumQps",
    *       //   "minimumViewabilityDecile": 0,
    *       //   "name": "my_name",
    *       //   "publisherTargeting": {},
    *       //   "state": "my_state",
    *       //   "userListTargeting": {},
    *       //   "verticalTargeting": {},
    *       //   "webTargeting": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def create(params: ParamsResourceBiddersPretargetingconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBiddersPretargetingconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBiddersPretargetingconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBiddersPretargetingconfigsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceBiddersPretargetingconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBiddersPretargetingconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBiddersPretargetingconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.delete({
    *     // Required. The name of the pretargeting configuration to delete. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *     name: 'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
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
  def delete(params: ParamsResourceBiddersPretargetingconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBiddersPretargetingconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(params: ParamsResourceBiddersPretargetingconfigsGet): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(
    params: ParamsResourceBiddersPretargetingconfigsGet,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceBiddersPretargetingconfigsGet,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def get(params: ParamsResourceBiddersPretargetingconfigsGet, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def get(
    params: ParamsResourceBiddersPretargetingconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Gets a pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.get({
    *     // Required. Name of the pretargeting configuration to get. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *     name: 'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def get(params: ParamsResourceBiddersPretargetingconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBiddersPretargetingconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPretargetingConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPretargetingConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPretargetingConfigsResponse] = js.native
  def list(params: ParamsResourceBiddersPretargetingconfigsList): GaxiosPromise[SchemaListPretargetingConfigsResponse] = js.native
  def list(
    params: ParamsResourceBiddersPretargetingconfigsList,
    callback: BodyResponseCallback[SchemaListPretargetingConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBiddersPretargetingconfigsList,
    options: BodyResponseCallback[Readable | SchemaListPretargetingConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListPretargetingConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBiddersPretargetingconfigsList, options: MethodOptions): GaxiosPromise[SchemaListPretargetingConfigsResponse] = js.native
  def list(
    params: ParamsResourceBiddersPretargetingconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPretargetingConfigsResponse]
  ): Unit = js.native
  /**
    * Lists all pretargeting configurations for a single bidder.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.list({
    *     // The maximum number of pretargeting configurations to return. If unspecified, at most 10 pretargeting configurations will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. This value is received from a previous `ListPretargetingConfigs` call in ListPretargetingConfigsResponse.nextPageToken.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the bidder whose pretargeting configurations will be listed. Format: bidders/{bidderAccountId\}
    *     parent: 'bidders/my-bidder',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "pretargetingConfigs": []
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
  def list(params: ParamsResourceBiddersPretargetingconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBiddersPretargetingconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(params: ParamsResourceBiddersPretargetingconfigsPatch): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(
    params: ParamsResourceBiddersPretargetingconfigsPatch,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceBiddersPretargetingconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceBiddersPretargetingconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def patch(
    params: ParamsResourceBiddersPretargetingconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Updates a pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.patch({
    *     // Output only. Name of the pretargeting configuration that must follow the pattern `bidders/{bidder_account_id\}/pretargetingConfigs/{config_id\}`
    *     name: 'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *     // Field mask to use for partial in-place updates.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "allowedUserTargetingModes": [],
    *       //   "appTargeting": {},
    *       //   "billingId": "my_billingId",
    *       //   "displayName": "my_displayName",
    *       //   "excludedContentLabelIds": [],
    *       //   "geoTargeting": {},
    *       //   "includedCreativeDimensions": [],
    *       //   "includedEnvironments": [],
    *       //   "includedFormats": [],
    *       //   "includedLanguages": [],
    *       //   "includedMobileOperatingSystemIds": [],
    *       //   "includedPlatforms": [],
    *       //   "includedUserIdTypes": [],
    *       //   "interstitialTargeting": "my_interstitialTargeting",
    *       //   "invalidGeoIds": [],
    *       //   "maximumQps": "my_maximumQps",
    *       //   "minimumViewabilityDecile": 0,
    *       //   "name": "my_name",
    *       //   "publisherTargeting": {},
    *       //   "state": "my_state",
    *       //   "userListTargeting": {},
    *       //   "verticalTargeting": {},
    *       //   "webTargeting": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def patch(params: ParamsResourceBiddersPretargetingconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBiddersPretargetingconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeTargetedApps(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedApps(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def removeTargetedApps(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedApps(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def removeTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def removeTargetedApps(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Removes targeted apps from the pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await realtimebidding.bidders.pretargetingConfigs.removeTargetedApps({
    *       // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *       pretargetingConfig:
    *         'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "appIds": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def removeTargetedApps(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeTargetedApps(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedapps,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeTargetedPublishers(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedPublishers(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def removeTargetedPublishers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedPublishers(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def removeTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def removeTargetedPublishers(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Removes targeted publishers from the pretargeting config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await realtimebidding.bidders.pretargetingConfigs.removeTargetedPublishers({
    *       // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *       pretargetingConfig:
    *         'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "publisherIds": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def removeTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def removeTargetedPublishers(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedpublishers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeTargetedSites(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedSites(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def removeTargetedSites(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedSites(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def removeTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def removeTargetedSites(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def removeTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Removes targeted sites from the pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await realtimebidding.bidders.pretargetingConfigs.removeTargetedSites({
    *       // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *       pretargetingConfig:
    *         'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "sites": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def removeTargetedSites(params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeTargetedSites(
    params: ParamsResourceBiddersPretargetingconfigsRemovetargetedsites,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suspend(): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def suspend(callback: BodyResponseCallback[SchemaPretargetingConfig]): Unit = js.native
  def suspend(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def suspend(params: ParamsResourceBiddersPretargetingconfigsSuspend): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def suspend(
    params: ParamsResourceBiddersPretargetingconfigsSuspend,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  def suspend(
    params: ParamsResourceBiddersPretargetingconfigsSuspend,
    options: BodyResponseCallback[Readable | SchemaPretargetingConfig],
    callback: BodyResponseCallback[Readable | SchemaPretargetingConfig]
  ): Unit = js.native
  def suspend(params: ParamsResourceBiddersPretargetingconfigsSuspend, options: MethodOptions): GaxiosPromise[SchemaPretargetingConfig] = js.native
  def suspend(
    params: ParamsResourceBiddersPretargetingconfigsSuspend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPretargetingConfig]
  ): Unit = js.native
  /**
    * Suspends a pretargeting configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/realtimebidding.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const realtimebidding = google.realtimebidding('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/realtime-bidding'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await realtimebidding.bidders.pretargetingConfigs.suspend({
    *     // Required. The name of the pretargeting configuration. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    *     name: 'bidders/my-bidder/pretargetingConfigs/my-pretargetingConfig',
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
    *   // {
    *   //   "allowedUserTargetingModes": [],
    *   //   "appTargeting": {},
    *   //   "billingId": "my_billingId",
    *   //   "displayName": "my_displayName",
    *   //   "excludedContentLabelIds": [],
    *   //   "geoTargeting": {},
    *   //   "includedCreativeDimensions": [],
    *   //   "includedEnvironments": [],
    *   //   "includedFormats": [],
    *   //   "includedLanguages": [],
    *   //   "includedMobileOperatingSystemIds": [],
    *   //   "includedPlatforms": [],
    *   //   "includedUserIdTypes": [],
    *   //   "interstitialTargeting": "my_interstitialTargeting",
    *   //   "invalidGeoIds": [],
    *   //   "maximumQps": "my_maximumQps",
    *   //   "minimumViewabilityDecile": 0,
    *   //   "name": "my_name",
    *   //   "publisherTargeting": {},
    *   //   "state": "my_state",
    *   //   "userListTargeting": {},
    *   //   "verticalTargeting": {},
    *   //   "webTargeting": {}
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
  def suspend(params: ParamsResourceBiddersPretargetingconfigsSuspend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def suspend(
    params: ParamsResourceBiddersPretargetingconfigsSuspend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
