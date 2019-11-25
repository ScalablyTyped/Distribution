package typings.hasha.hashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hasha.hashaStrings.hex
  - typings.hasha.hashaStrings.base64
  - typings.hasha.hashaStrings.latin1
*/
trait ToStringEncoding extends js.Object

object ToStringEncoding {
  @scala.inline
  def base64: typings.hasha.hashaStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.hasha.hashaStrings.hex = this.cast("hex")
  @scala.inline
  def latin1: typings.hasha.hashaStrings.latin1 = this.cast("latin1")
}

