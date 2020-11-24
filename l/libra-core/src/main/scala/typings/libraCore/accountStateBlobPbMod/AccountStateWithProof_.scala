package typings.libraCore.accountStateBlobPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.proofPbMod.AccountStateProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
@js.native
class AccountStateWithProof_ () extends Message {
  
  def clearBlob(): Unit = js.native
  
  def clearProof(): Unit = js.native
  
  def getBlob(): js.UndefOr[AccountStateBlob] = js.native
  
  def getProof(): js.UndefOr[AccountStateProof] = js.native
  
  def getVersion(): String = js.native
  
  def hasBlob(): Boolean = js.native
  
  def hasProof(): Boolean = js.native
  
  def setBlob(): Unit = js.native
  def setBlob(value: AccountStateBlob): Unit = js.native
  
  def setProof(): Unit = js.native
  def setProof(value: AccountStateProof): Unit = js.native
  
  def setVersion(value: String): Unit = js.native
}
