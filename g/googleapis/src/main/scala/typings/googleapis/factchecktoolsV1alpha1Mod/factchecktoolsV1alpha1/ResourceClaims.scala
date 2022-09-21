package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/factchecktools/v1alpha1", "factchecktools_v1alpha1.Resource$Claims")
@js.native
open class ResourceClaims protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(params: ParamsResourceClaimsSearch): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    options: BodyResponseCallback[
      Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse
    ]
  ): Unit = js.native
  def search(params: ParamsResourceClaimsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  ): Unit = js.native
  /**
    * Search through fact-checked claims.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/factchecktools.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const factchecktools = google.factchecktools('v1alpha1');
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
    *   const res = await factchecktools.claims.search({
    *     // The BCP-47 language code, such as "en-US" or "sr-Latn". Can be used to restrict results by language, though we do not currently consider the region.
    *     languageCode: 'placeholder-value',
    *     // The maximum age of the returned search results, in days. Age is determined by either claim date or review date, whichever is newer.
    *     maxAgeDays: 'placeholder-value',
    *     // An integer that specifies the current offset (that is, starting result location) in search results. This field is only considered if `page_token` is unset. For example, 0 means to return results starting from the first matching result, and 10 means to return from the 11th result.
    *     offset: 'placeholder-value',
    *     // The pagination size. We will return up to that many results. Defaults to 10 if not set.
    *     pageSize: 'placeholder-value',
    *     // The pagination token. You may provide the `next_page_token` returned from a previous List request, if any, in order to get the next page. All other fields must have the same values as in the previous request.
    *     pageToken: 'placeholder-value',
    *     // Textual query string. Required unless `review_publisher_site_filter` is specified.
    *     query: 'placeholder-value',
    *     // The review publisher site to filter results by, e.g. nytimes.com.
    *     reviewPublisherSiteFilter: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "claims": [],
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
  def search(params: ParamsResourceClaimsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceClaimsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
