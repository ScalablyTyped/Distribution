package typings.googleapis.osloginV1Mod.osloginV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersSshpublickeysPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The fingerprint of the public key to update. Public keys are identified
    * by their SHA-256 fingerprint. The fingerprint of the public key is in
    * format `users/{user}/sshPublicKeys/{fingerprint}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSshPublicKey] = js.native
  /**
    * Mask to control which fields get updated. Updates all if not present.
    */
  var updateMask: js.UndefOr[String] = js.native
}

