package typings.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.secret
  - typings.jose.joseStrings.`private`
  - typings.jose.joseStrings.public
*/
trait keyObjectTypes extends js.Object

object keyObjectTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.jose.joseStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.jose.joseStrings.public = this.cast("public")
  @scala.inline
  def secret: typings.jose.joseStrings.secret = this.cast("secret")
}

