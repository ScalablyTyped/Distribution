package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "Bridge")
@js.native
class Bridge protected () extends js.Object {
  def this(opts: BridgeOptions) = this()
  var opts: BridgeOptions = js.native
  def getBot(): AppServiceBot = js.native
  def getClientFactory(): ClientFactory = js.native
  def getIntent(): Intent = js.native
  def getIntent(userId: js.UndefOr[scala.Nothing], request: Request): Intent = js.native
  def getIntent(userId: String): Intent = js.native
  def getIntent(userId: String, request: Request): Intent = js.native
  def getIntentFromLocalpart(): Intent = js.native
  def getIntentFromLocalpart(localpart: String): Intent = js.native
  def getIntentFromLocalpart(localpart: String, request: Request): Intent = js.native
  def getIntentFromLocalpart(localpart: Null, request: Request): Intent = js.native
  def getLocation(protocol: String, fields: js.Object): js.Promise[js.Array[ThirdPartyLocationResult]] = js.native
  def getPrometheusMetrics(): RequestFactory = js.native
  def getProtocol(protocol: String): js.Promise[BridgeThirdPartyProtocolResult] = js.native
  def getRequestFactory(): RequestFactory = js.native
  def getRoomStore(): Null | RoomBridgeStore = js.native
  def getUser(protocol: String, fields: js.Object): js.Promise[js.Array[ThirdPartyUserResult]] = js.native
  def getUserStore(): Null | UserBridgeStore = js.native
  def loadDatabases(): js.Promise[Unit] = js.native
  def onAliasQueried(alias: String, roomId: String): Unit = js.native
  def onAliasQuery(alias: String, aliasLocalpart: String): ProvisionedRoom | js.Promise[ProvisionedRoom] = js.native
  def onEvent(request: Request, context: BridgeContext): Unit = js.native
  def onLog(line: String, isError: Boolean): Unit = js.native
  def onRoomUpgrade(oldRoomId: String, newRoomId: String, newVersion: String, context: BridgeContext): Unit = js.native
  def onUserQuery(matrixUser: MatrixUser): ProvisionedUser | js.Promise[ProvisionedUser] = js.native
  def parseLocation(alias: String): js.Promise[js.Array[ThirdPartyLocationResult]] = js.native
  def parseUser(userid: String): js.Promise[js.Array[ThirdPartyUserResult]] = js.native
  def provisionUser(matrixUser: MatrixUser, provisionedUser: ProvisionedUser): js.Promise[Unit] = js.native
  def registerBridgeGauges(counterFunc: js.Function0[_]): js.Object = js.native
  def run(port: Double, config: js.Object): Unit = js.native
  def run(port: Double, config: js.Object, appServiceInstance: AppService): Unit = js.native
}

