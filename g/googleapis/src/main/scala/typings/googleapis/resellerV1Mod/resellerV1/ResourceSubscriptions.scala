package typings.googleapis.resellerV1Mod.resellerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Subscriptions")
@js.native
class ResourceSubscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reseller.subscriptions.activate
    * @desc Activates a subscription previously suspended by the reseller
    * @alias reseller.subscriptions.activate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def activate(): GaxiosPromise[SchemaSubscription] = js.native
  def activate(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def activate(params: ParamsResourceSubscriptionsActivate): GaxiosPromise[SchemaSubscription] = js.native
  def activate(params: ParamsResourceSubscriptionsActivate, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def activate(
    params: ParamsResourceSubscriptionsActivate,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def activate(params: ParamsResourceSubscriptionsActivate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def activate(
    params: ParamsResourceSubscriptionsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.changePlan
    * @desc Update a subscription plan. Use this method to update a plan for a
    * 30-day trial or a flexible plan subscription to an annual commitment plan
    * with monthly or yearly payments.
    * @alias reseller.subscriptions.changePlan
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {().ChangePlanRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def changePlan(): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changePlan(params: ParamsResourceSubscriptionsChangeplan): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(params: ParamsResourceSubscriptionsChangeplan, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changePlan(
    params: ParamsResourceSubscriptionsChangeplan,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def changePlan(params: ParamsResourceSubscriptionsChangeplan, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changePlan(
    params: ParamsResourceSubscriptionsChangeplan,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.changeRenewalSettings
    * @desc Update a user license's renewal settings. This is applicable for
    * accounts with annual commitment plans only.
    * @alias reseller.subscriptions.changeRenewalSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {().RenewalSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def changeRenewalSettings(): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changeRenewalSettings(params: ParamsResourceSubscriptionsChangerenewalsettings): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def changeRenewalSettings(params: ParamsResourceSubscriptionsChangerenewalsettings, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changeRenewalSettings(
    params: ParamsResourceSubscriptionsChangerenewalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.changeSeats
    * @desc Update a subscription's user license settings.
    * @alias reseller.subscriptions.changeSeats
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {().Seats} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def changeSeats(): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def changeSeats(
    params: ParamsResourceSubscriptionsChangeseats,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def changeSeats(params: ParamsResourceSubscriptionsChangeseats, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def changeSeats(
    params: ParamsResourceSubscriptionsChangeseats,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.delete
    * @desc Cancel or transfer a subscription to direct.
    * @alias reseller.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.deletionType The deletionType query string enables the cancellation, downgrade, or suspension of a subscription.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceSubscriptionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * reseller.subscriptions.get
    * @desc Get a specific subscription.
    * @alias reseller.subscriptions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSubscription] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(params: ParamsResourceSubscriptionsGet): GaxiosPromise[SchemaSubscription] = js.native
  def get(params: ParamsResourceSubscriptionsGet, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(
    params: ParamsResourceSubscriptionsGet,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def get(params: ParamsResourceSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(
    params: ParamsResourceSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.insert
    * @desc Create or transfer a subscription.
    * @alias reseller.subscriptions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerAuthToken The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaSubscription] = js.native
  def insert(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def insert(params: ParamsResourceSubscriptionsInsert): GaxiosPromise[SchemaSubscription] = js.native
  def insert(params: ParamsResourceSubscriptionsInsert, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def insert(params: ParamsResourceSubscriptionsInsert, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def insert(
    params: ParamsResourceSubscriptionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.list
    * @desc List of subscriptions managed by the reseller. The list can be all
    * subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    * @alias reseller.subscriptions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customerAuthToken The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    * @param {string=} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string=} params.customerNamePrefix When retrieving all of your subscriptions and filtering for specific customers, you can enter a prefix for a customer name. Using an example customer group that includes exam.com, example20.com and example.com:   - exa -- Returns all customer names that start with 'exa' which could include exam.com, example20.com, and example.com. A name prefix is similar to using a regular expression's asterisk, exa*.  - example -- Returns example20.com and example.com.
    * @param {integer=} params.maxResults When retrieving a large list, the maxResults is the maximum number of results per page. The nextPageToken value takes you to the next page. The default is 20.
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(callback: BodyResponseCallback[SchemaSubscriptions]): Unit = js.native
  def list(params: ParamsResourceSubscriptionsList): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(params: ParamsResourceSubscriptionsList, callback: BodyResponseCallback[SchemaSubscriptions]): Unit = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: BodyResponseCallback[SchemaSubscriptions],
    callback: BodyResponseCallback[SchemaSubscriptions]
  ): Unit = js.native
  def list(params: ParamsResourceSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaSubscriptions] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscriptions]
  ): Unit = js.native
  /**
    * reseller.subscriptions.startPaidService
    * @desc Immediately move a 30-day free trial subscription to a paid service
    * subscription.
    * @alias reseller.subscriptions.startPaidService
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startPaidService(): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def startPaidService(params: ParamsResourceSubscriptionsStartpaidservice): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def startPaidService(params: ParamsResourceSubscriptionsStartpaidservice, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def startPaidService(
    params: ParamsResourceSubscriptionsStartpaidservice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * reseller.subscriptions.suspend
    * @desc Suspends an active subscription.
    * @alias reseller.subscriptions.suspend
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {string} params.subscriptionId This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all reseller subscriptions method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def suspend(): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def suspend(params: ParamsResourceSubscriptionsSuspend): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(params: ParamsResourceSubscriptionsSuspend, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def suspend(
    params: ParamsResourceSubscriptionsSuspend,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def suspend(params: ParamsResourceSubscriptionsSuspend, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def suspend(
    params: ParamsResourceSubscriptionsSuspend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
}

