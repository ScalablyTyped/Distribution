package typings.matrixAppserviceBridge.mod

import typings.matrixJsSdk.mod.MatrixClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "AppServiceBot")
@js.native
class AppServiceBot protected () extends js.Object {
  def this(client: MatrixClient, registration: AppServiceRegistration, memberCache: MembershipCache) = this()
  def getJoinedMembers(roomId: String): js.Promise[RoomMemberDict] = js.native
  def getJoinedRooms(): js.Promise[js.Array[String]] = js.native
  def isRemoteUser(userId: String): Boolean = js.native
}

