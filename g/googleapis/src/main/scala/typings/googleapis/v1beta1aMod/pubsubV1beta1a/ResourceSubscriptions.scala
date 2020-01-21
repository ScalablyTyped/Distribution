package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1beta1a", "pubsub_v1beta1a.Resource$Subscriptions")
@js.native
class ResourceSubscriptions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * pubsub.subscriptions.acknowledge
    * @desc Acknowledges a particular received message: the Pub/Sub system can
    * remove the given message from the subscription. Acknowledging a message
    * whose Ack deadline has expired may succeed, but the message could have
    * been already redelivered. Acknowledging a message more than once will not
    * result in an error. This is only used for messages received via pull.
    * @alias pubsub.subscriptions.acknowledge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AcknowledgeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def acknowledge(): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def acknowledge(params: ParamsResourceSubscriptionsAcknowledge): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(params: ParamsResourceSubscriptionsAcknowledge, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def acknowledge(
    params: ParamsResourceSubscriptionsAcknowledge,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceSubscriptionsAcknowledge, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceSubscriptionsAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.create
    * @desc Creates a subscription on a given topic for a given subscriber. If
    * the subscription already exists, returns ALREADY_EXISTS. If the
    * corresponding topic doesn't exist, returns NOT_FOUND.  If the name is not
    * provided in the request, the server will assign a random name for this
    * subscription on the same project as the topic.
    * @alias pubsub.subscriptions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Subscription} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaSubscription] = js.native
  def create(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def create(params: ParamsResourceSubscriptionsCreate): GaxiosPromise[SchemaSubscription] = js.native
  def create(params: ParamsResourceSubscriptionsCreate, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def create(
    params: ParamsResourceSubscriptionsCreate,
    options: BodyResponseCallback[SchemaSubscription],
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def create(params: ParamsResourceSubscriptionsCreate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def create(
    params: ParamsResourceSubscriptionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.delete
    * @desc Deletes an existing subscription. All pending messages in the
    * subscription are immediately dropped. Calls to Pull after deletion will
    * return NOT_FOUND.
    * @alias pubsub.subscriptions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The subscription to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceSubscriptionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSubscriptionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSubscriptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.get
    * @desc Gets the configuration details of a subscription.
    * @alias pubsub.subscriptions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.subscription The name of the subscription to get.
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
    * pubsub.subscriptions.list
    * @desc Lists matching subscriptions.
    * @alias pubsub.subscriptions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of subscriptions to return.
    * @param {string=} params.pageToken The value obtained in the last <code>ListSubscriptionsResponse</code> for continuation.
    * @param {string=} params.query A valid label query expression.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSubscriptionsResponse]): Unit = js.native
  def list(params: ParamsResourceSubscriptionsList): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: BodyResponseCallback[SchemaListSubscriptionsResponse],
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.modifyAckDeadline
    * @desc Modifies the Ack deadline for a message received from a pull
    * request.
    * @alias pubsub.subscriptions.modifyAckDeadline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ModifyAckDeadlineRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyAckDeadline(): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def modifyAckDeadline(params: ParamsResourceSubscriptionsModifyackdeadline): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(params: ParamsResourceSubscriptionsModifyackdeadline, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def modifyAckDeadline(
    params: ParamsResourceSubscriptionsModifyackdeadline,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def modifyAckDeadline(params: ParamsResourceSubscriptionsModifyackdeadline, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(
    params: ParamsResourceSubscriptionsModifyackdeadline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.modifyPushConfig
    * @desc Modifies the <code>PushConfig</code> for a specified subscription.
    * This method can be used to suspend the flow of messages to an endpoint by
    * clearing the <code>PushConfig</code> field in the request. Messages will
    * be accumulated for delivery even if no push configuration is defined or
    * while the configuration is modified.
    * @alias pubsub.subscriptions.modifyPushConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ModifyPushConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def modifyPushConfig(): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def modifyPushConfig(params: ParamsResourceSubscriptionsModifypushconfig): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(params: ParamsResourceSubscriptionsModifypushconfig, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def modifyPushConfig(
    params: ParamsResourceSubscriptionsModifypushconfig,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def modifyPushConfig(params: ParamsResourceSubscriptionsModifypushconfig, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(
    params: ParamsResourceSubscriptionsModifypushconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.pull
    * @desc Pulls a single message from the server. If return_immediately is
    * true, and no messages are available in the subscription, this method
    * returns FAILED_PRECONDITION. The system is free to return an UNAVAILABLE
    * error if no messages are available in a reasonable amount of time (to
    * reduce system load).
    * @alias pubsub.subscriptions.pull
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PullRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pull(): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(callback: BodyResponseCallback[SchemaPullResponse]): Unit = js.native
  def pull(params: ParamsResourceSubscriptionsPull): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(params: ParamsResourceSubscriptionsPull, callback: BodyResponseCallback[SchemaPullResponse]): Unit = js.native
  def pull(
    params: ParamsResourceSubscriptionsPull,
    options: BodyResponseCallback[SchemaPullResponse],
    callback: BodyResponseCallback[SchemaPullResponse]
  ): Unit = js.native
  def pull(params: ParamsResourceSubscriptionsPull, options: MethodOptions): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(
    params: ParamsResourceSubscriptionsPull,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPullResponse]
  ): Unit = js.native
  /**
    * pubsub.subscriptions.pullBatch
    * @desc Pulls messages from the server. Returns an empty list if there are
    * no messages available in the backlog. The system is free to return
    * UNAVAILABLE if there are too many pull requests outstanding for the given
    * subscription.
    * @alias pubsub.subscriptions.pullBatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PullBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pullBatch(): GaxiosPromise[SchemaPullBatchResponse] = js.native
  def pullBatch(callback: BodyResponseCallback[SchemaPullBatchResponse]): Unit = js.native
  def pullBatch(params: ParamsResourceSubscriptionsPullbatch): GaxiosPromise[SchemaPullBatchResponse] = js.native
  def pullBatch(
    params: ParamsResourceSubscriptionsPullbatch,
    callback: BodyResponseCallback[SchemaPullBatchResponse]
  ): Unit = js.native
  def pullBatch(
    params: ParamsResourceSubscriptionsPullbatch,
    options: BodyResponseCallback[SchemaPullBatchResponse],
    callback: BodyResponseCallback[SchemaPullBatchResponse]
  ): Unit = js.native
  def pullBatch(params: ParamsResourceSubscriptionsPullbatch, options: MethodOptions): GaxiosPromise[SchemaPullBatchResponse] = js.native
  def pullBatch(
    params: ParamsResourceSubscriptionsPullbatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPullBatchResponse]
  ): Unit = js.native
}

