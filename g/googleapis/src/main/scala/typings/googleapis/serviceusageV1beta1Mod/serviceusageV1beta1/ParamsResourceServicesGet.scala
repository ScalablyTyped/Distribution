package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of the consumer and service to get the `ConsumerState` for.  An
    * example name would be:
    * `projects/123/services/serviceusage.googleapis.com` where `123` is the
    * project number (not project ID).
    */
  var name: js.UndefOr[String] = js.native
}

