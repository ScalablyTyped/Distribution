package typings
package jwtDashExpressLib.jwtDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jwt-express", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var options: JWTExpressOptions = js.native
  def active(): expressLib.expressMod.eNs.RequestHandler = js.native
  def clear(): expressLib.expressMod.eNs.RequestHandler = js.native
  def create(secret: java.lang.String, payload: js.Any): JWT = js.native
  def create(secret: js.Function1[/* payload */ js.Any, java.lang.String], payload: js.Any): JWT = js.native
  def init(secret: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def init(secret: java.lang.String, options: JWTExpressOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def init(secret: js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]): expressLib.expressMod.eNs.RequestHandler = js.native
  def init(
    secret: js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String],
    options: JWTExpressOptions
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def require(key: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def require(key: java.lang.String, operator: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def require(key: java.lang.String, operator: java.lang.String, value: js.Any): expressLib.expressMod.eNs.RequestHandler = js.native
  def valid(): expressLib.expressMod.eNs.RequestHandler = js.native
}

