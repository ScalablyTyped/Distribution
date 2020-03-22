package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "UserBridgeStore")
@js.native
class UserBridgeStore protected () extends js.Object {
  def this(db: Datastore) = this()
  def this(db: Datastore, opts: js.Object) = this()
  def getByMatrixData(dataQuery: js.Object): js.Promise[js.Array[MatrixUser]] = js.native
  def getByMatrixLocalpart(localpart: String): js.Promise[Null | MatrixUser] = js.native
  def getByRemoteData(dataQuery: js.Object): js.Promise[js.Array[RemoteUser]] = js.native
  def getMatrixLinks(remoteId: String): js.Promise[js.Array[String]] = js.native
  def getMatrixUser(userId: String): js.Promise[Null | MatrixUser] = js.native
  def getMatrixUsersFromRemoteId(remoteId: String): js.Promise[js.Array[MatrixUser]] = js.native
  def getRemoteLinks(matrixId: String): js.Promise[js.Array[String]] = js.native
  def getRemoteUser(id: String): js.Promise[Null | RemoteUser] = js.native
  def getRemoteUsersFromMatrixId(userId: String): js.Promise[js.Array[RemoteUser]] = js.native
  def linkUsers(matrixUser: MatrixUser, remoteUser: RemoteUser): js.Promise[Unit] = js.native
  def setMatrixUser(matrixUser: MatrixUser): js.Promise[Unit] = js.native
  def setRemoteUser(remoteUser: RemoteUser): js.Promise[Unit] = js.native
  def unlinkUserIds(matrixUserId: String, remoteUserId: String): js.Promise[Double] = js.native
  def unlinkUsers(matrixUser: MatrixUser, remoteUser: RemoteUser): js.Promise[Double] = js.native
}

