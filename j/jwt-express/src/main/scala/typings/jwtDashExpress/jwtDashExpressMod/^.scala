package typings.jwtDashExpress.jwtDashExpressMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var options: JWTExpressOptions = js.native
  def active(): RequestHandler = js.native
  def clear(): RequestHandler = js.native
  def create(secret: String, payload: js.Any): JWT = js.native
  def create(secret: js.Function1[/* payload */ js.Any, String], payload: js.Any): JWT = js.native
  def init(secret: String): RequestHandler = js.native
  def init(secret: String, options: JWTExpressOptions): RequestHandler = js.native
  def init(secret: js.Function1[/* req */ Request, String]): RequestHandler = js.native
  def init(secret: js.Function1[/* req */ Request, String], options: JWTExpressOptions): RequestHandler = js.native
  def require(key: String): RequestHandler = js.native
  def require(key: String, operator: String): RequestHandler = js.native
  def require(key: String, operator: String, value: js.Any): RequestHandler = js.native
  def valid(): RequestHandler = js.native
}

