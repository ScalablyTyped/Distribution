package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_stream_keygen")
@js.native
object crypto_stream_keygen extends js.Object {
  def apply(): Uint8Array = js.native
  def apply(outputFormat: StringOutputFormat): String = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

