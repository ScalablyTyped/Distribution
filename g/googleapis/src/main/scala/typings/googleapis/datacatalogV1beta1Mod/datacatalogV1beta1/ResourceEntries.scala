package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Resource$Entries")
@js.native
open class ResourceEntries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def lookup(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def lookup(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]): Unit = js.native
  def lookup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def lookup(params: ParamsResourceEntriesLookup): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  def lookup(params: ParamsResourceEntriesLookup, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1Entry]
  ): Unit = js.native
  /**
    * Get an entry by target resource name. This method allows clients to use the resource name from the source Google Cloud Platform service to get the Data Catalog Entry.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.entries.lookup({
    *     // The full name of the Google Cloud Platform resource the Data Catalog entry represents. See: https://cloud.google.com/apis/design/resource_names#full_resource_name. Full names are case-sensitive. Examples: * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId * //pubsub.googleapis.com/projects/projectId/topics/topicId
    *     linkedResource: 'placeholder-value',
    *     // The SQL name of the entry. SQL names are case-sensitive. Examples: * `pubsub.project_id.topic_id` * ``pubsub.project_id.`topic.id.with.dots` `` * `bigquery.table.project_id.dataset_id.table_id` * `bigquery.dataset.project_id.dataset_id` * `datacatalog.entry.project_id.location_id.entry_group_id.entry_id` `*_id`s should satisfy the standard SQL rules for identifiers. https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
    *     sqlResource: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDateShardedSpec": {},
    *   //   "bigqueryTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "schema": {},
    *   //   "sourceSystemTimestamps": {},
    *   //   "type": "my_type",
    *   //   "usageSignal": {},
    *   //   "userSpecifiedSystem": "my_userSpecifiedSystem",
    *   //   "userSpecifiedType": "my_userSpecifiedType"
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
  def lookup(params: ParamsResourceEntriesLookup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
