package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ideahub/v1beta", "ideahub_v1beta.Resource$Platforms$Properties$Ideaactivities")
@js.native
open class ResourcePlatformsPropertiesIdeaactivities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleSearchIdeahubV1betaIdeaActivity] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1betaIdeaActivity]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1betaIdeaActivity] = js.native
  def create(params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate): GaxiosPromise[SchemaGoogleSearchIdeahubV1betaIdeaActivity] = js.native
  def create(
    params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1betaIdeaActivity]
  ): Unit = js.native
  def create(
    params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1betaIdeaActivity],
    callback: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1betaIdeaActivity]
  ): Unit = js.native
  def create(params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1betaIdeaActivity] = js.native
  def create(
    params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1betaIdeaActivity]
  ): Unit = js.native
  /**
    * Creates an idea activity entry.
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
    * const ideahub = google.ideahub('v1beta');
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
    *   const res = await ideahub.platforms.properties.ideaActivities.create({
    *     // Required. The parent resource where this idea activity will be created. Format: platforms/{platform\}/property/{property\}
    *     parent: 'platforms/my-platform/properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ideas": [],
    *       //   "name": "my_name",
    *       //   "topics": [],
    *       //   "type": "my_type",
    *       //   "uri": "my_uri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ideas": [],
    *   //   "name": "my_name",
    *   //   "topics": [],
    *   //   "type": "my_type",
    *   //   "uri": "my_uri"
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
  def create(params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePlatformsPropertiesIdeaactivitiesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
