package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfoWithSignatures
import typings.libraDashCore.libAtGeneratedValidatorUnderscoreChangeUnderscorePbMod.ValidatorChangeEventWithProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse")
@js.native
class UpdateToLatestLedgerResponse_ () extends Message {
  def addResponseItems(): ResponseItem = js.native
  def addResponseItems(value: ResponseItem): ResponseItem = js.native
  def addResponseItems(value: ResponseItem, index: Double): ResponseItem = js.native
  def addValidatorChangeEvents(): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: ValidatorChangeEventWithProof): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: ValidatorChangeEventWithProof, index: Double): ValidatorChangeEventWithProof = js.native
  def clearLedgerInfoWithSigs(): Unit = js.native
  def clearResponseItemsList(): Unit = js.native
  def clearValidatorChangeEventsList(): Unit = js.native
  def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
  def getResponseItemsList(): js.Array[ResponseItem] = js.native
  def getValidatorChangeEventsList(): js.Array[ValidatorChangeEventWithProof] = js.native
  def hasLedgerInfoWithSigs(): Boolean = js.native
  def setLedgerInfoWithSigs(): Unit = js.native
  def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
  def setResponseItemsList(value: js.Array[ResponseItem]): Unit = js.native
  def setValidatorChangeEventsList(value: js.Array[ValidatorChangeEventWithProof]): Unit = js.native
}

