package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_box_keypair")
@js.native
object crypto_box_keypair extends js.Object {
  def apply(): KeyPair = js.native
  def apply(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

