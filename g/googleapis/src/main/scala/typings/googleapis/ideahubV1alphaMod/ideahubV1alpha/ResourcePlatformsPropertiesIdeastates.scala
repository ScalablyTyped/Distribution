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

@JSImport("googleapis/build/src/apis/ideahub/v1alpha", "ideahub_v1alpha.Resource$Platforms$Properties$Ideastates")
@js.native
open class ResourcePlatformsPropertiesIdeastates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaIdeaState] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaIdeaState]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaIdeaState] = js.native
  def patch(params: ParamsResourcePlatformsPropertiesIdeastatesPatch): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaIdeaState] = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesIdeastatesPatch,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaIdeaState]
  ): Unit = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesIdeastatesPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaIdeaState],
    callback: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaIdeaState]
  ): Unit = js.native
  def patch(params: ParamsResourcePlatformsPropertiesIdeastatesPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaIdeaState] = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesIdeastatesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaIdeaState]
  ): Unit = js.native
  /**
    * Update an idea state resource.
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
    *   const res = await ideahub.platforms.properties.ideaStates.patch({
    *     // Unique identifier for the idea state. Format: platforms/{platform\}/properties/{property\}/ideaStates/{idea_state\}
    *     name: 'platforms/my-platform/properties/my-propertie/ideaStates/my-ideaState',
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
  def patch(params: ParamsResourcePlatformsPropertiesIdeastatesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePlatformsPropertiesIdeastatesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
