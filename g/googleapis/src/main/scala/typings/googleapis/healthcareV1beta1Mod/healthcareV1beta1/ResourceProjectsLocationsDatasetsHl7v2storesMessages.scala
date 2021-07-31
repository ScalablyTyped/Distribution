package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Hl7v2stores$Messages")
@js.native
class ResourceProjectsLocationsDatasetsHl7v2storesMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.create
    * @desc Creates a message and sends a notification to the Cloud Pub/Sub
    * topic. If configured, the MLLP adapter listens to messages created by
    * this method and sends those back to the hospital. A successful response
    * indicates the message has been persisted to storage and a Cloud Pub/Sub
    * notification has been sent. Sending to the hospital by the MLLP adapter
    * happens asynchronously.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the dataset this message belongs to.
    * @param {().CreateMessageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.delete
    * @desc Deletes an HL7v2 message.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 message to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.get
    * @desc Gets an HL7v2 message.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 message to retrieve.
    * @param {string=} params.view Specifies which parts of the Message resource should be returned in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.ingest
    * @desc Ingests a new HL7v2 message from the hospital and sends a
    * notification to the Cloud Pub/Sub topic. Return is an HL7v2 ACK message
    * if the message was successfully stored. Otherwise an error is returned.
    * If an identical HL7v2 message is created twice only one resource is
    * created on the server and no error is reported.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.ingest
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the HL7v2 store this message belongs to.
    * @param {().IngestMessageRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaIngestMessageResponse],
    callback: BodyResponseCallback[SchemaIngestMessageResponse]
  ): Unit = js.native
  def ingest(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest, options: MethodOptions): GaxiosPromise[SchemaIngestMessageResponse] = js.native
  def ingest(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesIngest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIngestMessageResponse]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.list
    * @desc Lists all the messages in the given HL7v2 store with support for
    * filtering.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts messages returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings  Fields/functions available for filtering are:  *  `message_type`, from the MSH-9 segment; for example `NOT message_type = "ADT"` *  `send_date` or `sendDate`, the YYYY-MM-DD date the message was sent in the dataset's time_zone, from the MSH-7 segment; for example `send_date < "2017-01-02"` *  `send_time`, the timestamp of when the message was sent, using the RFC3339 time format for comparisons, from the MSH-7 segment; for example `send_time < "2017-01-02T00:00:00-05:00"` *  `send_facility`, the care center that the message came from, from the MSH-4 segment; for example `send_facility = "ABC"` *  `HL7RegExp(expr)`, which does regular expression matching of `expr` against the message payload using re2 (http://code.google.com/p/re2/) syntax; for example `HL7RegExp("^.*\|.*\|EMERG")` *  `PatientId(value, type)`, which matches if the message lists a patient having an ID of the given value and type in the PID-2, PID-3, or PID-4 segments; for example `PatientId("123456", "MRN")` *  `labels.x`, a string value of the label with key `x` as set using the Message.labels map, for example `labels."priority"="high"`. The operator `:*` can be used to assert the existence of a label, for example `labels."priority":*`.  Limitations on conjunctions:  *  Negation on the patient ID function or the labels field is not supported, for example these queries are invalid: `NOT PatientId("123456", "MRN")`, `NOT labels."tag1":*`, `NOT labels."tag2"="val2"`. *  Conjunction of multiple patient ID functions is not supported, for example this query is invalid: `PatientId("123456", "MRN") AND PatientId("456789", "MRN")`. *  Conjunction of multiple labels fields is also not supported, for example this query is invalid: `labels."tag1":* AND labels."tag2"="val2"`. *  Conjunction of one patient ID function, one labels field and conditions on other fields is supported, for example this query is valid: `PatientId("123456", "MRN") AND labels."tag1":* AND message_type = "ADT"`.
    * @param {string=} params.orderBy Orders messages returned by the specified order_by clause. Syntax: https://cloud.google.com/apis/design/design_patterns#sorting_order  Fields available for ordering are:  *  `send_time`
    * @param {integer=} params.pageSize Limit on the number of messages to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the HL7v2 store to retrieve messages from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaListMessagesResponse],
    callback: BodyResponseCallback[SchemaListMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList, options: MethodOptions): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMessagesResponse]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.messages.patch
    * @desc Update the message.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.messages.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask Only the `labels` field is allowed to be updated. The labels in the request will be merged with the existing set of labels. Existing labels with the same keys will be updated.
    * @param {().Message} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
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
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesMessagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
}
