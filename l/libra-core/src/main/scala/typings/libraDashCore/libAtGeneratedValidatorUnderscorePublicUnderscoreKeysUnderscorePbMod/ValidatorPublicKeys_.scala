package typings.libraDashCore.libAtGeneratedValidatorUnderscorePublicUnderscoreKeysUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
@js.native
class ValidatorPublicKeys_ () extends Message {
  def getAccountAddress(): Uint8Array | String = js.native
  def getAccountAddress_asB64(): String = js.native
  def getAccountAddress_asU8(): Uint8Array = js.native
  def getConsensusPublicKey(): Uint8Array | String = js.native
  def getConsensusPublicKey_asB64(): String = js.native
  def getConsensusPublicKey_asU8(): Uint8Array = js.native
  def getNetworkIdentityPublicKey(): Uint8Array | String = js.native
  def getNetworkIdentityPublicKey_asB64(): String = js.native
  def getNetworkIdentityPublicKey_asU8(): Uint8Array = js.native
  def getNetworkSigningPublicKey(): Uint8Array | String = js.native
  def getNetworkSigningPublicKey_asB64(): String = js.native
  def getNetworkSigningPublicKey_asU8(): Uint8Array = js.native
  def setAccountAddress(value: String): Unit = js.native
  def setAccountAddress(value: Uint8Array): Unit = js.native
  def setConsensusPublicKey(value: String): Unit = js.native
  def setConsensusPublicKey(value: Uint8Array): Unit = js.native
  def setNetworkIdentityPublicKey(value: String): Unit = js.native
  def setNetworkIdentityPublicKey(value: Uint8Array): Unit = js.native
  def setNetworkSigningPublicKey(value: String): Unit = js.native
  def setNetworkSigningPublicKey(value: Uint8Array): Unit = js.native
}

