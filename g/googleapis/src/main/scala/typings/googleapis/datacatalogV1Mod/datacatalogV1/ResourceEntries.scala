package typings.googleapis.datacatalogV1Mod.datacatalogV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1", "datacatalog_v1.Resource$Entries")
@js.native
open class ResourceEntries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def lookup(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def lookup(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]): Unit = js.native
  def lookup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def lookup(params: ParamsResourceEntriesLookup): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  def lookup(params: ParamsResourceEntriesLookup, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1Entry] = js.native
  def lookup(
    params: ParamsResourceEntriesLookup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1Entry]
  ): Unit = js.native
  /**
    * Gets an entry by its target resource name. The resource name comes from the source Google Cloud Platform service.
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
    * const datacatalog = google.datacatalog('v1');
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
    *     // Fully qualified name (FQN) of the resource. FQNs take two forms: * For non-regionalized resources: `{SYSTEM\}:{PROJECT\}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS\}` * For regionalized resources: `{SYSTEM\}:{PROJECT\}.{LOCATION_ID\}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS\}` Example for a DPMS table: `dataproc_metastore:{PROJECT_ID\}.{LOCATION_ID\}.{INSTANCE_ID\}.{DATABASE_ID\}.{TABLE_ID\}`
    *     fullyQualifiedName: 'placeholder-value',
    *     // The full name of the Google Cloud Platform resource the Data Catalog entry represents. For more information, see [Full Resource Name] (https://cloud.google.com/apis/design/resource_names#full_resource_name). Full names are case-sensitive. For example: * `//bigquery.googleapis.com/projects/{PROJECT_ID\}/datasets/{DATASET_ID\}/tables/{TABLE_ID\}` * `//pubsub.googleapis.com/projects/{PROJECT_ID\}/topics/{TOPIC_ID\}`
    *     linkedResource: 'placeholder-value',
    *     // The SQL name of the entry. SQL names are case-sensitive. Examples: * `pubsub.topic.{PROJECT_ID\}.{TOPIC_ID\}` * `pubsub.topic.{PROJECT_ID\}.`\``{TOPIC.ID.SEPARATED.WITH.DOTS\}`\` * `bigquery.table.{PROJECT_ID\}.{DATASET_ID\}.{TABLE_ID\}` * `bigquery.dataset.{PROJECT_ID\}.{DATASET_ID\}` * `datacatalog.entry.{PROJECT_ID\}.{LOCATION_ID\}.{ENTRY_GROUP_ID\}.{ENTRY_ID\}` Identifiers (`*_ID`) should comply with the [Lexical structure in Standard SQL] (https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical).
    *     sqlResource: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bigqueryDateShardedSpec": {},
    *   //   "bigqueryTableSpec": {},
    *   //   "businessContext": {},
    *   //   "dataSource": {},
    *   //   "dataSourceConnectionSpec": {},
    *   //   "databaseTableSpec": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "filesetSpec": {},
    *   //   "fullyQualifiedName": "my_fullyQualifiedName",
    *   //   "gcsFilesetSpec": {},
    *   //   "integratedSystem": "my_integratedSystem",
    *   //   "labels": {},
    *   //   "linkedResource": "my_linkedResource",
    *   //   "name": "my_name",
    *   //   "personalDetails": {},
    *   //   "routineSpec": {},
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
