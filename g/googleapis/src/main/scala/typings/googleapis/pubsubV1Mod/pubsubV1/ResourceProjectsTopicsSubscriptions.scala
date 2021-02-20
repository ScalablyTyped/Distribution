package typings.googleapis.pubsubV1Mod.pubsubV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Topics$Subscriptions")
@js.native
class ResourceProjectsTopicsSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * pubsub.projects.topics.subscriptions.list
    * @desc Lists the names of the subscriptions on this topic.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of the topic that subscriptions are attached to.
    *     // Format is `projects/{project}/topics/{topic}`.
    *     topic: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var subscriptionsPage = response['subscriptions'];
    *     if (!subscriptionsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < subscriptionsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `subscriptionsPage`: console.log(JSON.stringify(subscriptionsPage[i],
    * null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       pubsub.projects.topics.subscriptions.list(request, handlePage);
    *     }
    *   };
    *
    *   pubsub.projects.topics.subscriptions.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.subscriptions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of subscription names to return.
    * @param {string=} params.pageToken The value returned by the last `ListTopicSubscriptionsResponse`; indicates that this is a continuation of a prior `ListTopicSubscriptions` call, and that the system should return the next page of data.
    * @param {string} params.topic The name of the topic that subscriptions are attached to. Format is `projects/{project}/topics/{topic}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: BodyResponseCallback[SchemaListTopicSubscriptionsResponse],
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
}
