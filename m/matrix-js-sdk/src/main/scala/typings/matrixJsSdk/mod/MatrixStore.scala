package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatrixStore extends StObject {
  
  def clearOutOfBandMembers(): js.Promise[Unit] = js.native
  
  def deleteAllData(): js.Promise[Unit] = js.native
  
  def getAccountData(eventType: String): js.UndefOr[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getClientOptions(): js.Promise[Any] = js.native
  
  def getFilter(userId: String, filterId: String): Filter | Null = js.native
  
  def getFilterIdByName(filterName: String): Filter | Null = js.native
  
  def getGroup(groupId: String): Group | Null = js.native
  
  def getGroups(): js.Array[Group] = js.native
  
  def getOutOfBandMembers(roomId: String): js.Promise[(js.Array[MatrixEvent[EventContentTypeMessage, EventType]]) | Null] = js.native
  
  def getRoom(roomId: String): Room | Null = js.native
  
  def getRoomSummaries(): js.Array[RoomSummary] = js.native
  
  def getRooms(): js.Array[Room] = js.native
  
  def getSavedSync(): js.Promise[Any] = js.native
  
  def getSavedSyncToken(): js.Promise[String | Null] = js.native
  
  def getSyncToken(): String | Null = js.native
  
  def getUser(userId: String): User | Null = js.native
  
  def getUsers(): js.Array[User] = js.native
  
  def isNewlyCreated(): js.Promise[Boolean] = js.native
  
  def removeRoom(roomId: String): Unit = js.native
  
  def save(): Unit = js.native
  def save(force: Boolean): Unit = js.native
  
  def scrollback(room: Room, limit: Double): js.Array[Any] = js.native
  
  def setFilterIdByName(filterName: String, filterId: String): Unit = js.native
  
  def setOutOfBandMembers(roomId: String, membershipEvents: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): js.Promise[Unit] = js.native
  
  def setSyncData(syncData: Any): js.Promise[Unit] = js.native
  
  def setSyncToken(token: String): Unit = js.native
  
  def startup(): js.Promise[Unit] = js.native
  
  def storeAccountDataEvents(events: js.Array[MatrixEvent[EventContentTypeMessage, EventType]]): Unit = js.native
  
  def storeClientOptions(options: Any): js.Promise[Unit] = js.native
  
  def storeEvents(room: Room, events: js.Array[MatrixEvent[EventContentTypeMessage, EventType]], token: String): Boolean = js.native
  def storeEvents(
    room: Room,
    events: js.Array[MatrixEvent[EventContentTypeMessage, EventType]],
    token: String,
    toStart: Boolean
  ): Boolean = js.native
  
  def storeFilter(filter: Filter): Unit = js.native
  
  def storeGroup(group: Group): Unit = js.native
  
  def storeRoom(room: Room): Unit = js.native
  
  def storeUser(user: User): Unit = js.native
  
  def wantsSave(): Boolean = js.native
}
