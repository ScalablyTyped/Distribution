package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixStore extends js.Object {
  def clearOutOfBandMembers(): js.Promise[Unit] = js.native
  def deleteAllData(): js.Promise[Unit] = js.native
  def getAccountData(eventType: String): js.UndefOr[MatrixEvent] = js.native
  def getClientOptions(): js.Promise[_] = js.native
  def getFilter(userId: String, filterId: String): Filter | Null = js.native
  def getFilterIdByName(filterName: String): Filter | Null = js.native
  def getGroup(groupId: String): Group | Null = js.native
  def getGroups(): js.Array[Group] = js.native
  def getOutOfBandMembers(roomId: String): js.Promise[js.Array[MatrixEvent] | Null] = js.native
  def getRoom(roomId: String): Room | Null = js.native
  def getRoomSummaries(): js.Array[RoomSummary] = js.native
  def getRooms(): js.Array[Room] = js.native
  def getSavedSync(): js.Promise[_] = js.native
  def getSavedSyncToken(): js.Promise[String | Null] = js.native
  def getSyncToken(): String | Null = js.native
  def getUser(userId: String): User | Null = js.native
  def getUsers(): js.Array[User] = js.native
  def isNewlyCreated(): js.Promise[Boolean] = js.native
  def removeRoom(roomId: String): Unit = js.native
  def save(): Unit = js.native
  def save(force: Boolean): Unit = js.native
  def scrollback(room: Room, limit: Double): js.Array[_] = js.native
  def setFilterIdByName(filterName: String, filterId: String): Unit = js.native
  def setOutOfBandMembers(roomId: String, membershipEvents: js.Array[MatrixEvent]): js.Promise[Unit] = js.native
  def setSyncData(syncData: js.Any): js.Promise[Unit] = js.native
  def setSyncToken(token: String): Unit = js.native
  def startup(): js.Promise[Unit] = js.native
  def storeAccountDataEvents(events: js.Array[MatrixEvent]): Unit = js.native
  def storeClientOptions(options: js.Any): js.Promise[Unit] = js.native
  def storeEvents(room: Room, events: js.Array[MatrixEvent], token: String): Boolean = js.native
  def storeEvents(room: Room, events: js.Array[MatrixEvent], token: String, toStart: Boolean): Boolean = js.native
  def storeFilter(filter: Filter): Unit = js.native
  def storeGroup(group: Group): Unit = js.native
  def storeRoom(room: Room): Unit = js.native
  def storeUser(user: User): Unit = js.native
  def wantsSave(): Boolean = js.native
}

