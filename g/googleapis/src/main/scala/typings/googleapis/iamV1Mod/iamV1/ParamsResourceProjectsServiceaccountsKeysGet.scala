package typings.googleapis.iamV1Mod.iamV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsServiceaccountsKeysGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the service account key in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.  Using `-`
    * as a wildcard for the `PROJECT_ID` will infer the project from the
    * account. The `ACCOUNT` value can be the `email` address or the
    * `unique_id` of the service account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The output format of the public key requested. X509_PEM is the default
    * output format.
    */
  var publicKeyType: js.UndefOr[String] = js.native
}

