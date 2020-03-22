package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "RoomBridgeStore")
@js.native
class RoomBridgeStore protected () extends js.Object {
  def this(db: Datastore) = this()
  def this(db: Datastore, ops: RoomBridgeStoreOptions) = this()
  def batchGetLinkedRemoteRooms(matrixIds: js.Array[String]): js.Promise[RemoteRoomDict] = js.native
  def getEntriesByLinkData(data: js.Object): js.Promise[js.Array[Entry]] = js.native
  def getEntriesByMatrixId(matrixId: String): js.Promise[js.Array[Entry]] = js.native
  def getEntriesByMatrixIds(ids: js.Array[String]): js.Promise[EntryDict] = js.native
  def getEntriesByMatrixRoomData(data: js.Object): js.Promise[js.Array[Entry]] = js.native
  def getEntriesByRemoteId(remoteId: String): js.Promise[js.Array[Entry]] = js.native
  def getEntriesByRemoteRoomData(data: js.Object): js.Promise[js.Array[Entry]] = js.native
  def getEntryById(id: String): js.Promise[Null | Entry] = js.native
  def getLinkedMatrixRooms(remoteId: String): js.Promise[js.Array[MatrixRoom]] = js.native
  def getLinkedRemoteRooms(matrixId: String): js.Promise[js.Array[RemoteRoom]] = js.native
  def getMatrixRoom(roomId: String): js.Promise[Null | MatrixRoom] = js.native
  def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom): js.Promise[Unit] = js.native
  def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom, data: js.Object): js.Promise[Unit] = js.native
  def linkRooms(matrixRoom: MatrixRoom, remoteRoom: RemoteRoom, data: js.Object, linkId: String): js.Promise[Unit] = js.native
  def removeEntriesByLinkData(data: js.Object): js.Promise[Unit] = js.native
  def removeEntriesByMatrixRoomData(data: js.Object): js.Promise[Unit] = js.native
  def removeEntriesByMatrixRoomId(matrixId: String): js.Promise[Unit] = js.native
  def removeEntriesByRemoteRoomData(data: js.Object): js.Promise[Unit] = js.native
  def removeEntriesByRemoteRoomId(remoteId: String): js.Promise[Unit] = js.native
  def setMatrixRoom(matrixRoom: MatrixRoom): js.Promise[Unit] = js.native
  def upsertEntry(entry: Entry): js.Promise[Unit] = js.native
}

