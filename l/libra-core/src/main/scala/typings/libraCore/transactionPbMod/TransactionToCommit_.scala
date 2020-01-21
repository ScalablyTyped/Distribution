package typings.libraCore.transactionPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.eventsPbMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit")
@js.native
class TransactionToCommit_ () extends Message {
  def addAccountStates(): AccountState = js.native
  def addAccountStates(value: AccountState): AccountState = js.native
  def addAccountStates(value: AccountState, index: Double): AccountState = js.native
  def addEvents(): Event = js.native
  def addEvents(value: Event): Event = js.native
  def addEvents(value: Event, index: Double): Event = js.native
  def clearAccountStatesList(): Unit = js.native
  def clearEventsList(): Unit = js.native
  def clearSignedTxn(): Unit = js.native
  def getAccountStatesList(): js.Array[AccountState] = js.native
  def getEventsList(): js.Array[Event] = js.native
  def getGasUsed(): String = js.native
  def getSignedTxn(): js.UndefOr[SignedTransaction] = js.native
  def hasSignedTxn(): Boolean = js.native
  def setAccountStatesList(value: js.Array[AccountState]): Unit = js.native
  def setEventsList(value: js.Array[Event]): Unit = js.native
  def setGasUsed(value: String): Unit = js.native
  def setSignedTxn(): Unit = js.native
  def setSignedTxn(value: SignedTransaction): Unit = js.native
}

