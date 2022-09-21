package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pubsub/v1beta2", "pubsub_v1beta2.Resource$Projects$Topics$Subscriptions")
@js.native
open class ResourceProjectsTopicsSubscriptions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: BodyResponseCallback[Readable | SchemaListTopicSubscriptionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList, options: MethodOptions): GaxiosPromise[SchemaListTopicSubscriptionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTopicSubscriptionsResponse]
  ): Unit = js.native
  /**
    * Lists the name of the subscriptions for this topic.
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
    * const pubsub = google.pubsub('v1beta2');
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
    *   const res = await pubsub.projects.topics.subscriptions.list({
    *     // Maximum number of subscription names to return.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListTopicSubscriptionsResponse`; indicates that this is a continuation of a prior `ListTopicSubscriptions` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // The name of the topic that subscriptions are attached to.
    *     topic: 'projects/my-project/topics/my-topic',
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
  def list(params: ParamsResourceProjectsTopicsSubscriptionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTopicsSubscriptionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
