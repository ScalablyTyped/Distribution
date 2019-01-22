package typings
package hapiLib

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
  var credentials: hapiLib.hapiMod.AuthCredentials
  /**
    * The authentication strategy name matching the provided credentials.
    */
  var strategy: java.lang.String
}

