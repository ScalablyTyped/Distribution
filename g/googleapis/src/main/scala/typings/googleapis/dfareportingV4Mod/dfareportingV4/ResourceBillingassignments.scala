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

@JSImport("googleapis/build/src/apis/dfareporting/v4", "dfareporting_v4.Resource$Billingassignments")
@js.native
open class ResourceBillingassignments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def insert(): GaxiosPromise[SchemaBillingAssignment] = js.native
  def insert(callback: BodyResponseCallback[SchemaBillingAssignment]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingAssignment] = js.native
  def insert(params: ParamsResourceBillingassignmentsInsert): GaxiosPromise[SchemaBillingAssignment] = js.native
  def insert(
    params: ParamsResourceBillingassignmentsInsert,
    callback: BodyResponseCallback[SchemaBillingAssignment]
  ): Unit = js.native
  def insert(
    params: ParamsResourceBillingassignmentsInsert,
    options: BodyResponseCallback[Readable | SchemaBillingAssignment],
    callback: BodyResponseCallback[Readable | SchemaBillingAssignment]
  ): Unit = js.native
  def insert(params: ParamsResourceBillingassignmentsInsert, options: MethodOptions): GaxiosPromise[SchemaBillingAssignment] = js.native
  def insert(
    params: ParamsResourceBillingassignmentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingAssignment]
  ): Unit = js.native
  /**
    * Inserts a new billing assignment and returns the new assignment. Only one of advertiser_id or campaign_id is support per request. If the new assignment has no effect (assigning a campaign to the parent advertiser billing profile or assigning an advertiser to the account billing profile), no assignment will be returned.
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
    *   const res = await dfareporting.billingAssignments.insert({
    *     // Billing profile ID of this billing assignment.
    *     billingProfileId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "campaignId": "my_campaignId",
    *       //   "kind": "my_kind",
    *       //   "subaccountId": "my_subaccountId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "campaignId": "my_campaignId",
    *   //   "kind": "my_kind",
    *   //   "subaccountId": "my_subaccountId"
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
  def insert(params: ParamsResourceBillingassignmentsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceBillingassignmentsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBillingAssignmentsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaBillingAssignmentsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBillingAssignmentsListResponse] = js.native
  def list(params: ParamsResourceBillingassignmentsList): GaxiosPromise[SchemaBillingAssignmentsListResponse] = js.native
  def list(
    params: ParamsResourceBillingassignmentsList,
    callback: BodyResponseCallback[SchemaBillingAssignmentsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingassignmentsList,
    options: BodyResponseCallback[Readable | SchemaBillingAssignmentsListResponse],
    callback: BodyResponseCallback[Readable | SchemaBillingAssignmentsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingassignmentsList, options: MethodOptions): GaxiosPromise[SchemaBillingAssignmentsListResponse] = js.native
  def list(
    params: ParamsResourceBillingassignmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBillingAssignmentsListResponse]
  ): Unit = js.native
  /**
    * Retrieves a list of billing assignments.
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
    *   const res = await dfareporting.billingAssignments.list({
    *     // Billing profile ID of this billing assignment.
    *     billingProfileId: 'placeholder-value',
    *     // User profile ID associated with this request.
    *     profileId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billingAssignments": [],
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
  def list(params: ParamsResourceBillingassignmentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBillingassignmentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
