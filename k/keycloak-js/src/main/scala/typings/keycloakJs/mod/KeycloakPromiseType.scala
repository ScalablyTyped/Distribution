package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.keycloakJs.keycloakJsStrings.legacy
  - typings.keycloakJs.keycloakJsStrings.native
*/
trait KeycloakPromiseType extends js.Object

object KeycloakPromiseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def legacy: typings.keycloakJs.keycloakJsStrings.legacy = this.cast("legacy")
  @scala.inline
  def native: typings.keycloakJs.keycloakJsStrings.native = this.cast("native")
}

