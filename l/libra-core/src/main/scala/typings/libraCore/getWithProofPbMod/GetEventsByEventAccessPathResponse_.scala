package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typings.libraCore.eventsPbMod.EventWithProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse")
@js.native
class GetEventsByEventAccessPathResponse_ () extends Message {
  def addEventsWithProof(): EventWithProof = js.native
  def addEventsWithProof(value: EventWithProof): EventWithProof = js.native
  def addEventsWithProof(value: EventWithProof, index: Double): EventWithProof = js.native
  def clearEventsWithProofList(): Unit = js.native
  def clearProofOfLatestEvent(): Unit = js.native
  def getEventsWithProofList(): js.Array[EventWithProof] = js.native
  def getProofOfLatestEvent(): js.UndefOr[AccountStateWithProof] = js.native
  def hasProofOfLatestEvent(): Boolean = js.native
  def setEventsWithProofList(value: js.Array[EventWithProof]): Unit = js.native
  def setProofOfLatestEvent(): Unit = js.native
  def setProofOfLatestEvent(value: AccountStateWithProof): Unit = js.native
}

