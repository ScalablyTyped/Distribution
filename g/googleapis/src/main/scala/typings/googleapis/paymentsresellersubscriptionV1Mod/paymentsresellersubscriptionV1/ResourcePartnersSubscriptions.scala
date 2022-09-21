package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/paymentsresellersubscription/v1", "paymentsresellersubscription_v1.Resource$Partners$Subscriptions")
@js.native
open class ResourcePartnersSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse] = js.native
  def cancel(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse]
  ): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse] = js.native
  def cancel(params: ParamsResourcePartnersSubscriptionsCancel): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse] = js.native
  def cancel(
    params: ParamsResourcePartnersSubscriptionsCancel,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse]
  ): Unit = js.native
  def cancel(
    params: ParamsResourcePartnersSubscriptionsCancel,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse
    ]
  ): Unit = js.native
  def cancel(params: ParamsResourcePartnersSubscriptionsCancel, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse] = js.native
  def cancel(
    params: ParamsResourcePartnersSubscriptionsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse]
  ): Unit = js.native
  /**
    * Used by partners to cancel a subscription service either immediately or by the end of the current billing cycle for their customers. It should be called directly by the partner using service accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await paymentsresellersubscription.partners.subscriptions.cancel({
    *     // Required. The name of the subscription resource to be cancelled. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    *     name: 'partners/my-partner/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cancelImmediately": false,
    *       //   "cancellationReason": "my_cancellationReason"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "subscription": {}
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
  def cancel(params: ParamsResourcePartnersSubscriptionsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourcePartnersSubscriptionsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def create(params: ParamsResourcePartnersSubscriptionsCreate): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def create(
    params: ParamsResourcePartnersSubscriptionsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  def create(
    params: ParamsResourcePartnersSubscriptionsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  def create(params: ParamsResourcePartnersSubscriptionsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def create(
    params: ParamsResourcePartnersSubscriptionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  /**
    * Used by partners to create a subscription for their customers. The created subscription is associated with the end user inferred from the end user credentials. This API must be authorized by the end user using OAuth.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await paymentsresellersubscription.partners.subscriptions.create({
    *     // Required. The parent resource name, which is the identifier of the partner. It will have the format of "partners/{partner_id\}".
    *     parent: 'partners/my-partner',
    *     // Required. Identifies the subscription resource on the Partner side. The value is restricted to 63 ASCII characters at the maximum. If a subscription was previously created with the same subscription_id, we will directly return that one.
    *     subscriptionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cancellationDetails": {},
    *       //   "createTime": "my_createTime",
    *       //   "cycleEndTime": "my_cycleEndTime",
    *       //   "endUserEntitled": false,
    *       //   "freeTrialEndTime": "my_freeTrialEndTime",
    *       //   "lineItems": [],
    *       //   "name": "my_name",
    *       //   "partnerUserToken": "my_partnerUserToken",
    *       //   "processingState": "my_processingState",
    *       //   "products": [],
    *       //   "promotionSpecs": [],
    *       //   "promotions": [],
    *       //   "redirectUri": "my_redirectUri",
    *       //   "renewalTime": "my_renewalTime",
    *       //   "serviceLocation": {},
    *       //   "state": "my_state",
    *       //   "updateTime": "my_updateTime",
    *       //   "upgradeDowngradeDetails": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cancellationDetails": {},
    *   //   "createTime": "my_createTime",
    *   //   "cycleEndTime": "my_cycleEndTime",
    *   //   "endUserEntitled": false,
    *   //   "freeTrialEndTime": "my_freeTrialEndTime",
    *   //   "lineItems": [],
    *   //   "name": "my_name",
    *   //   "partnerUserToken": "my_partnerUserToken",
    *   //   "processingState": "my_processingState",
    *   //   "products": [],
    *   //   "promotionSpecs": [],
    *   //   "promotions": [],
    *   //   "redirectUri": "my_redirectUri",
    *   //   "renewalTime": "my_renewalTime",
    *   //   "serviceLocation": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "upgradeDowngradeDetails": {}
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
  def create(params: ParamsResourcePartnersSubscriptionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePartnersSubscriptionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def entitle(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse] = js.native
  def entitle(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse]
  ): Unit = js.native
  def entitle(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse] = js.native
  def entitle(params: ParamsResourcePartnersSubscriptionsEntitle): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse] = js.native
  def entitle(
    params: ParamsResourcePartnersSubscriptionsEntitle,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse]
  ): Unit = js.native
  def entitle(
    params: ParamsResourcePartnersSubscriptionsEntitle,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse
    ]
  ): Unit = js.native
  def entitle(params: ParamsResourcePartnersSubscriptionsEntitle, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse] = js.native
  def entitle(
    params: ParamsResourcePartnersSubscriptionsEntitle,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse]
  ): Unit = js.native
  /**
    * Used by partners to entitle a previously provisioned subscription to the current end user. The end user identity is inferred from the authorized credential of the request. This API must be authorized by the end user using OAuth.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await paymentsresellersubscription.partners.subscriptions.entitle(
    *     {
    *       // Required. The name of the subscription resource that is entitled to the current end user. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    *       name: 'partners/my-partner/subscriptions/my-subscription',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "subscription": {}
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
  def entitle(params: ParamsResourcePartnersSubscriptionsEntitle, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def entitle(
    params: ParamsResourcePartnersSubscriptionsEntitle,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def extend(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse] = js.native
  def extend(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse]
  ): Unit = js.native
  def extend(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse] = js.native
  def extend(params: ParamsResourcePartnersSubscriptionsExtend): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse] = js.native
  def extend(
    params: ParamsResourcePartnersSubscriptionsExtend,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse]
  ): Unit = js.native
  def extend(
    params: ParamsResourcePartnersSubscriptionsExtend,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse
    ]
  ): Unit = js.native
  def extend(params: ParamsResourcePartnersSubscriptionsExtend, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse] = js.native
  def extend(
    params: ParamsResourcePartnersSubscriptionsExtend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse]
  ): Unit = js.native
  /**
    * Used by partners to extend a subscription service for their customers on an ongoing basis for the subscription to remain active and renewable. It should be called directly by the partner using service accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await paymentsresellersubscription.partners.subscriptions.extend({
    *     // Required. The name of the subscription resource to be extended. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}".
    *     name: 'partners/my-partner/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "extension": {},
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cycleEndTime": "my_cycleEndTime",
    *   //   "freeTrialEndTime": "my_freeTrialEndTime",
    *   //   "renewalTime": "my_renewalTime"
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
  def extend(params: ParamsResourcePartnersSubscriptionsExtend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def extend(
    params: ParamsResourcePartnersSubscriptionsExtend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def get(params: ParamsResourcePartnersSubscriptionsGet): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def get(
    params: ParamsResourcePartnersSubscriptionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  def get(
    params: ParamsResourcePartnersSubscriptionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  def get(params: ParamsResourcePartnersSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def get(
    params: ParamsResourcePartnersSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  /**
    * Used by partners to get a subscription by id. It should be called directly by the partner using service accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await paymentsresellersubscription.partners.subscriptions.get({
    *     // Required. The name of the subscription resource to retrieve. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    *     name: 'partners/my-partner/subscriptions/my-subscription',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cancellationDetails": {},
    *   //   "createTime": "my_createTime",
    *   //   "cycleEndTime": "my_cycleEndTime",
    *   //   "endUserEntitled": false,
    *   //   "freeTrialEndTime": "my_freeTrialEndTime",
    *   //   "lineItems": [],
    *   //   "name": "my_name",
    *   //   "partnerUserToken": "my_partnerUserToken",
    *   //   "processingState": "my_processingState",
    *   //   "products": [],
    *   //   "promotionSpecs": [],
    *   //   "promotions": [],
    *   //   "redirectUri": "my_redirectUri",
    *   //   "renewalTime": "my_renewalTime",
    *   //   "serviceLocation": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "upgradeDowngradeDetails": {}
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
  def get(params: ParamsResourcePartnersSubscriptionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePartnersSubscriptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def provision(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def provision(callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]): Unit = js.native
  def provision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def provision(params: ParamsResourcePartnersSubscriptionsProvision): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def provision(
    params: ParamsResourcePartnersSubscriptionsProvision,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  def provision(
    params: ParamsResourcePartnersSubscriptionsProvision,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  def provision(params: ParamsResourcePartnersSubscriptionsProvision, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.native
  def provision(
    params: ParamsResourcePartnersSubscriptionsProvision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription]
  ): Unit = js.native
  /**
    * Used by partners to provision a subscription for their customers. This creates a subscription without associating it with the end user account. EntitleSubscription must be called separately using OAuth in order for the end user account to be associated with the subscription. It should be called directly by the partner using service accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await paymentsresellersubscription.partners.subscriptions.provision({
    *       // Required. The parent resource name, which is the identifier of the partner. It will have the format of "partners/{partner_id\}".
    *       parent: 'partners/my-partner',
    *       // Required. Identifies the subscription resource on the Partner side. The value is restricted to 63 ASCII characters at the maximum. If a subscription was previously created with the same subscription_id, we will directly return that one.
    *       subscriptionId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "cancellationDetails": {},
    *         //   "createTime": "my_createTime",
    *         //   "cycleEndTime": "my_cycleEndTime",
    *         //   "endUserEntitled": false,
    *         //   "freeTrialEndTime": "my_freeTrialEndTime",
    *         //   "lineItems": [],
    *         //   "name": "my_name",
    *         //   "partnerUserToken": "my_partnerUserToken",
    *         //   "processingState": "my_processingState",
    *         //   "products": [],
    *         //   "promotionSpecs": [],
    *         //   "promotions": [],
    *         //   "redirectUri": "my_redirectUri",
    *         //   "renewalTime": "my_renewalTime",
    *         //   "serviceLocation": {},
    *         //   "state": "my_state",
    *         //   "updateTime": "my_updateTime",
    *         //   "upgradeDowngradeDetails": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cancellationDetails": {},
    *   //   "createTime": "my_createTime",
    *   //   "cycleEndTime": "my_cycleEndTime",
    *   //   "endUserEntitled": false,
    *   //   "freeTrialEndTime": "my_freeTrialEndTime",
    *   //   "lineItems": [],
    *   //   "name": "my_name",
    *   //   "partnerUserToken": "my_partnerUserToken",
    *   //   "processingState": "my_processingState",
    *   //   "products": [],
    *   //   "promotionSpecs": [],
    *   //   "promotions": [],
    *   //   "redirectUri": "my_redirectUri",
    *   //   "renewalTime": "my_renewalTime",
    *   //   "serviceLocation": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "upgradeDowngradeDetails": {}
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
  def provision(params: ParamsResourcePartnersSubscriptionsProvision, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def provision(
    params: ParamsResourcePartnersSubscriptionsProvision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undoCancel(): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse] = js.native
  def undoCancel(
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse]
  ): Unit = js.native
  def undoCancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse] = js.native
  def undoCancel(params: ParamsResourcePartnersSubscriptionsUndocancel): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse] = js.native
  def undoCancel(
    params: ParamsResourcePartnersSubscriptionsUndocancel,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse]
  ): Unit = js.native
  def undoCancel(
    params: ParamsResourcePartnersSubscriptionsUndocancel,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse
    ]
  ): Unit = js.native
  def undoCancel(params: ParamsResourcePartnersSubscriptionsUndocancel, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse] = js.native
  def undoCancel(
    params: ParamsResourcePartnersSubscriptionsUndocancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse]
  ): Unit = js.native
  /**
    * Used by partners to revoke the pending cancellation of a subscription, which is currently in `STATE_CANCEL_AT_END_OF_CYCLE` state. If the subscription is already cancelled, the request will fail. It should be called directly by the partner using service accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/paymentsresellersubscription.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const paymentsresellersubscription = google.paymentsresellersubscription('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await paymentsresellersubscription.partners.subscriptions.undoCancel({
    *       // Required. The name of the subscription resource whose pending cancellation needs to be undone. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    *       name: 'partners/my-partner/subscriptions/my-subscription',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "subscription": {}
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
  def undoCancel(params: ParamsResourcePartnersSubscriptionsUndocancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undoCancel(
    params: ParamsResourcePartnersSubscriptionsUndocancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
