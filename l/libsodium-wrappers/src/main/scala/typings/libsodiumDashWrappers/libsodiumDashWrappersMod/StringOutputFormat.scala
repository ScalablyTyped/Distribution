package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.libsodiumDashWrappers.libsodiumDashWrappersStrings.text
  - typings.libsodiumDashWrappers.libsodiumDashWrappersStrings.hex
  - typings.libsodiumDashWrappers.libsodiumDashWrappersStrings.base64
*/
trait StringOutputFormat extends js.Object

object StringOutputFormat {
  @scala.inline
  def base64: typings.libsodiumDashWrappers.libsodiumDashWrappersStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.libsodiumDashWrappers.libsodiumDashWrappersStrings.hex = this.cast("hex")
  @scala.inline
  def text: typings.libsodiumDashWrappers.libsodiumDashWrappersStrings.text = this.cast("text")
}

