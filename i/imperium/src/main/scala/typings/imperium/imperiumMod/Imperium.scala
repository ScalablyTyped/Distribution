package typings.imperium.imperiumMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "Imperium")
@js.native
class Imperium () extends js.Object {
  var context: js.Array[String] = js.native
  var roles: Roles = js.native
  /* private */ def addRole(roleName: String, getAcl: GetAcl): Unit = js.native
  // Check if current user can do action(s)
  def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def evaluateRouteAction(req: Request[ParamsDictionary], expr: String, key: String, context: Context): String = js.native
  def evaluateRouteActions(req: Request[ParamsDictionary], action: js.Array[Action], context: Context): Actions = js.native
  def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  def evaluateUserActions(req: Request[ParamsDictionary], roles: js.Array[Role]): js.Promise[js.Array[Action]] = js.native
  // Check if user has role(s) act like as an OR
  def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  // Add new role with specific ImperiumGetAcl
  def role(roleName: String): Role = js.native
  def role(roleName: String, getAcl: GetAcl): Role = js.native
}

