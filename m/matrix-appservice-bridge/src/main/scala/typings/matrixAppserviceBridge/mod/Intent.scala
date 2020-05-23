package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.anon.CreateAsClient
import typings.matrixAppserviceBridge.anon.Roomalias
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.offline
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.online
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unavailable
import typings.matrixJsSdk.mod.EventType
import typings.matrixJsSdk.mod.MatrixClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "Intent")
@js.native
class Intent protected () extends js.Object {
  def this(client: MatrixClient, botClient: MatrixClient, opts: js.Object) = this()
  def ban(roomId: String, target: String, reason: String): js.Promise[Unit] = js.native
  def createAlias(alias: String, roomId: String): js.Promise[Unit] = js.native
  def createRoom(opts: CreateAsClient): js.Promise[Roomalias] = js.native
  def getClient(): MatrixClient = js.native
  def getEvent(roomId: String, eventId: String): js.Promise[_] = js.native
  def getEvent(roomId: String, eventId: String, useCache: Boolean): js.Promise[_] = js.native
  def getProfileInfo(userId: String): js.Promise[_] = js.native
  def getProfileInfo(userId: String, info: String): js.Promise[_] = js.native
  def getProfileInfo(userId: String, info: String, useCache: Boolean): js.Promise[_] = js.native
  def getStateEvent(roomId: String, eventType: EventType): js.Promise[_] = js.native
  def getStateEvent(roomId: String, eventType: EventType, stateKey: String): js.Promise[_] = js.native
  def invite(roomId: String, target: String): js.Promise[Unit] = js.native
  def join(roomId: String): js.Promise[Unit] = js.native
  def join(roomId: String, viaServers: js.Array[String]): js.Promise[Unit] = js.native
  def kick(roomId: String, target: String, reason: String): js.Promise[Unit] = js.native
  def leave(roomId: String): js.Promise[Unit] = js.native
  def onEvent(event: js.Object): Unit = js.native
  def roomState(roomId: String, useCache: Boolean): js.Promise[_] = js.native
  def sendEvent(roomId: String, `type`: EventType, content: js.Object): js.Promise[Unit] = js.native
  def sendMessage(roomId: String, content: js.Object): js.Promise[Unit] = js.native
  def sendReadReceipt(): js.Promise[Unit] = js.native
  def sendStateEvent(roomId: String, `type`: EventType, skey: String, content: js.Object): js.Promise[Unit] = js.native
  def sendText(roomId: String, text: String): js.Promise[Unit] = js.native
  def sendTyping(roomId: String, isTyping: Boolean): js.Promise[Unit] = js.native
  def setAvatarUrl(url: String): js.Promise[Unit] = js.native
  def setDisplayName(name: String): js.Promise[Unit] = js.native
  def setPowerLevel(roomId: String, target: String, level: Double): js.Promise[Unit] = js.native
  @JSName("setPresence")
  def setPresence_offline(presence: offline, status_msg: String): js.Promise[Unit] = js.native
  @JSName("setPresence")
  def setPresence_online(presence: online, status_msg: String): js.Promise[Unit] = js.native
  @JSName("setPresence")
  def setPresence_unavailable(presence: unavailable, status_msg: String): js.Promise[Unit] = js.native
  def setRoomAvatar(roomId: String, avatar: String, info: String): js.Promise[Unit] = js.native
  def setRoomName(roomId: String, name: String): js.Promise[Unit] = js.native
  def setRoomTopic(roomId: String, topic: String): js.Promise[Unit] = js.native
  def unban(roomId: String, target: String): js.Promise[Unit] = js.native
}

