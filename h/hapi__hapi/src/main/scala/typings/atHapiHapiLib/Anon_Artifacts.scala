package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Artifacts extends js.Object {
  /**
    * The artifacts are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme. Defaults to no artifacts.
    */
  var artifacts: js.UndefOr[js.Object] = js.undefined
  /**
    * The credentials are used to bypass the default authentication strategies,
    * and are validated directly as if they were received via an authentication scheme.
    */
  var credentials: atHapiHapiLib.atHapiHapiMod.AuthCredentials
  /**
    * The authentication strategy name matching the provided credentials.
    */
  var strategy: java.lang.String
}

object Anon_Artifacts {
  @scala.inline
  def apply(
    credentials: atHapiHapiLib.atHapiHapiMod.AuthCredentials,
    strategy: java.lang.String,
    artifacts: js.Object = null
  ): Anon_Artifacts = {
    val __obj = js.Dynamic.literal(credentials = credentials, strategy = strategy)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    __obj.asInstanceOf[Anon_Artifacts]
  }
}

