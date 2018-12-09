package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", JSImport.Namespace)
@js.native
object imperiumModMembers extends js.Object {
  val context: js.Array[java.lang.String] = js.native
  val roles: Roles = js.native
  def can(actionS: Action): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def can(actionS: java.lang.String): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def can(actionS: js.Array[Action | java.lang.String]): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def evaluateRouteAction(
    req: expressLib.expressMod.eNs.Request,
    expr: java.lang.String,
    key: java.lang.String,
    context: Context
  ): java.lang.String = js.native
  def evaluateRouteActions(req: expressLib.expressMod.eNs.Request, action: js.Array[Action], context: Context): Actions = js.native
  def evaluateUserAction(action: RoleParams, context: ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]): ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def evaluateUserActions(req: expressLib.expressMod.eNs.Request, roles: js.Array[Role]): js.Promise[js.Array[Action]] = js.native
  def is(roleNames: java.lang.String): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def is(roleNames: js.Array[java.lang.String]): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def role(roleName: java.lang.String): Role = js.native
  def role(roleName: java.lang.String, getAcl: GetAcl): Role = js.native
}

