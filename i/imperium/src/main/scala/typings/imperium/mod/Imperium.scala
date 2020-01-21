package typings.imperium.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "Imperium")
@js.native
class Imperium () extends js.Object {
  var context: js.Array[String] = js.native
  var roles: Roles_ = js.native
  /* private */ def addRole(roleName: String, getAcl: GetAcl): Unit = js.native
  // Check if current user can do action(s)
  def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def evaluateRouteAction(req: Request_[ParamsDictionary], expr: String, key: String, context: Context_): String = js.native
  def evaluateRouteActions(req: Request_[ParamsDictionary], action: js.Array[Action], context: Context_): Actions = js.native
  def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  def evaluateUserActions(req: Request_[ParamsDictionary], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = js.native
  // Check if user has role(s) act like as an OR
  def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  // Add new role with specific ImperiumGetAcl
  def role(roleName: String): Role_ = js.native
  def role(roleName: String, getAcl: GetAcl): Role_ = js.native
}

