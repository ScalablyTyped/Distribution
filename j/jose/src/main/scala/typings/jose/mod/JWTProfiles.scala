package typings.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.id_token
  - typings.jose.joseStrings.atPlussignJWT
  - typings.jose.joseStrings.logout_token
*/
trait JWTProfiles extends js.Object

object JWTProfiles {
  @scala.inline
  def atPlussignJWT: typings.jose.joseStrings.atPlussignJWT = "at+JWT".asInstanceOf[typings.jose.joseStrings.atPlussignJWT]
  @scala.inline
  def id_token: typings.jose.joseStrings.id_token = "id_token".asInstanceOf[typings.jose.joseStrings.id_token]
  @scala.inline
  def logout_token: typings.jose.joseStrings.logout_token = "logout_token".asInstanceOf[typings.jose.joseStrings.logout_token]
}

