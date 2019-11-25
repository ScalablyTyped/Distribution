package typings.k6.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.k6.k6Strings.std
  - typings.k6.k6Strings.rawstd
  - typings.k6.k6Strings.url
  - typings.k6.k6Strings.rawurl
*/
trait Base64Variant extends js.Object

object Base64Variant {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rawstd: typings.k6.k6Strings.rawstd = this.cast("rawstd")
  @scala.inline
  def rawurl: typings.k6.k6Strings.rawurl = this.cast("rawurl")
  @scala.inline
  def std: typings.k6.k6Strings.std = this.cast("std")
  @scala.inline
  def url: typings.k6.k6Strings.url = this.cast("url")
}

