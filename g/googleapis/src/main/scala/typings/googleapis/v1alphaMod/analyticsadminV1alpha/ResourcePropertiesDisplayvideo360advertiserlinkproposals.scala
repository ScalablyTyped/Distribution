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

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Displayvideo360advertiserlinkproposals")
@js.native
open class ResourcePropertiesDisplayvideo360advertiserlinkproposals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
  ] = js.native
  def approve(
    callback: BodyResponseCallback[
      SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
    ]
  ): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
  ] = js.native
  def approve(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
  ] = js.native
  def approve(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove,
    callback: BodyResponseCallback[
      SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
    ]
  ): Unit = js.native
  def approve(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
    ]
  ): Unit = js.native
  def approve(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove,
    options: MethodOptions
  ): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
  ] = js.native
  def approve(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[
      SchemaGoogleAnalyticsAdminV1alphaApproveDisplayVideo360AdvertiserLinkProposalResponse
    ]
  ): Unit = js.native
  /**
    * Approves a DisplayVideo360AdvertiserLinkProposal. The DisplayVideo360AdvertiserLinkProposal will be deleted and a new DisplayVideo360AdvertiserLink will be created.
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
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinkProposals.approve(
    *       {
    *         // Required. The name of the DisplayVideo360AdvertiserLinkProposal to approve. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    *         name: 'properties/my-propertie/displayVideo360AdvertiserLinkProposals/my-displayVideo360AdvertiserLinkProposal',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayVideo360AdvertiserLink": {}
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
  def approve(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancel(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def cancel(
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def cancel(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def cancel(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  def cancel(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal
    ]
  ): Unit = js.native
  def cancel(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def cancel(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  /**
    * Cancels a DisplayVideo360AdvertiserLinkProposal. Cancelling can mean either: - Declining a proposal initiated from Display & Video 360 - Withdrawing a proposal initiated from Google Analytics After being cancelled, a proposal will eventually be deleted automatically.
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
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinkProposals.cancel(
    *       {
    *         // Required. The name of the DisplayVideo360AdvertiserLinkProposal to cancel. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    *         name: 'properties/my-propertie/displayVideo360AdvertiserLinkProposals/my-displayVideo360AdvertiserLinkProposal',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "advertiserDisplayName": "my_advertiserDisplayName",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignDataSharingEnabled": false,
    *   //   "costDataSharingEnabled": false,
    *   //   "linkProposalStatusDetails": {},
    *   //   "name": "my_name",
    *   //   "validationEmail": "my_validationEmail"
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
  def cancel(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def create(
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def create(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal
    ]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  /**
    * Creates a DisplayVideo360AdvertiserLinkProposal.
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
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinkProposals.create(
    *       {
    *         // Required. Example format: properties/1234
    *         parent: 'properties/my-propertie',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "adsPersonalizationEnabled": false,
    *           //   "advertiserDisplayName": "my_advertiserDisplayName",
    *           //   "advertiserId": "my_advertiserId",
    *           //   "campaignDataSharingEnabled": false,
    *           //   "costDataSharingEnabled": false,
    *           //   "linkProposalStatusDetails": {},
    *           //   "name": "my_name",
    *           //   "validationEmail": "my_validationEmail"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adsPersonalizationEnabled": false,
    *   //   "advertiserDisplayName": "my_advertiserDisplayName",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignDataSharingEnabled": false,
    *   //   "costDataSharingEnabled": false,
    *   //   "linkProposalStatusDetails": {},
    *   //   "name": "my_name",
    *   //   "validationEmail": "my_validationEmail"
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
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a DisplayVideo360AdvertiserLinkProposal on a property. This can only be used on cancelled proposals.
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
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinkProposals.delete(
    *       {
    *         // Required. The name of the DisplayVideo360AdvertiserLinkProposal to delete. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    *         name: 'properties/my-propertie/displayVideo360AdvertiserLinkProposals/my-displayVideo360AdvertiserLinkProposal',
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
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def get(
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def get(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal
    ]
  ): Unit = js.native
  def get(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal] = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaDisplayVideo360AdvertiserLinkProposal]
  ): Unit = js.native
  /**
    * Lookup for a single DisplayVideo360AdvertiserLinkProposal.
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
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinkProposals.get({
    *       // Required. The name of the DisplayVideo360AdvertiserLinkProposal to get. Example format: properties/1234/displayVideo360AdvertiserLinkProposals/5678
    *       name: 'properties/my-propertie/displayVideo360AdvertiserLinkProposals/my-displayVideo360AdvertiserLinkProposal',
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
    *   //   "linkProposalStatusDetails": {},
    *   //   "name": "my_name",
    *   //   "validationEmail": "my_validationEmail"
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
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
  ] = js.native
  def list(
    callback: BodyResponseCallback[
      SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
    ]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
  ] = js.native
  def list(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
  ] = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList,
    callback: BodyResponseCallback[
      SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
    ]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList, options: MethodOptions): GaxiosPromise[
    SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
  ] = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[
      SchemaGoogleAnalyticsAdminV1alphaListDisplayVideo360AdvertiserLinkProposalsResponse
    ]
  ): Unit = js.native
  /**
    * Lists DisplayVideo360AdvertiserLinkProposals on a property.
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
    *     await analyticsadmin.properties.displayVideo360AdvertiserLinkProposals.list(
    *       {
    *         // The maximum number of resources to return. If unspecified, at most 50 resources will be returned. The maximum value is 200 (higher values will be coerced to the maximum).
    *         pageSize: 'placeholder-value',
    *         // A page token, received from a previous `ListDisplayVideo360AdvertiserLinkProposals` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListDisplayVideo360AdvertiserLinkProposals` must match the call that provided the page token.
    *         pageToken: 'placeholder-value',
    *         // Required. Example format: properties/1234
    *         parent: 'properties/my-propertie',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayVideo360AdvertiserLinkProposals": [],
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
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesDisplayvideo360advertiserlinkproposalsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
