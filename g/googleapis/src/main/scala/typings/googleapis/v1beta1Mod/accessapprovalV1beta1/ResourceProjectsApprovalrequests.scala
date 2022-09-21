package typings.googleapis.v1beta1Mod.accessapprovalV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accessapproval/v1beta1", "accessapproval_v1beta1.Resource$Projects$Approvalrequests")
@js.native
open class ResourceProjectsApprovalrequests protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(params: ParamsResourceProjectsApprovalrequestsApprove): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(
    params: ParamsResourceProjectsApprovalrequestsApprove,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def approve(
    params: ParamsResourceProjectsApprovalrequestsApprove,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def approve(params: ParamsResourceProjectsApprovalrequestsApprove, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def approve(
    params: ParamsResourceProjectsApprovalrequestsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * accessapproval.projects.approvalRequests.approve
    * @desc Approves a request and returns the updated ApprovalRequest.  Returns NOT_FOUND if the request does not exist. Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.projects.approvalRequests.approve({
    *     // Name of the approval request to approve.
    *     name: 'projects/my-project/approvalRequests/my-approvalRequest',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "expireTime": "my_expireTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias accessapproval.projects.approvalRequests.approve
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the approval request to approve.
    * @param {().ApproveApprovalRequestMessage} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def approve(params: ParamsResourceProjectsApprovalrequestsApprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceProjectsApprovalrequestsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def dismiss(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def dismiss(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(params: ParamsResourceProjectsApprovalrequestsDismiss): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(
    params: ParamsResourceProjectsApprovalrequestsDismiss,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def dismiss(
    params: ParamsResourceProjectsApprovalrequestsDismiss,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def dismiss(params: ParamsResourceProjectsApprovalrequestsDismiss, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def dismiss(
    params: ParamsResourceProjectsApprovalrequestsDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * accessapproval.projects.approvalRequests.dismiss
    * @desc Dismisses a request. Returns the updated ApprovalRequest.  NOTE: This does not deny access to the resource if another request has been made and approved. It is equivalent in effect to ignoring the request altogether.  Returns NOT_FOUND if the request does not exist.  Returns FAILED_PRECONDITION if the request exists but is not in a pending state.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.projects.approvalRequests.dismiss({
    *     // Name of the ApprovalRequest to dismiss.
    *     name: 'projects/my-project/approvalRequests/my-approvalRequest',
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
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias accessapproval.projects.approvalRequests.dismiss
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the ApprovalRequest to dismiss.
    * @param {().DismissApprovalRequestMessage} params.requestBody Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dismiss(params: ParamsResourceProjectsApprovalrequestsDismiss, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def dismiss(
    params: ParamsResourceProjectsApprovalrequestsDismiss,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(callback: BodyResponseCallback[SchemaApprovalRequest]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(params: ParamsResourceProjectsApprovalrequestsGet): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(
    params: ParamsResourceProjectsApprovalrequestsGet,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsApprovalrequestsGet,
    options: BodyResponseCallback[Readable | SchemaApprovalRequest],
    callback: BodyResponseCallback[Readable | SchemaApprovalRequest]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsApprovalrequestsGet, options: MethodOptions): GaxiosPromise[SchemaApprovalRequest] = js.native
  def get(
    params: ParamsResourceProjectsApprovalrequestsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApprovalRequest]
  ): Unit = js.native
  /**
    * accessapproval.projects.approvalRequests.get
    * @desc Gets an approval request. Returns NOT_FOUND if the request does not exist.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.projects.approvalRequests.get({
    *     // Name of the approval request to retrieve.
    *     name: 'projects/my-project/approvalRequests/my-approvalRequest',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approve": {},
    *   //   "dismiss": {},
    *   //   "name": "my_name",
    *   //   "requestTime": "my_requestTime",
    *   //   "requestedExpiration": "my_requestedExpiration",
    *   //   "requestedLocations": {},
    *   //   "requestedReason": {},
    *   //   "requestedResourceName": "my_requestedResourceName",
    *   //   "requestedResourceProperties": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias accessapproval.projects.approvalRequests.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the approval request to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(params: ParamsResourceProjectsApprovalrequestsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsApprovalrequestsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListApprovalRequestsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(params: ParamsResourceProjectsApprovalrequestsList): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(
    params: ParamsResourceProjectsApprovalrequestsList,
    callback: BodyResponseCallback[SchemaListApprovalRequestsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsApprovalrequestsList,
    options: BodyResponseCallback[Readable | SchemaListApprovalRequestsResponse],
    callback: BodyResponseCallback[Readable | SchemaListApprovalRequestsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsApprovalrequestsList, options: MethodOptions): GaxiosPromise[SchemaListApprovalRequestsResponse] = js.native
  def list(
    params: ParamsResourceProjectsApprovalrequestsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListApprovalRequestsResponse]
  ): Unit = js.native
  /**
    * accessapproval.projects.approvalRequests.list
    * @desc Lists approval requests associated with a project, folder, or organization. Approval requests can be filtered by state (pending, active, dismissed). The order is reverse chronological.
    * @example
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/accessapproval.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const accessapproval = google.accessapproval('v1beta1');
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
    *   const res = await accessapproval.projects.approvalRequests.list({
    *     // A filter on the type of approval requests to retrieve. Must be one of the
    *     // following values:
    *     // <ol>
    *     //   <li>[not set]: Requests that are pending or have active approvals.</li>
    *     //   <li>ALL: All requests.</li>
    *     //   <li>PENDING: Only pending requests.</li>
    *     //   <li>ACTIVE: Only active (i.e. currently approved) requests.</li>
    *     //   <li>DISMISSED: Only dismissed (including expired) requests.</li>
    *     //   <li>HISTORY: Active and dismissed (including expired) requests.</li>
    *     // </ol>
    *     filter: 'placeholder-value',
    *     // Requested page size.
    *     pageSize: 'placeholder-value',
    *     // A token identifying the page of results to return.
    *     pageToken: 'placeholder-value',
    *     // The parent resource. This may be "projects/{project_id}",
    *     // "folders/{folder_id}", or "organizations/{organization_id}".
    *     parent: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approvalRequests": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * @alias accessapproval.projects.approvalRequests.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter on the type of approval requests to retrieve. Must be one of the following values: <ol>   <li>[not set]: Requests that are pending or have active approvals.</li>   <li>ALL: All requests.</li>   <li>PENDING: Only pending requests.</li>   <li>ACTIVE: Only active (i.e. currently approved) requests.</li>   <li>DISMISSED: Only dismissed (including expired) requests.</li>   <li>HISTORY: Active and dismissed (including expired) requests.</li> </ol>
    * @param {integer=} params.pageSize Requested page size.
    * @param {string=} params.pageToken A token identifying the page of results to return.
    * @param {string} params.parent The parent resource. This may be "projects/{project_id}", "folders/{folder_id}", or "organizations/{organization_id}".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(params: ParamsResourceProjectsApprovalrequestsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsApprovalrequestsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
