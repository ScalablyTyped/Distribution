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

@JSImport("googleapis/build/src/apis/ideahub/v1alpha", "ideahub_v1alpha.Resource$Ideas")
@js.native
open class ResourceIdeas protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse] = js.native
  def list(params: ParamsResourceIdeasList): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse] = js.native
  def list(
    params: ParamsResourceIdeasList,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceIdeasList,
    options: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaListIdeasResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaListIdeasResponse]
  ): Unit = js.native
  def list(params: ParamsResourceIdeasList, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse] = js.native
  def list(
    params: ParamsResourceIdeasList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaListIdeasResponse]
  ): Unit = js.native
  /**
    * List ideas for a given Creator and filter and sort options.
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
    *   const res = await ideahub.ideas.list({
    *     // Allows filtering. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions are implicitly combined, as if the `AND` operator was always used. The `OR` operator is currently unsupported. * Supported functions: - `saved(bool)`: If set to true, fetches only saved ideas. If set to false, fetches all except saved ideas. Can't be simultaneously used with `dismissed(bool)`. - `dismissed(bool)`: If set to true, fetches only dismissed ideas. Can't be simultaneously used with `saved(bool)`. The `false` value is currently unsupported. Examples: * `saved(true)` * `saved(false)` * `dismissed(true)` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Order semantics described below.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of ideas per page. If unspecified, at most 10 ideas will be returned. The maximum value is 2000; values above 2000 will be coerced to 2000.
    *     pageSize: 'placeholder-value',
    *     // Used to fetch next page.
    *     pageToken: 'placeholder-value',
    *     // If defined, specifies the creator for which to filter by. Format: publishers/{publisher\}/properties/{property\}
    *     parent: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "ideas": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceIdeasList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceIdeasList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
