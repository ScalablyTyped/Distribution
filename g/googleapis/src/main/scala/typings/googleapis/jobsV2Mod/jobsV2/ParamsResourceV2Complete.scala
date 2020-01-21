package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceV2Complete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional.  If provided, restricts completion to the specified company.
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Required.  The language of the query. This is the BCP-47 language code,
    * such as "en-US" or "sr-Latn". For more information, see [Tags for
    * Identifying Languages](https://tools.ietf.org/html/bcp47).  For
    * CompletionType.JOB_TITLE type, only open jobs with same language_code are
    * returned.  For CompletionType.COMPANY_NAME type, only companies having
    * open jobs with same language_code are returned.  For
    * CompletionType.COMBINED type, only open jobs with same language_code or
    * companies having open jobs with same language_code are returned.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Required.  Completion result count. The maximum allowed page size is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Required.  The query used to generate suggestions.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Optional.  The scope of the completion. The defaults is
    * CompletionScope.PUBLIC.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * Optional.  The completion topic. The default is CompletionType.COMBINED.
    */
  var `type`: js.UndefOr[String] = js.native
}

