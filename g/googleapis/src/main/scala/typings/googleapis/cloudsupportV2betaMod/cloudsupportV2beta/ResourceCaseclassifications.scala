package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Resource$Caseclassifications")
@js.native
open class ResourceCaseclassifications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaSearchCaseClassificationsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchCaseClassificationsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchCaseClassificationsResponse] = js.native
  def search(params: ParamsResourceCaseclassificationsSearch): GaxiosPromise[SchemaSearchCaseClassificationsResponse] = js.native
  def search(
    params: ParamsResourceCaseclassificationsSearch,
    callback: BodyResponseCallback[SchemaSearchCaseClassificationsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceCaseclassificationsSearch,
    options: BodyResponseCallback[Readable | SchemaSearchCaseClassificationsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchCaseClassificationsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceCaseclassificationsSearch, options: MethodOptions): GaxiosPromise[SchemaSearchCaseClassificationsResponse] = js.native
  def search(
    params: ParamsResourceCaseclassificationsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchCaseClassificationsResponse]
  ): Unit = js.native
  /**
    * Retrieve valid classifications to be used when creating a support case. The classications are hierarchical, with each classification containing all levels of the hierarchy, separated by " \> ". For example "Technical Issue \> Compute \> Compute Engine".
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsupport.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsupport = google.cloudsupport('v2beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsupport.caseClassifications.search({
    *     // The maximum number of cases fetched with each request.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return. If unspecified, the first page is retrieved.
    *     pageToken: 'placeholder-value',
    *     // An expression written in the Cloud filter language. If non-empty, then only cases whose fields match the filter are returned. If empty, then no messages are filtered out.
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "caseClassifications": [],
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
  def search(params: ParamsResourceCaseclassificationsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceCaseclassificationsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
