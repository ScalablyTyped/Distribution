package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Applications")
@js.native
open class ResourceApplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listHidden(): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(callback: BodyResponseCallback[SchemaHiddenPlayerList]): Unit = js.native
  def listHidden(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(params: ParamsResourceApplicationsListhidden): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    callback: BodyResponseCallback[SchemaHiddenPlayerList]
  ): Unit = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    options: BodyResponseCallback[Readable | SchemaHiddenPlayerList],
    callback: BodyResponseCallback[Readable | SchemaHiddenPlayerList]
  ): Unit = js.native
  def listHidden(params: ParamsResourceApplicationsListhidden, options: MethodOptions): GaxiosPromise[SchemaHiddenPlayerList] = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHiddenPlayerList]
  ): Unit = js.native
  /**
    * Get the list of players hidden from the given application. This method is only available to user accounts for your developer console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesManagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesManagement = google.gamesManagement('v1management');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/games'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesManagement.applications.listHidden({
    *     // The application ID from the Google Play developer console.
    *     applicationId: 'placeholder-value',
    *     // The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified `maxResults`.
    *     maxResults: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def listHidden(params: ParamsResourceApplicationsListhidden, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listHidden(
    params: ParamsResourceApplicationsListhidden,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
