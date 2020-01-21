package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem")
@js.native
class ResponseItem_ () extends Message {
  def clearGetAccountStateResponse(): Unit = js.native
  def clearGetAccountTransactionBySequenceNumberResponse(): Unit = js.native
  def clearGetEventsByEventAccessPathResponse(): Unit = js.native
  def clearGetTransactionsResponse(): Unit = js.native
  def getGetAccountStateResponse(): js.UndefOr[GetAccountStateResponse] = js.native
  def getGetAccountTransactionBySequenceNumberResponse(): js.UndefOr[GetAccountTransactionBySequenceNumberResponse] = js.native
  def getGetEventsByEventAccessPathResponse(): js.UndefOr[GetEventsByEventAccessPathResponse] = js.native
  def getGetTransactionsResponse(): js.UndefOr[GetTransactionsResponse] = js.native
  def getResponseItemsCase(): ResponseItemsCase = js.native
  def hasGetAccountStateResponse(): Boolean = js.native
  def hasGetAccountTransactionBySequenceNumberResponse(): Boolean = js.native
  def hasGetEventsByEventAccessPathResponse(): Boolean = js.native
  def hasGetTransactionsResponse(): Boolean = js.native
  def setGetAccountStateResponse(): Unit = js.native
  def setGetAccountStateResponse(value: GetAccountStateResponse): Unit = js.native
  def setGetAccountTransactionBySequenceNumberResponse(): Unit = js.native
  def setGetAccountTransactionBySequenceNumberResponse(value: GetAccountTransactionBySequenceNumberResponse): Unit = js.native
  def setGetEventsByEventAccessPathResponse(): Unit = js.native
  def setGetEventsByEventAccessPathResponse(value: GetEventsByEventAccessPathResponse): Unit = js.native
  def setGetTransactionsResponse(): Unit = js.native
  def setGetTransactionsResponse(value: GetTransactionsResponse): Unit = js.native
}

