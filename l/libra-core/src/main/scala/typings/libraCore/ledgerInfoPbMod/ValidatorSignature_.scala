package typings.libraCore.ledgerInfoPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature")
@js.native
class ValidatorSignature_ () extends Message {
  
  def getSignature(): Uint8Array | String = js.native
  
  def getSignature_asB64(): String = js.native
  
  def getSignature_asU8(): Uint8Array = js.native
  
  def getValidatorId(): Uint8Array | String = js.native
  
  def getValidatorId_asB64(): String = js.native
  
  def getValidatorId_asU8(): Uint8Array = js.native
  
  def setSignature(value: String): Unit = js.native
  def setSignature(value: Uint8Array): Unit = js.native
  
  def setValidatorId(value: String): Unit = js.native
  def setValidatorId(value: Uint8Array): Unit = js.native
}
