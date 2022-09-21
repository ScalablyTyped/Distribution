package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Subscriptions")
@js.native
open class ResourceProjectsSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def acknowledge(): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def acknowledge(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(params: ParamsResourceProjectsSubscriptionsAcknowledge): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceProjectsSubscriptionsAcknowledge,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def acknowledge(
    params: ParamsResourceProjectsSubscriptionsAcknowledge,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def acknowledge(params: ParamsResourceProjectsSubscriptionsAcknowledge, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def acknowledge(
    params: ParamsResourceProjectsSubscriptionsAcknowledge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Acknowledges the messages associated with the `ack_ids` in the `AcknowledgeRequest`. The Pub/Sub system can remove the relevant messages from the subscription. Acknowledging a message whose ack deadline has expired may succeed, but such a message may be redelivered later. Acknowledging a message more than once will not result in an error.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.acknowledge({
    *     // Required. The subscription whose message is being acknowledged. Format is `projects/{project\}/subscriptions/{sub\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ackIds": []
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
  def acknowledge(params: ParamsResourceProjectsSubscriptionsAcknowledge, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def acknowledge(
    params: ParamsResourceProjectsSubscriptionsAcknowledge,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaSubscription] = js.native
  def create(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def create(params: ParamsResourceProjectsSubscriptionsCreate): GaxiosPromise[SchemaSubscription] = js.native
  def create(
    params: ParamsResourceProjectsSubscriptionsCreate,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsSubscriptionsCreate,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsSubscriptionsCreate, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def create(
    params: ParamsResourceProjectsSubscriptionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Creates a subscription to a given topic. See the [resource name rules] (https://cloud.google.com/pubsub/docs/admin#resource_names). If the subscription already exists, returns `ALREADY_EXISTS`. If the corresponding topic doesn't exist, returns `NOT_FOUND`. If the name is not provided in the request, the server will assign a random name for this subscription on the same project as the topic, conforming to the [resource name format] (https://cloud.google.com/pubsub/docs/admin#resource_names). The generated name is populated in the returned Subscription object. Note that for REST API requests, you must specify a name in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.create({
    *     // Required. The name of the subscription. It must have the format `"projects/{project\}/subscriptions/{subscription\}"`. `{subscription\}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    *     name: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ackDeadlineSeconds": 0,
    *       //   "bigqueryConfig": {},
    *       //   "deadLetterPolicy": {},
    *       //   "detached": false,
    *       //   "enableExactlyOnceDelivery": false,
    *       //   "enableMessageOrdering": false,
    *       //   "expirationPolicy": {},
    *       //   "filter": "my_filter",
    *       //   "labels": {},
    *       //   "messageRetentionDuration": "my_messageRetentionDuration",
    *       //   "name": "my_name",
    *       //   "pushConfig": {},
    *       //   "retainAckedMessages": false,
    *       //   "retryPolicy": {},
    *       //   "state": "my_state",
    *       //   "topic": "my_topic",
    *       //   "topicMessageRetentionDuration": "my_topicMessageRetentionDuration"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ackDeadlineSeconds": 0,
    *   //   "bigqueryConfig": {},
    *   //   "deadLetterPolicy": {},
    *   //   "detached": false,
    *   //   "enableExactlyOnceDelivery": false,
    *   //   "enableMessageOrdering": false,
    *   //   "expirationPolicy": {},
    *   //   "filter": "my_filter",
    *   //   "labels": {},
    *   //   "messageRetentionDuration": "my_messageRetentionDuration",
    *   //   "name": "my_name",
    *   //   "pushConfig": {},
    *   //   "retainAckedMessages": false,
    *   //   "retryPolicy": {},
    *   //   "state": "my_state",
    *   //   "topic": "my_topic",
    *   //   "topicMessageRetentionDuration": "my_topicMessageRetentionDuration"
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
  def create(params: ParamsResourceProjectsSubscriptionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsSubscriptionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSubscriptionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsSubscriptionsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsSubscriptionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsSubscriptionsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsSubscriptionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing subscription. All messages retained in the subscription are immediately dropped. Calls to `Pull` after deletion will return `NOT_FOUND`. After a subscription is deleted, a new one may be created with the same name, but the new one has no association with the old subscription or its topic unless the same topic is specified.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.delete({
    *     // Required. The subscription to delete. Format is `projects/{project\}/subscriptions/{sub\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
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
  def delete(params: ParamsResourceProjectsSubscriptionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsSubscriptionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def detach(): GaxiosPromise[SchemaDetachSubscriptionResponse] = js.native
  def detach(callback: BodyResponseCallback[SchemaDetachSubscriptionResponse]): Unit = js.native
  def detach(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDetachSubscriptionResponse] = js.native
  def detach(params: ParamsResourceProjectsSubscriptionsDetach): GaxiosPromise[SchemaDetachSubscriptionResponse] = js.native
  def detach(
    params: ParamsResourceProjectsSubscriptionsDetach,
    callback: BodyResponseCallback[SchemaDetachSubscriptionResponse]
  ): Unit = js.native
  def detach(
    params: ParamsResourceProjectsSubscriptionsDetach,
    options: BodyResponseCallback[Readable | SchemaDetachSubscriptionResponse],
    callback: BodyResponseCallback[Readable | SchemaDetachSubscriptionResponse]
  ): Unit = js.native
  def detach(params: ParamsResourceProjectsSubscriptionsDetach, options: MethodOptions): GaxiosPromise[SchemaDetachSubscriptionResponse] = js.native
  def detach(
    params: ParamsResourceProjectsSubscriptionsDetach,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDetachSubscriptionResponse]
  ): Unit = js.native
  /**
    * Detaches a subscription from this topic. All messages retained in the subscription are dropped. Subsequent `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will stop.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.detach({
    *     // Required. The subscription to detach. Format is `projects/{project\}/subscriptions/{subscription\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
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
  def detach(params: ParamsResourceProjectsSubscriptionsDetach, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def detach(
    params: ParamsResourceProjectsSubscriptionsDetach,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaSubscription] = js.native
  def get(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(params: ParamsResourceProjectsSubscriptionsGet): GaxiosPromise[SchemaSubscription] = js.native
  def get(params: ParamsResourceProjectsSubscriptionsGet, callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def get(
    params: ParamsResourceProjectsSubscriptionsGet,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsSubscriptionsGet, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def get(
    params: ParamsResourceProjectsSubscriptionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Gets the configuration details of a subscription.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.get({
    *     // Required. The name of the subscription to get. Format is `projects/{project\}/subscriptions/{sub\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ackDeadlineSeconds": 0,
    *   //   "bigqueryConfig": {},
    *   //   "deadLetterPolicy": {},
    *   //   "detached": false,
    *   //   "enableExactlyOnceDelivery": false,
    *   //   "enableMessageOrdering": false,
    *   //   "expirationPolicy": {},
    *   //   "filter": "my_filter",
    *   //   "labels": {},
    *   //   "messageRetentionDuration": "my_messageRetentionDuration",
    *   //   "name": "my_name",
    *   //   "pushConfig": {},
    *   //   "retainAckedMessages": false,
    *   //   "retryPolicy": {},
    *   //   "state": "my_state",
    *   //   "topic": "my_topic",
    *   //   "topicMessageRetentionDuration": "my_topicMessageRetentionDuration"
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
  def get(params: ParamsResourceProjectsSubscriptionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsSubscriptionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsSubscriptionsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsSubscriptionsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsSubscriptionsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsSubscriptionsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsSubscriptionsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/subscriptions/my-subscription',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(params: ParamsResourceProjectsSubscriptionsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsSubscriptionsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSubscriptionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(params: ParamsResourceProjectsSubscriptionsList): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsSubscriptionsList,
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsSubscriptionsList,
    options: BodyResponseCallback[Readable | SchemaListSubscriptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaListSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSubscriptionsResponse]
  ): Unit = js.native
  /**
    * Lists matching subscriptions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.list({
    *     // Maximum number of subscriptions to return.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListSubscriptionsResponse`; indicates that this is a continuation of a prior `ListSubscriptions` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the project in which to list subscriptions. Format is `projects/{project-id\}`.
    *     project: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def list(params: ParamsResourceProjectsSubscriptionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsSubscriptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyAckDeadline(): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def modifyAckDeadline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(params: ParamsResourceProjectsSubscriptionsModifyackdeadline): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(
    params: ParamsResourceProjectsSubscriptionsModifyackdeadline,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def modifyAckDeadline(
    params: ParamsResourceProjectsSubscriptionsModifyackdeadline,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def modifyAckDeadline(params: ParamsResourceProjectsSubscriptionsModifyackdeadline, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def modifyAckDeadline(
    params: ParamsResourceProjectsSubscriptionsModifyackdeadline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Modifies the ack deadline for a specific message. This method is useful to indicate that more time is needed to process a message by the subscriber, or to make the message available for redelivery if the processing was interrupted. Note that this does not modify the subscription-level `ackDeadlineSeconds` used for subsequent messages.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.modifyAckDeadline({
    *     // Required. The name of the subscription. Format is `projects/{project\}/subscriptions/{sub\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ackDeadlineSeconds": 0,
    *       //   "ackIds": []
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
  def modifyAckDeadline(params: ParamsResourceProjectsSubscriptionsModifyackdeadline, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyAckDeadline(
    params: ParamsResourceProjectsSubscriptionsModifyackdeadline,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modifyPushConfig(): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def modifyPushConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(params: ParamsResourceProjectsSubscriptionsModifypushconfig): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(
    params: ParamsResourceProjectsSubscriptionsModifypushconfig,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def modifyPushConfig(
    params: ParamsResourceProjectsSubscriptionsModifypushconfig,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def modifyPushConfig(params: ParamsResourceProjectsSubscriptionsModifypushconfig, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def modifyPushConfig(
    params: ParamsResourceProjectsSubscriptionsModifypushconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Modifies the `PushConfig` for a specified subscription. This may be used to change a push subscription to a pull one (signified by an empty `PushConfig`) or vice versa, or change the endpoint URL and other attributes of a push subscription. Messages will accumulate for delivery continuously through the call regardless of changes to the `PushConfig`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.modifyPushConfig({
    *     // Required. The name of the subscription. Format is `projects/{project\}/subscriptions/{sub\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "pushConfig": {}
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
  def modifyPushConfig(params: ParamsResourceProjectsSubscriptionsModifypushconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modifyPushConfig(
    params: ParamsResourceProjectsSubscriptionsModifypushconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaSubscription] = js.native
  def patch(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def patch(params: ParamsResourceProjectsSubscriptionsPatch): GaxiosPromise[SchemaSubscription] = js.native
  def patch(
    params: ParamsResourceProjectsSubscriptionsPatch,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsSubscriptionsPatch,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsSubscriptionsPatch, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def patch(
    params: ParamsResourceProjectsSubscriptionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Updates an existing subscription. Note that certain properties of a subscription, such as its topic, are not modifiable.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.patch({
    *     // Required. The name of the subscription. It must have the format `"projects/{project\}/subscriptions/{subscription\}"`. `{subscription\}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    *     name: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "subscription": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ackDeadlineSeconds": 0,
    *   //   "bigqueryConfig": {},
    *   //   "deadLetterPolicy": {},
    *   //   "detached": false,
    *   //   "enableExactlyOnceDelivery": false,
    *   //   "enableMessageOrdering": false,
    *   //   "expirationPolicy": {},
    *   //   "filter": "my_filter",
    *   //   "labels": {},
    *   //   "messageRetentionDuration": "my_messageRetentionDuration",
    *   //   "name": "my_name",
    *   //   "pushConfig": {},
    *   //   "retainAckedMessages": false,
    *   //   "retryPolicy": {},
    *   //   "state": "my_state",
    *   //   "topic": "my_topic",
    *   //   "topicMessageRetentionDuration": "my_topicMessageRetentionDuration"
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
  def patch(params: ParamsResourceProjectsSubscriptionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsSubscriptionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pull(): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(callback: BodyResponseCallback[SchemaPullResponse]): Unit = js.native
  def pull(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(params: ParamsResourceProjectsSubscriptionsPull): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(
    params: ParamsResourceProjectsSubscriptionsPull,
    callback: BodyResponseCallback[SchemaPullResponse]
  ): Unit = js.native
  def pull(
    params: ParamsResourceProjectsSubscriptionsPull,
    options: BodyResponseCallback[Readable | SchemaPullResponse],
    callback: BodyResponseCallback[Readable | SchemaPullResponse]
  ): Unit = js.native
  def pull(params: ParamsResourceProjectsSubscriptionsPull, options: MethodOptions): GaxiosPromise[SchemaPullResponse] = js.native
  def pull(
    params: ParamsResourceProjectsSubscriptionsPull,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPullResponse]
  ): Unit = js.native
  /**
    * Pulls messages from the server.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.pull({
    *     // Required. The subscription from which messages should be pulled. Format is `projects/{project\}/subscriptions/{sub\}`.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "maxMessages": 0,
    *       //   "returnImmediately": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "receivedMessages": []
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
  def pull(params: ParamsResourceProjectsSubscriptionsPull, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pull(
    params: ParamsResourceProjectsSubscriptionsPull,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def seek(): GaxiosPromise[SchemaSeekResponse] = js.native
  def seek(callback: BodyResponseCallback[SchemaSeekResponse]): Unit = js.native
  def seek(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSeekResponse] = js.native
  def seek(params: ParamsResourceProjectsSubscriptionsSeek): GaxiosPromise[SchemaSeekResponse] = js.native
  def seek(
    params: ParamsResourceProjectsSubscriptionsSeek,
    callback: BodyResponseCallback[SchemaSeekResponse]
  ): Unit = js.native
  def seek(
    params: ParamsResourceProjectsSubscriptionsSeek,
    options: BodyResponseCallback[Readable | SchemaSeekResponse],
    callback: BodyResponseCallback[Readable | SchemaSeekResponse]
  ): Unit = js.native
  def seek(params: ParamsResourceProjectsSubscriptionsSeek, options: MethodOptions): GaxiosPromise[SchemaSeekResponse] = js.native
  def seek(
    params: ParamsResourceProjectsSubscriptionsSeek,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSeekResponse]
  ): Unit = js.native
  /**
    * Seeks an existing subscription to a point in time or to a given snapshot, whichever is provided in the request. Snapshots are used in [Seek] (https://cloud.google.com/pubsub/docs/replay-overview) operations, which allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment state of messages in an existing subscription to the state captured by a snapshot. Note that both the subscription and the snapshot must be on the same topic.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.seek({
    *     // Required. The subscription to affect.
    *     subscription: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "snapshot": "my_snapshot",
    *       //   "time": "my_time"
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
  def seek(params: ParamsResourceProjectsSubscriptionsSeek, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def seek(
    params: ParamsResourceProjectsSubscriptionsSeek,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsSubscriptionsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsSubscriptionsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsSubscriptionsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsSubscriptionsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsSubscriptionsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(params: ParamsResourceProjectsSubscriptionsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsSubscriptionsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsSubscriptionsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSubscriptionsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSubscriptionsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsSubscriptionsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSubscriptionsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/pubsub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const pubsub = google.pubsub('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/pubsub',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await pubsub.projects.subscriptions.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/subscriptions/my-subscription',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceProjectsSubscriptionsTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsSubscriptionsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
