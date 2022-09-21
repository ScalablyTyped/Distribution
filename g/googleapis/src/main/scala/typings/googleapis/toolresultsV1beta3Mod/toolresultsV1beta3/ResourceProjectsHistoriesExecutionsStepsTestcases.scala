package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Testcases")
@js.native
open class ResourceProjectsHistoriesExecutionsStepsTestcases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTestCase] = js.native
  def get(callback: BodyResponseCallback[SchemaTestCase]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestCase] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet): GaxiosPromise[SchemaTestCase] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet,
    callback: BodyResponseCallback[SchemaTestCase]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet,
    options: BodyResponseCallback[Readable | SchemaTestCase],
    callback: BodyResponseCallback[Readable | SchemaTestCase]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet, options: MethodOptions): GaxiosPromise[SchemaTestCase] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestCase]
  ): Unit = js.native
  /**
    * Gets details of a Test Case for a Step. Experimental test cases API. Still in active development. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Test Case does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *     await toolresults.projects.histories.executions.steps.testCases.get({
    *       // A Execution id Required.
    *       executionId: 'placeholder-value',
    *       // A History id. Required.
    *       historyId: 'placeholder-value',
    *       // A Project id. Required.
    *       projectId: 'placeholder-value',
    *       // A Step id. Note: This step must include a TestExecutionStep. Required.
    *       stepId: 'placeholder-value',
    *       // A Test Case id. Required.
    *       testCaseId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "elapsedTime": {},
    *   //   "endTime": {},
    *   //   "skippedMessage": "my_skippedMessage",
    *   //   "stackTraces": [],
    *   //   "startTime": {},
    *   //   "status": "my_status",
    *   //   "testCaseId": "my_testCaseId",
    *   //   "testCaseReference": {},
    *   //   "toolOutputs": []
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
  def get(params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTestCasesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTestCasesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTestCasesResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList): GaxiosPromise[SchemaListTestCasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList,
    callback: BodyResponseCallback[SchemaListTestCasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList,
    options: BodyResponseCallback[Readable | SchemaListTestCasesResponse],
    callback: BodyResponseCallback[Readable | SchemaListTestCasesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList, options: MethodOptions): GaxiosPromise[SchemaListTestCasesResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTestCasesResponse]
  ): Unit = js.native
  /**
    * Lists Test Cases attached to a Step. Experimental test cases API. Still in active development. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing Step does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/toolresults.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const toolresults = google.toolresults('v1beta3');
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
    *     await toolresults.projects.histories.executions.steps.testCases.list({
    *       // A Execution id Required.
    *       executionId: 'placeholder-value',
    *       // A History id. Required.
    *       historyId: 'placeholder-value',
    *       // The maximum number of TestCases to fetch. Default value: 100. The server will use this default if the field is not set or has a value of 0. Optional.
    *       pageSize: 'placeholder-value',
    *       // A continuation token to resume the query at the next item. Optional.
    *       pageToken: 'placeholder-value',
    *       // A Project id. Required.
    *       projectId: 'placeholder-value',
    *       // A Step id. Note: This step must include a TestExecutionStep. Required.
    *       stepId: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "testCases": []
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
  def list(params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
