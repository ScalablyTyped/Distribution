package typings.hapiHapi.anon

import typings.hapiHapi.mod.AuthCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifacts extends js.Object {
  /**
    * The artifacts are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme. Defaults to no artifacts.
    */
  var artifacts: js.UndefOr[js.Object] = js.undefined
  /**
    * The credentials are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme.
    */
  var credentials: AuthCredentials
  /**
    * The authentication strategy name matching the provided credentials.
    */
  var strategy: String
}

object Artifacts {
  @scala.inline
  def apply(credentials: AuthCredentials, strategy: String, artifacts: js.Object = null): Artifacts = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifacts]
  }
}

