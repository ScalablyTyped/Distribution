package typings.libraCore.transactionPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.RawTransaction.PayloadCase
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "RawTransaction")
@js.native
class RawTransaction_ () extends Message {
  def clearProgram(): Unit = js.native
  def clearWriteSet(): Unit = js.native
  def getExpirationTime(): String = js.native
  def getGasUnitPrice(): String = js.native
  def getMaxGasAmount(): String = js.native
  def getPayloadCase(): PayloadCase = js.native
  def getProgram(): js.UndefOr[Program] = js.native
  def getSenderAccount(): Uint8Array | String = js.native
  def getSenderAccount_asB64(): String = js.native
  def getSenderAccount_asU8(): Uint8Array = js.native
  def getSequenceNumber(): String = js.native
  def getWriteSet(): js.UndefOr[WriteSet] = js.native
  def hasProgram(): Boolean = js.native
  def hasWriteSet(): Boolean = js.native
  def setExpirationTime(value: String): Unit = js.native
  def setGasUnitPrice(value: String): Unit = js.native
  def setMaxGasAmount(value: String): Unit = js.native
  def setProgram(): Unit = js.native
  def setProgram(value: Program): Unit = js.native
  def setSenderAccount(value: String): Unit = js.native
  def setSenderAccount(value: Uint8Array): Unit = js.native
  def setSequenceNumber(value: String): Unit = js.native
  def setWriteSet(): Unit = js.native
  def setWriteSet(value: WriteSet): Unit = js.native
}

