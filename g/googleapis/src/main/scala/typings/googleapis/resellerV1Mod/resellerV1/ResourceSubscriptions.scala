package typings.googleapis.resellerV1Mod.resellerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Subscriptions")
@js.native
open class ResourceSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaSubscription] = js.native
  def activate(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def activate(params: ParamsResourceSubscriptionsActivate): GaxiosPromise[SchemaSubscription] = js.native
  def activate(params: ParamsResourceSubscriptionsActivate, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def activate(
    params: ParamsResourceSubscriptionsActivate,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def activate(params: ParamsResourceSubscriptionsActivate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def activate(
    params: ParamsResourceSubscriptionsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Activates a subscription previously suspended by the reseller. If you did not suspend the customer subscription and it is suspended for any other reason, such as for abuse or a pending ToS acceptance, this call will not reactivate the customer subscription.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.activate({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def activate(params: ParamsResourceSubscriptionsActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceSubscriptionsActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def changePlan(): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changePlan(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(params: ParamsResourceSubscriptionsChangeplan): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(params: ParamsResourceSubscriptionsChangeplan, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changePlan(
    params: ParamsResourceSubscriptionsChangeplan,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def changePlan(params: ParamsResourceSubscriptionsChangeplan, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(
    params: ParamsResourceSubscriptionsChangeplan,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Updates a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with monthly or yearly payments. How a plan is updated differs depending on the plan and the products. For more information, see the description in [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#update_subscription_plan).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.changePlan({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dealCode": "my_dealCode",
    *       //   "kind": "my_kind",
    *       //   "planName": "my_planName",
    *       //   "purchaseOrderId": "my_purchaseOrderId",
    *       //   "seats": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def changePlan(params: ParamsResourceSubscriptionsChangeplan, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def changePlan(
    params: ParamsResourceSubscriptionsChangeplan,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def changeRenewalSettings(): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changeRenewalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(params: ParamsResourceSubscriptionsChangerenewalsettings): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def changeRenewalSettings(params: ParamsResourceSubscriptionsChangerenewalsettings, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Updates a user license's renewal settings. This is applicable for accounts with annual commitment plans only. For more information, see the description in [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#update_renewal).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.changeRenewalSettings({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "renewalType": "my_renewalType"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def changeRenewalSettings(params: ParamsResourceSubscriptionsChangerenewalsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def changeSeats(): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changeSeats(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changeSeats(
    params: ParamsResourceSubscriptionsChangeseats,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(
    params: ParamsResourceSubscriptionsChangeseats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Updates a subscription's user license settings. For more information about updating an annual commitment plan or a flexible plan subscription’s licenses, see [Manage Subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#update_subscription_seat).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.changeSeats({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "licensedNumberOfSeats": 0,
    *       //   "maximumNumberOfSeats": 0,
    *       //   "numberOfSeats": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def changeSeats(
    params: ParamsResourceSubscriptionsChangeseats,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSubscriptionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Cancels, suspends, or transfers a subscription to direct.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.delete({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // The `deletionType` query string enables the cancellation, downgrade, or suspension of a subscription.
    *     deletionType: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
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
  def delete(params: ParamsResourceSubscriptionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSubscription] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(params: ParamsResourceSubscriptionsGet): GaxiosPromise[SchemaSubscription] = js.native
  def get(params: ParamsResourceSubscriptionsGet, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(
    params: ParamsResourceSubscriptionsGet,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def get(params: ParamsResourceSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(
    params: ParamsResourceSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Gets a specific subscription. The `subscriptionId` can be found using the [Retrieve all reseller subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#get_all_subscriptions) method. For more information about retrieving a specific subscription, see the information descrived in [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#get_subscription).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/apps.order',
    *       'https://www.googleapis.com/auth/apps.order.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.get({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def get(params: ParamsResourceSubscriptionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSubscriptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaSubscription] = js.native
  def insert(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def insert(params: ParamsResourceSubscriptionsInsert): GaxiosPromise[SchemaSubscription] = js.native
  def insert(params: ParamsResourceSubscriptionsInsert, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def insert(params: ParamsResourceSubscriptionsInsert, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Creates or transfer a subscription. Create a subscription for a customer's account that you ordered using the [Order a new customer account](/admin-sdk/reseller/v1/reference/customers/insert.html) method. For more information about creating a subscription for different payment plans, see [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#create_subscription).\ If you did not order the customer's account using the customer insert method, use the customer's `customerAuthToken` when creating a subscription for that customer. If transferring a G Suite subscription with an associated Google Drive or Google Vault subscription, use the [batch operation](/admin-sdk/reseller/v1/how-tos/batch.html) to transfer all of these subscriptions. For more information, see how to [transfer subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#transfer_a_subscription).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.insert({
    *     // The `customerAuthToken` query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    *     customerAuthToken: 'placeholder-value',
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billingMethod": "my_billingMethod",
    *       //   "creationTime": "my_creationTime",
    *       //   "customerDomain": "my_customerDomain",
    *       //   "customerId": "my_customerId",
    *       //   "dealCode": "my_dealCode",
    *       //   "kind": "my_kind",
    *       //   "plan": {},
    *       //   "purchaseOrderId": "my_purchaseOrderId",
    *       //   "renewalSettings": {},
    *       //   "resourceUiUrl": "my_resourceUiUrl",
    *       //   "seats": {},
    *       //   "skuId": "my_skuId",
    *       //   "skuName": "my_skuName",
    *       //   "status": "my_status",
    *       //   "subscriptionId": "my_subscriptionId",
    *       //   "suspensionReasons": [],
    *       //   "transferInfo": {},
    *       //   "trialSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def insert(params: ParamsResourceSubscriptionsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(callback: BodyResponseCallback[SchemaSubscriptions]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(params: ParamsResourceSubscriptionsList): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(params: ParamsResourceSubscriptionsList, callback: BodyResponseCallback[SchemaSubscriptions]): Unit = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: BodyResponseCallback[Readable | SchemaSubscriptions],
    callback: BodyResponseCallback[Readable | SchemaSubscriptions]
  ): Unit = js.native
  def list(params: ParamsResourceSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptions]
  ): Unit = js.native
  /**
    * Lists of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's transferable subscriptions. Optionally, this method can filter the response by a `customerNamePrefix`. For more information, see [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/apps.order',
    *       'https://www.googleapis.com/auth/apps.order.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.list({
    *     // The `customerAuthToken` query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    *     customerAuthToken: 'placeholder-value',
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // When retrieving all of your subscriptions and filtering for specific customers, you can enter a prefix for a customer name. Using an example customer group that includes `exam.com`, `example20.com` and `example.com`: - `exa` -- Returns all customer names that start with 'exa' which could include `exam.com`, `example20.com`, and `example.com`. A name prefix is similar to using a regular expression's asterisk, exa*. - `example` -- Returns `example20.com` and `example.com`.
    *     customerNamePrefix: 'placeholder-value',
    *     // When retrieving a large list, the `maxResults` is the maximum number of results per page. The `nextPageToken` value takes you to the next page. The default is 20.
    *     maxResults: 'placeholder-value',
    *     // Token to specify next page in the list
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "subscriptions": []
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
  def list(params: ParamsResourceSubscriptionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startPaidService(): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def startPaidService(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(params: ParamsResourceSubscriptionsStartpaidservice): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def startPaidService(params: ParamsResourceSubscriptionsStartpaidservice, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Immediately move a 30-day free trial subscription to a paid service subscription. This method is only applicable if a payment plan has already been set up for the 30-day trial subscription. For more information, see [manage subscriptions](/admin-sdk/reseller/v1/how-tos/manage_subscriptions#paid_service).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.startPaidService({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def startPaidService(params: ParamsResourceSubscriptionsStartpaidservice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suspend(): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def suspend(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(params: ParamsResourceSubscriptionsSuspend): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(params: ParamsResourceSubscriptionsSuspend, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def suspend(
    params: ParamsResourceSubscriptionsSuspend,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def suspend(params: ParamsResourceSubscriptionsSuspend, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(
    params: ParamsResourceSubscriptionsSuspend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Suspends an active subscription. You can use this method to suspend a paid subscription that is currently in the `ACTIVE` state. * For `FLEXIBLE` subscriptions, billing is paused. * For `ANNUAL_MONTHLY_PAY` or `ANNUAL_YEARLY_PAY` subscriptions: * Suspending the subscription does not change the renewal date that was originally committed to. * A suspended subscription does not renew. If you activate the subscription after the original renewal date, a new annual subscription will be created, starting on the day of activation. We strongly encourage you to suspend subscriptions only for short periods of time as suspensions over 60 days may result in the subscription being cancelled.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/reseller.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const reseller = google.reseller('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await reseller.subscriptions.suspend({
    *     // This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    *     customerId: 'placeholder-value',
    *     // This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    *     subscriptionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingMethod": "my_billingMethod",
    *   //   "creationTime": "my_creationTime",
    *   //   "customerDomain": "my_customerDomain",
    *   //   "customerId": "my_customerId",
    *   //   "dealCode": "my_dealCode",
    *   //   "kind": "my_kind",
    *   //   "plan": {},
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "renewalSettings": {},
    *   //   "resourceUiUrl": "my_resourceUiUrl",
    *   //   "seats": {},
    *   //   "skuId": "my_skuId",
    *   //   "skuName": "my_skuName",
    *   //   "status": "my_status",
    *   //   "subscriptionId": "my_subscriptionId",
    *   //   "suspensionReasons": [],
    *   //   "transferInfo": {},
    *   //   "trialSettings": {}
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
  def suspend(params: ParamsResourceSubscriptionsSuspend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def suspend(
    params: ParamsResourceSubscriptionsSuspend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
