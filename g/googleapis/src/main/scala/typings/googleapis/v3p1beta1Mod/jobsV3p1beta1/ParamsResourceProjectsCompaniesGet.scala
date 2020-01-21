package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsCompaniesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The resource name of the company to be retrieved.  The format
    * is "projects/{project_id}/companies/{company_id}", for example,
    * "projects/api-test-project/companies/foo".
    */
  var name: js.UndefOr[String] = js.native
}

