package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/jobs/v3p1beta1", "jobs_v3p1beta1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var clientEvents: ResourceProjectsClientevents = js.native
  
  var companies: ResourceProjectsCompanies = js.native
  
  def complete(): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(callback: BodyResponseCallback[SchemaCompleteQueryResponse]): Unit = js.native
  def complete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(params: ParamsResourceProjectsComplete): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(
    params: ParamsResourceProjectsComplete,
    callback: BodyResponseCallback[SchemaCompleteQueryResponse]
  ): Unit = js.native
  def complete(
    params: ParamsResourceProjectsComplete,
    options: BodyResponseCallback[Readable | SchemaCompleteQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaCompleteQueryResponse]
  ): Unit = js.native
  def complete(params: ParamsResourceProjectsComplete, options: MethodOptions): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(
    params: ParamsResourceProjectsComplete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompleteQueryResponse]
  ): Unit = js.native
  /**
    * Completes the specified prefix with keyword suggestions. Intended for use by a job search auto-complete search box.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/jobs.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const jobs = google.jobs('v3p1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/jobs',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await jobs.projects.complete({
    *     // Optional. If provided, restricts completion to specified company. The format is "projects/{project_id\}/companies/{company_id\}", for example, "projects/api-test-project/companies/foo".
    *     companyName: 'placeholder-value',
    *     // Deprecated. Use language_codes instead. Optional. The language of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). For CompletionType.JOB_TITLE type, only open jobs with the same language_code are returned. For CompletionType.COMPANY_NAME type, only companies having open jobs with the same language_code are returned. For CompletionType.COMBINED type, only open jobs with the same language_code or companies having open jobs with the same language_code are returned. The maximum number of allowed characters is 255.
    *     languageCode: 'placeholder-value',
    *     // Optional. The list of languages of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). For CompletionType.JOB_TITLE type, only open jobs with the same language_codes are returned. For CompletionType.COMPANY_NAME type, only companies having open jobs with the same language_codes are returned. For CompletionType.COMBINED type, only open jobs with the same language_codes or companies having open jobs with the same language_codes are returned. The maximum number of allowed characters is 255.
    *     languageCodes: 'placeholder-value',
    *     // Required. Resource name of project the completion is performed within. The format is "projects/{project_id\}", for example, "projects/api-test-project".
    *     name: 'projects/my-project',
    *     // Required. Completion result count. The maximum allowed page size is 10.
    *     pageSize: 'placeholder-value',
    *     // Required. The query used to generate suggestions. The maximum number of allowed characters is 255.
    *     query: 'placeholder-value',
    *     // Optional. The scope of the completion. The defaults is CompletionScope.PUBLIC.
    *     scope: 'placeholder-value',
    *     // Optional. The completion topic. The default is CompletionType.COMBINED.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "completionResults": [],
    *   //   "metadata": {}
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
  def complete(params: ParamsResourceProjectsComplete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def complete(
    params: ParamsResourceProjectsComplete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var jobs: ResourceProjectsJobs = js.native
  
  var operations: ResourceProjectsOperations = js.native
}
