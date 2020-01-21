package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.getWithProofPbMod.RequestItem.RequestedItemsCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem")
@js.native
class RequestItem_ () extends Message {
  def clearGetAccountStateRequest(): Unit = js.native
  def clearGetAccountTransactionBySequenceNumberRequest(): Unit = js.native
  def clearGetEventsByEventAccessPathRequest(): Unit = js.native
  def clearGetTransactionsRequest(): Unit = js.native
  def getGetAccountStateRequest(): js.UndefOr[GetAccountStateRequest] = js.native
  def getGetAccountTransactionBySequenceNumberRequest(): js.UndefOr[GetAccountTransactionBySequenceNumberRequest] = js.native
  def getGetEventsByEventAccessPathRequest(): js.UndefOr[GetEventsByEventAccessPathRequest] = js.native
  def getGetTransactionsRequest(): js.UndefOr[GetTransactionsRequest] = js.native
  def getRequestedItemsCase(): RequestedItemsCase = js.native
  def hasGetAccountStateRequest(): Boolean = js.native
  def hasGetAccountTransactionBySequenceNumberRequest(): Boolean = js.native
  def hasGetEventsByEventAccessPathRequest(): Boolean = js.native
  def hasGetTransactionsRequest(): Boolean = js.native
  def setGetAccountStateRequest(): Unit = js.native
  def setGetAccountStateRequest(value: GetAccountStateRequest): Unit = js.native
  def setGetAccountTransactionBySequenceNumberRequest(): Unit = js.native
  def setGetAccountTransactionBySequenceNumberRequest(value: GetAccountTransactionBySequenceNumberRequest): Unit = js.native
  def setGetEventsByEventAccessPathRequest(): Unit = js.native
  def setGetEventsByEventAccessPathRequest(value: GetEventsByEventAccessPathRequest): Unit = js.native
  def setGetTransactionsRequest(): Unit = js.native
  def setGetTransactionsRequest(value: GetTransactionsRequest): Unit = js.native
}

