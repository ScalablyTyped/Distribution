package typings.googleapis.testingV1Mod.testingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Projects$Testmatrices")
@js.native
open class ResourceProjectsTestmatrices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(params: ParamsResourceProjectsTestmatricesCancel): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    options: BodyResponseCallback[Readable | SchemaCancelTestMatrixResponse],
    callback: BodyResponseCallback[Readable | SchemaCancelTestMatrixResponse]
  ): Unit = js.native
  def cancel(params: ParamsResourceProjectsTestmatricesCancel, options: MethodOptions): GaxiosPromise[SchemaCancelTestMatrixResponse] = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCancelTestMatrixResponse]
  ): Unit = js.native
  /**
    * Cancels unfinished test executions in a test matrix. This call returns immediately and cancellation proceeds asynchronously. If the matrix is already final, this operation will have no effect. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Test Matrix does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/testing.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const testing = google.testing('v1');
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
    *   const res = await testing.projects.testMatrices.cancel({
    *     // Cloud project that owns the test.
    *     projectId: 'placeholder-value',
    *     // Test matrix that will be canceled.
    *     testMatrixId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "testState": "my_testState"
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
  def cancel(params: ParamsResourceProjectsTestmatricesCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceProjectsTestmatricesCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(params: ParamsResourceProjectsTestmatricesCreate): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(params: ParamsResourceProjectsTestmatricesCreate, callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTestmatricesCreate,
    options: BodyResponseCallback[Readable | SchemaTestMatrix],
    callback: BodyResponseCallback[Readable | SchemaTestMatrix]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTestmatricesCreate, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def create(
    params: ParamsResourceProjectsTestmatricesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestMatrix]
  ): Unit = js.native
  /**
    * Creates and runs a matrix of tests according to the given specifications. Unsupported environments will be returned in the state UNSUPPORTED. A test matrix is limited to use at most 2000 devices in parallel. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed or if the matrix tries to use too many simultaneous devices.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/testing.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const testing = google.testing('v1');
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
    *   const res = await testing.projects.testMatrices.create({
    *     // The GCE project under which this job will run.
    *     projectId: 'placeholder-value',
    *     // A string id used to detect duplicated requests. Ids are automatically scoped to a project, so users should ensure the ID is unique per-project. A UUID is recommended. Optional, but strongly recommended.
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientInfo": {},
    *       //   "environmentMatrix": {},
    *       //   "failFast": false,
    *       //   "flakyTestAttempts": 0,
    *       //   "invalidMatrixDetails": "my_invalidMatrixDetails",
    *       //   "outcomeSummary": "my_outcomeSummary",
    *       //   "projectId": "my_projectId",
    *       //   "resultStorage": {},
    *       //   "state": "my_state",
    *       //   "testExecutions": [],
    *       //   "testMatrixId": "my_testMatrixId",
    *       //   "testSpecification": {},
    *       //   "timestamp": "my_timestamp"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientInfo": {},
    *   //   "environmentMatrix": {},
    *   //   "failFast": false,
    *   //   "flakyTestAttempts": 0,
    *   //   "invalidMatrixDetails": "my_invalidMatrixDetails",
    *   //   "outcomeSummary": "my_outcomeSummary",
    *   //   "projectId": "my_projectId",
    *   //   "resultStorage": {},
    *   //   "state": "my_state",
    *   //   "testExecutions": [],
    *   //   "testMatrixId": "my_testMatrixId",
    *   //   "testSpecification": {},
    *   //   "timestamp": "my_timestamp"
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
  def create(params: ParamsResourceProjectsTestmatricesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTestmatricesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(params: ParamsResourceProjectsTestmatricesGet): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(params: ParamsResourceProjectsTestmatricesGet, callback: BodyResponseCallback[SchemaTestMatrix]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTestmatricesGet,
    options: BodyResponseCallback[Readable | SchemaTestMatrix],
    callback: BodyResponseCallback[Readable | SchemaTestMatrix]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTestmatricesGet, options: MethodOptions): GaxiosPromise[SchemaTestMatrix] = js.native
  def get(
    params: ParamsResourceProjectsTestmatricesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestMatrix]
  ): Unit = js.native
  /**
    * Checks the status of a test matrix. May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Test Matrix does not exist
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/testing.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const testing = google.testing('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await testing.projects.testMatrices.get({
    *     // Cloud project that owns the test matrix.
    *     projectId: 'placeholder-value',
    *     // Unique test matrix id which was assigned by the service.
    *     testMatrixId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientInfo": {},
    *   //   "environmentMatrix": {},
    *   //   "failFast": false,
    *   //   "flakyTestAttempts": 0,
    *   //   "invalidMatrixDetails": "my_invalidMatrixDetails",
    *   //   "outcomeSummary": "my_outcomeSummary",
    *   //   "projectId": "my_projectId",
    *   //   "resultStorage": {},
    *   //   "state": "my_state",
    *   //   "testExecutions": [],
    *   //   "testMatrixId": "my_testMatrixId",
    *   //   "testSpecification": {},
    *   //   "timestamp": "my_timestamp"
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
  def get(params: ParamsResourceProjectsTestmatricesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTestmatricesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
