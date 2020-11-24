package typings.libraCore.ledgerInfoPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/ledger_info_pb", "LedgerInfoWithSignatures")
@js.native
class LedgerInfoWithSignatures_ () extends Message {
  
  def addSignatures(): ValidatorSignature = js.native
  def addSignatures(value: js.UndefOr[scala.Nothing], index: Double): ValidatorSignature = js.native
  def addSignatures(value: ValidatorSignature): ValidatorSignature = js.native
  def addSignatures(value: ValidatorSignature, index: Double): ValidatorSignature = js.native
  
  def clearLedgerInfo(): Unit = js.native
  
  def clearSignaturesList(): Unit = js.native
  
  def getLedgerInfo(): js.UndefOr[LedgerInfo] = js.native
  
  def getSignaturesList(): js.Array[ValidatorSignature] = js.native
  
  def hasLedgerInfo(): Boolean = js.native
  
  def setLedgerInfo(): Unit = js.native
  def setLedgerInfo(value: LedgerInfo): Unit = js.native
  
  def setSignaturesList(value: js.Array[ValidatorSignature]): Unit = js.native
}
