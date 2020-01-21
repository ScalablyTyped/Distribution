package typings.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonwebtoken.jsonwebtokenStrings.HS256
  - typings.jsonwebtoken.jsonwebtokenStrings.HS384
  - typings.jsonwebtoken.jsonwebtokenStrings.HS512
  - typings.jsonwebtoken.jsonwebtokenStrings.RS256
  - typings.jsonwebtoken.jsonwebtokenStrings.RS384
  - typings.jsonwebtoken.jsonwebtokenStrings.RS512
  - typings.jsonwebtoken.jsonwebtokenStrings.ES256
  - typings.jsonwebtoken.jsonwebtokenStrings.ES384
  - typings.jsonwebtoken.jsonwebtokenStrings.ES512
  - typings.jsonwebtoken.jsonwebtokenStrings.PS256
  - typings.jsonwebtoken.jsonwebtokenStrings.PS384
  - typings.jsonwebtoken.jsonwebtokenStrings.PS512
  - typings.jsonwebtoken.jsonwebtokenStrings.none
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  def ES256: typings.jsonwebtoken.jsonwebtokenStrings.ES256 = this.cast("ES256")
  @scala.inline
  def ES384: typings.jsonwebtoken.jsonwebtokenStrings.ES384 = this.cast("ES384")
  @scala.inline
  def ES512: typings.jsonwebtoken.jsonwebtokenStrings.ES512 = this.cast("ES512")
  @scala.inline
  def HS256: typings.jsonwebtoken.jsonwebtokenStrings.HS256 = this.cast("HS256")
  @scala.inline
  def HS384: typings.jsonwebtoken.jsonwebtokenStrings.HS384 = this.cast("HS384")
  @scala.inline
  def HS512: typings.jsonwebtoken.jsonwebtokenStrings.HS512 = this.cast("HS512")
  @scala.inline
  def PS256: typings.jsonwebtoken.jsonwebtokenStrings.PS256 = this.cast("PS256")
  @scala.inline
  def PS384: typings.jsonwebtoken.jsonwebtokenStrings.PS384 = this.cast("PS384")
  @scala.inline
  def PS512: typings.jsonwebtoken.jsonwebtokenStrings.PS512 = this.cast("PS512")
  @scala.inline
  def RS256: typings.jsonwebtoken.jsonwebtokenStrings.RS256 = this.cast("RS256")
  @scala.inline
  def RS384: typings.jsonwebtoken.jsonwebtokenStrings.RS384 = this.cast("RS384")
  @scala.inline
  def RS512: typings.jsonwebtoken.jsonwebtokenStrings.RS512 = this.cast("RS512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typings.jsonwebtoken.jsonwebtokenStrings.none = this.cast("none")
}

