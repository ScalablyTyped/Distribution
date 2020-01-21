package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.KeyPair
import typings.libsodiumWrappers.mod.StringKeyPair
import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_sign_keypair")
@js.native
object cryptoSignKeypair extends js.Object {
  def apply(): KeyPair = js.native
  def apply(outputFormat: StringOutputFormat): StringKeyPair = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): KeyPair = js.native
}

