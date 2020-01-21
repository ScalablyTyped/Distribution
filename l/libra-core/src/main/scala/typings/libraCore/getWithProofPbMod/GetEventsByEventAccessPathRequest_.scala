package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.accessPathPbMod.AccessPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest")
@js.native
class GetEventsByEventAccessPathRequest_ () extends Message {
  def clearAccessPath(): Unit = js.native
  def getAccessPath(): js.UndefOr[AccessPath] = js.native
  def getAscending(): Boolean = js.native
  def getLimit(): String = js.native
  def getStartEventSeqNum(): String = js.native
  def hasAccessPath(): Boolean = js.native
  def setAccessPath(): Unit = js.native
  def setAccessPath(value: AccessPath): Unit = js.native
  def setAscending(value: Boolean): Unit = js.native
  def setLimit(value: String): Unit = js.native
  def setStartEventSeqNum(value: String): Unit = js.native
}

