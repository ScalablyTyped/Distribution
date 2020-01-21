package typings.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_kx_keypair")
@js.native
object cryptoKxKeypair extends js.Object {
  def apply(): KeyPair = js.native
  def apply(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

