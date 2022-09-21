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

@JSImport("googleapis/build/src/apis/cloudsupport/v2beta", "cloudsupport_v2beta.Resource$Cases")
@js.native
open class ResourceCases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var attachments: ResourceCasesAttachments = js.native
  
  def close(): GaxiosPromise[SchemaCase] = js.native
  def close(callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def close(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def close(params: ParamsResourceCasesClose): GaxiosPromise[SchemaCase] = js.native
  def close(params: ParamsResourceCasesClose, callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def close(
    params: ParamsResourceCasesClose,
    options: BodyResponseCallback[Readable | SchemaCase],
    callback: BodyResponseCallback[Readable | SchemaCase]
  ): Unit = js.native
  def close(params: ParamsResourceCasesClose, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def close(
    params: ParamsResourceCasesClose,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCase]
  ): Unit = js.native
  /**
    * Close the specified case.
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
    *   const res = await cloudsupport.cases.close({
    *     // Required. The fully qualified name of the case resource to be closed.
    *     name: '[^/]+/[^/]+/cases/my-case',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "classification": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "escalated": false,
    *   //   "name": "my_name",
    *   //   "priority": "my_priority",
    *   //   "severity": "my_severity",
    *   //   "state": "my_state",
    *   //   "subscriberEmailAddresses": [],
    *   //   "testCase": false,
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def close(params: ParamsResourceCasesClose, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def close(
    params: ParamsResourceCasesClose,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var comments: ResourceCasesComments = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaCase] = js.native
  def create(callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def create(params: ParamsResourceCasesCreate): GaxiosPromise[SchemaCase] = js.native
  def create(params: ParamsResourceCasesCreate, callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def create(
    params: ParamsResourceCasesCreate,
    options: BodyResponseCallback[Readable | SchemaCase],
    callback: BodyResponseCallback[Readable | SchemaCase]
  ): Unit = js.native
  def create(params: ParamsResourceCasesCreate, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def create(
    params: ParamsResourceCasesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCase]
  ): Unit = js.native
  /**
    * Create a new case and associate it with the given Cloud resource.
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
    *   const res = await cloudsupport.cases.create({
    *     // Required. The name of the Cloud resource under which the case should be created.
    *     parent: '[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "classification": {},
    *       //   "createTime": "my_createTime",
    *       //   "creator": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "escalated": false,
    *       //   "name": "my_name",
    *       //   "priority": "my_priority",
    *       //   "severity": "my_severity",
    *       //   "state": "my_state",
    *       //   "subscriberEmailAddresses": [],
    *       //   "testCase": false,
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "classification": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "escalated": false,
    *   //   "name": "my_name",
    *   //   "priority": "my_priority",
    *   //   "severity": "my_severity",
    *   //   "state": "my_state",
    *   //   "subscriberEmailAddresses": [],
    *   //   "testCase": false,
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceCasesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceCasesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def escalate(): GaxiosPromise[SchemaCase] = js.native
  def escalate(callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def escalate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def escalate(params: ParamsResourceCasesEscalate): GaxiosPromise[SchemaCase] = js.native
  def escalate(params: ParamsResourceCasesEscalate, callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def escalate(
    params: ParamsResourceCasesEscalate,
    options: BodyResponseCallback[Readable | SchemaCase],
    callback: BodyResponseCallback[Readable | SchemaCase]
  ): Unit = js.native
  def escalate(params: ParamsResourceCasesEscalate, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def escalate(
    params: ParamsResourceCasesEscalate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCase]
  ): Unit = js.native
  /**
    * Escalate a case. Escalating a case will initiate the Cloud Support escalation management process. This operation is only available to certain Customer Care tiers. Go to https://cloud.google.com/support and look for 'Technical support escalations' in the feature list to find out which tiers are able to perform escalations.
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
    *   const res = await cloudsupport.cases.escalate({
    *     // Required. The fully qualified name of the Case resource to be escalated.
    *     name: '[^/]+/[^/]+/cases/my-case',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "escalation": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "classification": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "escalated": false,
    *   //   "name": "my_name",
    *   //   "priority": "my_priority",
    *   //   "severity": "my_severity",
    *   //   "state": "my_state",
    *   //   "subscriberEmailAddresses": [],
    *   //   "testCase": false,
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def escalate(params: ParamsResourceCasesEscalate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def escalate(
    params: ParamsResourceCasesEscalate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCase] = js.native
  def get(callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def get(params: ParamsResourceCasesGet): GaxiosPromise[SchemaCase] = js.native
  def get(params: ParamsResourceCasesGet, callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def get(
    params: ParamsResourceCasesGet,
    options: BodyResponseCallback[Readable | SchemaCase],
    callback: BodyResponseCallback[Readable | SchemaCase]
  ): Unit = js.native
  def get(params: ParamsResourceCasesGet, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def get(params: ParamsResourceCasesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  /**
    * Retrieve the specified case.
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
    *   const res = await cloudsupport.cases.get({
    *     // Required. The fully qualified name of a case to be retrieved.
    *     name: '[^/]+/[^/]+/cases/my-case',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "classification": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "escalated": false,
    *   //   "name": "my_name",
    *   //   "priority": "my_priority",
    *   //   "severity": "my_severity",
    *   //   "state": "my_state",
    *   //   "subscriberEmailAddresses": [],
    *   //   "testCase": false,
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceCasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListCasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListCasesResponse] = js.native
  def list(params: ParamsResourceCasesList): GaxiosPromise[SchemaListCasesResponse] = js.native
  def list(params: ParamsResourceCasesList, callback: BodyResponseCallback[SchemaListCasesResponse]): Unit = js.native
  def list(
    params: ParamsResourceCasesList,
    options: BodyResponseCallback[Readable | SchemaListCasesResponse],
    callback: BodyResponseCallback[Readable | SchemaListCasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCasesList, options: MethodOptions): GaxiosPromise[SchemaListCasesResponse] = js.native
  def list(
    params: ParamsResourceCasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCasesResponse]
  ): Unit = js.native
  /**
    * Retrieve all cases under the specified parent. Note: Listing cases under an Organization returns only the cases directly parented by that organization. To retrieve all cases under an organization, including cases parented by projects under that organization, use `cases.search`.
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
    *   const res = await cloudsupport.cases.list({
    *     // An expression written in filter language. If non-empty, the query returns the cases that match the filter. Else, the query doesn't filter the cases. Filter expressions use the following fields with the operators equals (`=`) and `AND`: - `state`: The accepted values are `OPEN` or `CLOSED`. - `priority`: The accepted values are `P0`, `P1`, `P2`, `P3`, or `P4`. You can specify multiple values for priority using the `OR` operator. For example, `priority=P1 OR priority=P2`. - [DEPRECATED] `severity`: The accepted values are `S0`, `S1`, `S2`, `S3`, or `S4`. - `creator.email`: The email address of the case creator. Examples: - `state=CLOSED` - `state=OPEN AND creator.email="tester@example.com"` - `state=OPEN AND (priority=P0 OR priority=P1)`
    *     filter: 'placeholder-value',
    *     // The maximum number of cases fetched with each request. Defaults to 10.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return. If unspecified, the first page is retrieved.
    *     pageToken: 'placeholder-value',
    *     // Required. The fully qualified name of parent resource to list cases under.
    *     parent: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cases": [],
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
  def list(params: ParamsResourceCasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCase] = js.native
  def patch(callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def patch(params: ParamsResourceCasesPatch): GaxiosPromise[SchemaCase] = js.native
  def patch(params: ParamsResourceCasesPatch, callback: BodyResponseCallback[SchemaCase]): Unit = js.native
  def patch(
    params: ParamsResourceCasesPatch,
    options: BodyResponseCallback[Readable | SchemaCase],
    callback: BodyResponseCallback[Readable | SchemaCase]
  ): Unit = js.native
  def patch(params: ParamsResourceCasesPatch, options: MethodOptions): GaxiosPromise[SchemaCase] = js.native
  def patch(
    params: ParamsResourceCasesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCase]
  ): Unit = js.native
  /**
    * Update the specified case. Only a subset of fields (display_name, description, time_zone, subscriber_email_addresses, related_resources, severity, priority, primary_contact, and labels) can be updated.
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
    *   const res = await cloudsupport.cases.patch({
    *     // The resource name for the case.
    *     name: '[^/]+/[^/]+/cases/my-case',
    *     // A field that represents attributes of a case object that should be updated as part of this request. Supported values are severity, display_name, and subscriber_email_addresses. If no fields are specified, all supported fields will be updated. WARNING: If you do not provide a field mask then you may accidentally clear some fields. For example, if you leave field mask empty and do not provide a value for subscriber_email_addresses then subscriber_email_addresses will be updated to empty.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "classification": {},
    *       //   "createTime": "my_createTime",
    *       //   "creator": {},
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "escalated": false,
    *       //   "name": "my_name",
    *       //   "priority": "my_priority",
    *       //   "severity": "my_severity",
    *       //   "state": "my_state",
    *       //   "subscriberEmailAddresses": [],
    *       //   "testCase": false,
    *       //   "timeZone": "my_timeZone",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "classification": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "escalated": false,
    *   //   "name": "my_name",
    *   //   "priority": "my_priority",
    *   //   "severity": "my_severity",
    *   //   "state": "my_state",
    *   //   "subscriberEmailAddresses": [],
    *   //   "testCase": false,
    *   //   "timeZone": "my_timeZone",
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceCasesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCasesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaSearchCasesResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchCasesResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchCasesResponse] = js.native
  def search(params: ParamsResourceCasesSearch): GaxiosPromise[SchemaSearchCasesResponse] = js.native
  def search(params: ParamsResourceCasesSearch, callback: BodyResponseCallback[SchemaSearchCasesResponse]): Unit = js.native
  def search(
    params: ParamsResourceCasesSearch,
    options: BodyResponseCallback[Readable | SchemaSearchCasesResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchCasesResponse]
  ): Unit = js.native
  def search(params: ParamsResourceCasesSearch, options: MethodOptions): GaxiosPromise[SchemaSearchCasesResponse] = js.native
  def search(
    params: ParamsResourceCasesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchCasesResponse]
  ): Unit = js.native
  /**
    * Search cases using the specified query.
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
    *   const res = await cloudsupport.cases.search({
    *     // The maximum number of cases fetched with each request. The default page size is 10.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return. If unspecified, the first page is retrieved.
    *     pageToken: 'placeholder-value',
    *     // An expression written in filter language. A query uses the following fields with the operators equals (`=`) and `AND`: - `organization`: An organization name in the form `organizations/`. - `project`: A project name in the form `projects/`. - `state`: The accepted values are `OPEN` or `CLOSED`. - `priority`: The accepted values are `P0`, `P1`, `P2`, `P3`, or `P4`. You can specify multiple values for priority using the `OR` operator. For example, `priority=P1 OR priority=P2`. - [DEPRECATED] `severity`: The accepted values are `S0`, `S1`, `S2`, `S3`, or `S4`. - `creator.email`: The email address of the case creator. You must specify eitehr `organization` or `project`. To search across `displayName`, `description`, and comments, use a global restriction with no keyword or operator. For example, `"my search"`. To search only cases updated after a certain date, use `update_time` retricted with that particular date, time, and timezone in ISO datetime format. For example, `update_time\>"2020-01-01T00:00:00-05:00"`. `update_time` only supports the greater than operator (`\>`). Examples: - `organization="organizations/123456789"` - `project="projects/my-project-id"` - `project="projects/123456789"` - `organization="organizations/123456789" AND state=CLOSED` - `project="projects/my-project-id" AND creator.email="tester@example.com"` - `project="projects/my-project-id" AND (priority=P0 OR priority=P1)`
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cases": [],
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
  def search(params: ParamsResourceCasesSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceCasesSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
