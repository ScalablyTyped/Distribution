package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keycloakJs.keycloakJsStrings.standard
  - typings.keycloakJs.keycloakJsStrings.`implicit`
  - typings.keycloakJs.keycloakJsStrings.hybrid
*/
trait KeycloakFlow extends js.Object

object KeycloakFlow {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hybrid: typings.keycloakJs.keycloakJsStrings.hybrid = this.cast("hybrid")
  @scala.inline
  def `implicit`: typings.keycloakJs.keycloakJsStrings.`implicit` = this.cast("implicit")
  @scala.inline
  def standard: typings.keycloakJs.keycloakJsStrings.standard = this.cast("standard")
}

