package typings.googleapis.webriskV1Mod.webriskV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webrisk/v1", "webrisk_v1.Resource$Threatlists")
@js.native
open class ResourceThreatlists protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def computeDiff(): GaxiosPromise[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse] = js.native
  def computeDiff(callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse]): Unit = js.native
  def computeDiff(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse] = js.native
  def computeDiff(params: ParamsResourceThreatlistsComputediff): GaxiosPromise[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse] = js.native
  def computeDiff(
    params: ParamsResourceThreatlistsComputediff,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse]
  ): Unit = js.native
  def computeDiff(
    params: ParamsResourceThreatlistsComputediff,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse]
  ): Unit = js.native
  def computeDiff(params: ParamsResourceThreatlistsComputediff, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse] = js.native
  def computeDiff(
    params: ParamsResourceThreatlistsComputediff,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudWebriskV1ComputeThreatListDiffResponse]
  ): Unit = js.native
  /**
    * Gets the most recent threat list diffs. These diffs should be applied to a local database of hashes to keep it up-to-date. If the local database is empty or excessively out-of-date, a complete snapshot of the database will be returned. This Method only updates a single ThreatList at a time. To update multiple ThreatList databases, this method needs to be called once for each list.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/webrisk.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const webrisk = google.webrisk('v1');
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
    *   const res = await webrisk.threatLists.computeDiff({
    *     // Sets the maximum number of entries that the client is willing to have in the local database. This should be a power of 2 between 2**10 and 2**20. If zero, no database size limit is set.
    *     'constraints.maxDatabaseEntries': 'placeholder-value',
    *     // The maximum size in number of entries. The diff will not contain more entries than this value. This should be a power of 2 between 2**10 and 2**20. If zero, no diff size limit is set.
    *     'constraints.maxDiffEntries': 'placeholder-value',
    *     // The compression types supported by the client.
    *     'constraints.supportedCompressions': 'placeholder-value',
    *     // Required. The threat list to update. Only a single ThreatType should be specified per request. If you want to handle multiple ThreatTypes, you must make one request per ThreatType.
    *     threatType: 'placeholder-value',
    *     // The current version token of the client for the requested list (the client version that was received from the last successful diff). If the client does not have a version token (this is the first time calling ComputeThreatListDiff), this may be left empty and a full database snapshot will be returned.
    *     versionToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additions": {},
    *   //   "checksum": {},
    *   //   "newVersionToken": "my_newVersionToken",
    *   //   "recommendedNextDiff": "my_recommendedNextDiff",
    *   //   "removals": {},
    *   //   "responseType": "my_responseType"
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
  def computeDiff(params: ParamsResourceThreatlistsComputediff, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def computeDiff(
    params: ParamsResourceThreatlistsComputediff,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
