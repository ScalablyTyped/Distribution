package typings.matrixAppserviceBridge.mod

import typings.matrixJsSdk.mod.MembershipType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "MembershipCache")
@js.native
class MembershipCache () extends js.Object {
  def getMemberEntry(roomId: String, userId: String): MembershipType = js.native
  def setMemberEntry(roomId: String, userId: String, membership: MembershipType): Unit = js.native
}

