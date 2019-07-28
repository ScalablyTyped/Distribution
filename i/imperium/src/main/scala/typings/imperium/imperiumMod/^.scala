package typings.imperium.imperiumMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val context: js.Array[String] = js.native
  val roles: Roles = js.native
  def can(actionS: String): js.Promise[RequestHandler] = js.native
  def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler] = js.native
  def can(actionS: Action): js.Promise[RequestHandler] = js.native
  def evaluateRouteAction(req: Request, expr: String, key: String, context: Context): String = js.native
  def evaluateRouteActions(req: Request, action: js.Array[Action], context: Context): Actions = js.native
  def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  def evaluateUserActions(req: Request, roles: js.Array[Role]): js.Promise[js.Array[Action]] = js.native
  def is(roleNames: String): js.Promise[RequestHandler] = js.native
  def is(roleNames: js.Array[String]): js.Promise[RequestHandler] = js.native
  def role(roleName: String): Role = js.native
  def role(roleName: String, getAcl: GetAcl): Role = js.native
}

