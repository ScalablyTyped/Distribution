package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keycloakJs.keycloakJsStrings.`login-required`
  - typings.keycloakJs.keycloakJsStrings.`check-sso`
*/
trait KeycloakOnLoad extends js.Object

object KeycloakOnLoad {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `check-sso`: typings.keycloakJs.keycloakJsStrings.`check-sso` = this.cast("check-sso")
  @scala.inline
  def `login-required`: typings.keycloakJs.keycloakJsStrings.`login-required` = this.cast("login-required")
}

