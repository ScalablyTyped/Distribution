package typings.googleapis.dfareportingV4Mod.dfareportingV4

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Campaigncreativeassociations")
@js.native
open class ResourceCampaigncreativeassociations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insert(): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(params: ParamsResourceCampaigncreativeassociationsInsert): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]
  ): Unit = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    options: BodyResponseCallback[Readable | SchemaCampaignCreativeAssociation],
    callback: BodyResponseCallback[Readable | SchemaCampaignCreativeAssociation]
  ): Unit = js.native
  def insert(params: ParamsResourceCampaigncreativeassociationsInsert, options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]
  ): Unit = js.native
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a default ad does not exist already.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaignCreativeAssociations.insert({
    *     // Campaign ID in this association.
    *     campaignId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "creativeId": "my_creativeId",
    *       //   "kind": "my_kind"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "creativeId": "my_creativeId",
    *   //   "kind": "my_kind"
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
  def insert(params: ParamsResourceCampaigncreativeassociationsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(params: ParamsResourceCampaigncreativeassociationsList): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    options: BodyResponseCallback[Readable | SchemaCampaignCreativeAssociationsListResponse],
    callback: BodyResponseCallback[Readable | SchemaCampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCampaigncreativeassociationsList, options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  /**
    * Retrieves the list of creative IDs associated with the specified campaign. This method supports paging.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dfareporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dfareporting = google.dfareporting('v4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/dfatrafficking'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dfareporting.campaignCreativeAssociations.list({
    *     // Campaign ID in this association.
    *     campaignId: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Value of the nextPageToken from the previous result page.
    *     pageToken: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *     // Order of sorted results.
    *     sortOrder: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "campaignCreativeAssociations": [],
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
  def list(params: ParamsResourceCampaigncreativeassociationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
