package typings.ltijs.providerMod

import typings.express.mod.Express
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.ltijs.anon.Method
import typings.ltijs.databaseMod.DatabaseOptions
import typings.ltijs.deepLinkingMod.DeepLinkingService
import typings.ltijs.gradeServiceMod.GradeService
import typings.ltijs.ltijsBooleans.`false`
import typings.ltijs.ltijsBooleans.`true`
import typings.ltijs.namesAndRolesMod.NamesAndRolesService
import typings.ltijs.platformMod.Platform
import typings.ltijs.platformMod.PlatformConfig
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltijs/lib/Provider/Provider", "Provider")
@js.native
class Provider protected () extends js.Object {
  def this(encryptionKey: String, database: DatabaseOptions) = this()
  def this(encryptionKey: String, database: DatabaseOptions, options: ProviderOptions) = this()
  var Database: typings.ltijs.databaseMod.Database = js.native
  var DeepLinking: DeepLinkingService = js.native
  var Grade: GradeService = js.native
  var NamesAndRoles: NamesAndRolesService = js.native
  @JSName("app")
  var app_Original: Express = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def appUrl(): String = js.native
  def close(): js.Promise[Boolean] = js.native
  def deletePlatform(url: String): js.Promise[Boolean] = js.native
  def deploy(): js.Promise[js.UndefOr[`true`]] = js.native
  def deploy(options: DeploymentOptions): js.Promise[js.UndefOr[`true`]] = js.native
  def getAllPlatforms(): js.Promise[js.Array[Platform] | `false`] = js.native
  def getPlatform(url: String): js.Promise[Platform | `false`] = js.native
  def invalidTokenUrl(): String = js.native
  def keysetUrl(): String = js.native
  def loginUrl(): String = js.native
  def onConnect(_connectCallback: OnConnectCallback): `true` = js.native
  def onConnect(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
  def onDeepLinking(_connectCallback: OnConnectCallback): `true` = js.native
  def onDeepLinking(_connectCallback: OnConnectCallback, options: OnConnectOptions): `true` = js.native
  def redirect(response: Response_[_], path: String): Unit = js.native
  def redirect(response: Response_[_], path: String, options: RedirectOptions): Unit = js.native
  def registerPlatform(config: PlatformConfig): js.Promise[Platform | `false`] = js.native
  def sessionTimeoutUrl(): String = js.native
  def whitelist(urls: (String | Method)*): `true` = js.native
}

