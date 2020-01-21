package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keycloakJs.keycloakJsStrings.query
  - typings.keycloakJs.keycloakJsStrings.fragment
*/
trait KeycloakResponseMode extends js.Object

object KeycloakResponseMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fragment: typings.keycloakJs.keycloakJsStrings.fragment = this.cast("fragment")
  @scala.inline
  def query: typings.keycloakJs.keycloakJsStrings.query = this.cast("query")
}

