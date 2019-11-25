package typings.jws.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jws.jwsStrings.HS256
  - typings.jws.jwsStrings.HS384
  - typings.jws.jwsStrings.HS512
  - typings.jws.jwsStrings.RS256
  - typings.jws.jwsStrings.RS384
  - typings.jws.jwsStrings.RS512
  - typings.jws.jwsStrings.ES256
  - typings.jws.jwsStrings.ES384
  - typings.jws.jwsStrings.ES512
  - typings.jws.jwsStrings.PS256
  - typings.jws.jwsStrings.PS384
  - typings.jws.jwsStrings.PS512
  - typings.jws.jwsStrings.none
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  def ES256: typings.jws.jwsStrings.ES256 = this.cast("ES256")
  @scala.inline
  def ES384: typings.jws.jwsStrings.ES384 = this.cast("ES384")
  @scala.inline
  def ES512: typings.jws.jwsStrings.ES512 = this.cast("ES512")
  @scala.inline
  def HS256: typings.jws.jwsStrings.HS256 = this.cast("HS256")
  @scala.inline
  def HS384: typings.jws.jwsStrings.HS384 = this.cast("HS384")
  @scala.inline
  def HS512: typings.jws.jwsStrings.HS512 = this.cast("HS512")
  @scala.inline
  def PS256: typings.jws.jwsStrings.PS256 = this.cast("PS256")
  @scala.inline
  def PS384: typings.jws.jwsStrings.PS384 = this.cast("PS384")
  @scala.inline
  def PS512: typings.jws.jwsStrings.PS512 = this.cast("PS512")
  @scala.inline
  def RS256: typings.jws.jwsStrings.RS256 = this.cast("RS256")
  @scala.inline
  def RS384: typings.jws.jwsStrings.RS384 = this.cast("RS384")
  @scala.inline
  def RS512: typings.jws.jwsStrings.RS512 = this.cast("RS512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.jws.jwsStrings.none = this.cast("none")
}

