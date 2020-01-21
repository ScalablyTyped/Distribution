package typings.libraCore.mempoolStatusPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus")
@js.native
class MempoolAddTransactionStatus_ () extends Message {
  def getCode(): MempoolAddTransactionStatusCode = js.native
  def getMessage(): String = js.native
  def setCode(value: MempoolAddTransactionStatusCode): Unit = js.native
  def setMessage(value: String): Unit = js.native
}

