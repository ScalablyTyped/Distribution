package typings.keycloakDashJs.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keycloakDashJs.keycloakDashJsStrings.query
  - typings.keycloakDashJs.keycloakDashJsStrings.fragment
*/
trait KeycloakResponseMode extends js.Object

object KeycloakResponseMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fragment: typings.keycloakDashJs.keycloakDashJsStrings.fragment = this.cast("fragment")
  @scala.inline
  def query: typings.keycloakDashJs.keycloakDashJsStrings.query = this.cast("query")
}

