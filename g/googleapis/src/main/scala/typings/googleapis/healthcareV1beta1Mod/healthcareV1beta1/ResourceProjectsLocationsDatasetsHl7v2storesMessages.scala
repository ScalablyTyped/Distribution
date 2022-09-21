package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Hl7v2stores$Messages")
@js.native
open class ResourceProjectsLocationsDatasetsHl7v2storesMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchGet(): GaxiosPromise[SchemaBatchGetMessagesResponse] = js.native
  def batchGet(callback: BodyResponseCallback[SchemaBatchGetMessagesResponse]): Unit = js.native
  def batchGet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBatchGetMessagesResponse] = js.native
  def batchGet(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget): GaxiosPromise[SchemaBatchGetMessagesResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget,
    callback: BodyResponseCallback[SchemaBatchGetMessagesResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget,
    options: BodyResponseCallback[Readable | SchemaBatchGetMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaBatchGetMessagesResponse]
  ): Unit = js.native
  def batchGet(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget, options: MethodOptions): GaxiosPromise[SchemaBatchGetMessagesResponse] = js.native
  def batchGet(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBatchGetMessagesResponse]
  ): Unit = js.native
  /**
    * Gets multiple messages in the given HL7v2 store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.batchGet({
    *       // The resource id of the HL7v2 messages to retrieve in the format: `{message_id\}`, where the full resource name is `{parent\}/messages/{message_id\}` A maximum of 100 messages can be retrieved in a batch. All 'ids' have to be under parent.
    *       ids: 'placeholder-value',
    *       // Name of the HL7v2 store to retrieve messages from, in the format: `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/hl7v2Stores/{hl7v2_store_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store',
    *       // Specifies the parts of the Messages resource to return in the response. When unspecified, equivalent to BASIC.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "messages": []
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
  def batchGet(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def batchGet(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesBatchget,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaMessage] = js.native
  def create(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate): GaxiosPromise[SchemaMessage] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.create({
    *       // The name of the dataset this message belongs to.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "message": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "data": "my_data",
    *   //   "labels": {},
    *   //   "messageType": "my_messageType",
    *   //   "name": "my_name",
    *   //   "parsedData": {},
    *   //   "patientIds": [],
    *   //   "schematizedData": {},
    *   //   "sendFacility": "my_sendFacility",
    *   //   "sendTime": "my_sendTime"
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
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an HL7v2 message.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.delete({
    *       // The resource name of the HL7v2 message to delete.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store/messages/my-message',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMessage] = js.native
  def get(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet): GaxiosPromise[SchemaMessage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Gets an HL7v2 message.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.get({
    *       // The resource name of the HL7v2 message to retrieve.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store/messages/my-message',
    *       // Specifies which parts of the Message resource to return in the response. When unspecified, equivalent to FULL.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "data": "my_data",
    *   //   "labels": {},
    *   //   "messageType": "my_messageType",
    *   //   "name": "my_name",
    *   //   "parsedData": {},
    *   //   "patientIds": [],
    *   //   "schematizedData": {},
    *   //   "sendFacility": "my_sendFacility",
    *   //   "sendTime": "my_sendTime"
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
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def ingest(): GaxiosPromise[SchemaIngestMessageResponse] = js.native
  def ingest(callback: BodyResponseCallback[SchemaIngestMessageResponse]): Unit = js.native
  def ingest(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIngestMessageResponse] = js.native
  def ingest(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest): GaxiosPromise[SchemaIngestMessageResponse] = js.native
  def ingest(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest,
    callback: BodyResponseCallback[SchemaIngestMessageResponse]
  ): Unit = js.native
  def ingest(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest,
    options: BodyResponseCallback[Readable | SchemaIngestMessageResponse],
    callback: BodyResponseCallback[Readable | SchemaIngestMessageResponse]
  ): Unit = js.native
  def ingest(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest, options: MethodOptions): GaxiosPromise[SchemaIngestMessageResponse] = js.native
  def ingest(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIngestMessageResponse]
  ): Unit = js.native
  /**
    * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received. If the method is successful, it generates a response containing an HL7v2 acknowledgment (`ACK`) message. If the method encounters an error, it returns a negative acknowledgment (`NACK`) message. This behavior is suitable for replying to HL7v2 interface systems that expect these acknowledgments.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.ingest({
    *       // The name of the HL7v2 store this message belongs to.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "message": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hl7Ack": "my_hl7Ack",
    *   //   "message": {}
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
  def ingest(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def ingest(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMessagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList,
    callback: BodyResponseCallback[SchemaListMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList,
    options: BodyResponseCallback[Readable | SchemaListMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList, options: MethodOptions): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMessagesResponse]
  ): Unit = js.native
  /**
    * Lists all the messages in the given HL7v2 store with support for filtering. Note: HL7v2 messages are indexed asynchronously, so there might be a slight delay between the time a message is created and when it can be found through a filter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.list({
    *       // Restricts messages returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: * `message_type`, from the MSH-9.1 field. For example, `NOT message_type = "ADT"`. * `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone, from the MSH-7 segment. For example, `send_date < "2017-01-02"`. * `send_time`, the timestamp when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment. For example, `send_time < "2017-01-02T00:00:00-05:00"`. * `create_time`, the timestamp when the message was created in the HL7v2 store. Use the RFC3339 time format for comparisons. For example, `create_time < "2017-01-02T00:00:00-05:00"`. * `send_facility`, the care center that the message came from, from the MSH-4 segment. For example, `send_facility = "ABC"`. * `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments. For example, `PatientId("123456", "MRN")`. * `labels.x`, a string value of the label with key `x` as set using the Message.labels map. For example, `labels."priority"="high"`. The operator `:*` can be used to assert the existence of a label. For example, `labels."priority":*`.
    *       filter: 'placeholder-value',
    *       // Orders messages returned by the specified order_by clause. Syntax: https://cloud.google.com/apis/design/design_patterns#sorting_order Fields available for ordering are: * `send_time`
    *       orderBy: 'placeholder-value',
    *       // Limit on the number of messages to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from the previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // Name of the HL7v2 store to retrieve messages from.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store',
    *       // Specifies the parts of the Message to return in the response. When unspecified, equivalent to BASIC. Setting this to anything other than BASIC with a `page_size` larger than the default can generate a large response, which impacts the performance of this method.
    *       view: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hl7V2Messages": [],
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
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaMessage] = js.native
  def patch(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch): GaxiosPromise[SchemaMessage] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Update the message. The contents of the message in Message.data and data extracted from the contents such as Message.create_time can't be altered. Only the Message.labels field is allowed to be updated. The labels in the request are merged with the existing set of labels. Existing labels with the same keys are updated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res =
    *     await healthcare.projects.locations.datasets.hl7V2Stores.messages.patch({
    *       // Resource name of the Message, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/hl7V2Stores/{hl7_v2_store_id\}/messages/{message_id\}`. Assigned by the server.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/hl7V2Stores/my-hl7V2Store/messages/my-message',
    *       // The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "data": "my_data",
    *         //   "labels": {},
    *         //   "messageType": "my_messageType",
    *         //   "name": "my_name",
    *         //   "parsedData": {},
    *         //   "patientIds": [],
    *         //   "schematizedData": {},
    *         //   "sendFacility": "my_sendFacility",
    *         //   "sendTime": "my_sendTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "data": "my_data",
    *   //   "labels": {},
    *   //   "messageType": "my_messageType",
    *   //   "name": "my_name",
    *   //   "parsedData": {},
    *   //   "patientIds": [],
    *   //   "schematizedData": {},
    *   //   "sendFacility": "my_sendFacility",
    *   //   "sendTime": "my_sendTime"
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
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
