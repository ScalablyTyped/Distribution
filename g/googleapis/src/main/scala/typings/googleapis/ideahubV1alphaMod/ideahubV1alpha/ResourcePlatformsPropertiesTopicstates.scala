package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ideahub/v1alpha", "ideahub_v1alpha.Resource$Platforms$Properties$Topicstates")
@js.native
open class ResourcePlatformsPropertiesTopicstates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaTopicState] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaTopicState]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaTopicState] = js.native
  def patch(params: ParamsResourcePlatformsPropertiesTopicstatesPatch): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaTopicState] = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesTopicstatesPatch,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaTopicState]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesTopicstatesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaTopicState],
    callback: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaTopicState]
  ): Unit = js.native
  def patch(params: ParamsResourcePlatformsPropertiesTopicstatesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaTopicState] = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesTopicstatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaTopicState]
  ): Unit = js.native
  /**
    * Update a topic state resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ideahub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ideahub = google.ideahub('v1alpha');
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
    *   const res = await ideahub.platforms.properties.topicStates.patch({
    *     // Unique identifier for the topic state. Format: platforms/{platform\}/properties/{property\}/topicStates/{topic_state\}
    *     name: 'platforms/my-platform/properties/my-propertie/topicStates/my-topicState',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dismissed": false,
    *       //   "name": "my_name",
    *       //   "saved": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dismissed": false,
    *   //   "name": "my_name",
    *   //   "saved": false
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
  def patch(params: ParamsResourcePlatformsPropertiesTopicstatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesTopicstatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
