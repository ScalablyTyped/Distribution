package typings.libraCore.mempoolPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse")
@js.native
class AddTransactionWithValidationResponse_ () extends Message {
  
  def clearStatus(): Unit = js.native
  
  def getCurrentVersion(): String = js.native
  
  def getStatus(): js.UndefOr[MempoolAddTransactionStatus] = js.native
  
  def hasStatus(): Boolean = js.native
  
  def setCurrentVersion(value: String): Unit = js.native
  
  def setStatus(): Unit = js.native
  def setStatus(value: MempoolAddTransactionStatus): Unit = js.native
}
