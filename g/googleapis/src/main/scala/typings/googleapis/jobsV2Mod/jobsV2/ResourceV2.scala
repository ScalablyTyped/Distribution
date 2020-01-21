package typings.googleapis.jobsV2Mod.jobsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$V2")
@js.native
class ResourceV2 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * jobs.complete
    * @desc Completes the specified prefix with job keyword suggestions.
    * Intended for use by a job search auto-complete search box.
    * @alias jobs.complete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.companyName Optional.  If provided, restricts completion to the specified company.
    * @param {string=} params.languageCode Required.  The language of the query. This is the BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).  For CompletionType.JOB_TITLE type, only open jobs with same language_code are returned.  For CompletionType.COMPANY_NAME type, only companies having open jobs with same language_code are returned.  For CompletionType.COMBINED type, only open jobs with same language_code or companies having open jobs with same language_code are returned.
    * @param {integer=} params.pageSize Required.  Completion result count. The maximum allowed page size is 10.
    * @param {string=} params.query Required.  The query used to generate suggestions.
    * @param {string=} params.scope Optional.  The scope of the completion. The defaults is CompletionScope.PUBLIC.
    * @param {string=} params.type Optional.  The completion topic. The default is CompletionType.COMBINED.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def complete(): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(callback: BodyResponseCallback[SchemaCompleteQueryResponse]): Unit = js.native
  def complete(params: ParamsResourceV2Complete): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(params: ParamsResourceV2Complete, callback: BodyResponseCallback[SchemaCompleteQueryResponse]): Unit = js.native
  def complete(
    params: ParamsResourceV2Complete,
    options: BodyResponseCallback[SchemaCompleteQueryResponse],
    callback: BodyResponseCallback[SchemaCompleteQueryResponse]
  ): Unit = js.native
  def complete(params: ParamsResourceV2Complete, options: MethodOptions): GaxiosPromise[SchemaCompleteQueryResponse] = js.native
  def complete(
    params: ParamsResourceV2Complete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompleteQueryResponse]
  ): Unit = js.native
}

