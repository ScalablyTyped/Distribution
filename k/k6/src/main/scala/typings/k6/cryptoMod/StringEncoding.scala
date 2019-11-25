package typings.k6.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.k6.k6Strings.hex
  - typings.k6.k6Strings.base64
  - typings.k6.k6Strings.base64url
  - typings.k6.k6Strings.base64rawurl
*/
trait StringEncoding extends js.Object

object StringEncoding {
  @scala.inline
  def base64: typings.k6.k6Strings.base64 = this.cast("base64")
  @scala.inline
  def base64rawurl: typings.k6.k6Strings.base64rawurl = this.cast("base64rawurl")
  @scala.inline
  def base64url: typings.k6.k6Strings.base64url = this.cast("base64url")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.k6.k6Strings.hex = this.cast("hex")
}

